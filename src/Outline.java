import java.util.Arrays;

public class Outline {
    public static void main(String... args) { // varargs alternative to String[]
        Integer[] intArray = {1, 7, 3, 4, 8, 2};
        System.out.println(Arrays.asList(intArray));
        // Arrays.sort(intArray,.......)

        String[] stringArr = {"abc", "eqwe", "asdsad", "qqqqqqqqq"};
        StringArray stringArray = new StringArray(stringArr);
        // Task 1
        part1();
        // Task 2
        part2();

        // Task 3
        System.out.println(StringUtils.betterString("aaa", "bb", (s1, s2) -> s1.length() > s2.length()));

        // Task 4
        System.out.println(StringUtils.betterEntry("aaa", "bb", (s1, s2) -> s1.length() > s2.length()));

        // Task 5
        System.out.println(StringUtils.allMatches(stringArr, s -> s.length() < 5));

        // Task 6
        System.out.println(StringUtils.allMatchesGeneric(stringArr, s -> s.length() > 5));

        // Task 7
        System.out.println(StringUtils.transformedList(stringArr, s -> s + "!"));

        // Task 8
        System.out.println(StringUtils.transformedListGeneric(stringArr, s -> s + "#"));
    }

    private static void part2() {
        String[] stringArr = {"abc", "eqwe", "asdsad", "qqqqqqqqq"};
        StringArray stringArray = new StringArray(stringArr);
        stringArray.sortByLength();
        stringArray.printArray();
        stringArray.sortByELetter2();
        stringArray.printArray();
    }

    private static void part1() {
        String[] stringArr = {"abc", "eqwe", "asdsad", "qqqqqqqqq"};
        StringArray stringArray = new StringArray(stringArr);
        stringArray.printArray();
        stringArray.sortByLength();
        stringArray.printArray();
        stringArray.sortByLengthReversed();
        stringArray.printArray();
        stringArray.sortByFirstCharacter();
        stringArray.printArray();
        stringArray.sortByELetter();
        stringArray.printArray();
    }
}