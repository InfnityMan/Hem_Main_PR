class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int num : arr){
            if(freq.containsKey(num)) freq.put(num, freq.get(num) + 1); else freq.put(num, 1);
        }

        return freq.size() == new HashSet<>(freq.values()).size();
    }
}
