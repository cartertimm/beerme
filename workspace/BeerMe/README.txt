Carter -- add getPreferences() in class Profile -- returns int[] of combined likes and dislikes.

If we need this in the future... I found it necessary to change the 
way we convert ArrayList to an Array.

Assuming an ArrayList called beerList is already created:

We had:
	return (Beer[]) beerList.toArray();

--This did not work properly.

We now have:
	Beer[] returnArr = new Beer[beerList.size()];
	returnArr = beerList.toArray(returnArr);
	return returnArr;

--This works fine and is the preferred way to do this (according to Stack Exchange)
