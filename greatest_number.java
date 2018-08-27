public class BiggestNumber 
{
    public static void main(String[] args)
    {
        int a,b,c,max;
        a=5;
        b=10;
        c=15;
        max=(a>b?(a>c?a:c):b>c?b:c);
        System.out.println(max+" is the greatest.");
    }
}