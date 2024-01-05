//This:calling default constructor from parameterized constructor
class A1
{
A1()
{
System.out.println("Hello A1 from default constructor");
}
A1(int x)
{
this();//calling
System.out.println(x);
}
}
class TestThis5
{
public static void main(String args[])
{
A1 a=new A1(10);
}
}