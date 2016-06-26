package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.GotTheBombMessage;
import MessagesModel.Message;
import MessagesModel.ModelFactory;

public class GotTheBombRegex implements IRegex
{
	private static final String regex = "\"(?<userName>.+)[<](?<userId>\\d+)[>][<](?<userSteamId>.*)[>][<](?<userTeam>CT|TERRORIST|Unassigned|Spectator)[>]\" triggered \"Got_The_Bomb\"";

	public GotTheBombRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}

	@Override
	public Message tryCreatingMessage(String input)
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		GotTheBombMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createGotTheBombMessage();
			
			message.setUserName(m.group("userName"));
			message.setUserID(m.group("userId"));
			message.setUserSteamID(m.group("userSteamId"));
			message.setUserTeam(m.group("userTeam"));
		}
		
		return message;
	}
}
