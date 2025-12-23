import java.util.Scanner;
public class Test {
   public static void main(String[] args)
   {
    Scanner es= new Scanner(System.in);
    int x;
    int y;
    String name;
    System.out.println("Enter the value of x:");
    x=es.nextInt();
    System.out.println("Enter the value of y:");
    y=es.nextInt();
    es.nextLine();
    System.out.println("Enter the name:");
    name=es.nextLine();
    System.out.print(+x);
    System.out.print(+y);
    System.out.print(" "+name);
    es.close();
   }
}
