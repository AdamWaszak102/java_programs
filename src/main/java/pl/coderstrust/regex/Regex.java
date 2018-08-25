package pl.coderstrust.regex;

/**
 * Created by Adam on 2018-04-06.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private Pattern pattern;
    private Matcher matcher;

    private final String IP_REGEX_PATTERN =
            "^([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\." +
                    "([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\." +
                    "([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\." +
                    "([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))$";

    public Regex() {
        pattern = Pattern.compile(IP_REGEX_PATTERN);
    }

    public boolean isIpAddress(String input) {
        matcher = pattern.matcher(input);
        return matcher.matches();
    }
}