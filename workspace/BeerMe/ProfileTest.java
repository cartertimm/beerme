import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class ProfileTest {

	@Test
	public void testProfile() throws FileNotFoundException {
		Profile person = new Profile();
	}

	@Test
	public void testGetLikes() throws FileNotFoundException {
		Profile person = new Profile();
		Beer [] likes = person.getLikes();
		assertEquals("Alaskan Amber", likes[0].getName());
	}

	@Test
	public void testGetDislikes() throws FileNotFoundException {
		Profile person = new Profile();
		Beer [] dislikes = person.getDislikes();
		assertEquals("Alaskan Amber", dislikes[0].getName());
	}

	@Test
	public void testGetOnTap() throws FileNotFoundException {
		Profile person = new Profile();
		Beer [] tap = person.getOnTap();
		assertEquals("Bellevue Brewing 425 Pale Ale", tap[0].getName());
	}

	@Test
	public void testAddLike() throws FileNotFoundException {
		Profile person = new Profile();
		String a = "Bellevue Brewing Oatmeal Stout";
		int [] at = {4,8,8,9,6};
		Beer beer = new Beer(a,at);
		person.addLike(beer);
		
	}

	@Test
	public void testAddDislike() throws FileNotFoundException {
		Profile person = new Profile();
		String a = "Bellevue Brewing Oatmeal Stout";
		int [] at = {4,8,8,9,6};
		Beer beer = new Beer(a,at);
		person.addDislike(beer);
	}

	@Test
	public void testAddOnTap() throws FileNotFoundException {
		Profile person = new Profile();
		String a = "Bellevue Brewing Oatmeal Stout";
		int [] at = {4,8,8,9,6};
		Beer beer = new Beer(a,at);
		person.addOnTap(beer);
	}

	@Test
	public void testRemoveLike() throws FileNotFoundException {
		Profile person = new Profile();
		String a = "Bellevue Brewing Oatmeal Stout";
		int [] at = {4,8,8,9,6};
		Beer beer = new Beer(a,at);
		person.removeLike(beer);
	}

	@Test
	public void testRemoveDislike() throws FileNotFoundException {
		Profile person = new Profile();
		String a = "Bellevue Brewing Oatmeal Stout";
		int [] at = {4,8,8,9,6};
		Beer beer = new Beer(a,at);
		person.removeDislike(beer);
	}

	@Test
	public void testRemoveOnTap() throws FileNotFoundException {
		Profile person = new Profile();
		String a = "Bellevue Brewing Oatmeal Stout";
		int [] at = {4,8,8,9,6};
		Beer beer = new Beer(a,at);
		person.removeOnTap(beer);
	}

	@Test
	public void testSearchLike() throws FileNotFoundException {
		Profile person = new Profile();
		String a = "Alaskan Amber";
		int [] at = {4,8,8,9,6};
		Beer beer = new Beer(a,at);
		person.searchLike(beer);
	}

	@Test
	public void testSearchDislike() throws FileNotFoundException {
		Profile person = new Profile();
		String a = "Alaskan Amber";
		int [] at = {4,8,8,9,6};
		Beer beer = new Beer(a,at);
		person.searchDislike(beer);
	}

	@Test
	public void testSearchOnTap() throws FileNotFoundException {
		Profile person = new Profile();
		String a = "Alaskan Amber";
		int [] at = {4,8,8,9,6};
		Beer beer = new Beer(a,at);
		person.searchOnTap(beer);
	}

	

}
