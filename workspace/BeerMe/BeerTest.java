import static org.junit.Assert.*;

import org.junit.Test;

//import bin.Beer;

public class BeerTest {

	@Test
	public void testGetName() {
		int [] att = {5,5,5,5,5};
		String beerName = "bud";
		Beer bud = new Beer(beerName,att);
		assertEquals("bud",bud.getName());
	}

	@Test
	public void testGetAttributes() {
		int [] attributes = {5,5,5,5,5};
		String beerName = "bud";
		Beer bud = new Beer(beerName,attributes);
		int [] budAtt = bud.getAttributes();
		assertSame(attributes[0] + attributes [1] + attributes [2] + attributes [3] + attributes [4] ,budAtt[0] + budAtt[1] + budAtt[2] + budAtt[3] + budAtt[4]);
	}
}
