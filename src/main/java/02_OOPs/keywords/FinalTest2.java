package keywords;

class Aa
{
    final void m1()
    {
        System.out.println("i am in class A");
    }
}
class Bb extends Aa
{

   // void m1()    ERROR: Cannot override the final method from A
    {
        System.out.println("i am in class B");
    }
}
class FinalTest2
{
    public static void main(String[] args)
    {
        Aa ob=new Bb();
        ob.m1();
    }
}
