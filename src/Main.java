import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("Задание_1");
        byte[] arr1 = {0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0};
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr1));

        //2. Задать пустой целочисленный массив размером 8.
        //С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("Задание_2");
        byte[] arr2 = new byte[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (byte) (i * 3);
        }
        System.out.println(Arrays.toString(arr2));

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;
        System.out.println("Задание_3");
        byte[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        //и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("Задание_4");
        int r = 5;
        byte[][] arr4 = new byte[r][r];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (i == j || arr4.length - 1 == i + j) {
                    arr4[i][j] = 1;
                }
                System.out.printf("%s\t", arr4[i][j]);
            }
            System.out.println();
        }

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        System.out.println("Задание_5");
        Random rand = new Random();
        int len = 15;
        byte[] arr5 = new byte[len];
        byte min, indexMin, max, indexMax;
        for (int i = 0; i < len; i++) {
            arr5[i] = (byte) rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr5));
        min = max = arr5[0];
        indexMax = indexMin = 0;
        for (int i = 0; i < len; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
                indexMax = (byte) i;
            }
            if (arr5[i] < min) {
                min = arr5[i];
                indexMin = (byte) i;
            }
        }
        System.out.printf("В данном массиве %s-й элемент является максимальным и равен %s\n" +
                "%s-й является минимальным и равен %s", indexMax, max, indexMin, min);

        //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        //метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой
        //части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        //checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

        //7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        // или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Для усложнения задачи
        // нельзя пользоваться вспомогательными массивами.
    }
}
