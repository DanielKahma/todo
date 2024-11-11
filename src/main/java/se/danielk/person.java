package se.danielk;

import javax.crypto.spec.PSource;

public class person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;


    //Constructors
    public person(String firstName, String lastName, String email){
        if (firstName == null || firstName.isEmpty())
            throw new IllegalArgumentException("Firstname is Required!");

        if (lastName == null || lastName.isEmpty())
            throw new IllegalArgumentException("Lastname is Required!");

        if (email == null || email.isEmpty())
            throw new IllegalArgumentException("Email is Required!");


        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

    public person(int id, String firstName, String lastName, String email){

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "person{" +
                "id = " + id +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", email = '" + email + '\'' +
                '}';
    }


}
