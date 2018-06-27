
package javaapplication6;

public class JavaApplication6 {

    
    public static int faktoriyel(int x){
           int fakt=1;
           for(int i=1;i<=x;i++){
               fakt=fakt*i;
           }
           return fakt;
    }
        
    public static void main(String[] args) {
  
      int rows = 4, number = 1;
      int a;

        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                ++number;
                  System.out.println();
                for(int k=1;k<number;k++)
                {
                    System.out.println(faktoriyel(k));
                }
            }
                  
            System.out.println();
        }      
    }
    
}
