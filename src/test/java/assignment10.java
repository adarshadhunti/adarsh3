public class assignment10 {
    public static void main(String[] args) {
        //Write a program which will break the current execution if it find “Selenium”
        //	Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]
        String strArray[]={"Java","JavaScript","Selenium","Python","Mukesh"};
        for(int i=0;i<strArray.length;i++)
            if(strArray[i].equals("Selenium"))
            {
                System.out.println("found Selenium word breaking now");
                break;
            }
    }
}
