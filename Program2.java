import java.util.*;
public class Program2{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the a value");
         System.out.println("enter the b value");
          System.out.println("enter the c value");
          int a=sc.nextInt();
           int b=sc.nextInt();
            int c=sc.nextInt();
            if (a>b && a>c){
                System.out.println("a is big");
            }
            else if (b>c){
                System.out.println("b is big");
            }
           else {
               System.out.println("c is big");
           }
    }
}