package statsbot.core.udp.server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.concurrent.BlockingQueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import statsbot.core.main.Main;

public class UDPServer implements Runnable
{
	private final static int PACKETSIZE = 1500;
	private DatagramSocket socket = null;
	private BlockingQueue<byte[]> buffer = null;
	private final static Logger log = LogManager.getLogger(UDPServer.class);
	
	public UDPServer(int port, BlockingQueue<byte[]> buffer)
	{
		this.buffer = buffer;
		try 
		{
			socket = new DatagramSocket(port);
			log.info("Opened DatagramSocket on port " + port);
		} 
		catch (SocketException e) 
		{
			e.printStackTrace();
		}
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
			e.printStackTrace();
		}
		finally
		{
			socket.close();
		}
	}
}
