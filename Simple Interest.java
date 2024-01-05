//To calculate the Simple Interest
//
import java.util.Scanner;
class Interest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int P=sc.nextInt();
double r=sc.nextDouble();
double t=sc.nextDouble();
double si=P*r*t/100;
System.out.println(si);
}//main
}//class
