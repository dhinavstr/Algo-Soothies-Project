public class OwnerAuth {

    static String[] usernames = {"admin", "owner"};
    static String[] passwords = {"123", "owner123"};

    public static boolean login(String user, String pass) {

        int index = -1;

        for (int i = 0; i < usernames.length; i++) {
            if (user.equals(usernames[i])) {
                index = i; 
                break;
            }
        }

        if (index != -1 && pass.equals(passwords[index])) {
            return true;
        }

        return false;
    }
}
