import static java.util.Arrays.sort;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[] arr = {100,20,11,12,3,4,5,7,101};
    int largest = 0;
    int Slargest = 0;

    Arrays.sort(arr);

    for (int i=0; i<arr.length ; i++) {
        if (arr[i] > largest) {
            Slargest = largest;
            largest = arr[i];
        }

    }
    System.out.println(Slargest);



}