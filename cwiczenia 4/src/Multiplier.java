import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Multiplier {
    //a) metoda przyjmuje dwie zmienne typu int
        public int multiply(int a, int b) {
        return a + b;
    }

    // b) metoda przyjmująca cztery zmienne typu int
    public int multiply(int a, int b, int c, int d) {
        return multiply(a, b) * multiply(c, d);
    }

    // c) metoda przyjmująca dwie zmienne typu double
    public double multiply(double a, double b) {
        return a + b;
    }

    // d) metoda przyjmująca dwa obiekty typu BigDecimal
    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    // e) metoda przyjmująca listę obiektów klasy Integer
    public int multiply(ArrayList<Integer> numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
}

