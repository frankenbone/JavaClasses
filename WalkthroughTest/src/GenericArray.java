import java.util.*;

public class GenericArray{

	//receive an array of type T and search for key
    public int search(T[] arr,Object key){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(key))
                return i;
        }
        return -1;
    }


}//end of class
	


