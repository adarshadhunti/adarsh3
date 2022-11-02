package assigment2;

public class trainerclass{
    public static void main(String[] args) {
        //task1
        Trainer t1 =new Trainer("Mukesh","Testing","mukesh@gmail.com",1);
        Trainer t2 =new Trainer("Hitesh","Dev","mukesh@gmail.com",2);
        Trainer t3 =new Trainer("Mukesh","Dev ops","mukesh@gmail.com",3);
        System.out.println("name: "+ t1.name + "  email: " +t1.email);

        //task 2
        String[] trainers=new String[3];
        trainers[0]=t1.name;
        trainers[1]=t2.name;
        trainers[2]=t3.name;
        for (int i=0;i<trainers.length;i++)
        System.out.println(trainers[i]);

        //output
        //name: Mukesh  email: mukesh@gmail.com
        //Mukesh
        //Hitesh
        //Mukesh
    }
}
