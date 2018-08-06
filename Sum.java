import java.io.*;
class Sum
{
public static void main(String args[])
{
int sum=0,n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}
