//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//P33_find dublicate  element in string using sorting method;

    int[] str1={1,4,3,4,6,1,3};  //1,1,3,3,4,6
    Arrays.sort(str1);

    for(int i=0;i<str1.length;i++)
    {
       for(int j=i+1;j<str1.length;j++)
       {
        if(str1[i]==str1[j])
        {
            System.out.println("the dublicate elements are "+str1[j]);
        }

       }

    }

}
