package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.EnteredTheGameMessage;
import MessagesModel.Message;
import MessagesModel.ModelFactory;

public class EnteredTheGameRegex implements IRegex
{
	private static final String regex = "\"(?<userName>.+)[<](?<userId>\\d+)[>][<](?<userSteamId>.*)[>][<][>]\" entered the game";

	public EnteredTheGameRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}

	@Override
	public Message tryCreatingMessage(String input)
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		EnteredTheGameMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createEnteredTheGameMessage();
			
			message.setUserName(m.group("userName"));
			message.setUserID(m.group("userId"));
			message.setUserSteamID(m.group("userSteamId"));
		}
		
		return message;
	}
}
