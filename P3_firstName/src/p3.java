//pgram to find the first words of name
void main() {

            String input="NAVAMEETH hOSUR gurmeth kUMAR"; //=>n h g kumar

            String[] input2=input.split(" ");
            StringBuilder str=new StringBuilder();
            int len= input2.length-1;//["naveen","hosur","kumar"}
            for(int i=0;i<input2.length-1;i++)
            {
                char[] word=input2[i].toCharArray();
                str.append(word[0] );
                str.append(" ");

            }
            str.append(input2[len]);
             System.out.println(str);
        }



