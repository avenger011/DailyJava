//CODE to retain the capital letter from string//
void main() {
    {
        System.out.println("Try programiz.pro");
        String arr="AsddfdeRddfFf";
        System.out.println(arr);
        char[] arr2=arr.toCharArray();
        for(char ch:arr2)
        {
            if(Character.isUpperCase(ch)){System.out.println(ch);
            }
        }

}}
