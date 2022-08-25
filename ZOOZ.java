
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner cin = new Scanner(System.in);
		
		int t = cin.nextInt();
		
		while(t-->0){
		    cin.nextLine();
		    
		    int n = cin.nextInt();
		    
		    String s = "1";
		   
		    for(int i=1; i<=n-2;i++)
		        s+= "0";
		       
		    s+="1";
		    
		    System.out.println(s);
		
		}
		cin.close();
	}
}
