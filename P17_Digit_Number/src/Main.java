//to count digit and Number
void main() {
    String str="hellow i am 123";
int Ccount=0;
int Ncount=0;
    for(char inn:str.toCharArray()) {

        if (Character.isAlphabetic(inn)) {
            Ccount = Ccount + 1;
        }
        if(Character.isDigit(inn))
        {Ncount=Ncount+1;
        }
    }
    System.out.println("alpha "+Ccount);
    System.out.println("Number "+Ncount);
}
