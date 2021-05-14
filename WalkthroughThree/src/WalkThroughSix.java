import java.util.*;

public class WalkThroughSix {

	private static int s;

	@SuppressWarnings("unlikely-arg-type")
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

		//search for name in list

		if(nameArrayList.contains("Kyleigh"))

		{

			int index=nameArrayList.indexOf("Kyleigh");

			System.out.println();
			System.out.println("Index of name:"+index);
			System.out.println();

		}

		else{
			System.out.println();
			System.out.println("Name is not found in array list");
		}

		//convert nameArrayList to array

		{
			Object[] names = nameArrayList.toArray();

			//print the names array
			System.out.println("The names in the array output as an array are: ");
			for (Object obj:names)
				System.out.printf(obj + " ");

			System.out.println();

			//convert Array back to ArrayList

			System.out.println();
			Collection<Object> nameList = Arrays.asList(names);
			System.out.println("The names printed as an ArrayList are: ");
			System.out.println(nameList);


		}

	}//end main

}//end class
