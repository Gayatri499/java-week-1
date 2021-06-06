import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
int sum=0,i,r,n;
Scanner c=new Scanner(System.in);
System.out.print("Enter a number: ");
n=c.nextInt();
i=n;
while(n>0)
{r=n%10;
sum=sum+(r*r*r);
n=n/10;
}
if(i==sum)
{System.out.println(i+" is an Armstrong number.");}
else
{ 
  System.out.println(i+" is not an Armstrong number.");}
}
 }


	 
	