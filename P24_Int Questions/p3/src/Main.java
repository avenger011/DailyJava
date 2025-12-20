//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //to print the array in assending order
int[] arr={0,34,59,4,66,1,4,6};
int temp=0;
for (int i=0;i<arr.length;i++) {

  for (int j=i+1;j< arr.length;j++)
  {
      if(arr[i]>arr[j])
      {
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
      }
  }


}
for (int i:arr)
{System.out.println(i);}

}
