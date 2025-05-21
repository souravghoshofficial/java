public class ReversedCharSequence implements CharSequence {
    private String original;

    public ReversedCharSequence(String str) {
        this.original = new StringBuilder(str).reverse().toString();
    }

    @Override
    public int length() {
        return original.length();
    }

    @Override
    public char charAt(int index) {
        return original.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return original.substring(start, end);
    }

    @Override
    public String toString() {
        return original;
    }

    public static void main(String[] args) {
        String sentence = "Programming is both art and science";
        ReversedCharSequence rcs = new ReversedCharSequence(sentence);

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed String: " + rcs.toString());
        System.out.println("Character at index 5: " + rcs.charAt(5));
        System.out.println("Length: " + rcs.length());
        System.out.println("Subsequence (5 to 15): " + rcs.subSequence(5, 15));
    }
}
