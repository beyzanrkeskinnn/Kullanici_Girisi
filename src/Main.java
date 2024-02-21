import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Kullanıcıdan almak istediğimiz değişkenlerimizi tanımladık.
        String userName, password, newPassword, resetPassword;

        //Kullanıcıdan password ve userName değerlerimmizi aldık.
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz :");
        password = input.nextLine();

        //Şifre kontrolümüzü yaptık
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Başarılı bir şekilde giriş yaptınız");
        } else {
            //Eğer şifremiz yanlışsa şifre değişiktirmek istediğini sorduk
            System.out.println("Bilgileriniz yanlış! Şifre sıfırlamak ister misiniz? \n evet  \n hayır");

            resetPassword = input.nextLine();

            if (resetPassword.equals("evet")) {
                //Şifresini değiştirdik
                System.out.println("Yeni Şifre giriniz: ");
                newPassword = input.nextLine();
                if (newPassword.equals("java123")) { //daha önceki şifre ile aynı olma durumunu bildirdik
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz. Şifreniz daha öncei şifreniz ile aynı olamaz");
                } else {
                    System.out.println("Şifreniz başarılı bir şekilde oluşturuldu :" + newPassword);
                }

            } else {
                System.out.println("Şifrenizi girmeyi tekrar deneyiniz ");
            }
        }
    }
}