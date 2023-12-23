/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.UserAccount;

import business.Business;
import business.Person.Person;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author meetb007
 */
public class UserAccountDirectory {
    Business business;
    Person person;
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory(Business business) {
        userAccountList = new ArrayList<>();
        this.business = business;
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public boolean checkUsernameAvailability(String newUsername) {
        for (UserAccount u: userAccountList){
            if (u.getUsername() != null && u.getUsername().equals(newUsername)) 
                return false;
        }
        return true;
    }
    
    public UserAccount createUserAccount(String username, String password, 
            Person person, Role role) 
            throws UsernameExistsException, PasswordExistsException{
        UserAccount userAccount = new UserAccount(person, business);
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
}
