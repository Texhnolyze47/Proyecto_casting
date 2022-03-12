/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ivan
 */
public class Perfil {
    int id;
    String provincia;
    String sexo;
    String altura;
    String edad;
    String colorPiel;
    String colorOjos;
    String especialidad;
    String experencia;

    public Perfil() {
    }

    public Perfil(int id, String provincia, String sexo, String altura, String edad, String colorPiel, String colorOjos, String especialidad, String experencia) {
        this.id = id;
        this.provincia = provincia;
        this.sexo = sexo;
        this.altura = altura;
        this.edad = edad;
        this.colorPiel = colorPiel;
        this.colorOjos = colorOjos;
        this.especialidad = especialidad;
        this.experencia = experencia;
    }
    
     public Perfil( String provincia, String sexo, String altura, String edad, String colorPiel, String colorOjos, String especialidad, String experencia) {
        this.provincia = provincia;
        this.sexo = sexo;
        this.altura = altura;
        this.edad = edad;
        this.colorPiel = colorPiel;
        this.colorOjos = colorOjos;
        this.especialidad = especialidad;
        this.experencia = experencia;
    }
    
    
    

    public int getId() {
        return id;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getSexo() {
        return sexo;
    }

    public String getAltura() {
        return altura;
    }

    public String getEdad() {
        return edad;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getExperencia() {
        return experencia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setExperencia(String experencia) {
        this.experencia = experencia;
    }

    @Override
    public String toString() {
        return "Perfil{" + "id=" + id + ", provincia=" + provincia + ", sexo=" + sexo + ", altura=" + altura + ", edad=" + edad + ", colorPiel=" + colorPiel + ", colorOjos=" + colorOjos + ", especialidad=" + especialidad + ", experencia=" + experencia + '}';
    }
    
    
}
