import java.util.*;
public class Program4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if (num%5==0 && num%11==0){
System.out.println("It is divisible");
        }
        else{
            System.out.println("It is not divisible by 5 and 11");
        }
    }
}