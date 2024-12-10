package FindNumbersWithEvenNumberOfDigits;

class Solution {
    public static int findNumbers(int[] nums) {
        int cnt = 0;

        for (int i : nums) {
            if ((String.valueOf(i).length()) % 2 == 0) {
                cnt += 1;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12, 345, 2, 6, 7896}));
        System.out.println(findNumbers(new int[]{555, 901, 482, 1771}));
    }
}