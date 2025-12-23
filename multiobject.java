public class multiobject{
    int y=6;
    float z=9.8f;
    public static void main(String[] args)
    {
        multiobject obj1= new multiobject();//class calling
        multiobject obj2=new multiobject();
        System.out.println(obj1.y);
        System.out.println(obj2.z);
    }
}