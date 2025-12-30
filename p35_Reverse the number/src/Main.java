//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //to add the digit of numbers
int num=1234;
int a=0;
int b=0;


    while(num!=0)
    {a=num%10;     // 1234%10 =4  ,123%10 =3 ,12 %10 =2

     b=b+a;
     num=num/10;
    }
    System.out.println(b);
}
