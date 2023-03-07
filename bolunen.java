import java.util.Scanner;
public class bolunen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int k;
        double toplam=0;
        double sayac=0;
        double ortalama;
        System.out.print("Bir Sayi Tuslayiniz : ");
        k = input.nextInt();

        for (int i=0; i<k; i++) {

            if((i % 3 ==0) && (i % 4 == 0)){

               toplam +=i;
               sayac+=1;

            }

        }

        ortalama = toplam/sayac;
        System.out.print(ortalama);





    }
    }
