import java.util.Arrays;

public class TemperatureConversion {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.5)));
    }

    public static double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        double kelvin = (celsius + 273.15);
        double farenheit = (celsius * 9)/5 + 32;
        ans[0] = kelvin;
        ans[1] = farenheit;

        return ans;
    }
}
