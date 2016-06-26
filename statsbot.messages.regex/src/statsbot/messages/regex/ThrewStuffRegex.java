package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.Message;
import MessagesModel.ModelFactory;
import MessagesModel.ThrewStuffMessage;

public class ThrewStuffRegex implements IRegex
{
	private static final String regex = "\"(?<userName>.+)[<](?<userId>\\d+)[>][<](?<userSteamId>.*)[>][<](?<userTeam>CT|TERRORIST|Unassigned|Spectator)[>]\""
			+ " threw (?<stuff>hegrenade|flashbang|smokegrenade|decoy|molotov) \\[(?<posX>[\\-]?[0-9]+) (?<posY>[\\-]?[0-9]+) (?<posZ>[\\-]?[0-9]+)\\]";

	public ThrewStuffRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}

	@Override
	public Message tryCreatingMessage(String input)
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		ThrewStuffMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createThrewStuffMessage();
			
			message.setUserName(m.group("userName"));
			message.setUserID(m.group("userId"));
			message.setUserSteamID(m.group("userSteamId"));
			message.setUserTeam(m.group("userTeam"));
			message.setStuff(m.group("stuff"));
			message.setPosX(Integer.parseInt(m.group("posX")));
			message.setPosY(Integer.parseInt(m.group("posY")));
			message.setPosZ(Integer.parseInt(m.group("posZ")));
		}
		
		return message;
	}
}
