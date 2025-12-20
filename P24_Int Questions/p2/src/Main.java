//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//program to find the reapeated words from the string

    String str="helpoppwdravuyayjnaa";
    char[] str2=str.toCharArray();
    Map<Character,Integer> str3=new HashMap<>();
    for(char c:str2)
    {
        str3.put(c,str3.getOrDefault(c,0)+1); //this will add tghe char to key and count to vslue.

    }
    for(Map.Entry<Character,Integer> entry: str3.entrySet()) /// loop to access the values of the Map
    {
        if(entry.getValue()>1)
        {System.out.print(entry.getKey());}
    }

}
