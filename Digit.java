import java.io.*;
class Digit
{
public static void main(String args[])
{
int num,c=0;
Scanner s=new Scanner(System.in);
num=s.nextInt();
while(num!=0)
{
num=num/10;
c++;
}
System.out.prinltn(c);
}
}
