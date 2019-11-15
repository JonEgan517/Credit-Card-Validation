import java.util.*;
import java.io.*;

public class CreditCard 
{    
	public static void main (String[] args) throws IOException
	{	        
		Scanner file = new Scanner(new File("Credit Cards Numbers.txt")); 
		Scanner stringInput = new Scanner(System.in);
		System.out.println("how many credit cards?");
		int fileLength = stringInput.nextInt();
		
		for(int n = 0; n < fileLength; n++)
		{
	    	String line = file.nextLine(); 
	        int[] readCard = new int[line.length()];
	 		for (int i = 0; i < line.length(); i++) 
	 		{
	 			readCard[i] = Integer.parseInt(line.substring(i, i + 1));
	 		}
	 		
	 		for (int i = readCard.length - 2; i >= 0; i = i - 2) 
	 		{
	 			int doubleIt = readCard[i];
	 			
	 			doubleIt = doubleIt * 2;
	 			
	 			if (doubleIt > 9) 
	 			{
	 				doubleIt = doubleIt % 10 + 1;
	 			}
	 			readCard[i] = doubleIt;
	 		}
	 		
	 		int sum = 0;
	 		
	 		for (int i = 0; i < readCard.length; i++) 
	 		{
	 			sum += readCard[i];
	 		}
	 		
	 		if (sum % 10 == 0) 
	 		{
	 			System.out.println(line + " is a valid credit card number");
	 		} 
	 		
	 		else 
	 		{
	 			System.out.println(line + " is an invalid credit card number");
	 		}
		}    
	}
}
