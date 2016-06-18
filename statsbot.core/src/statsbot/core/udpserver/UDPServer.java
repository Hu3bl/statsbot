package statsbot.core.udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

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
		try
		{
			while(true)
	        {
	            // Create a packet
	            DatagramPacket packet = new DatagramPacket(new byte[PACKETSIZE], PACKETSIZE ) ;

	            // Receive a packet (blocking)
	            socket.receive( packet ) ;

	            // Print the packet
	            System.out.println(new String(packet.getData())) ;
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
