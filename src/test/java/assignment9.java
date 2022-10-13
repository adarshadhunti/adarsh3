public class assignment9 {
    public static void main(String[] args) {
        //Write a program which will break the current execution if it find number 85
        //	Input – [12,34,66,85,900]
        int intArray[]={12,34,66,85,900};
        for(int i=0;i<intArray.length;i++)
            if(intArray[i]==85)
            {
                System.out.println("found 85 breaking now");
                break;
            }
    }
}
