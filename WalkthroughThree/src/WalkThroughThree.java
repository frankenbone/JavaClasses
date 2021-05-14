import java.util.*;

public class WalkThroughThree {

	public static void main(String[] args) {
		//need ArrayList
		ArrayList<String> nameArrayList = new ArrayList<String>();
		
		//put some names into the ArrayList
		nameArrayList.add("Gary");
		nameArrayList.add("Cam");
		nameArrayList.add("Kyleigh");
		nameArrayList.add("Shauna");
		nameArrayList.add("Bill");
		
		//print out nameArrayList with enhanced for loop
		System.out.println("The names in this list are: ");

	     for(String nm:nameArrayList)
	    	 System.out.println(nm);

	}//end main

}//end class
