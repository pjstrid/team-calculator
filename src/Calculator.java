public class Calculator {
  
    public int multiply(int a, int b) {
        return a * b;
    }

    public int subtract(int a, int b){

        return a - b;
    }
  
    public int add (int a, int b) {
        return a + b;
    }

    public boolean modulus (int a){
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
