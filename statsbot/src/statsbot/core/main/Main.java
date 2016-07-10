package statsbot.core.main;

import java.util.concurrent.LinkedBlockingQueue;

import statsbot.core.udp.parser.UDPParser;
import statsbot.core.udp.server.UDPServer;
import statsbot.messages.regex.RegexInitializer;

public class Main 
{
	private static LinkedBlockingQueue<byte[]> buffer = new LinkedBlockingQueue<byte[]>();
	//private final static Logger log = LogManager.getLogger(Main.class);
	public static void main(String args[])
	{
		RegexInitializer.initializeRegexObjects();
		
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
}
