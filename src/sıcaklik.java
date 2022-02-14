import java.util.Scanner;
public class sıcaklik {
    public static void main(String[] args) {
        
        int isi;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklığı giriniz :");
        isi = input.nextInt();

        if (isi < 5 ) {
            System.out.print("Kayağa gidebilirsiniz.");
        }
        else if (isi < 15){
            System.out.print("Sinemaya gidebilirsiniz.");
        }
        else if (isi == 15){
            System.out.println("Sinemaya gidebilirsiniz.");
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        else if (isi <= 25){
            System.out.print("Pikniğe gidebilirsiniz.");
        }
        else if (isi > 25){
            System.out.print("Yüzmeye gidebilirsiniz.");
        }



    }
}
