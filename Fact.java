import java.io.*;
class Fact
{
public static void main(String args[])
{
int i,num,fact=1;
Scanner s=new Scanner(System.in);
num=s.nextInt();
for(i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}
