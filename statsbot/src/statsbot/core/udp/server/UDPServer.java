package statsbot.core.udp.server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.concurrent.BlockingQueue;

public class UDPServer implements Runnable
{
	private final static int PACKETSIZE = 1500;
	private DatagramSocket socket = null;
	private BlockingQueue<byte[]> buffer = null;
	
	public UDPServer(int port, BlockingQueue<byte[]> buffer)
	{
		this.buffer = buffer;
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
	
	@Override
	public void run()
	{
		startListening();
	}
	
	private void startListening()
	{
		try
		{
			while(true)
	        {
	            // Create a packet
	            DatagramPacket packet = new DatagramPacket(new byte[PACKETSIZE], PACKETSIZE ) ;

	            // Receive a packet (blocking)
	            socket.receive(packet) ;

	            // Put the packet into queue
	            this.buffer.put(packet.getData());
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
