import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // NullPointerException
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.err.println("NullPointerException: " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            int value = arr[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        }

        // NumberFormatException
        try {
            String strNum = "abc";
            int num = Integer.parseInt(strNum);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException: " + e.getMessage());
        }

        // IOException
        try {
            FileInputStream fis = new FileInputStream("archivo.txt");
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }

        // FileNotFoundException
        try {
            FileInputStream fis = new FileInputStream("archivo_que_no_existe.txt");
        } catch (IOException e) {
            System.err.println("FileNotFoundException: " + e.getMessage());
        }

        // InterruptedException
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException: " + e.getMessage());
        }

        // ClassCastException
        try {
            Object obj = "Hola";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.err.println("ClassCastException: " + e.getMessage());
        }

        // UnsupportedOperationException
        try {
            List<String> lista = Collections.unmodifiableList(null);
            lista.add("elemento");
        } catch (UnsupportedOperationException e) {
            System.err.println("UnsupportedOperationException: " + e.getMessage());
        }

        // IllegalArgumentException
        try {
            int edad = -5;
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}
