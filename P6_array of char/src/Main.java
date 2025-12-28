//to remove the deublicatre charectoir in the array of char
void main() {
char[] arr={'a','e','i','0','u','a','i'};

Set<Character> arr2= new HashSet<>();
for(char i:arr)
{
    arr2.add(i);
}
System.out.println(arr2);
}

