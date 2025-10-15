//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
      
        System.out.println("Multiply: " + calc.multiply(2, 3));

      
        System.out.println("Subtract " + calc.subtract(12, 5));

        System.out.println("Average " + calc.average(52, 84));

        System.out.println("Addition: " + calc.add(2, 3));

        System.out.println("Is " + 222 + " an even number: " + calc.modulus(222));
        System.out.println("Is " + 333 + " an even number: " + calc.modulus(333));



        System.out.println("Divide " + calc.divide(2, 3));
    }
}