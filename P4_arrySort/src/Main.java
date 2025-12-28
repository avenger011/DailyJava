//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
int[] num={0,3,4,2,6,7,3,9};
for(int i=0;i<num.length;i++)
 {
     for(int j=i+1;j<num.length;j++)
     {
         if(num[i]>num[j])
         {    int temp=num[j];
               num[j]=num[i];
               num[i]=temp;
         }



     }

 }
    System.out.println(Arrays.toString(num));
}
