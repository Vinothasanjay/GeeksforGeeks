import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       int i=10;
       int fact=1;
       int j=1;
       while(j<=i){
           fact=fact*j;
           j++;
       }
       System.out.print(fact);
    }
}
