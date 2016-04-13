
import java.util.ArrayList;
import java.lang.Math;

public class Profile{
	
	public Profile(){
		fileAccess = new FileManager();
		likes = new ArrayList<Beer>();
		dislikes = new ArrayList<Beer>();
		onTap = new ArrayList<Beer>();
		
		Beer[] beerList = Discover.getBeerList();
		
		//add to likes ArrayList
		String[] fromFiles = fileAccess.getNames("likes.txt");
		for (int i = 0; i < fromFiles.length; i++){
			for (int j = 0; j < beerList.length; i++){
				if (beerList[j].getName().equals(fromFiles[i])){
					likes.add(beerList[j]);
					break;
				}
			}
		}
		likes.trimToSize();
		
		//add to dislikes ArrayList
		fromFiles = fileAccess.getNames("dislikes.txt");
		for (int i = 0; i < fromFiles.length; i++){
			for (int j = 0; j < beerList.length; i++){
				if (beerList[j].getName().equals(fromFiles[i])){
					dislikes.add(beerList[j]);
					break;
				}
			}
		}
		dislikes.trimToSize();
		
		//add to onTap ArrayList
		fromFiles = fileAccess.getNames("onTap.txt");
		for (int i = 0; i < fromFiles.length; i++){
			for (int j = 0; j < beerList.length; i++){
				if (beerList[j].getName().equals(fromFiles[i])){
					onTap.add(beerList[j]);
					break;
				}
			}
		}
		onTap.trimToSize();
	}
	
	public Beer[] getLikes(){
		return likes.toArray();
	}
	
	public Beer[] getDislikes(){
		return dislikes.toArray();
	}
	
	public Beer[] getOnTap(){
		return onTap.toArray();
	}
	
	public void addLike(Beer beer){
		likes.add(beer);
		likes.trimToSize();
		fileAccess.add(beer.getName(), "likes.txt");
	}
	
	public void addDislike(Beer beer){
		dislikes.add(beer);
		dislikes.trimToSize();
		fileAccess.add(beer.getName(), "dislikes.txt");
	}
	
	public void addOnTap(Beer beer){
		onTap.add(beer);
		onTap.trimtoSize();
		fileAccess.add(beer.getName(), "onTap.txt");
	}
	
	public void removeLike(Beer beer){
		like.remove(Beer);
		like.trimToSize();
		fileAccess.remove(beer.getName(), "likes.txt");
	}
	
	public void removeDislike(Beer beer){
		dislike.remove(beer);
		dislike.trimToSize();
		fileAccess.remove(beer.getName(), "dislikes.txt");
	}
	
	public void removeOnTap(Beer beer){
		onTap.remove(beer);
		onTap.trimToSize();
		fileAccess.remove(beer.getName(), "onTap.txt");
	}
	
	public int[] getPositiveAttributes(){
		int[] posAtts = new int[5];
		if (likes.size() == 0){
			for (int i = 0; i < 5; i++)
				posAtts[i] = 5;
			return posAtts;
		}
		
		for (int i = 0; i < likes.size(); i++){
			int[] attributes = likes[i].getAttributes;
			for (int j = 0; j < 5; j++){
				posAtts[j] += attributes[j];
			}
		}
		
		for (int i = 0; i < 5; i++){
			posAtts[i] = posAtts[i] / likes.size();
			posAtts[i] = (int) Math.round(posAtts[i]);
		}
		
		return posAtts;
	}
	
	public int[] getNegativeAttributes(){
		int[] negAtts = new int[5];
		if (dislikes.size() == 0){
			for (int i = 0; i < 5; i++)
				negAtts[i] = 64;
			return negAtts;
		}
		
		for (int i = 0; i < dislikes.size(); i++){
			int[] attributes = dislikes[i].getAttributes;
			for (int j = 0; j < 5; j++){
				negAtts[j] += attributes[j];
			}
		}
		
		for (int i = 0; i < 5; i++){
			negAtts[i] = negAtts[i] / dislikes.size();
			negAtts[i] = (int) Math.round(negAtts[i]);
		}
		
		return negAtts;
	}
	
	public Beer[] getOmits(){
		ArrayList<Beer> omits = new ArrayList<Beer>();
		omits.addAll(likes);
		omits.addAll(dislikes);
		omits.addAll(onTap);
		omits.trimToSize();
		return omits.toArray();
	}
	
	
	
	private ArrayList<Beer> likes;
	private ArrayList<Beer> dislikes;
	private ArrayList<Beer> onTap;
	private FileManager fileAccess;
}
