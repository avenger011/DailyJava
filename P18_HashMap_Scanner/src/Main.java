//take input from user anf addd it to hash map
void main() {
    System.out.println("enter number");
    //take input from user anf addd it to hash map
Scanner sc=new Scanner(System.in);
System.out.println("enter name");
String name=sc.nextLine();
int number=sc.nextInt();
sc.nextLine();           //<------------------------------------------------------------------------
String name2=sc.nextLine();                                          //                              |
                                                                  //                                 |
int num2=sc.nextInt();                                             //                                |
    sc.nextLine();                 //always remenber to ad sc.next after scanning number;  --like----

Map<String,Integer> nmap=new HashMap<>();
nmap.put(name,number);
nmap.put(name2,num2);
System.out.println(nmap);
sc.close();
}
