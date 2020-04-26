import java.util.Scanner;

public class TimUCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a:");
        int a = scanner.nextInt();
        System.out.println("nhap so b:");
        int b =scanner.nextInt();
        if(a==0 && b==0){
            System.out.println("khong co ucln");
        }else if(a==0){
            System.out.println("UCLN: "+Math.abs(b));
        }else if(b==0){
            System.out.println("UCLN: "+Math.abs(a));
        }else {
            if(a==b){
                System.out.println("UCLN: "+a);
            }else {
                while (a !=b){
                    if(a>b){
                        a=a-b;
                    }else {
                        b= b-a;
                    }
                }
                System.out.println("UCLN: "+a);
            }
        }
    }
}
