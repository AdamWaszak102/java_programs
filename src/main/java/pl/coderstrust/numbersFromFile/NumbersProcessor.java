package pl.coderstrust.numbersFromFile;

/**
 * Created by Adam on 2018-04-09.
 */
public class NumbersProcessor {
    public String processLine(String line) {

        String nextLine = line;
        String[] arrayOfStrings = nextLine.split("\\s+");
        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (String number : arrayOfStrings) {
            stringBuilder.append(number);
            if (stringBuilder.length() > 0) {
                sum += Integer.valueOf(number);
                stringBuilder.append("+");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("=");
        stringBuilder.append(sum);
        return stringBuilder.toString();
    }
}
