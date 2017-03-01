import java.util.ArrayList;

public class FizzProc {


		private int start=1;
		private int end=100;
		private ArrayList<String> results = new ArrayList<String>(end-start);
		
		/**Constructor */
		public FizzProc(){
		}
		
	/**Setting start and end numbers*/
		public void setStart(int newStart){
			start=newStart;
		}
		
		public void setEnd (int newEnd){
			end=newEnd;
		}
		
		public void processFizz(){
			
			LoopOverNums firstStep= new LoopOverNums(start,end);
			results=firstStep.getResultList();
			PrintTextStd secondStep=new PrintTextStd(results);
			secondStep.PrintToStdOut();
			PrintJSON thirdStep = new PrintJSON(results);
			thirdStep.printToJSON();
			PrintHTML fourthStep = new PrintHTML(results);
			fourthStep.PrintToHTML();
		}
		
}
