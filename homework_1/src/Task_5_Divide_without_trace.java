/**
 * Created by Alex Novikov on 13.08.2016.
 *
 * Даны 2 числа, определить делится ли первое число на второе без остатка
 */
public class Task_5_Divide_without_trace {

    public static void main(String[] args) {

        int x = 61;
        int y = 30;

        x = x % y;
        System.out.println(x);
        if (x == 0)
            System.out.println("First number divided into second number without a trace");
            else System.out.println("First number divided into second number with a trace");
    }
}
