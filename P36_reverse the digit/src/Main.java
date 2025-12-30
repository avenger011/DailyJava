//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //to reverse the numbers
int num=123456;
int a=0;
int b=0;

while(num!=0)
{ a=num%10;
    b=b*10+a;
    num=num/10;
}
System.out.println(b);
}
