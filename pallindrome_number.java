import java.util.Scanner;
public class Pallindrome 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ld,rev=0,temp,num;
        System.out.print("Enter Number: ");
        num=sc.nextInt();
        temp=num;
        while(temp>0)
        {
            ld=temp%10;
            rev=rev*10+ld;
            temp/=10;
        }
        if(rev==num)
        {
            System.out.println(num+" is Pallidrome.");
        }
        else
        {
            System.out.println(num+" is not Pallidrome.");
        }
    }
}