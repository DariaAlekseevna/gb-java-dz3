import java.util.Arrays;
import java.util.Random;

/*
 * Реализовать алгоритм сортировки слиянием
 */

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[8];
        int arrSize = array1.length;
        System.out.println(arrSize);
        for (int i = 0; i < arrSize; i++) {
            array1[i] = random.nextInt(50);
        }
        System.out.printf("Изначальный массив: ");
        System.out.println(Arrays.toString(array1));
        System.out.printf("Сортированный массив: ");
        System.out.println(Arrays.toString(MergeSort(array1)));
    }
    
    private static int[] MergeSort(int[] arr) {
        int arrSize = arr.length;
        int[] arr1 = arr;
        // System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[8];
        // System.out.println(Arrays.toString(arr2));
        int[] result = MergeSortInner(arr1, arr2, 0, arrSize);
        return result;
    }
    
    private static int[] MergeSortInner(int[] arr1, int[] arr2, int startI, int endI) {

        if (startI >= endI - 1)
            return arr1;

        int middle = startI + (endI - startI) / 2;
        int[] sorted1 = MergeSortInner(arr1, arr2, startI, middle);
        int[] sorted2 = MergeSortInner(arr1, arr2, middle, endI);

        int index1 = startI;
        int index2 = middle;
        int destIndex = startI;
        int[] result = new int[arr1.length];
        if (sorted1 == arr1)
            result = arr2;
        else result = arr1;
            

        while ((index1 < middle) && (index2 < endI)) {
            if (sorted1[index1] < sorted2[index2])
                result[destIndex++] = sorted1[index1++];
            else
                result[destIndex++] = sorted2[index2++];
        }
        while (index1 < middle)
            result[destIndex++] = sorted1[index1++];
        while (index2 < endI)
            result[destIndex++] = sorted2[index2++];

        return result;
    }
}