import java.util.*;
class peterson
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,d,i,fact=1,sum=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        m=n;
        while(m>0)
        {
            d=m%10;
            m/=10;
            for(i=1;i<=d;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            fact=1;
        }
        if(n==sum)
        System.out.println("Peterson number");
        else
        System.out.println("Not Peterson number");
    }
}
        
                