package coding;

import java.util.Arrays;

public class MergeSortedArray {

        public static void main(String[] args) {
//            int[] nums1 = new int[]{3, 8, 12, 15};
//            int[] nums2 = new int[]{2, 5, 9, 14};
            int[] nums1 = new int[]{1,2,3,0,0,0};
            int[] nums2 = new int[]{2, 5, 6};
            int m = nums1.length;
            int n = nums2.length;

            int[] mergedArray = merge(nums1, m, nums2, n);
            System.out.println("Merged Array: " + Arrays.toString(mergedArray));
        }
        public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
            int[] mergedArray = new int[m + n];

            int i = 0, j = 0, k = 0;

            while (i < m && j < n) {
                if (nums1[i] <= nums2[j] && nums1[i]!=0) {
                    mergedArray[k++] = nums1[i++];
                } else {
                    mergedArray[k++] = nums2[j++];
                }
            }

            while (i < m) {


                    mergedArray[k++] = nums1[i++];


            }

            while (j < n) {
                mergedArray[k++] = nums2[j++];
            }

            return mergedArray;
        }
    }

