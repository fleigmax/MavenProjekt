package de.fleig;
import java.io.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException
    {

	String input="";

	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println( "Beliebige Buchstaben eingeben: " );
	input = r.readLine();

	System.out.println(input.toUpperCase());


    }
}
