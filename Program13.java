import java.util.*;
class Program13
{
    public static void main(String args[])
    {
        float marks;
        int physics, chemistry, biology, maths, computer;
        float percentage, totalmarks;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks: ");
        marks=sc.nextFloat();
        System.out.println("enter physics marks: ");
        physics=sc.nextInt();
        System.out.println("enter chemistry marks: ");
        chemistry=sc.nextInt();
        System.out.println("enter biology marks: ");
        biology=sc.nextInt();
        System.out.println("enter maths marks: ");
        maths=sc.nextInt();
        System.out.println("enter computer marks: ");
        computer=sc.nextInt();
        totalmarks=physics+chemistry+biology+maths+computer;
        percentage=(marks/totalmarks)*100;
        System.out.println("marks:"+marks);
        System.out.println("physics marks:"+physics);
        System.out.println("chemistry marks:"+chemistry);
        System.out.println("biology marks:"+biology);
        System.out.println("maths marks:"+maths);
        System.out.println("computer marks:"+computer);
        System.out.println("total marks:"+totalmarks);
        System.out.println("percentage:"+percentage);
        if (percentage>=90)
        {
            System.out.println("grade A");
        }
        else if (percentage>=80)
        {
            System.out.println("grade B");
        }
        else if (percentage>=70)
        {
            System.out.println("grade C");
        }
        else if (percentage>=60)
        {
            System.out.println("grade D");
        }
        else if (percentage>=40)
        {
            System.out.println("grade E");
        }
}
}