package ipshow;

import util.Cellar;
//now import c. util package 

public class Storage extends Object 
{
	private String ip;
	
	public Storage (String ip)
	{
		this.ip = ip;
		new Cellar();
		// Help
	}

	public String getIp() 
	{
		return ip;
	}

	public void setIp(String ip) 
	{
		// Assign ip Value 
		this.ip = ip;
	}
	
	@Override
	public int hashCode()
	{
		//Kunst des Programmierers 
		return -1;
	}
}
