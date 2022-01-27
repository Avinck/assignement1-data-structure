import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        String userId = "CG_training";
        String password = "training";
        Scanner input = new Scanner(System.in);


        for (int i=3; i>1; i--) {
            System.out.println("Enter user id:");
            String userId = input.nextInt();
            System.out.println("Enter user password");
            String password1 = input.nextLine();

            if ((userId.matches(user_Id1)) && (password.matches(password1))) {
                System.out.println("welcome"+ userId);
                break;
            }
            else{
                System.out.println("login failed attempts remaining"+(i-1));
                System.out.println("");
                if (i==1){
                    System.out.println("contact admin");
                }
            }
            }
        }


    }
