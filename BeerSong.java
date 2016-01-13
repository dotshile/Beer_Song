
public class BeerSong {

	public static void main(String[] args) {
		int beerNum = 99; // declares int, name beerNum, assign 99
		String word = "bottles"; //declares string, name word, assign bottles
		
		while (beerNum > 0) { //code will run as beerNum > 99
			
			if (beerNum == 1 ) {
				word = "bottle"; //when beerNum becomes 1, changes the word to singular
			}
			
			System.out.println(beerNum + " " + word + " of beer on the wall,"); //prints line
			System.out.println(beerNum + " " + word + " of beer."); //prints line
			System.out.println("Take one down. "); //prints line
			System.out.println( "Pass it around. "); //prints line
			beerNum = beerNum - 1; //subtracts one from beerNum
			
			if (beerNum > 0) { //if beerNum > 0
				System.out.println(beerNum + " " + word + " of beer on the wall."); //print line
				System.out.println(); //print line
			}
			else { //runs when beerNum == 0
					System.out.println("No more bottles of beer on the wall.");
			}
		}
	}
}