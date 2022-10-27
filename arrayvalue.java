import java.util.Scanner;
class arrayvalue
{
public static void main(String args[])
{
int n; 
System.out.print("Enter the values of n:");
Scanner sc = new Scanner(System.in);
n= sc.nextInt();
int [] arr = new int[n];
System.out.println(" Enter the values:");
for (int i=0;i<n;i++)
{
arr[i]= sc.nextInt();
}
System.out.println(" values are:");
for(int i=0;i<n;i++)
{
if(i%2==0)
{
System.out.println("its even index "+i);
}
else
System.out.println("its odd   index "+i);
}
}
}
