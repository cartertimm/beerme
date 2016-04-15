import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class FileManagerTest {

	@Test
	public  void testGetAttributes() throws FileNotFoundException {
		FileManager file = new FileManager();
		int [][] list = file.getAttributes();
		assertEquals(2,list[0][0]);
	}

	@Test
	public void testGetNames() throws IOException {
		FileManager file = new FileManager();
		String [] list = file.getNames("likes.txt");
		assertEquals("Alaskan Amber",list[0]);
	}

	@Test
	public void testQuitAndSave() throws IOException {
		
		String beer1 = "Alaskan Amber";
		String beer2 = "Alaskan White";
		String beer3 = "Bellevue Brewing 425 Pale Ale";
		int [] att1 = {2,5,3,7,5};
		int [] att2 = {2,4,3,3,5};
		int [] att3 = {4,4,7,4,5};
		Beer a = new Beer(beer1,att1);
		Beer b = new Beer(beer2,att2);
		Beer c = new Beer(beer3, att3);
		Beer [] al = {a};
		Beer [] bl = {b};
		Beer [] cl = {c};
		FileManager file = new FileManager();
		file.quitAndSave(al,bl,cl);
		String [] likes = file.getNames("likes.txt");
		String [] dislikes = file.getNames("dislike.txt");
		String [] ontap = file.getNames("onTap.txt");
		assertEquals("Alaskan Amber",likes[0]);
		assertEquals("Alaskan White",dislikes[0]);
		assertEquals("Bellevue Brewing 425 Pale Ale",ontap[0]);
	}

}
