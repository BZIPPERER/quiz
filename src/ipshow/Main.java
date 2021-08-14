package ipshow;

import java.net.InetAddress;
import java.net.UnknownHostException;

import util.Util;

public class Main 
{

	public static void main(String[] args) 
	{
		 int servus_tv = 0;
		 //System.out.println("false");
		 InetAddress ip;
	        String hostname;
	        try 
	        {
	            ip = InetAddress.getLocalHost();
	            //hostname = ip.getHostName();
	          //  System.out.println("Your current IP address : " + ip);
	            //System.out.println("Your current Hostname : " + hostname);
	            String IP = ip.toString();
	            String dummy = IP.substring(16,IP.length()-1);
	            Storage st_ = new Storage(dummy);
	            System.out.println("Ihre IP Adresse lautet " +  st_.getIp());
	        }//switch channel 
	        catch (UnknownHostException e) 
	        {
	 
	            e.printStackTrace();
	        }
	        finally
	        {
	        	Util.appenix();
	        	System.out.println("Starte Quiz"); 
	        	new QuizGame(); //Show Me Game 
	        }
	        //mux
	}

}
