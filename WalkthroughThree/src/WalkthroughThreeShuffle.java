import java.util.*;

public class WalkthroughThreeShuffle {

	public static void main(String[] args) {
		//need ArrayList
		ArrayList<String> nameArrayList = new ArrayList<String>();
		
		//put some names into the ArrayList
		nameArrayList.add("Gary");
		nameArrayList.add("Cam");
		nameArrayList.add("Kyleigh");
		nameArrayList.add("Shauna");
		nameArrayList.add("Bill");
		
		//shuffle the nameArrayList
		
		
		Collections.shuffle(nameArrayList);
		
		//print out nameArrayList with enhanced for loop
		System.out.println("The names in this list are: ");

	     for(String nm:nameArrayList)
	    	 System.out.println(nm);
	     
	     //sort the list and output the sorted list printed
	     Collections.sort(nameArrayList);
	     
	     System.out.println();
	     System.out.println("The sorted names in this list are: ");

	     for(String nm:nameArrayList)
	    	 System.out.println(nm);

	}//end main

}//end class