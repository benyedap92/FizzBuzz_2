import java.util.ArrayList;

public class PrintTextStd {

	private ArrayList<String> result;
	
	public PrintTextStd( ArrayList<String> strList){
		result = strList;
	}
	
	/** This method writes out the elements of result list to the standard output.*/
	public void PrintToStdOut(){
		for (String val : result){
			System.out.println(val);
	}
}
}
