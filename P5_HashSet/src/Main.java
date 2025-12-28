//program to remove the dublicate numbers from the array ,

//for that first yopu have to convert array into array list
void main() {

    int[] arr={1,4,6,3,4,2,5,3,2};

    Set<Integer> arr2= new HashSet<>(); // careates the variable arr2 of type hash set
    for(int i=0;i<arr.length;i++)
    {
        arr2.add(arr[i]);
    }
    System.out.println(arr2);

}
