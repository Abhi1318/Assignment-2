import java.util.Scanner;
public class PrimeNumber 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,num,cnt=0;
        System.out.print("Enter Number: ");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                cnt++;
            }
        }
        if(cnt==2)
        {
            System.out.println(num+" is Prime.");
        }
        else
        {
            System.out.println(num+" is not Prime.");
        }
    }
}