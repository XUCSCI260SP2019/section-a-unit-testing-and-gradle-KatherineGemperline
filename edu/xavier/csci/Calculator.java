public class Calculator {

    public int calculate(int ... args){
        int sum = 0;
        for(int x: args){
            sum = sum + x;
        }
        return sum;
    }
}