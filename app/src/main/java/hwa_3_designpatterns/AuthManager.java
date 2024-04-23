/*
 * User Authentication (Singleton Pattern)
 * AuthManager.java (Singleton)
 */
package hwa_3_designpatterns;

public class AuthManager {

    private AuthManager() {}

    private static final AuthManager instance = new AuthManager();

    //initiates only one instance 
    public static AuthManager getInstance() {
        return instance;
    }

    //mimics authentication with only one valid default credentials
    public boolean authenticateUser(String username, String password) {
        return "username".equals(username) && "password".equals(password);
    }


    


}
