/*
 *	Practical Test #2 IB Computer Science MDV: Arrays, statistics
 */
import java.util.*;
import java.io.*;

public class PracticalTestQ3
{
	// Array size:
	public static int size(double[] array)
	{
		int result = 0; // modify
		result += array.length;
		return result;
	}
	//------------------------------------------------------------------

	// Minimum:
	public static double min(double[] array)
	{
		double minimum = array[0]; // modify
		
		for(int i = 0; i < array.length; i++){
			
			if(array[i] < minimum){
				minimum = array[i];
			}

		}
		return minimum;
	}
	//------------------------------------------------------------------

	// Maximum:
	public static double max(double[] array)
	{
		double maximum = 0; // modify
		for(int i = 0; i < array.length; i++){
			
			if(array[i] > maximum){
				maximum = array[i];
			}

		}
		return maximum;
	}
	//------------------------------------------------------------------

	// Range
	public static double range(double[] array)
	{
		double range = 0.0; // modify / your code goes here

			range=max(array)-min(array);

		return range;
	}
	//------------------------------------------------------------------

	// Average:
	public static double average(double[] array)
	{
		double average = 0.0; 
		double total = 0.0;

		for(int i = 0; i < array.length; i++){
			total=total + array[i];
		}
		average = total/array.length;
		// your code goes here
		return average;
	}
	//------------------------------------------------------------------

	// Mode:
	public static double mode(double array[])
	{
		double mode = 1;
		double max = 0.0;
		double number = 0.0;

		for(int i = 0; i < (array.length - 1); i++){
			for(int j = 1; j < array.length; j++){
				if(array[i] == array[j]){
					mode++;
				}

				if (max < mode){
					max = mode;
					number = array[i];
					mode = number;
				}
			}
		}
		return mode; //this doesn't seem to work properly
	}
	//------------------------------------------------------------------

	// For the median to work, the array double[] MUST BE SORTED
	public static double median(double[] array)
	{
		Arrays.sort(array); // DO NOT REMOVE THIS LINE, it sorts the array
		double median = 0;
		

		if(array.length % 2 == 0){
			double val1 = array[array.length / 2];
			double val2 = array[(array.length / 2) - 1];
			median = (double) (val1 + val2) / 2;
		}

		else{
			median = array[(array.length / 2)];
		}
		/* median = array[array.length/2]; */ //ignore this 
		return median;
	}

	public static double formatDouble(double x, int decimals)
	{	
		double result = 0.0; // modify
		//idk how to do this
		return result;
	}
	//------------------------------------------------------------------

	public static void main (String args[]) throws IOException
	{
		
		System.out.println("\n*** Statistical Analysis of Data Sets ***\n");

		double rainfall[]    = load("rainfall.txt");	// load data from files
		double temperature[] = load("temperature.txt"); // into arrays

		System.out.println( "\nSingapore Rainfall Statistics" );
		System.out.println( "Measurements   : " + size(rainfall) );
		System.out.println( "Minimum   (0.2): " + min(rainfall) );
		System.out.println( "Maximum (765.9): " + max(rainfall) );
		System.out.println( "Range   (765.7): " + range(rainfall) );
		System.out.println( "Average(178.89): " + average(rainfall) );
		System.out.println( "Mode    (127.2): " + mode(rainfall) );
		System.out.println( "Median  (159.7): " + median(rainfall) );

		System.out.println( "\nSingapore Temperature Statistics" );

		System.out.println( "\nSingapore Rainfall Statistics" );
		System.out.println( "Measurements   : " + size(temperature) );
		System.out.println( "Minimum   (0.2): " + min(temperature) );
		System.out.println( "Maximum (765.9): " + max(temperature) );
		System.out.println( "Range   (765.7): " + range(temperature) );
		System.out.println( "Average(178.89): " + average(temperature) );
		System.out.println( "Mode    (127.2): " + mode(temperature) );
		System.out.println( "Median  (159.7): " + median(temperature) );
		
		// write the appropriate code to process the temperature array here

		System.out.println();
	}

	//------------------------------------------
	//- DO NOT MODIFY THE CODE BELOW THIS LINE -
	//------------------------------------------

    public static double[] load(String fileName) throws IOException
    {
        //System.out.println("<<< Loading data >>>");
        File file = new File(fileName);
        if (!file.exists())
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return null;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		double[] data = new double[countLines(fileName)];
		while ( br.ready() )
		{
            temp = br.readLine();
            data[count] = Double.parseDouble(temp);
            count++;
        }
        br.close();
        System.out.println(fileName + " file loaded.");// optional
        return data;
    }

    public static int countLines(String fileName) throws IOException
    {
        File file = new File(fileName);
        if ( !file.exists() )
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return 0;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		while ( br.ready() )
		{
			temp = br.readLine();
            count++;
        }
        br.close();
        return count;
    }


}


