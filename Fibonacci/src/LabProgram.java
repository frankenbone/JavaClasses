import java.util.Scanner;

public class LabProgram {
   
   public static int fibonacci(int n) {
      /* Type your code here. */  
      if(n<0)
         return -1;
      if(n==0||n==1)  
         return n;
      
      else
         return fibonacci(n-1)+fibonacci(n-2);
}
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      System.out.println("Enter your number: ");
      startNum = scnr.nextInt();
      System.out.println("fibonnaci(" + startNum + ") is " + fibonacci(startNum));
   }
}
