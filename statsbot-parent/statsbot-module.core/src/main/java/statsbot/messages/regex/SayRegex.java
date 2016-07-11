package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.Message;
import MessagesModel.ModelFactory;
import MessagesModel.SayMessage;

public class SayRegex implements IRegex
{
	private static final String regex = "\"(?<userName>.+)[<](?<userId>\\d+)[>][<](?<userSteamId>.*)[>][<](?<userTeam>CT|TERRORIST|Unassigned|Spectator)[>]\" say \"(?<text>.*)\"";
	
	public SayRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}
	
	@Override
	public Message tryCreatingMessage(String input)
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		SayMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createSayMessage();
			
			message.setUserName(m.group("userName"));
			message.setUserID(m.group("userId"));
			message.setUserSteamID(m.group("userSteamId"));
			message.setUserTeam(m.group("userTeam"));
			message.setText(m.group("text"));
		}
		
		return message;
	}
}
