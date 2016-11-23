package Task3_2;

/**
 * Created by Дима on 23.11.2016.
 */
import java.util.Random;
public class Arithmetic {

    public static void main(String[] args) {

        Random rand = new Random();

        Integer a = 10 - rand.nextInt(4);
        Integer b = 12 - rand.nextInt(6);

        System.out.println(Arithmetic.add(a,b));
        System.out.println(Adder.check(a,b));
    }

    static int add(Integer a, Integer b) {
        int sum = a+b;
        return sum;
    }
}


