//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//to count the numbers in the string
    String str="123stredf45jdjdxoood";
    char[] str1=str.toCharArray();
    int count=0;
    int count1=0;
    for(char c :str1)
    {
        if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9')
        {count=count+1;}

    }

System.out.println(count);

    //type 2 with using Charecter.isDisgit
    for(char c:str1)
    {
        if(Character.isDigit(c))
        {count1=count1+1;}

    }
    System.out.println(count1);
}

