//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//to find the min -max in the array of numbers
    int[] arr = {110, 32, 54, 11, 21, 67, 10};
    int min = 0;
    int max = 0;
    Arrays.sort(arr);
    min = arr[0];
    max = arr[arr.length - 1];
    System.out.println(max-min);
}
