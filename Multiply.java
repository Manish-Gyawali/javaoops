import java.util.Scanner;
    class Table {
        Scanner sc=new Scanner(System.in);
        int n;
        int i,j;
        void input()
        {
            System.out.println("Enter the number ");
            n=sc.nextInt();
        }
        void output()
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=10;j++)
                {
                   /*  System.out.println(i+"*"+j+"="+(i*j));*/
                   System.out.print(i+"*"+j+"="+(i*j)+"\n");
                   // we can  seperate the number by + sign
                }
                System.out.println();
            }
        }
        void scannerclose()
        {
            sc.close();
        }
}
public class Multiply{//file name must be public class
    public static void main(String[] args)
    {
        Table obj=new Table();
        obj.input();
        obj.output();
        obj.scannerclose();
    }
}
//public class contain main method