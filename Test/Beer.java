
public class Beer{
	
	// int[] attributes must be of form [bitterness, flavor, aroma, color, ABV]
	public Beer(String beerName, int[] beerAttributes){
		name = beerName;
		attributes = new int[5] attributes;
		for (int i = 0; i < 5; i++)
			attributes[i] = beerAttributes[i];
	}
	
	public String getName(){
		return name;
	}
	
	public int[] getAttributes(){
		return attributes;
	}	
	
	private String name;
	private int[] attributes;
}
