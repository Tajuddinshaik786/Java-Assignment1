import java.util.*;
public class Program3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        if (n >0){
          System.out.println("it is a positive number");
        }
      else if(n<0) {
          System.out.println("it is a negative number");
          
      }
    
        else {
            System.out.println("it s a zero");
        }
    }

}