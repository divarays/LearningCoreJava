package february1;

//import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Code";
		  int len = str.length();
		 
		  /* 
		   * 
		   * 		  String temp = "", finalStr = "";
			for (int i=0; i < len; i++){
			  finalStr = finalStr + str.charAt(i);
			  temp = temp + finalStr;
		    System.out.println(temp);
		    //finalStr = temp + temp
		  }*/
/*
 * 	//  =================== Reverse String ==============	  
 
		  Scanner strInput = new Scanner(System.in);
		  System.out.println("Please enter a String");
		  temp = strInput.nextLine();
		  len = temp.length();
		  for (int i=len-1; i >=0; i--){
		  finalStr = finalStr + temp.charAt(i);
		  }
		  System.out.println(finalStr);
		  strInput.close();
*/
		  int[] nums = {1, 2, 9};
		  int count = 0;
		  len = nums.length;
		  for (int i=0; i< len; i++) {
			  if (nums[i] == 9) {
				  count++;
			  }
		  }
		  System.out.println(count);
			  
	}

}
