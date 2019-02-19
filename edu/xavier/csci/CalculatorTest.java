public class CalculatorTest{
    public static void main( String[] args){
        Calculator ex = new Calculator();
        int sum = ex.calculate(2, 4);
        System.out.println(sum);

        sum = ex.calculate(2, 4, 3);
        System.out.println(sum);

        sum = ex.calculate(2, 4, 3, 5);
        System.out.println(sum);

        sum = ex.calculate();
        System.out.println(sum);

        sum = ex.calculate(2);
        System.out.println(sum);
    }
}