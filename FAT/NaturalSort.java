import java.util.*;
import java.util.regex.*;

public class NaturalSort {
    static public List<String> Strings = new ArrayList<>();

    static public List<String> NS(List<String> Strings) {
        Strings.sort((a, b) -> {
            int na = extractNum(a);
            int nb = extractNum(b);
            if (na != nb) {
                return na - nb;
            }
            return a.compareTo(b);
        });

        return Strings;
    }

    static public int extractNum(String s) {
        Matcher m = Pattern.compile("\\d+").matcher(s);
        if (m.find()) {
            return Integer.parseInt(m.group());
        }
        return 0;
    }

    static public void main(String args[]) {
        Strings.add("text1");
        Strings.add("text101");
        Strings.add("text2");

        List<String> sorted = NS(Strings);
        for (String s : sorted)
            System.out.println(s);
    }
}