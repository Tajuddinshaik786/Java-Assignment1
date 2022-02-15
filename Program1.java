import java.util.*;
public class Program1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("enter a value");
      
       int a=sc.nextInt();
       System.out.println("enter b value");
        int b=sc.nextInt();

        if (a>b){
          System.out.println("a is a maximum nunber");
        }

    else {
        System.out.println("b is a maximum number");
    }
        
    }
}