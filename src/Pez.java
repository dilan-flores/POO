public class Pez {
    /* Atributos */
    String nombre, color, escamas, cola;
    int tamanio, peso;

    public Pez(){
        nombre = "Lucy";
        color = "Amarillo y naranja";
        escamas = "Normales";
        cola = "sencilla";
        tamanio = 20;
        peso = 20;
    }

    /* Métodos y Evento*/
    public void nadar(){}
    public void comer(){}
    public void pacifico(){}
    public void peligro(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEscamas() {
        return escamas;
    }

    public void setEscamas(String escamas) {
        this.escamas = escamas;
    }

    public String getCola() {
        return cola;
    }

    public void setCola(String cola) {
        this.cola = cola;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
