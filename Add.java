import java.io.*;
class Add
{
public static void main(String args[])
{
int a[10];
int n,k,i,sum=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
k=s.nextInt();
for(i=1;i<=k;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}
