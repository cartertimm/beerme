
import java.util.ArrayList;
import java.lang.Math;

/**
	Loops through the array holding all beers used in the program. Each beer's
	attributes are checked and the differences are found and stored. If a beer
	does not have at least one attribute that matches the desired attributes
	exactly	or at least two attributes that are one away from the desired
	attributes and so on, the next beer is looked at. Once a beer is identified
	as a potential match, it is ensured that it is not in the list of beers to 
	not display. If it is not in that list, the same procedure for finding
	positive attribute matches is done, albeit with negative attributes. If the
	beer in question does not match the negative attributes, it is added to the 
	array of matched beers and the next beer is looked at.
	
	@param	posAtts: array holding desired attributes in a beer
	@param  negAtts: array holding undesired attributes of beer
	@param	all	   : array holding all beers in the program
	@param  omits  : array holding beers to not select
	
	@return        : array holding all matched beers
*/
Beer[] findBeers(int[] posAtts, int[] negAtts, Beer[] all, Beer[] omits){
	ArrayList matchedBeers = new ArrayList(0);	// used to hold matched beers
	
	/*
		Loop through all beers.
	*/
	
	for (int i = 0; i < all.length; i++){
		int[] difference = {0, 0, 0, 0, 0};	// both pos and neg differences
		int[] curAtts = all[i].getAttributes();	// current attributes
		
		/*
			Calculate the difference between positive attributes and those of
			the current beer. Save the relevant values in the difference array.
		*/
		
		for (int j = 0; j < 5; j++){
			switch (Math.abs(curAtts[j] - posAtts[j]){
				case (0):
					difference[0]++;
					break;
				case (1):
					difference[1]++;
					break;
				case (2):
					difference[2]++;
					break;
				case (3):
					difference[3]++;
					break;
				case (4):
					difference[4]++;
					break;
			}
		}
		
		/*
			Check if the current beer matches the positive values. If not, look
			at the next beer.
		*/
		
		boolean posMatch = false;	// positive match flag
		for (int j = 0; j < 5; j++){
			if (difference[j] > j){
				posMatch = true;
				break;
			}
		}
		
		if (posMatch){
			
			/*
				Check if the beer is in the list of beers to not display. If so,
				look at the next beer.
			*/
			
			boolean inOmits = false;	// omits list flag
			for (int j = 0; j < omits.length; j++){
				if (all[i].getName().equals(omits[j].getName()){
					inOmits = true;
					break;
				}
			}
			
			if (!inOmits){
				
				/*
					Reset the difference array to use with negative differences.
				*/
				
				for (int j = 0; j < 5; j++)
					difference[j] = 0;
				
				/*
					Calculate the difference between negative attributes and
					those of the current beer. Save the relevant values in the
					difference array.
				*/
				
				for (int j = 0; j < 5; j++){
					switch (Math.abs(curAtts[j] - negAtts[j]){
						case (0):
							difference[0]++;
							break;
						case (1):
							difference[1]++;
							break;
						case (2):
							difference[2]++;
							break;
						case (3):
							difference[3]++;
							break;
						case (4):
							difference[4]++;
							break;
					}
				}
				
				/*
					Check if the current beer matches the negative values. If
					so, look at the next beer. If not, add the current beer 
					being looked at to the matchedBeers array.
				*/
				
				boolean negMatch = false;	// negative match flag
				for (int j = 0; j < 5; j++){
					if (difference[j] > j){
						negMatch = true;
						break;
					}
				}
				
				if (!negMatch)
					matchedBeers.add(all[i]);
			}
		}
	}
	
	return matchedBeers.toArray();
}
