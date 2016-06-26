package statsbot.core.main;

import statsbot.core.udp.server.UDPServer;
import statsbot.messages.regex.AttackedRegex;
import statsbot.messages.regex.BombDefusingRegex;
import statsbot.messages.regex.BombPlantingRegex;
import statsbot.messages.regex.ChangeMapRegex;
import statsbot.messages.regex.ChangeNameRegex;
import statsbot.messages.regex.ConnectedRegex;
import statsbot.messages.regex.DisconnectedRegex;
import statsbot.messages.regex.EnteredTheGameRegex;
import statsbot.messages.regex.GotTheBombRegex;
import statsbot.messages.regex.JoinTeamRegex;
import statsbot.messages.regex.KillAssistRegex;
import statsbot.messages.regex.PurchasedRegex;
import statsbot.messages.regex.RoundEndRegex;
import statsbot.messages.regex.RoundRestartRegex;
import statsbot.messages.regex.RoundScoredRegex;
import statsbot.messages.regex.RoundStartRegex;
import statsbot.messages.regex.SayRegex;
import statsbot.messages.regex.SayTeamRegex;
import statsbot.messages.regex.SwitchTeamRegex;
import statsbot.messages.regex.TeamScoredRegex;
import statsbot.messages.regex.ThrewStuffRegex;

public class Main 
{
	private static final String input = "\"Hu3bl<2><STEAM_1:1:10481859><TERRORIST>\" [88 2512 -127] attacked \"Nate<10><BOT><CT>\" [382 2102 -126] with \"ak47\" (damage \"109\") (damage_armor \"15\") (health \"0\") (armor \"84\") (hitgroup \"head\")";
	
	public static void main( String args[] )
	{
		AttackedRegex attackedRegex = new AttackedRegex();
		BombDefusingRegex bombDefusingRegex = new BombDefusingRegex();
		BombPlantingRegex bombPlantingRegex = new BombPlantingRegex();
		ChangeMapRegex changeMapRegex = new ChangeMapRegex();
		ChangeNameRegex changeNameRegex = new ChangeNameRegex();
		ConnectedRegex ConnectedRegex = new ConnectedRegex();
		DisconnectedRegex disconnectedRegex = new DisconnectedRegex();
		EnteredTheGameRegex enteredTheGameRegex = new EnteredTheGameRegex();
		GotTheBombRegex gotTheBombRegex = new GotTheBombRegex();
		JoinTeamRegex joinTeamRegex = new JoinTeamRegex();
		KillAssistRegex killAssistRegex = new KillAssistRegex();
		PurchasedRegex purchasedRegex = new PurchasedRegex();
		RoundEndRegex roundEndRegex = new RoundEndRegex();
		RoundRestartRegex roundRestartRegex = new RoundRestartRegex();
		RoundScoredRegex roundScoredRegex = new RoundScoredRegex();
		RoundStartRegex roundStartRegex = new RoundStartRegex();
		SayRegex sayRegex = new SayRegex();
		SayTeamRegex sayTeamRegex = new SayTeamRegex();
		SwitchTeamRegex switchTeamRegex = new SwitchTeamRegex();
		TeamScoredRegex teamScoredRegex = new TeamScoredRegex();
		ThrewStuffRegex threwStuffRegex = new ThrewStuffRegex();
		
		UDPServer listener = new UDPServer(1337);
		listener.startListening();
	}
	
	
}
