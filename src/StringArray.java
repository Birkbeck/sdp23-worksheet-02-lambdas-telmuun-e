import java.util.Arrays;

public class StringArray {
    private String[] stringArray;
    public StringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }
    public void printArray() {
        System.out.println(Arrays.asList(stringArray));
    }
    public void sortByLength() {
        Arrays.sort(stringArray, (a, b) -> a.length() - b.length());
    }
    public void sortByLengthReversed() {
        Arrays.sort(stringArray, (a, b) -> b.length() - a.length());
    }
    public void sortByFirstCharacter() {
        Arrays.sort(stringArray, (a, b) -> a.charAt(0) - b.charAt(0));
    }
    public void sortByELetter() {
        Arrays.sort(stringArray, (a, b) -> b.indexOf('e') - a.indexOf('e'));
    }
    public void sortByELetter2() {
        Arrays.sort(stringArray, StringUtils::eChecker);
    }
}
