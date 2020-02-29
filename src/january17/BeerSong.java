package january17;

public class BeerSong {

//	static int beerNum = 99;
//	static String word = "bottles";
	
	public static void main (String args[]) {
		int beerNum = 99;
		String word = "bottles";
	
	while (beerNum >= 0) {
	
		if (beerNum == 1) {
			word = "bottle";
		}
		
//		System.out.print(beerNum + " "+word+ " of beer on the wall.");
//		System.out.println("Take one down and Pass it around.");
		if (beerNum > 0) {
			System.out.println(beerNum + " "+word+ " of beer on the wall.");
		}
		else
		{
			System.out.println("No more bottles of beer on the wall.");
		}
		beerNum--;
	}
	
	
	
	}
}
