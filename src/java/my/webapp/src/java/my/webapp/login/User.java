/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.webapp.login;

/**
 *
 * @author Personal
 */
public class User {
    private int Id;
    private String Alias;
    private String Email;

    public User(int Id, String Alias, String Email) {
        this.Id = Id;
        this.Alias = Alias;
        this.Email = Email;
    }

    public int getId() {
        return Id;
    }

    public String getAlias() {
        return Alias;
    }

    public String getEmail() {
        return Email;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }        
}
