package statsbot.core.main;

import statsbot.core.udpserver.UDPServer;
import statsbot.messages.regex.AttackedRegex;
import MessagesModel.AttackedMessage;

public class Main 
{
	private static final String input = "\"Hu3bl<2><STEAM_1:1:10481859><TERRORIST>\" [88 2512 -127] attacked \"Nate<10><BOT><CT>\" [382 2102 -126] with \"ak47\" (damage \"109\") (damage_armor \"15\") (health \"0\") (armor \"84\") (hitgroup \"head\")";
	
	public static void main( String args[] )
	{
		//UDPServer listener = new UDPServer(1337);
		//listener.startListening();
		
		
		
		AttackedMessage message = AttackedRegex.getMessageObject(input);
		System.out.println(message);
	}
}
