import java.util.List;

public class PositiveNumbers {
    public static void main(String[] args) {
        List<Double> positiveNumbers = NumCalc.scannerNumList();
        NumCalc.reversedNumbers(positiveNumbers);
        System.out.println(NumCalc.numInfo(positiveNumbers));
        System.out.println("Najwieksza liczba:" + NumCalc.maxNum(positiveNumbers));
        System.out.println("Najmniejsza liczba:" + NumCalc.minNum(positiveNumbers));
    }
}
