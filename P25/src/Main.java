//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//● Input: Aditya Ramekar
//
//● Expected Output: aytidA rakemaR
    String strr1="Aditya Ramekar";
    String[] strr2=strr1.split(" ");
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<strr2.length;i++)
    {
        char[] str3=strr2[i].toCharArray();
        for (int j=str3.length-1;j>-1;j--)
        {
            sb.append(str3[j]);
        }
        sb.append(" ");

    }
    System.out.println(sb);
}
