package january25;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="devyani";
		System.out.println(str.length());
		System.out.println(str.indexOf("y"));
		System.out.println(str.length()-str.indexOf("y"));
		System.out.println(str.substring(str.indexOf("y"), str.length()));
		test obj = new test();
		System.out.println(obj.in1020(8, 9));
		
		int counter = 0;
		  while(str.indexOf("xx") != -1){
		     counter++;
		     str = str.substring(str.indexOf("xx")+1, str.length());
			  System.out.println(counter);
			  System.out.println(str.indexOf("xx"));

		  }
/*
 *	// =============== Pyramid printing ============	
 
	 for (int i=0;i<5;i++) {
		 for (int j=5; j>i; j--) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 
*/	 
	}
	public boolean in1020(int a, int b) {
		  if (a>=10 && b>=10 && (((a-10) <= 10) || ((b-10) <= 10)))
		  return true;
		  else
		  return false;
		}
	
}
