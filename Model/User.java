package Model;

import java.util.ArrayList;
/**
 * This class is the model class that holds the Person information
 */
public class User {
    /**
     * These variables are the sql equivalent of the rows/data for User
     */
    private String userName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String gender;
    private String personID;


    public User(String userName, String password, String email, String firstName, String lastName, String personID, Person[] familyMembers) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personID = personID;
        this.gender = null;
    }
    public void SetGender(String gender) {
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getPersonID() {
        return personID;
    }
}
