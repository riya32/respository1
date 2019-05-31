import java.io.*;
class prime
{
public static void main(String args[])
{
int f,n,i,j,l;
l=args[0].length();
n=Integer.parseInt(args[0]);
System.out.println("The Length of  the Command agrument:"+l);
System.out.println("Prime number");
for(i=3;i<=n;i++)
{
f=0;
for(j=1;j<=n;j++)
{
if(i%j==0)
f++;
}
if(f==2)
System.out.println(+i);
}
}
}