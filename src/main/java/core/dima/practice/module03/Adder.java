package core.dima.practice.module03;

public class Adder extends Arithmetic {
    boolean check(Integer a, Integer b) {
        if (a >= b) {
            return true;
        } else {
            return false;
        }
    }
}