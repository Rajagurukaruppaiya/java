import java.util.Scanner;

public class swap
{
public static void main(String[] args)
{
int a = 30;
int b = 10;

a= a+b; //30 = 30+10=40
a=a-b; //10 =40-10 =30
b=a-b;// 40-30 =10;

System.out.print("Enter the value a = " + a);
System.out.print("Enter the value b = " + b);
}
}