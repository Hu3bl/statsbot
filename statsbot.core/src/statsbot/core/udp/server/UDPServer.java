package statsbot.core.udp.server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import statsbot.core.udp.parser.UDPParser;

public class UDPServer 
{
	DatagramSocket socket = null;
	private final static int PACKETSIZE = 3000 ;
	
	public UDPServer(int port)
	{
		try 
		{
			socket = new DatagramSocket(port);
		} 
		catch (SocketException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Opened DatagramSocket on port " + port);
	}
	
	public void startListening()
	{
		UDPParser parser = new UDPParser();
		try
		{
			while(true)
	        {
	            // Create a packet
	            DatagramPacket packet = new DatagramPacket(new byte[PACKETSIZE], PACKETSIZE ) ;

	            // Receive a packet (blocking)
	            socket.receive( packet ) ;

	            // Print the packet
	            System.out.println(new String(packet.getData()));
	            
	            // Process the packet
	            if(parser.parseData(new String(packet.getData())))
	            {
	            	System.out.println("true");
	            }
	            else
	            {
	            	System.out.println("false");
	            }
	        }  
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			socket.close();
		}
	}
}
