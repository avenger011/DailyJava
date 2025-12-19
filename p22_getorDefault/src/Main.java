//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    {
        String input = "hello world";
        HashMap<Character, Integer> charCount = new HashMap<>();
        char[] ch=input.toCharArray();
        for (char c : ch) {
            // If present, increment; if not, add with count 1
            charCount.put(c, charCount.getOrDefault(c, 0)+1);
        }

        System.out.println("Character counts: " + charCount);
    }
}
