import java.util.*;
class Divison
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value:");
int n=sc.nextInt();
int a[]=new int[n];
int sum=0;
int i;
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.print("the array is:");
for(i=0;i<a.length;i++)
{
System.out.print(a[i]+"\n");
}
for(i=0;i<n;i++)
{
if (a[i]%2==0||a[i]%5==0)
{
sum+=a[i];
}
}
System.out.print("sum is:"+sum);
}

}
