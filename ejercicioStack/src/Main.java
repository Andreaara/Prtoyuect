public class Main {
    public static void main(String[] args) {




        String e1 = "Anita lava la tina";
        String e2 = "Hola";
        String e3 = "Tengo dos gatos";

        System.out.println(e1);
        System.out.println(isPalindrome(e1));
        System.out.println(e2);
        System.out.println(isPalindrome(e2));
        System.out.println(e3);
        System.out.println(isPalindrome(e3));


    }


    public static boolean isPalindrome(String text) {

        String normalizedText = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        if (normalizedText.length() <= 1) {
            return true;
        }

        ArrayStack<Character> stack = new ArrayStack<>();
        int length = normalizedText.length();

        for (int i = 0; i < length; i++) {
            stack.push(normalizedText.charAt(i));
        }

        StringBuilder reversedText = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedText.append(stack.pop());
        }
        return normalizedText.equals(reversedText.toString());
    }
}