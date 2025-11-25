import java.util.Scanner;
public class Tower {
    public static void Tower(int n,String src,String helper,String Des)
    {
if(n==1)
{
    System.out.println(n + " moved from " + src +" to " + Des);
}
else
{
Tower(n-1,src,Des,helper);
System.out.println(n + " move from " + src +" to " + helper);
Tower(n-1,helper,src,Des);
}

    }
    public static void  main(String args[])
    {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n= sc.nextInt();
Tower(n,"S","H","D");

    }
    
}
