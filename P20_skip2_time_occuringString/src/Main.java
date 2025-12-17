//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //code the skip the twice recurring letter in the string
    String input = "whitefield";
   char[] input2=input.toCharArray();
   int count=0;
   for(int i=0;i<input2.length;i++) {
       if (input2[i] != '0') {
           for (int j = i + 1; j < input2.length; j++) {
               if (input2[i] == input2[j])
               {
                   count = count + 1;
                   input2[j]='0';
                   input2[i]='0';
               }


           }

       }
   }
   StringBuilder st=new StringBuilder();
   for(int i=0;i<input2.length;i++)
   {if(input2[i]!='0')
   { st.append(input2[i]);}
   }
   System.out.println(st);
}