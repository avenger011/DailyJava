//pgram to find thge repeated charector from string
void main() {

    String arr="STRRERKKT";
    char[] arr2=arr.toCharArray();
    char[]  res=New char[];
    String res2="";
    for (int i=0 ;i<arr2.length;i++)

    {
       for(int j=i+1 ;j<arr2.length;j++)
           if(arr2[i]==arr2[j])
           {
               res=res+arr2[j];
           }

    }



}
