import java.util.ArrayList;

public class LoopOverNums {
	private int startNum;
	private int endNum;
	private int actNum;
	private String actOutStr;
	private ArrayList<String> resultList = new ArrayList<String>(endNum-startNum);
	
	
	
	/**Constructor */
	public LoopOverNums(int start, int end){
		startNum=start;
		endNum=end;
	}
	
	/**Looping over the interval between start and end numbers and calls HandleNum */
	private void loopOver(){
		for (int i=startNum; i<=endNum; i++){
			actNum = i;
			HandleNum actOut = new HandleNum(actNum);
			actOutStr = actOut.getOutString();
			resultList.add(actOutStr);
//			System.out.println(actOutStr);
		}
	}
	
	public  ArrayList<String> getResultList(){
		loopOver();
		return resultList;
	}
	
}
