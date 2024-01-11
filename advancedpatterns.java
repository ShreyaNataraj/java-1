public class advancedpatterns {
  public static void hollow_rectangle(int totrows, int totcols){
    for(int i = 1; i<=totrows; i++){
      for(int j = 1;j<=totcols; j++){
        if(i ==1 || i==totrows || j==1 || j==totcols){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }

  }
  public static void inverted_and_rotated_half_pyramid(int n){
    for(int i = 1; i<=n; i++){
      //spaces
      for(int j = 1; j<=n-i; j++){
        System.out.print(" ");
      }
      for(int j =1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void half_pyramid_with_numbers(int n){
    for(int i = 1; i<=n; i++){
      for(int j = 1; j<=n-i+1; j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
  public static void floyds_triangle(int n){
    int counter = 1;
    for(int i = 1; i<=n; i++){
      for(int j = 1; j<=i; j++){
        System.out.print(counter);
        counter++;
      }
      System.out.println();
    }
  }
  public static void zero_one_triangle(int n){
    for(int i = 1; i<=n; i++){
      for(int j =1; j<=i; j++){
      if ((i+j)%2==0){
        System.out.print("1");
      }
      else{
        System.out.print("0");
      }
    }
      System.out.println();
      
      
      }
  }
  public static void butterfly(int n){
    for(int i = 1; i<=n; i++){
      for(int j = 1; j<=i; j++){
        System.out.print("*");

      }
      for(int j =1; j<=2*(n-i); j++){
        System.out.print(" ");
      }
      for(int j =1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    
    for(int i =n; i>=1; i--){
      for(int j =1; j<=i; j++){
        System.out.print("*");
        
      }
      for(int j =1;j<=2*(n-i);j++ ){
        System.out.print(" ");
      }
      for(int j =1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
 
  }
  public static void solid_rhombus(int n){
    for(int i = 1; i<=n; i++){
      for(int j =1; j<=n-i; j++){
        System.out.print(" ");

      }
      for(int j =1; j<=n; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void hollow_rhombus(int n){
    for(int i =1; i<=n; i++){
      for(int j =1; j<=n-i; j++){
        System.out.print(" ");
      }
      for(int j =1; j<=n; j++){
        if (i==1||i==n||j==1||j==n) {
          System.out.print("*");
          
        }
        else{System.out.print(" ");}
      }
      System.out.println();
    }

  }
  public static void diamond(int n){
    for(int i =1; i<=n; i++){
      for(int j =1; j<=n-i; j++){
        System.out.print(" ");
      }
      for(int j =1;j<=(2*i)-1; j++){
        System.out.print("*");
      }
      System.out.println();

    }
    for(int i =n; i>=1; i--){
     for(int j =1; j<=n-i; j++){
      System.out.print (" ") ;
     }
      for(int j =1; j<=(2*i)-1; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String args[]){
  diamond(4);
  }

}

