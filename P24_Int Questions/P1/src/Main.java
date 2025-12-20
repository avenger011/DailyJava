//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //program to remove the repeted word from the string
String str1="maa sadive sahayathe maa";
StringBuilder str3=new StringBuilder();

String[] str2=str1.split(" ");
    for(int i=0;i<str2.length;i++)
{
if(!str2[i].equals("0"))
{str3.append(" "+str2[i]);}

 for(int j=i+1;j<str2.length;j++)
 {
     if(str2[i].equals(str2[j]))
     {str2[j]="0";}
 }






}
    System.out.println(str3);
}







