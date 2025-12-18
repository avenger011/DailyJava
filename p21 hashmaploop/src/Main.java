//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Map<String,Integer> srt=new HashMap<>();
    srt.put("saiganesh",30);
    srt.put("servegar",70);
    srt.put("swat",100);
    StringBuilder str2=new StringBuilder();
    for(Map.Entry<String,Integer> entry:srt.entrySet()) //for loop to iterate through the hash map
    {
        if(entry.getValue()>=35) {
            str2.append(entry.getKey());
            str2.append(" and");
        }
    }

        System.out.println("Passed sudents are "+str2);
}
