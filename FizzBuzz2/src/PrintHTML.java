import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class PrintHTML {
	private ArrayList<String> result;
	
	public PrintHTML(ArrayList<String> givenResults){
		result=givenResults;
		
	}
	/** Writes out the results to an html file*/
	public void PrintToHTML(){
		try {
		    BufferedWriter out = new BufferedWriter(new FileWriter("FizzBuzz.html"));
		    out.write("<!DOCTYPE html>\n<html>\n<head>\n<title>FizzBuzz</title>");
		    for (String val:result){
		    	out.write("<p>"+val+" </p>");
		    }
		    out.write("</body>\n</html>");
		                                             
		    out.close();
		}
		catch (IOException e)
		{
		    System.out.println("Exception ");

		}
		
		
	}
	}
	
	

