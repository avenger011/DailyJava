//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//to move the 0 to the end in an array
    int[] a={1,2,3,0,3,0,4,0,4};
    List<Integer> b=new ArrayList<>();
    int count=0;
    for(int i:a)
    {
        if(i!=0)
        {b.add(i);}
        else{ count=count+1;}

    }
    for(int i=0;i<count;i++)
    {b.add(0);}
    System.out.println(b);
}
