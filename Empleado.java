
package Modelo;


public class Empleado {
    String dpi;
    String nom;
    String ape;
    String tel;
    String correo;
    
    public Empleado()
    {
        
    }

    public Empleado(String dpi, String nom, String ape, String tel, String correo) {
        this.dpi = dpi;
        this.nom = nom;
        this.ape = ape;
        this.tel = tel;
        this.correo = correo;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
