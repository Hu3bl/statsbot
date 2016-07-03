package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.KillMessage;
import MessagesModel.Message;
import MessagesModel.ModelFactory;

public class KillRegex implements IRegex
{
	private static final String regex = "\"(?<userName>.+)[<](?<userId>\\d+)[>][<](?<userSteamId>.*)[>][<](?<userTeam>CT|TERRORIST|Unassigned|Spectator)[>]\" "
			+ "\\[(?<killerPosX>[\\-]?[0-9]+) (?<killerPosY>[\\-]?[0-9]+) (?<killerPosZ>[\\-]?[0-9]+)\\] "
			+ "killed \"(?<killedUserName>.+)[<](?<killedUserId>\\d+)[>][<](?<killedSteamId>.*)[>][<](?<killedUserTeam>CT|TERRORIST|Unassigned|Spectator)[>]\" "
			+ "\\[(?<killedPosX>[\\-]?[0-9]+) (?<killedPosY>[\\-]?[0-9]+) (?<killedPosZ>[\\-]?[0-9]+)\\] "
			+ "with \"(?<weapon>[a-zA-Z0-9_]+)\"(?<headshot>.*)";
	
	private static final String headshotRegex = "\\(headshot\\)";

	public KillRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}

	@Override
	public Message tryCreatingMessage(String input)
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		KillMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createKillMessage();
			
			message.setUserName(m.group("userName"));
			message.setUserID(m.group("userId"));
			message.setUserSteamID(m.group("userSteamId"));
			message.setUserTeam(m.group("userTeam"));
			message.setKillerPosX(Integer.parseInt(m.group("killerPosX")));
			message.setKillerPosY(Integer.parseInt(m.group("killerPosY")));
			message.setKillerPosZ(Integer.parseInt(m.group("killerPosZ")));
			message.setKilledUserName(m.group("killedUserName"));
			message.setKilledUserID(m.group("killedUserId"));
			message.setKilledUserSteamID(m.group("killedSteamId"));
			message.setKilledUserTeam(m.group("killedUserTeam"));
			message.setKilledPosX(Integer.parseInt(m.group("killedPosX")));
			message.setKilledPosY(Integer.parseInt(m.group("killedPosY")));
			message.setKilledPosZ(Integer.parseInt(m.group("killedPosZ")));
			message.setWeapon(m.group("weapon"));
			
			Pattern headshotPattern = Pattern.compile(headshotRegex);
			Matcher headshotMatcher = headshotPattern.matcher(m.group("headshot"));
			if (headshotMatcher.find())
			{
				message.setHeadshot(true);
			}
			else
			{
				message.setHeadshot(false);
			}
			
		}
		
		return message;
	}
}
