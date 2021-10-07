public class BinaryNodeString {

    String word = "";
    int count = 0;
    BinaryNodeString left;
    BinaryNodeString right;

    public BinaryNodeString(String word) {
        this.word = word;
        count++;
        left = null;
        right = null;
    }

    public String getWord() {
        return word;
    }


    public BinaryNodeString(String word, BinaryNodeString left, BinaryNodeString right) {
        this.word = word;
        this.left = left;
        this.right = right;
    }

    public int compareTo(BinaryNodeString b)
    {
        return this.word.compareToIgnoreCase(b.word);
    }

}
