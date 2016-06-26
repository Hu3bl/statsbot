package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.BombPlantingMessage;
import MessagesModel.Message;
import MessagesModel.ModelFactory;

public class BombPlantingRegex implements IRegex
{
	private static final String regex = "\"(?<userName>.+)[<](?<userId>\\d+)[>][<](?<userSteamId>.*)[>][<](?<userTeam>CT|TERRORIST|Unassigned|Spectator)[>]\" triggered \"Planted_The_Bomb\"";

	public BombPlantingRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}

	@Override
	public Message tryCreatingMessage(String input) 
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		BombPlantingMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createBombPlantingMessage();
			
			message.setUserName(m.group("userName"));
			message.setUserID(m.group("userId"));
			message.setUserSteamID(m.group("userSteamId"));
			message.setUserTeam(m.group("userTeam"));
		}
		
		return message;
	}
}
