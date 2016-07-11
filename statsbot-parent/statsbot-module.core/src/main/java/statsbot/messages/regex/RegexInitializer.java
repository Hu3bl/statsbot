package statsbot.messages.regex;

public class RegexInitializer 
{
	public static void initializeRegexObjects()
	{
		// the created instances will register themselves in the RegexParser
		new AttackedRegex();
		new BombDefusingRegex();
		new BombPlantingRegex();
		new ChangeMapRegex();
		new ChangeNameRegex();
		new ConnectedRegex();
		new DisconnectedRegex();
		new EnteredTheGameRegex();
		new GotTheBombRegex();
		new JoinTeamRegex();
		new KillRegex();
		new KillAssistRegex();
		new PurchasedRegex();
		new RoundEndRegex();
		new RoundRestartRegex();
		new RoundScoredRegex();
		new RoundStartRegex();
		new SayRegex();
		new SayTeamRegex();
		new SwitchTeamRegex();
		new TeamScoredRegex();
		new ThrewStuffRegex();
	}
	
}
