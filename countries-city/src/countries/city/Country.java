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
class Country {
    private String code;
    private String name;
    private String continent;
    private double surfaceArea;
    private Double population;
    private double qnp;
    private int capital;

    public Country(String code, String name, String continent, double surfaceArea, Double population, double qnp, int capital) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.surfaceArea = surfaceArea;
        this.population = population;
        this.qnp = qnp;
        this.capital = capital;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public Double getPopulation() {
        return population;
    }

    public double getQnp() {
        return qnp;
    }

    public int getCapital() {
        return capital;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public void setQnp(double qnp) {
        this.qnp = qnp;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }
    public String toString(){
    return "code" +code+ ","+"name"+name+","+"continent"+continent+","+"SurfaceArea"+surfaceArea+","+"population "+population+","+"qnp"+qnp+","+"capital"+capital;
    }
    
    
}
