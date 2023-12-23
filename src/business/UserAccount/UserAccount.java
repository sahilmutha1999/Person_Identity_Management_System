/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.UserAccount;

import business.Business;
import business.Organization.Organization;
import business.Person.Person;
import business.Role.Role;
import business.WorkQueue.WorkQueue;
import hashing.AES;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author meetb007
 */
public class UserAccount {
    private Business business;
    private Person person;
    private Role role;
    private String username;
    private String password;
    private boolean isEnabled = false;
    private ArrayList<String> prevPassword = new ArrayList<String> ();
    private String encryptedPassword;
    private WorkQueue workQueue;
    
    public UserAccount(Person person, Business business) {
        this.person = person;
        this.business = business;
        workQueue = new WorkQueue();
    }

    public UserAccount(Person person, Business business, String username, 
            String password, boolean isEnabled, Role role) {
        this.person = person;
        this.business = business;
        try {
            setUsername(username);
            setPassword(password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", 
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        this.isEnabled = isEnabled;
        this.role = role;
        workQueue = new WorkQueue();
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws UsernameExistsException{
        try {
            if (this.username == null ||  
                    (this.username != null &&
                    !this.username.equals(username))) {
                for (Organization o: business.getOrganizationDirectory().getOrganizationList()) {
                    if (!o.getUserAccountDirectory().checkUsernameAvailability(username))
                        throw new UsernameExistsException("Username already taken.");
                }
                
                this.username = username;
            }
            else
                return;
            
        } catch (UsernameExistsException e) {
            throw new UsernameExistsException("Username already taken.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getPassword() {
        try {
            return AES.decrypt(password);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void setPassword(String password) throws PasswordExistsException{
        try {
            encryptedPassword = AES.encrypt(password);
            
            if ((this.password == null) || 
                    (this.password != null && 
                    !this.password.equals(encryptedPassword)))
                if (checkPasswordInPrevPassword(encryptedPassword))
                    throw new PasswordExistsException("Password already used.");
                else
                    this.password = encryptedPassword;
            else
                return;
            
            prevPassword.add(this.password);
        } catch (PasswordExistsException e) {
            throw new PasswordExistsException("Password already used.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public boolean checkPasswordInPrevPassword(String password) {
        return prevPassword.contains(password);
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public Person getAssociatedPerson() {
        return person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    @Override
    public String toString() {
        return person.getName();
    }
}

class PasswordExistsException extends Exception {
    public PasswordExistsException(String message) {
        super(message);
    }
}

class UsernameExistsException extends Exception {
    public UsernameExistsException(String message) {
        super(message);
    }
}
