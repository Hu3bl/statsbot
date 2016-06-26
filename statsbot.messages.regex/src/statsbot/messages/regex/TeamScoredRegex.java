package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.Message;
import MessagesModel.ModelFactory;
import MessagesModel.TeamScoredMessage;

public class TeamScoredRegex implements IRegex
{
	private static final String regex = "Team \"(?<team>CT|TERRORIST)\" scored \"(?<score>\\d+)\" with \"(?<players>\\d+)\" players";

	public TeamScoredRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}
	
	@Override
	public Message tryCreatingMessage(String input)
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		TeamScoredMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createTeamScoredMessage();
			
			message.setTeam(m.group("team"));
			message.setScore(m.group("score"));
			message.setPlayers(m.group("players"));
		}
		
		return message;
	}
}
