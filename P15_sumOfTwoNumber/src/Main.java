//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Program

    int[] arr={2,5,8,3,1,2,4,1,5,7};
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                if(arr[i]+arr[j]==10)
                {System.out.println(arr[i]+" "+arr[j]);

                }
                }

            }
}
