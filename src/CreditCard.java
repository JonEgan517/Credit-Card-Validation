import java.util.*;
import java.io.*;

public class CreditCard 
{    
	public static void main (String[] args) throws IOException
	{	        
		Scanner file = new Scanner(new File("Credit Cards Numbers.txt")); 
		String fileLength = file.nextLine();
	  
		for (int n = 0; n < fileLength.length(); n++ )
	    {   
	    	 String line = file.nextLine();
	         String [] readCard = line.split("");
	         int size = readCard.length;
	         
	         System.out.println(line);
	    }    
	}
}
