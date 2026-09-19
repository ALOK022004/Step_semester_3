package assignmentproblems;

import java.util.Scanner;

public class Problem1 {

    static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        int product = 1;

        // Product of elements to the left
        for (int i = 0; i < n; i++) {
            answer[i] = product;
            product = product * nums[i];
        }

        product = 1;

        // Product of elements to the right
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * product;
            product = product * nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = productExceptSelf(nums);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}