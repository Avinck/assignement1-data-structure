import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int m1,m2,m3;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter m1 marks");
        m1=s.nextInt();
        System.out.println("Enter m2 marks");
        m2=s.nextInt();
        System.out.println("Enter m3 marks");
        m3=s.nextInt();
        if(m1>60 && m2>60 && m3>60){
            System.out.println("passed");
        }
        else if ((m1>60 && m2>60) || (m1>60 && m3>60) || (m2>60 && m3>60)){
            System.out.println("promoted");
        }
        else if ((m1>60 || m2>60 || m3>60)|| (m1<60 && m2<60 && m3<60)){
            System.out.println("failed");
        }
        else if()
        {
            System.out.println("please enter marks");
        }
    }
}
