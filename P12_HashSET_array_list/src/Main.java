void main() {
    int[] arr1={4,9,6,7,3}; //this is integer of array ,coz[] is present, so you can use arrays.sort()
    int [] arr2={2,5,8,9,4,6,1};
    Set<Integer> ant=new HashSet<>();//but this is HashSet you should convert to Array list To uise Collections
    for(int i:arr1)
    { ant.add(i);
    }
    for(int i:arr2)
    {
        ant.add(i);}

    List<Integer> ant2=new ArrayList<>(ant);//Conversion of hashset to array list
    Collections.sort(ant2);
    System.out.println(ant2);
}