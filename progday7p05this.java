//this:to refer current class instance variable
class Student2
{
int id;//int rollno
String name;
float fee;
Student2(int id,String name,float fee)
{
this.id=id;
this.name=name;
this.fee=fee;
}
void display()
{
System.out.println(id+" "+name+" "+fee);
}
class TestThis2
{
public static void main(String args[])
{
Student2 s1=new Student2(111,"Ankit",5000f);
Student2 s2=new Student2(222,"Sumit",4000f);
s1.display();
s2.display();
}
}

