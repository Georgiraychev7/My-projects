package headers;

import Utils.User;

public class HeaderFactory {

    public static HeaderModule headerFactory(User user){
        if(user.isLoggedIn()){
            return new HeaderModuleForLoggedUser();
        } else {
            return new HeaderModuleForUnLoggedUser();
        }
    }
}
