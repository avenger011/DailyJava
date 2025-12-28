//to find the first repested number in aerrsy without using hashset
void main() {
    int[] arr = {1, 2, 3, 4, 8, 3, 4, 5,0};
    int a=0;
   outerloop:
    for (int i = 0; i < arr.length; i++) {


        for (int j = i + 1; j < arr.length; j++)
        {
            if(arr[i]==arr[j])
            { System.out.println(arr[j]);
            break outerloop;}

        }

    }}

