class Prime
{
public static void main(String[] args)
{

for(int i=2;i<=100;i++)
{
int x=0;
for(int j=2;j<=i/2;j++)
{
if(i%j==0)
{x=1;
break;
}
} 
if(x==0)
{System.out.println(i);}
}
}
}
