/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.PublicationAuthority;

/**
 *
 * @author meetb007
 */
public class PublicationAuthority {
    private String name;
    private String country;

    public PublicationAuthority(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public PublicationAuthority() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return name;
    }
}
