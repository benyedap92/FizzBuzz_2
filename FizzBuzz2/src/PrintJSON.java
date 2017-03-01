import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class PrintJSON {
	private ArrayList<String> result;
	
	public PrintJSON(ArrayList<String> givenResults){
		result=givenResults;
		
	}
	/** Writes out the results to an html file*/
	public void printToJSON(){
		try {
		    BufferedWriter out = new BufferedWriter(new FileWriter("FizzBuzz.json"));
		    out.write("{\n \"title\" : \"FizzBuzz\"\n");
		    for (String val:result){
		    	out.write("{\"value\": "+val+"\n}");
		    }
		    out.write("\n}");
		                                             
		    out.close();
		}
		catch (IOException e)
		{
		    System.out.println("Exception ");

		}
		
		
	}
	}