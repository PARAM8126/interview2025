
class Test {

    
   void sum(int a, int b) {
        int res = a + b;  
        System.out.println(res); 
    }

    // Method to add two floats
    void sum(float a, float b) {
        float res = a + b;  
        System.out.println(res);  
    }
}


class MethodOverloading {
    public static void main(String[] args) {
        Test t = new Test();  // Create object of Test class

        t.sum(10, 20);           // Calls sum(int, int) → Output: 30
        t.sum(10.4f, 20.7f);     // Calls sum(float, float) → Output: 31.1
    }
}
