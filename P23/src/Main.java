//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //to count the blanck spaces
    String str = "He gllo ga gn e$h";
    char[] str2 = str.replace('$', 's').toCharArray();
    System.out.println(str2);
    Map<Character, Integer> str3 = new HashMap<>();

    for (char c : str2) {
        if (c == ' ') {
            {str3.put(c,str3.getOrDefault(c,0)+1);}
        }

    }System.out.println("The count of bla nck spacewss is = "+str3);
}