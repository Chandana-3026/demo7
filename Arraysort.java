import java.util.Scanner;
class Search_Element
{
public static void main(String args[])
{
int n,flag=0,i=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no.of elements you want in Array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
//code for sorting
for(i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
int temp=0;
if(a[i]>a[j])//elements ascending to descending//a[i] < a[j] descending to ascending
{
//swap a[i] and a[j]
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int x:a)
{
//System.out.println("After sorting the elements are:");
System.out.print(x+" ");
}
}
}