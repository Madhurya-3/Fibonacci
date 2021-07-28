import java.util.*;
class fibonacci
{
    public static void main()
    {
        System.out.println("Enter no. of numbers required in fibonacci series");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=3,f1=0,f2=1,fib=0;
        System.out.print("The series are "+f1+", "+f2);
        while(i<=n)
        {
            fib=f1+f2;
            System.out.print(", "+fib);
            f1=f2;
            f2=fib;
            i++;
        }
    }
}
