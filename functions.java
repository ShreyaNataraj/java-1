import java.util.*;
public class functions {
  public static void sum(){
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int sum = a+b;
  System.out.println(sum);

  
}
//sum of the two numbers
public static int calculateSum(int a, int b){
  int sum = a+b;
  return sum;
}
//product of the two numbers
public static int product(int a ,int b){
  int prod = a * b;
  return prod;
}
//print the factorial of the number
public static int factorial(int n){
  int f =1;
  for(int i =1 ;i<=n; i++){
    f*=i;

  }
  return f;
}


  public static int binco(int n, int r) {
      int fact_n = factorial(n);
      int fact_r = factorial(r);
      int fact_nmr = factorial(n - r);
      int bincoeff = fact_n / (fact_r * fact_nmr);
      return bincoeff;
  }
  //print prime numbers in an optimised level
  public static boolean isprime(int n){
    for(int i =2; i<=Math.sqrt(n); i++){
      if(n%i==0){
        return false;
      }
      
    }
    return true;
  }
  //print all primes in range
  public static void printprimes(int n){
    for(int i =2; i<=n; i++){
      if(isprime(i)){
        System.out.print(i+ " ");
      }
    }
    System.out.println();

  }
  //converting binary to decimal numbers
 public static void bintodec(int binnum){
  int pow = 0;
  int decimal = 0;
  int mynum = binnum;
  while( binnum!=0){
    int lastdigit = binnum%10;
    decimal = decimal + lastdigit*(int)(Math.pow(2,pow));
    pow++;
    binnum = binnum/10;
  }
  System.out.println("decimal of" + "" + mynum + "is" + " " + decimal);
 }
 //converting decimal number to primary numbers
 public static void dectobin(int decnum){
  int mynum = decnum;
  int pow = 0;
  int binnum = 0;
  while(decnum>0){
    int rem = decnum % 2;
    binnum = binnum + (rem)*(int)(Math.pow(10,pow));
    pow++;
    decnum/=2;
  }
  System.out.println("binary form of" + mynum + " " + binnum);
 }
  public static void main(String args[]) {
     dectobin(23);
  }
}





