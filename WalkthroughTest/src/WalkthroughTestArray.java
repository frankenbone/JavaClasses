import java.util.*;

public class WalkthroughTestArray {

	public static void main(String[] args) {
       
        Integer a[]= {2, 4, 6, 8};
        int n=6;
        GenericArray<Integer> a1=new GenericArray<>();
        System.out.println("Elements in the array "+Arrays.toString(a));
        int i=a1.search(a,n);
        if(i!=-1)
            System.out.println("Element "+n+ " Found at Index : "+i);
        else
        System.out.println("Element "+n+ "  Not Found  ");
        Double d1[]= {2.2, 4.2, 6.9, 8.8};
        GenericArray<Double> d2=new GenericArray<>();
        System.out.println("Elements in the array "+Arrays.toString(d1));
        double dd=4.2;
        i=d2.search(d1,dd);
        if(i!=-1)
            System.out.println("Element "+dd+ "  Found at Index : "+i);
        else
            System.out.println("Element "+dd+" Not Found  : ");
        String s1[]= {"Hello", "World", "This ","is"};
        GenericArray<String> s2=new GenericArray<>();
        System.out.println("Elements in the array "+Arrays.toString(s1));
        i=s2.search(s1,dd);
        if(i!=-1)
            System.out.println("Element "+dd+ "  Found at Index : "+i);
        else
            System.out.println("Element "+dd+" Not Found  : ");
    }
    
}