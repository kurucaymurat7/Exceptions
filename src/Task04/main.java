package Task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //   1- filedları(encapsulated) id, username, password, active (boolean), signedIn (boolean)
        //      olan User isimli bir class create ediniz.
        //   2- bütün fieldları parametre alan bir constructor tanımlayınız.
        //   4- UserMain isminde main için bir class create ediniz.
        //   5- Kullanicidan istenen adette user bilgisi isteyerek bir ArrayList e atayiniz.
        //      active ve signedIn default olarak true, false atayabilirsiniz.
        //      id yi sistemde otomatik aliniz.,
        //   6- eğer password 6 dan küçük olursa yeniden kullanici girisi isteyin.passwordun
        //      6 karakterden küçük olup olmadığını classın içinde kontrol ediniz.

        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        List<User> userList = new ArrayList<>();

        System.out.println("Kac adet kayit olusturacaksiniz ? ");
        int objAdedi = scan.nextInt();

        int userID = 999;
        for (int i = 0; i < objAdedi; i++) {

            User user = new User();

            userID++;

            System.out.print("Username : ");
            String userName = scan.next();

            String password = user.setPassword();

            boolean isActive = rnd.nextBoolean();
            boolean isSignedin = rnd.nextBoolean();

            User kullanici = new User(userID, userName, password, isActive, isSignedin);

            userList.add(kullanici);
        }

        System.out.println(userList.toString());

        /*
        for (int i = 0; i < userList.size(); i++) {
            System.out.println("ID : " + userList.get(i).getId() + " , username : " + userList.get(i).getUsername() +
                    " , password : " + userList.get(i).getPassword() + " , active : " + userList.get(i).isActive() +
                    " , Signed in : " + userList.get(i).isSignedIn());
        } */
    }
}