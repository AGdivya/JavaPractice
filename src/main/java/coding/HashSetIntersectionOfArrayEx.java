package coding;

import java.util.HashSet;

public class HashSetIntersectionOfArrayEx {
    public static void main(String[] args) {

        int[] arr1 = {7, 3, 9, 9, 3};
        int[] arr2 = {6, 3, 9, 2, 9, 4};
        // intersection = 2 (3,9)
        /*
        First convert any one of array in HAshSet --> then search second array element in your set -->
        if we will get match increment count variable unless don;t
         */
        interSection(arr1, arr2);


    }

    public static int interSection(int[] arr1, int[] arr2) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])) {
                System.out.println(arr2[j]);
                count++;
                set.remove(arr2[j]);
            }
        }
        System.out.println("Total common elements in both arrays are: "+count);
        return count;
    }
}
