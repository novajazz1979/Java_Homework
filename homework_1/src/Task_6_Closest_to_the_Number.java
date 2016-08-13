/**
 * Created by Alex Novikov on 13.08.2016.
 *
 * Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11
 * ближайшее к десяти 11.
 */
public class Task_6_Closest_to_the_Number {

    public static void main(String[] args) {

        int x = 10;
        int y = 8;
        int z = 12;

        int a = x - y;
        int b = x - z;

        if (a < 0) a = a * -1;
        if (b < 0) b = b * -1;

        if (a > b) System.out.println("Z is closer to X");
            else if (a < b) System.out.println("Y is closer to X");
                else System.out.println("Z and Y have equal destination to X");
    }
}
