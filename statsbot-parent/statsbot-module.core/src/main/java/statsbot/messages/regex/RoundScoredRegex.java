package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.Message;
import MessagesModel.ModelFactory;
import MessagesModel.RoundScoredMessage;

public class RoundScoredRegex implements IRegex
{
	private static final String regex = "Team \"(?<team>.*)\" triggered \"SFUI_Notice_(?<teamWin>Terrorists_Win|CTs_Win|Target_Bombed|Target_Saved|Bomb_Defused)";
	
	public RoundScoredRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}

	@Override
	public Message tryCreatingMessage(String input)
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		RoundScoredMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createRoundScoredMessage();
			
			message.setTeam(m.group("team"));
			String teamWin = m.group("teamWin");
			switch (teamWin)
			{
				case "Terrorists_Win": 
					message.setTeamWin("T"); 
					message.setType("normal");
					break;
				case "CTs_Win":
					message.setTeamWin("CT"); 
					message.setType("normal");
					break;
				case "Target_Bombed":
					message.setTeamWin("T");
					message.setType("bombExploded");
					break;
				case "Target_Saved":
					message.setTeamWin("CT");
					message.setType("saved");
					break;
				case "Bomb_Defused":
					message.setTeamWin("CT");
					message.setType("bombDefused");
					break;
				default:
					return null;
			}
		}
		
		return message;
	}
}
