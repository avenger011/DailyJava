//to find the count of the substring in string ,here "@#"
void main() {

    String str = "@#8765@#4567@#@#34567@#0987";
   int index=0;
   int count=0;



    while((index=str.indexOf("@#",index))!=-1){
        index=index+2;
        count++;
    }
    System.out.println(count);
}




