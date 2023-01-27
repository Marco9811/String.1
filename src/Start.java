public class Start {
    public static void main(String[] args) {

        String string1 = "Hello";
        String string2 = "How are you?";

        char[] charArray = string1.substring(0,2).concat(string2.substring(10,12)).toCharArray();
        System.out.println(charArray);

    }
}
