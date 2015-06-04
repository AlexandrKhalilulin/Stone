package console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleLogic {
    public static double inputMinValueTransparency() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double min = 0;
        System.out.println("Enter lower range of transparency:");
        try {
            min = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return min;
    }

    public static double inputMaxValueTransparency() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double max = 0;
        System.out.println("Enter high range of transparency:");
        try {
            max = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return max;
    }
}
