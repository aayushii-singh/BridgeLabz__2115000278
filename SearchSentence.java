public class SearchSentence {
    public static void main(String[] args) {
        String[] sentences = {"This is a sample sentence.", "Another example.", "The target word is here."};
        String target = "target";
        String result = "Not Found";
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(target)) {
                result = sentences[i];
                break;
            }
        }
        System.out.println(result);
    }
}
