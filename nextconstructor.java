import java.util.Scanner;
class nextconstructor 
{
    int x;
    String name;
    nextconstructor(int a, String b)
    {
        x=a;
        name=b;
    }
    public static void main(String[] args)
    {
       // nextconstructor obj=new nextconstructor(5,"john banega don"); //passing parameters
       //to pass user input values
       Scanner sc=new Scanner(System.in);
       int p;
       String c;
       System.out.println("Enter the value:");
       p=sc.nextInt();
       sc.nextLine();
       System.out.println("Enter the name:");
       c=sc.nextLine();
       nextconstructor obj=new nextconstructor(p, c);
        System.out.println("value is:"+obj.x);
        System.out.print("name:"+obj.name);
    }
}