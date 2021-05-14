import java.util.Scanner;

public class NumberPattern {
   public static void printNumPattern(int n1, int n2){
      
      if(n1 > 0) {
         
       System.out.println(n1 + " ");
       printNumPattern(n1 - n2, n2);
       
       System.out.println(n1 + " ");
  
      } else {
       
       System.out.println( n1 + " ");  
      }   
   }
  
   public static void main(String[] args) { 
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      printNumPattern(num1, num2); 
   } 
} 