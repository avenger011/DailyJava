//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //p32 find  first singly occurting charector "ststotds" =>o since o,d is repeated once ,and o is first
    String str = "ststotds";
    char[] str2 = str.toCharArray();
    Map<Character, Integer> str3 = new HashMap<>();
    for (char c : str2) {
        str3.put(c, str3.getOrDefault(c, 0) + 1);
    }
    System.out.println(str3);
    for (Map.Entry<Character, Integer> entry : str3.entrySet())
    {if(entry.getValue()<2)
    {System.out.println("first singly occurting charector is "+entry.getKey());
        break;                                     //break will exit loop as soon it finds 1st once.

    }

    }

}
