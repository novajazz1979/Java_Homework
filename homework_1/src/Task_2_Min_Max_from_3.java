/**
 * Created by Alex Novikov on 13.08.2016.
 *
 * Найти среди 3х чисел максимальное и минимальное
 */
public class Task_2_Min_Max_from_3 {

    public static void main(String[] args) {

        int x = 38;
        int y = 52;
        int z = 14;

        if (x < y && x < z)
            System.out.println("Min is " + x);
            else if (y < x && y < z)
            System.out.println("Min is " + y);
                else System.out.println("Min is " + z);

        if (x > y && x > z)
            System.out.println("Max is " + x);
            else if (y > x && y > z)
            System.out.println("Max is " + y);
                else System.out.println("Max is " + z);
    }
}
