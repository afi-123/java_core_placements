// Methods -Creating,Calling,returning,Passing
public class methods_creation {
    public static void main(String[] args) {
        methods_creation obj=new  methods_creation();//Object creation
// obj.sum(10,20); // method calling

int res=obj.sum(10,20);
System.out.println(res);

        System.out.println();
    }
    // public void sum(int a, int b) // method creation
    // {
    //     // int a=20,b=20;
    //     int c=a+b;
    //     System.out.println(c);
    // }
    public int sum(int a, int b) // method creation, passing
    {
        // int a=20,b=20;
        int c=a+b;
     return c;
    }
}