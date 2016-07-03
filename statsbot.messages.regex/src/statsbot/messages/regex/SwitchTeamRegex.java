package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.Message;
import MessagesModel.ModelFactory;
import MessagesModel.SwitchTeamMessage;

public class SwitchTeamRegex implements IRegex
{
	private static final String regex = "\"(?<userName>.+)[<](?<userId>\\d+)[>][<](?<userSteamId>.*)[>]\" switched from team [<](?<userTeam>CT|TERRORIST|Unassigned|Spectator)[>] to [<](?<switchedTeam>CT|TERRORIST|Unassigned|Spectator)[>]";

	public SwitchTeamRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}

	@Override
	public Message tryCreatingMessage(String input)
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		SwitchTeamMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createSwitchTeamMessage();
			
			message.setUserName(m.group("userName"));
			message.setUserID(m.group("userId"));
			message.setUserSteamID(m.group("userSteamId"));
			message.setUserTeam(m.group("userTeam"));
			message.setSwitchedTeam(m.group("switchedTeam"));
		}
		
		return message;
	}
}
