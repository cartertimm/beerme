

public class FileManager{
	
	//used to load beers into beerList in class Discover, also to create omitList for findBeers
	String[] getNames(String filename)
	
	//used only to get initial attributes to load beers into beerList
	int[][] getAttributes()
	
	//used to add a beer (only name is necessary) to likes.txt, dislikes.txt, or onTap.txt
	void add(String name, String filename)
	
	//used to remove a beer (only name is necessary) from likes.txt, dislikes.txt, or onTap.txt
	void remove(String name, String filename)
}
