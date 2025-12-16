// print table
void main() {

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the table yopu want");
    int num=sc.nextInt();
    sc.nextLine();
    int prod=0;
    for(int i=1;i<=10;i++)
    {
        prod=num*i;
        System.out.println(num+"*"+i+"="+prod);
    }

}
