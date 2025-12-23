import java.util.Scanner;
public class constructor{
    int x;//constructor doesnot have return type!
    public constructor(int y)//class constructor class name=constructor name
    {
        x=y;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int n=sc.nextInt();
        constructor obj=new constructor(n);//object creation
        System.out.print("value is:"+obj.x);
        sc.close();
    }
}
