package statsbot.core.main;

import statsbot.core.udpserver.UDPServer;

public class Main 
{
	public static void main( String args[] )
	{
		UDPServer listener = new UDPServer(1337);
		listener.startListening();
	}
}
