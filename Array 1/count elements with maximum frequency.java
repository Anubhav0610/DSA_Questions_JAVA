package Array_1;

public class count elements with maximum frequency {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int frequency = 0, count = 0;

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        //counting frequncies
        for (int val : freq.values()) {
            if (val == frequency) {
                count++;
            } else if (val > frequency) {
                frequency = val;
                count = 1;
            }//updating count and frequency
        }

        return frequency * count;
    }

}
