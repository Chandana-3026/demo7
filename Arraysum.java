//To find the length sum and average of an gien array
class Main3
{
public static void main(String args[])         
{
int[] numbers={2,-9,0,5,12,-25,22,9,8,12};
int sum=0;
Double average;
for(int a:numbers)
{
sum +=a;   
}
int arrayLength=numbers.length;
average=((double)sum/(double)arrayLength);
System.out.println("Sum="+sum);
System.out.println("Average="+average);
}
}

