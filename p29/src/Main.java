//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//to find the element in the array that sum is 20
    int[] arr={1,19,18,16,20,3,8};
    for(int i=0;i<arr.length;i++)
    {

       for(int j=i+1;j<arr.length;j++)
       { if(arr[j]*arr[i]==20)
       System.out.println(arr[i]+" "+arr[j]);}
    }



}
