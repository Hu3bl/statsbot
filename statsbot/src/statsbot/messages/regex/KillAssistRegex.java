package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.KillAssistMessage;
import MessagesModel.Message;
import MessagesModel.ModelFactory;

public class KillAssistRegex implements IRegex
{
	private static final String regex = "\"(?<userName>.+)[<](?<userId>\\d+)[>][<](?<userSteamId>.*)[>][<](?<userTeam>CT|TERRORIST|Unassigned|Spectator)[>]\" "
			+ "assisted killing \"(?<killedUserName>.+)[<](?<killedUserId>\\d+)[>][<](?<killedSteamId>.*)[>][<](?<killedUserTeam>CT|TERRORIST|Unassigned|Spectator)[>]\"";
	
	public KillAssistRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}

	@Override
	public Message tryCreatingMessage(String input)
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		KillAssistMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createKillAssistMessage();
			
			message.setUserName(m.group("userName"));
			message.setUserID(m.group("userId"));
			message.setUserSteamID(m.group("userSteamId"));
			message.setUserTeam(m.group("userTeam"));
			message.setKilledUserName(m.group("killedUserName"));
			message.setKilledUserID(m.group("killedUserId"));
			message.setKilledUserSteamID(m.group("killedSteamId"));
			message.setKilledUserTeam(m.group("killedUserTeam"));
		}
		
		return message;
	}
}
