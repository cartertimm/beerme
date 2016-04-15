import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class DiscoverTest {

	@Test
	public void testDiscover() throws FileNotFoundException {
		Discover listofBeers = new Discover();
		
	}
	


	@Test
	public void testSearch() {
		Beer [] result = Discover.search("Alaskan Amber");
		assertEquals("Alaskan Amber", result[0].getName());
		
	}

	@Test
	public void testFindBeers() {
		int [] posAt = {4,8,7,9,6};
		String bud = "bud";
		Beer budw = new Beer(bud,posAt);
		int [] negAt = {1,1,1,1,1};
		Beer [] omitBeer = {budw};
		Beer [] result = Discover.findBeers(posAt,negAt,omitBeer);
		assertEquals("Bellevue Brewing 425 Pale Ale", result[0].getName());
	}

	@Test
	public void testGetBeerList() throws FileNotFoundException {
		int [] posAt = {4,8,7,9,6};
		String bud = "bud";
		Beer budw = new Beer(bud,posAt);
		Discover discover = new Discover();
		Beer[] listOfBeers = discover.getBeerList();
		assertEquals("Alaskan Amber", listOfBeers[0].getName());
	}

}
