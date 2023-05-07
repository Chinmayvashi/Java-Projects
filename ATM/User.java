package ATM;

import java.util.ArrayList;

public class User {
    //Attributes for each user
    private String firtsname;
    private String lastname;
    private String uuid;
    private byte pinHash[];
    private ArrayList<Account> accounts;
}

public User(String firstname,String lastname, String pin, Bank theBank){
    
}