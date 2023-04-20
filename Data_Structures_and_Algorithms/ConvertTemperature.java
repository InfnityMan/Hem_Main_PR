class Solution {
    public double[] convertTemperature(double celsius) {
        double[] answer = {celsius + 273.15, celsius * 1.8 + 32.0};
        return answer;
    }
}
