abstract class Shape
{
    abstract void draw(); // abstract method
}

class Circle extends Shape 
{
    void draw()
    {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape
{
    void draw() 
   {
        System.out.println("Drawing Rectangle");
    }
}

public class TestShape
{
    public static void main(String[] args)
   {
        Shape s1 = new Circle();
        s1.draw();

        Shape s2 = new Rectangle();
        s2.draw();
    }
}
