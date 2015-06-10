package console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleLogic {

    public static double inputDouble() {
        Scanner in = new Scanner(System.in);
        double d = in.nextDouble();
        return d;
    }
}
