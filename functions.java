import java.util.*;
public class functions {
  public static void sum(){
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int sum = a+b;
  System.out.println(sum);

  
}
public static int calculateSum(int a, int b){
  int sum = a+b;
  return sum;
}
public static int product(int a ,int b){
  int prod = a * b;
  return prod;
}
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

  public static void main(String args[]) {
      System.out.println(binco(5,5 ));
  }
}




