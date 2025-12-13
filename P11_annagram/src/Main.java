//to check id the string is annagram  , silent,tsilent =>true means smae word jumbelled
void main() {

    String str1="silent";
    String str2="tsilen";


    char[] ch1=str1.toCharArray();
    char[] ch2=str2.toCharArray();  /// these are array of char type so you can use any functions like(Arrays.sort,Arrays.Equals())

//    List<Character> cha1= new ArrayList<>();
//    for(char c:ch1)
//    {
//        cha1.add(c);
//    }
//    List<Character> cha2 = new ArrayList<>();
//    for(char c:ch2)
//    {
//        cha2.add(c);
//    }


 Arrays.sort(ch1);
 Arrays.sort(ch2);

    if(Arrays.equals(ch1,ch2))

    {{System.out.println("true its annagram");}}
}