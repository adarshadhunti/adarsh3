public class assignment1 {
    public static void main(String[] args) {
       // Write a program to swap two number. For example a=10 and b=20 output should be a=20 and b=10
int a,b,c;
a=20;
b=10;
        System.out.println("Value of a before swap:"+a);
        System.out.println("Value of b before swap:"+b);

//swap 2 numbers logic
c=a;
a=b;
b=c;
System.out.println("Value of a after swap:"+a);
System.out.println("Value of b after swap:"+b);
    }
}
//output
//Value of a before swap:20
//Value of b before swap:10
//Value of a after swap:10
//Value of b after swap:20
