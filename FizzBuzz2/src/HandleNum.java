
public class HandleNum {
	private int actNum;
	private String outStr;
	
	/**Constructor */
	public HandleNum(int num){
		actNum=num;
	}
	/**Defines the outstring (outStr) - (if the actual number can be divided by 3 outStr 
	  equals to "fizz" if it can be divided by 5 its value is "buzz" if it can be divided
	  by both of these numbers it equals to "fizzbuzz". In other cases its value is the 
	  number in string type).*/
	private void procNum(){
		if (actNum%15==0){
			//System.out.println(fizz+buzz);
			outStr="fizzbuzz";
		}
		else if (actNum%3==0){
			//System.out.println(fizz);
			outStr="fizz";

		}
		else if (actNum%5==0){
			//System.out.println(buzz);
			outStr="buzz";
		}
		else{ //System.out.println(act_num);
		//String act_str=Integer.toString(act_num);
		outStr=Integer.toString(actNum);}
	}
	
	/** This method returns with the actual out string. */
	public String getOutString(){
		procNum();
		return outStr;
	}
}
