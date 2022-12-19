package square;

public class Square {
    public static int calculate(int num) {
        return num * num;
    }
}


package cube;

public class Cube {
    public static int calculate(int num) {
        return num * num * num;
    }
}


import java.util.Random;
import square.*;
import cube.*;

public abstract class AbstractClass {
    protected int number;
    public abstract void random();
}

public class Main extends AbstractClass {
    public void random() {
        Random rand = new Random();
        number = rand.nextInt(100) + 1;
    }

    public static void main(String[] args) {
        Main main = new Main();
        for (int i = 0; i < 10; i++) {
            main.random();
            int num = main.number;
            System.out.println("Number: " + num);
            System.out.println("Square: " + Square.calculate(num));
            System.out.println("Cube: " + Cube.calculate(num));
        }
    }
}
