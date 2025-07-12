interface A
{
    int num = 6;
    void show ();
}

 public class  InterfaceDemo {
    
    public static void main(String[] args) {
        System.out.println(A.num);
      //  A.num = 9;  //  cannot assign new value
    }
}
