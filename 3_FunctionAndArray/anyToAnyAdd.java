import java.util.*;
  
  public class anyToAnyAdd {
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt(); //source base
      int n1 = scn.nextInt(); 
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   } 
   
   public static int getSum(int b, int n1, int n2){
       // write ur code here
        int temp1 = anyBaseToDecimal(n1 , b);  // first convert both to decimal Base
        int temp2 = anyBaseToDecimal(n2 , b);  
        int sum = temp1 + temp2;                // then add them 
        return ( (decimalToAnyBase(sum, b) ) ); // then again convert to result to sourceBase
       
   }
  public static int decimalToAnyBase(int n, int b){
       
       int pow = 0;
       int newBaseN = 0; // result

       while( n != 0) {
           int rem = n % b;
           newBaseN += ( rem  * (int)Math.pow(10, pow) ) ;
           n /= b; // update the n for next rem
           pow++; // increase the pow by 1
       }
       return newBaseN;
   }
   
   public static int anyBaseToDecimal(int n, int b){
       
       int pow = 0;
       int newBaseN = 0; // result

       while( n != 0) {
           int rem = n % 10;
           newBaseN += ( rem  * (int)Math.pow(b, pow) ) ;
           n /= 10; // update the n for next rem
           pow++; // increase the pow by 1
       }
       return newBaseN;
   }
   
  
  }