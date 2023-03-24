package Rikkei.academy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertSort {
    public int[] insertionSort(int[] list) {
        int temp, j;
        for (int i = 1; i < list.length; i++) {
            temp = list[i];
            for (j = i - 1; j >= 0 && temp < list[j]; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = temp;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter arr size: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(100) + 1;
        }
        System.out.println("Before --> " + Arrays.toString(arr));
        System.out.println("After --> " + Arrays.toString(new InsertSort().insertionSort(arr)));
    }
}
