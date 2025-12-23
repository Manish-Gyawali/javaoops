import java.util.Scanner;
public class Attribute {
    int x;
    int y;
     public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        Attribute obj=new Attribute();
        System.out.println("Input the value of X and Y:\n");
        obj.x=sc.nextInt();
        obj.y=sc.nextInt();
        int p=obj.x*obj.y;
        System.out.print("Multiply:"+p);
        sc.close();
    }
}
