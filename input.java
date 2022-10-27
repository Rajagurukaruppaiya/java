import java.util.*;

class input
{

public static void main(String [] args)
{
System.out.print("Enter the first value:");
Scanner sc=new Scanner(System.in);
int a = sc.nextInt();

System.out.print("Enter the second value:");
Scanner sd=new Scanner(System.in);
int b = sd.nextInt();
int c=a%b;
System.out.print("The Result value is:" + c);
}
}