/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t>0){

            BigInteger num = cin.nextBigInteger();
            BigInteger fact = BigInteger.ONE;

            for(BigInteger i = BigInteger.ONE; i.compareTo(num)==-1 || i.compareTo(num)==0; i= i.add(BigInteger.ONE)){

                 fact = fact.multiply(i);
            }

            System.out.println(fact);
            t--;
        }
        cin.close();
	}
}
