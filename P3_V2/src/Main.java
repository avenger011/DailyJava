//pgram to find thge repeated charector from string
void main() {

    String arr = "SRENHDDTTGGUJ";
    char[] arr2 = arr.toCharArray();

    for (int i = 0; i < arr2.length; i++)
    {
        int count = 0;
        if (arr2[i] == 0){continue;}
        for (int j = i + 1; j < arr2.length; j++)
        {
            if (arr2[i] == arr2[j])
            {
                count = count + 1;
                arr2[j] = '0';
            }
        }
        if (count >=1)
    {
       System.out.println(arr2[i]);
    }

    }
}