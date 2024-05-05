import java.math.BigDecimal;
import java.util.List;

public class Adder {

    // a) metoda przyjmującą jako parametry dwie zmienne typu int
    public int add(int a, int b){
        return a+b;
    }
    //b) metoda przyjmująca jako parametry listę obiektów klasy BigDecimal
    public BigDecimal add(List<BigDecimal>numbers){
        BigDecimal sum= BigDecimal.ZERO;
        for (BigDecimal num: numbers){
            sum = sum.add(num);
        }
        return sum;
    }
}
