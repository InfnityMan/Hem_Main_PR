class Solution {
    public boolean isThree(int n) {
        if (n == 4) return true;
        if (n % 2 == 0) return false;
        if (n % 5 == 0 && n != 25) return false;

        if (Math.sqrt(n) % 1 == 0) {
            if(Math.sqrt(Math.sqrt(n)) % 1 == 0) return false;
            return true;
        }
        return false;
    }
}
