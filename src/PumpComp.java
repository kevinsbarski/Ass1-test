import java.util.Scanner;

public class PumpComp {
    public static void main(String[] args){
        System.out.print("Enter max pumpkin height: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        High h = new High();
        Pumpkin p1 = new Pumpkin("One",h,n);
        Pumpkin p2 = new Pumpkin("Two",h,n);
        Pumpkin p3 = new Pumpkin("Three",h,n);
        Pumpkin p4 = new Pumpkin("Four",h,n);
        Pumpkin p5 = new Pumpkin("Five",h,n);
        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(p4).start();
        new Thread(p5).start();


    }
}
