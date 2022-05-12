package helpers;

public class StringHelper {
    String[] words;
    private boolean isCaseSensitive;

    public StringHelper(boolean isCaseSensitive) {
        this.isCaseSensitive = isCaseSensitive;
    }

    public StringHelper() {
        this(true);
    }

    //TODO: extend this for words and for sentences
    public boolean compare(String firstString, String secondString) {
        if (!isCaseSensitive) {
            return firstString.equalsIgnoreCase(secondString);
        } else {
            return firstString.equals(secondString);
        }
    }

    public boolean isCaseSensitive() {
        return isCaseSensitive;
    }

    public void setCaseSensitive(boolean caseSensitive) {
        isCaseSensitive = caseSensitive;
    }

    public String[] splitSentenceToWords(String sentence) {
        words = sentence.split("\\s");
        return words;
    }

    public String removeAllCharacters(String input, char replacesMe) {


        return input.replaceAll(String.valueOf(replacesMe), "");
    }

    public String removeAllCharacters(String input, String replaceMe) throws Exception {
        if (replaceMe.length() > 1) {
            throw new Exception("More han 1 character are not allowed!");
        } else {

            replaceMe = escapeSpecialCharacter(replaceMe);
            return input.replaceAll(replaceMe, "");
        }
    }

    private String escapeSpecialCharacter(String input) {
        String escapedCharacter;
        switch (input) {
            case "(":
                escapedCharacter = "\\(";
                break;
            case ")":
                escapedCharacter = "\\)";
                break;
            case "[":
                escapedCharacter = "\\[";
                break;
            case "]":
                escapedCharacter = "\\]";
                break;
            case ".":
                escapedCharacter = "\\.";
                break;
            default:
                escapedCharacter = input;
                break;
        }
        return escapedCharacter;
    }

    public String removeFirst(String input, String replaceMe) throws Exception {
        if (replaceMe.length() > 1) {
            throw new Exception("More han 1 character are not allowed!");
        } else {
            return input.replace(replaceMe, "");
        }
    }

    public int countWords(String countMyWords) {
        String[] wordArray = countMyWords.split(" ");
        return wordArray.length;
    }
}
