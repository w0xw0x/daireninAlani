import java.util.Scanner;
public class daireAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yaricap, aci;
        System.out.println("Dairenin yarıçapını giriniz : ");
        yaricap = input.nextDouble();

        System.out.println("Bulmak istediğiniz kısmın açısınız giriniz : ");
        aci = input.nextDouble();

        double sonuc = 3.14*yaricap*yaricap*aci/360;
        System.out.println("Bulmak istediğiniz kısmın alanı : " +sonuc);


    }
}
