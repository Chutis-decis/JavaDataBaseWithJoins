package com.mycompany.platillos;
public class Platillos {
    
    int id; 
    String platillo; 
    String Postre; 
    String soda; 

    public Platillos() {
    }

    public Platillos(String platillo, String Postre, String soda) {
        this.platillo = platillo;
        this.Postre = Postre;
        this.soda = soda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlatillo() {
        return platillo;
    }

    public void setPlatillo(String platillo) {
        this.platillo = platillo;
    }

    public String getPostre() {
        return Postre;
    }

    public void setPostre(String Postre) {
        this.Postre = Postre;
    }

    public String getSoda() {
        return soda;
    }

    public void setSoda(String soda) {
        this.soda = soda;
    }
    
    
}
