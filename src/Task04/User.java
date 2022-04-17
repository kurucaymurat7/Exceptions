package Task04;

import java.util.Scanner;

public class User {
    //filedları(encapsulated) id, username, password, active (boolean), signedIn (boolean)
    //        //      olan User isimli bir class create ediniz.

    private int id;
    private String username;
    private String password;
    private boolean active;
    private boolean signedIn;

    public User() {
    }

    public User(int id, String username, String password, boolean active, boolean signedIn) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.active = active;
        this.signedIn = signedIn;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public boolean isActive() {

        return active;
    }

    public void setActive(boolean active) {

        this.active = active;
    }

    public boolean isSignedIn() {

        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {

        this.signedIn = signedIn;
    }

    public String setPassword() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Password : ");
            int sifre = 0;
            try {
                sifre = scan.nextInt();
                String sifreStr = String.valueOf(sifre);
                if (sifreStr.length() >= 6) {
                    return sifreStr;
                } else {
                    System.out.println("Sifreniz en az 6 haneli olmali.");
                }
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("Yalnız numerik ifadeler girilebilir.");
            }
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}
