import static java.lang.Character.*;

//upper to lower lower to upper
void main() {
    String input = "NaVaNeeTh";
char[] ch=input.toCharArray();
StringBuilder sb=new StringBuilder();

for(int i=0;i<ch.length;i++)
{
   if(Character.isUpperCase(ch[i]))
   {
       sb.append(Character.toLowerCase(ch[i]));

   }
   else{
       sb.append(Character.toUpperCase(ch[i]));

   }

}
System.out.println(sb);


}




