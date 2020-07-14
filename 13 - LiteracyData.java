/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
public class LiteracyData {
    private String country;
    private String gender;
    private int year;
    private String literacy;
    
    public LiteracyData(String country, int year, String gender, String literacy){
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacy = literacy;
    }
    
    public String getLiteracy(){
        return this.literacy;
    }
    
    public String getCountry(){
        return this.country;
    }
    
    public String getGender(){
        String[] parts = this.gender.split(" ");
        this.gender = parts[1];
        return this.gender;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public String toString(){
        return this.getCountry() + " (" + this.getYear() + "), " + this.getGender() + ", " + this.getLiteracy();
    }
}
