//this:to pass an argument in the method
class S2
{
void m(S2 obj)
{
System.out.println("method is invoked");
}
void p()
{
m(this);//argumentm(ob)
}
public static void main(String args[])
{
S2 ob=new S2();
ob.p();
}
}
