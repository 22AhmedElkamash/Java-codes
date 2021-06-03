/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countries.city;

/**
 *
 * @author elkamash
 */
public class City {
private int id;
private String name;
private Integer pupulation;
private String countryCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPupulation(int pupulation) {
        this.pupulation = pupulation;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public Integer getPupulation() {
        return pupulation;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public City(int id, String name, Integer pupulation, String countryCode) {
        this.id = id;
        this.name = name;
        this.pupulation = pupulation;
        this.countryCode = countryCode;
    }
    public String toString(){
    return "id: " +id+ " name:" +name+ " population:"+pupulation+" countrycode:"+countryCode;
    
    
    
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
