import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
* Задан целочисленный список ArrayList. 
* Найти минимальное, максимальное и среднее из этого списка.
*/

public class task3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list1 = new ArrayList<>(10);
        int arrSize = 10;
        for (int i = 0; i < arrSize; i++) {
            list1.add(i, random.nextInt(50));
        }
        System.out.println(list1);
        int min = Collections.min(list1);
        int max = Collections.max(list1);
        float sum = 0;
        for (int i = 0; i < arrSize; i++) {
            sum += list1.get(i);
        }
        System.out.printf("min = %d, max = %d, mean = %.1f", min, max, sum/arrSize);
    

    }
}
