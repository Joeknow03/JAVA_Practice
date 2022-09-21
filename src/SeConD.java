import java.util.Scanner;
public class SeConD {
        class A { static public void print() {
            System.out.println("A.print() is called");

        } }
        class B extends A { static public void print() {
            System.out.println("B.print() is called");

        } } public void Main(String... args) {
            A var = new B(); var.print();

        }
        }



