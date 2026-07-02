class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i + 1);
        }

        for (int i = 0; i < numbers.length; i++) {
            int difference = target - numbers[i];

            if (map.containsKey(difference) && map.get(difference) != i + 1) {
                ans[0] = i + 1;
                ans[1] = map.get(difference);
                break;
            }
        }

        return ans;
    }
}
