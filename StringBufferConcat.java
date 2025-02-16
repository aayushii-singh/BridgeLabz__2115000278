public class StringBufferConcat {
    public static void main(String[] args) {
        String[] strings = {"Hello", " ", "My", "Name", " is", " Ayushi", " Singh."};
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);
        }
        System.out.println("Concatenated String: " + sb.toString());
    }
}
