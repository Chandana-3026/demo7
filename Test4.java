//This:to invoke current class method
class A
{
void m()
{
System.out.println("Hello m");
}
void n()
{
System.out.println("Hello n");
m();//calling m method of class A
}
}
class Test4
{
public static void main(String args[])
{
A a=new A();
a.n();
}
}
