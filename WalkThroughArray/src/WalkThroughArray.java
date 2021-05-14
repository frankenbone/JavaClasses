import java.util.*;



public class WalkThroughArray<T extends Comparable<T>>

{

    public <T extends Comparable<T>> T linearSearch(T[] a , T b, T c)

    {

        T[] m = a;

       

        // traverse the array

        for( i = 0 ; i < arr.length ; i++ )

            // if element is found

            if( arr[i].compareTo(key) == 0 )

                return i;

           

        // if element is not found

        return -1;

    }
}
