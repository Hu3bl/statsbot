package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.ChangeNameMessage;
import MessagesModel.Message;
import MessagesModel.ModelFactory;

public class ChangeNameRegex implements IRegex
{
	private static final String regex = "\"(?<userName>.+)[<](?<userId>\\d+)[>][<](?<userSteamId>.*)[>][<](?<userTeam>CT|TERRORIST|Unassigned|Spectator)[>]\" changed name to \"(?<newUserName>.*)\"";

	public ChangeNameRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}

	@Override
	public Message tryCreatingMessage(String input) 
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		ChangeNameMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createChangeNameMessage();
			
			message.setUserName(m.group("userName"));
			message.setUserID(m.group("userId"));
			message.setUserSteamID(m.group("userSteamId"));
			message.setUserTeam(m.group("userTeam"));
			message.setNewUserName(m.group("newUserName"));
		}
		
		return message;
	}
}
