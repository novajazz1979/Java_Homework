/**
 * Created by Alex Novikov on 13.08.2016.
 *
 * Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа
 */
public class Task_3_Out_Equal_Min_from_3 {

    public static void main(String[] args) {

        int x = 9;
        int y = 9;
        int z = 12;

        if (x <= y && x <= z)
            System.out.println("Min is x = " + x);

        if (y <= x && y <= z)
            System.out.println("Min is y = " + y);

        if (z <= x && z <= x)
            System.out.println("Min is z = " + z);
    }
}
