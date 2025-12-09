//code to find if the array has dublicate numbers. so we send the array to hash map and check the size ,since hash map dosent allow dublicate value.
void main() {

    char[] arr={'a','e','i','o'};
    int num1=arr.length;
    Set<Character> arr2=new HashSet<>();
    for(char i:arr)
    {arr2.add(i);}
    int size=arr2.size();
    if(num1>size)
    {System.out.println("has dublicate value");}
    else
    { System.out.println("has no dublicate value");}

}
