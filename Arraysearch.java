//important
import java.util.Scanner;
class Search_Element
{
public static void main(String args[])
{
int n,x,flag=0,i=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no.of elements you want in Array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter the element you want to find:");
x=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.println("Element found at position:"+(i+1));
}
else
{
System.out.println("Element not found");
}
}
}

