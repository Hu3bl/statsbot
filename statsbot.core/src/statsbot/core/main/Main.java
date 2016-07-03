package statsbot.core.main;

import java.util.concurrent.LinkedBlockingQueue;

import statsbot.core.udp.parser.UDPParser;
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
import statsbot.messages.regex.KillRegex;
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
	private static LinkedBlockingQueue<byte[]> buffer = new LinkedBlockingQueue<byte[]>();
	
	public static void main( String args[] )
	{
		initializeRegexObjects();
		
		// create a thread for UDPServer to receive the messages
		Thread serverThread = new Thread(new UDPServer(1337, buffer));
		serverThread.setDaemon(true);
		serverThread.start();
				
		byte[] receivedData = null;
		UDPParser parser = new UDPParser();
		
		while(true)
		{
			try
			{
				receivedData = buffer.take();
			} 
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(parser.parseData(new String(receivedData)))
			{
				System.out.print("success " + new String(receivedData));
			}
			else
			{
				System.out.print("error " + new String(receivedData));
			}
			
		}
	}
	
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
