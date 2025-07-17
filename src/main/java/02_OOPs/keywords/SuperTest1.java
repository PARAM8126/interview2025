package keywords;

class Aaa
{
    int no=10;
}
class Bbb extends Aaa
{
    int no=20;
    void show(int no)
    {
     //   System.out.println(no);
       // System.out.println(this.no);
        System.out.println(super.no);
    }
}

class SuperTest
{
    public static void main(String[] args)
    {
        Bbb ob=new Bbb();
        ob.show(30);
    }
}
