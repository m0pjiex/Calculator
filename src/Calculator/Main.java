package Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double x = 5;
        double y = 5;
        System.out.println(calculator.Sum(x, y));
        System.out.println(calculator.Del(x, y));
    }
}
