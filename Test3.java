


/**
 *
 * @author USER
 */

import java.io.IOException;

public class Test3 {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() throws IOException {
        try {
            System.out.println(20 / 0); // Ini akan menyebabkan ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught in methodB");
            throw new IOException("ArithmeticException occurred", e);
        }
        System.out.println("Method B");
    }
}

class Utama {
    public static void main(String[] args) {
        Test3 o = new Test3();
        o.methodA();
        try {
            o.methodB(); // Memanggil methodB yang bisa menyebabkan IOException
        } catch (Exception e) {
            System.out.println("Error di method B: " + e);
        } finally {
            System.out.println("Ini selalu dicetak");
        }
    }
}
