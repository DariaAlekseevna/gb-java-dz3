import java.util.ArrayList;
import java.util.Random;

/*
Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */
public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list1 = new ArrayList<>(10);
        int arrSize = 10;
        for (int i = 0; i < arrSize; i++) {
            list1.add(i, random.nextInt(50));
        }
        System.out.printf("Изначальный список: ");
        System.out.println(list1);
        System.out.printf("Cписок без четных чисел: ");
        System.out.println(RemoveEvenNums(list1)); 
    }

    private static ArrayList<Integer> RemoveEvenNums(ArrayList<Integer> list){
        int arrsize = list.size();
        ArrayList<Integer> newlist = new ArrayList<>(arrsize);
        for (int i = 0; i < arrsize; i++) {
            if (list.get(i) % 2 != 0) {
                newlist.add(list.get(i));
            }
        }
        return newlist;
    }
}
