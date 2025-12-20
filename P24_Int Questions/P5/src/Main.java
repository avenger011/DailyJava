//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//find the sum of element ex[1,2,2,3,4,4,5,6,6] =>1,3,5

    int[] int1={1,2,2,3,4,4,5,6,6};
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i:int1)
    {hm.put(i,hm.getOrDefault(i,0)+1);}
    System.out.println(hm);

    for(Map.Entry<Integer,Integer> entry:hm.entrySet())
    { if(entry.getValue()==1)
    {System.out.println(entry.getKey());} //

    }
}
