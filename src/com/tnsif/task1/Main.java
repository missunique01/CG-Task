package com.tnsif.task1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<>();
        
        System.out.println("Enter the list size");
        int lst_size = scanner.nextInt();

        for (int i = 0; i < lst_size; i++) {
            System.out.println("Enter a number");
            lst.add(scanner.nextInt());
        }

        System.out.println(lst);

        System.out.println("Enter the target number");
        int target_num = scanner.nextInt();
        System.out.println(target_num);

        int[] result = twoNum(lst, target_num);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers sum to the target number.");
        }
    }

    public static int[] twoNum(ArrayList<Integer> lst, int target_num) {
        for (int i = 0; i < lst.size(); i++) {
            for (int j = i + 1; j < lst.size(); j++) {
                if (lst.get(i) + lst.get(j) == target_num) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
