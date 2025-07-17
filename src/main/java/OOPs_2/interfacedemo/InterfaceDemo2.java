
interface Computer
{
    void compileCode(); // abstract method (must override in implementing class)

    
}

class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("you got 5 errors");
    }
}

class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("you got 5 errors, faster");
    }
}
// Developer class uses a Computer object to build an app
class Developer
{
    public void buildApp(Computer obj)
    {
        System.out.println("Building App");
        obj.compileCode();
    }  
}

public class InterfaceDemo2 {
    public static void main(String[] args) 
{

        
        Computer obj = new Laptop();
        Developer dev = new Developer();
        dev.buildApp(obj);
       

    }
}
