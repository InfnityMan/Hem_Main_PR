class Solution {
    public int findGCD(int[] nums) {
        int minN = 1001;
        int maxN = 0;

        for(int i : nums) {
            if(minN > i) minN = i;
            if(maxN < i) maxN = i;
        }


        if(maxN % minN == 0 || minN == 1 || minN == maxN) return minN;
        
        int ans = 0;

        for(int i = 1; i < minN; i++) {
            if(maxN % i == 0 && minN % i == 0) ans = i;
        }

        return ans;
    }
}
