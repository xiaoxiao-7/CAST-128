//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.System.*;

public class Lab24b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File ("H:\\Java\\Unit14\\Unit14-Assignments\\lab24b.dat"));
		int size = file.nextInt();
		file.nextLine();
		PrintWriter TestWordSave = new PrintWriter( "H:\\Java\\Unit14\\Unit14-Assignments\\TestSave.txt" );
		for(int i = 0; i<size; i++)
		{
			String word = file.next();
			System.out.println(word);
			
			TestWordSave.write(word+" ");




	   }
		TestWordSave.close();
	}
}