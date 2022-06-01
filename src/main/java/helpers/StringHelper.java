package helpers;

public class StringHelper {
    String[] words;
    private boolean isCaseSensitive;

    /**
     * @param isCaseSensitive used in String comparison
     */
    public StringHelper(boolean isCaseSensitive) {
        this.isCaseSensitive = isCaseSensitive;
    }

    /**
     * Sets case-sensitive to true by default
     */
    public StringHelper() {
        this(true);
    }

    /**
     * Compare two strings based on case-sensitive option
     *
     * @param firstString
     * @param secondString
     * @return
     */
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

    //TODO: Reword this to trim extra characters from words
    public String[] splitSentenceToWords(String sentence) {
        words = sentence.split("\\s");
        return words;
    }


    /**
     * @param input
     * @param replaceMe
     * @return String without the specified characters
     * @throws Exception
     */
    public String removeAllCharacters(String input, String replaceMe) throws Exception {
        if (replaceMe.length() > 1) {
            throw new Exception("More han 1 character are not allowed!");
        } else {

            replaceMe = escapeSpecialCharacter(replaceMe);
            return input.replaceAll(replaceMe, "");
        }
    }

    /**
     * Escapes special characters
     *
     * @param input
     * @return
     */
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
            case "?":
                escapedCharacter = "\\?";
                break;
            case "!":
                escapedCharacter = "\\!";
                break;
            default:
                escapedCharacter = input;
                break;
        }
        return escapedCharacter;
    }

    /**
     * Removes the first occurrence
     *
     * @param input
     * @param replaceMe
     * @return
     * @throws Exception
     */
    public String removeFirst(String input, String replaceMe) throws Exception {
        replaceMe = escapeSpecialCharacter(replaceMe);

        return input.replaceFirst(replaceMe, "");
    }

    /**
     * Splits a string to words and counts them
     *
     * @param countMyWords
     * @return
     */
    public int countWords(String countMyWords) {
        String[] wordArray = countMyWords.split(" ");
        return wordArray.length;
    }
}
