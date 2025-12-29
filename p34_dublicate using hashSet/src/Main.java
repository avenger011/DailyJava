//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //check if the string has diublicate using hashmap
int[] str1={1,5,2,1,5,6,7};
HashSet<Integer> str2=new HashSet<>();
for(int i:str1)

{if(!str2.add(i))                   //! says if its not possible to add to the hash map
{System.out.println(i);}       //, that means it is alred added oince , sinbce hasMap dosent allow dublicates

}
}
