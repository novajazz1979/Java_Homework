/**
 * Created by Alex Novikov on 13.08.2016.
 *
 * Написать программу, которая проверит, является ли число четным или нечетным
 */
public class Task_4_Odd_or_even {

    public static void main(String[] args) {

        int x = 60;

        x = x % 2;

        if (x == 0)
            System.out.println("X is even");
            else System.out.println("X is odd");
    }
}
