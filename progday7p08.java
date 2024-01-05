//this:calling parameterized constructor from default constructor
class A2
{
A2()//default const
{
this(5);
System.out.println("Hello A2");
}
A2(int x)//paraemeterized const
{
System.out.println(x);
}
}
class TestThis6
{
public static void main(String args[])
{
A2 a=new A2();
}
}