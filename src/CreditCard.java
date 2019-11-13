import java.util.*;
import java.io.*;

public class CreditCard 
{    
	public static void main (String[] args) throws IOException
	{	        
		Scanner file = new Scanner(new File("Credit Cards Numbers.txt"));
	    int fileLength = file.nextInt(); 
	    String line = file.nextLine();
	    
	    for (int n = 0; n < fileLength; n++ )
	    {   
	       line = file.nextLine();
	       System.out.println(line);
	    }    
	}
}
