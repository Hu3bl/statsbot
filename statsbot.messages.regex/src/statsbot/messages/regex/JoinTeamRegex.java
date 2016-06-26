package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.JoinTeamMessage;
import MessagesModel.Message;
import MessagesModel.ModelFactory;

public class JoinTeamRegex implements IRegex
{
	private static final String regex = "\"(?<userName>.+)[<](?<userId>\\d+)[>][<](?<userSteamId>.*)[>][<](?<userTeam>CT|TERRORIST|Unassigned|Spectator)[>]\" joined team \"(?<joinedTeam>CT|TERRORIST|Unassigned|Spectator)\"";

	public JoinTeamRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}

	@Override
	public Message tryCreatingMessage(String input)
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		JoinTeamMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createJoinTeamMessage();
			
			message.setUserName(m.group("userName"));
			message.setUserID(m.group("userId"));
			message.setUserSteamID(m.group("userSteamId"));
			message.setUserTeam(m.group("userTeam"));
			message.setJoinedTeam(m.group("joinedTeam"));
		}
		
		return message;
	}
}
