



public class ArrayDemo1
{
    //int rollno;
    //int[] rollno;


    public static void main(String[] args)
    {
//        int[] a=new int[3];   //creation
//
//        a[0]=10;
//        a[1]=20;
//        a[2]=30;

        int[] a={10,20,30};

        System.out.println("Array Length : "+a.length);

        System.out.println("---------------------------------------");

        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
