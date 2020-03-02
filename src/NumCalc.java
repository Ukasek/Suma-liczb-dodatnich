import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumCalc {
    public static double minNum(List<Double> list) {
        double min = list.get(0);
        for (Double number : list) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static double maxNum(List<Double> list) {
        double max = list.get(0);
        for (Double number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static String numInfo(List positiveNumbers) {
        double sum = 0;
        String info = " ";
        for (int i = 0; i < positiveNumbers.size(); i++) {
            sum += (Double) positiveNumbers.get(i);
            if (i == positiveNumbers.size() - 1) {
                info += positiveNumbers.get(i);
            } else {
                info += positiveNumbers.get(i);
            }
        }
        info += sum;
        return info;
    }

    public static List scannerNumList() {
        List<Number> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double userInput = 1;
        while (userInput > 0) {
            System.out.println("Wprowadź liczbę dodatnią: ");
            userInput = (scanner.nextDouble());
            if (userInput <= 0) {
                break;
            }
            numbers.add(userInput);
        }
        return numbers;
    }

    public static void reversedNumbers(List list) {
        for (int i = (list.size() - 1); i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
