package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.BombDefusingMessage;
import MessagesModel.Message;
import MessagesModel.ModelFactory;

public class BombDefusingRegex implements IRegex
{
	private static final String regex = "\"(?<userName>.+)[<](?<userId>\\d+)[>][<](?<userSteamId>.*)[>][<](?<userTeam>CT|TERRORIST|Unassigned|Spectator)[>]\" triggered \"(Begin_Bomb_Defuse_With_Kit|Begin_Bomb_Defuse_Without_Kit)\"";

	public BombDefusingRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}

	@Override
	public Message tryCreatingMessage(String input) 
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		BombDefusingMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createBombDefusingMessage();
			
			message.setUserName(m.group("userName"));
			message.setUserID(m.group("userId"));
			message.setUserSteamID(m.group("userSteamId"));
			message.setUserTeam(m.group("userTeam"));
		}
		
		return message;
	}
}
