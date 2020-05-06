package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = -1;
        User userFound = new User("", false);
        for (int i = 0; i <= (users.length - 1); i++) {
            if (users[i].getUsername().equals(login)) {
                userFound = users[i];
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new UserNotFoundException("This User id not found");
        } else {
            return userFound;
        }
    }

    public static boolean validate(User user) throws UserInvalidException {
            if ((user.getUsername().length() > 3) && (user.isValid())) {
                return true;
            } else {
              throw new UserInvalidException("User invalid exception");
               // return false;
            }
        }


    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", true)};
        User user = new User("", false);
        try {
             user = findUser(users,  "Petr Arsentev");

         if (validate(user)) {
             System.out.println("This user has an access");
         }
     } catch (UserNotFoundException e) {
         e.printStackTrace();
     } //catch (UserInvalidException en) {
        // en.printStackTrace();
    // }
    }
}
