package hew;

public class Stringpassword {
	public static String Password(String name, int yearOfBirth) {
        String password = "";
        if (name.length() <= 4) {
            password = name + yearOfBirth;
        } else {
            password = name.substring(0, 4) + yearOfBirth;
        }
        return password;
    }

}
