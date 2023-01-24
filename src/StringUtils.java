import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static int eChecker(String s1, String s2) {
        return Integer.compare(eCounter(s1), eCounter(s2));

    }
    private static int eCounter(String str) {
        int count = 0;
        for (int i=0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return count;
    }
    public static String betterString(String s1, String s2, TwoStringPredicate predicator) {
        return predicator.betterString(s1, s2) ? s1 : s2;
    }
    public static <T> T betterEntry(T e1, T e2, TwoElementPredicate<T> predicator) {
        return predicator.betterEntry(e1, e2) ? e1 : e2;
    }
    public static List<String> allMatches(String[] words, Predicate predicator) {
        List<String> matches = new ArrayList<>();
        for (String word : words) {
            if (predicator.match(word)) {
                matches.add(word);
            }
        }
        return matches;
    }
    public static <T> List<T> allMatchesGeneric(T[] words, PredicateGeneric<T> predicator) {
        List<T> matches = new ArrayList<T>();
        for (T word : words) {
            if (predicator.match(word)) {
                matches.add(word);
            }
        }
        return matches;
    }
    public static List<String> transformedList(String[] words, PredicateTransform predicator) {
        List<String> transformed = new ArrayList<>();
        for (String word : words) {
            transformed.add(predicator.transform(word));
        }
        return transformed;
    }
    public static <T> List<T> transformedListGeneric(T[] words, PredicateTransformGeneric<T> predicator) {
        List<T> transformed = new ArrayList<>();
        for (T word : words) {
            transformed.add(predicator.transform(word));
        }
        return transformed;
    }
}
