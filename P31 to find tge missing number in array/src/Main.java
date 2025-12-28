//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //to find the missing m=number in  array
    //tip :add the total number , and find total actual-given;
int[] a={12,14,15,16};
int count=0;
int count2=0;


for(int i=0;i<a.length;i++)
    {count=count+a[i];}
for(int i=a[0];i<=a[a.length-1];i++)
{count2=count2+i;}
int res=count2-count;
System.out.println(res);
}
