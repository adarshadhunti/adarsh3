public class assignment8 {
    public static void main(String[] args) {
        //Write a program to print below students marks who have scored above 80
        //	Example- 78,12,89,55,35
        //	Output-  78,89
        int intArray[]={78,12,89,55,35};
        for(int i=0;i<intArray.length;i++)
            if(intArray[i]>80)
            {
                System.out.println(intArray[i]);
            }
    }
}
