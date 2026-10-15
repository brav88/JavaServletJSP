/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.webapp.person;

/**
 *
 * @author Personal
 */
public class Person { 
    private int Id;
    private String Name;
    private String LastName;
    private String Address;
    private int Age;
    private String PhoneNumber;

    public Person(int Id, String Name, String LastName, String Address, int Age, String PhoneNumber) {
        this.Id = Id;
        this.Name = Name;
        this.LastName = LastName;
        this.Address = Address;
        this.Age = Age;
        this.PhoneNumber = PhoneNumber;
    }
    
    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAddress() {
        return Address;
    }

    public int getAge() {
        return Age;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }    
}
