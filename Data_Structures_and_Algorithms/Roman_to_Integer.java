class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> values = new HashMap<>();
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
        String lastSymbol = s.substring(s.length() - 1);
        int lastVal = values.get(lastSymbol);
        int total = lastVal;
        for(int i = s.length() - 2; i >= 0; i--){
            String symbol = s.substring(i, i + 1);
            int val = values.get(symbol);
            if(val<lastVal)total-=val;
            else total+= val;
            lastVal=val;
        }
        return total;
    }
}
