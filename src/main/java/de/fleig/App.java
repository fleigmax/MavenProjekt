package de.fleig;
import java.io.*;

/**
 * Dieses Programm wandelt kleingeschriebene in großgeschriebene
 * Buchstaben um.
 */
public class App
{
    public static void main( String[] args ) throws IOException
    {

	String input="";

	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println( "Beliebige Buchstaben eingeben: " );
	input = r.readLine(); //BufferedReader liest String aus Konsole ein

	System.out.println(input.toUpperCase()); //Umgewandelter String wird ausgegeben


    }
}
