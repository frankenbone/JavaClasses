public class TestFibonacci{
	

public static void main(String args[]) 
    { 
        int fibArray[]={5, 10, 15, 20};
        int recFib;
        int itFib;
        long startTime;
        long endTime;
        long totalTime;
        
        
        
        for(int i=0 ; i<4; i++) { 
        	
             startTime = System.nanoTime();
             recFib = recursivefib(fibArray[i]);
             endTime   = System.nanoTime();
             totalTime = endTime - startTime;
             
             //Call recursive method and print out the results
             System.out.println(fibArray[i]+"th number with recusion method is "+recFib+" and time to finish is "+ totalTime);
             System.out.println();//space for readability
             
             //Call the iterative method with new startTime, etc and print out the results
             startTime = System.nanoTime();
             itFib = iterativefib(fibArray[i]);
             endTime   = System.nanoTime();
             totalTime = endTime - startTime;
             System.out.println(fibArray[i]+"th number with iteration method is "+itFib+" and time to finish is "+ totalTime);
             System.out.println();//space for readability
          

        } 
    
    } // end main

//---------------------------------------methods---------------------------------------------------

private static int recursivefib(int n) 
	{ //recursive method for fib
	
		if (n <= 1) 
			return n; 
		return recursivefib(n - 1) + recursivefib(n - 2); 
		
	} 


//iterative method
private static int iterativefib(int n) 
{ 
//set an array using int f[] 
	
int f[] = new int[n+2]; // 1 extra to handle a case n = 0 (Zybooks)
int i; 
   
//1st and second numbers are 0 and 1
f[0] = 0; 
f[1] = 1; 
  
for (i = 2; i <= n; i++) 
{ 
   /* Add the previous 2 numbers in the series 
     and store it */
    f[i] = f[i-1] + f[i-2]; 
} 
   
return f[n]; 
} 
}
