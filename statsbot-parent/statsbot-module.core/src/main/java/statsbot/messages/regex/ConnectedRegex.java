package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.ConnectedMessage;
import MessagesModel.Message;
import MessagesModel.ModelFactory;

public class ConnectedRegex implements IRegex
{
	private static final String regex = "\"(?<userName>.+)[<](?<userId>\\d+)[>][<](?<userSteamId>.*)[>][<][>]\" connected, address \"(?<address>.*)\"";

	public ConnectedRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}

	@Override
	public Message tryCreatingMessage(String input) 
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		ConnectedMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createConnectedMessage();
			
			message.setUserName(m.group("userName"));
			message.setUserID(m.group("userId"));
			message.setUserSteamID(m.group("userSteamId"));
			message.setAddress(m.group("address"));
		}
		
		return message;
	}
}
