//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    {
        //to count the letters
        String arr="SRENHDDTTGGUJ";
        char[] arr2=arr.toCharArray();
        Map<Character,Integer> arr3=new HashMap<>();
        for(char a:arr2)
        {arr3.put(a,arr3.getOrDefault(a,0)+1);}

        System.out.println(arr3);


    }


}