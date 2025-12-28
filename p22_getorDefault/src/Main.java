//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

        String input = "hello world";
        HashMap<Character, Integer> box = new HashMap<>();
        char[] ch = input.toCharArray();

        for (char c : ch) {
            box.put(c, box.getOrDefault(c, 0) + 1);
        }
        System.out.println(box);
    }