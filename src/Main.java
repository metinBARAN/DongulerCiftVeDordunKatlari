import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num,total=0;

        Scanner inp=new Scanner(System.in);

        do{
            System.out.println("Bir sayi giriniz: ");
            num=inp.nextInt();
            if(num%2==0&&num%4==0){
                total +=num;

        }
        }while (num%2!=1);
        System.out.println("Total: "+total);


    }
}
