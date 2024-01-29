package Seminar1.seminar;

//Задание №2
//        Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
//        максимальное количество подряд идущих 1.

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int max_count = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > max_count){
                    max_count = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println("Максимальное число единиц по порядку = " + max_count);
    }
}