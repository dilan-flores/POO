public class Perro {
    /* Atributos */
    String nombre, pelaje, color;
    int tamanio, edad, patas;

    public Perro(){
        nombre = "Karin";
        pelaje = "Mediano";
        color = "Negro y café";
        patas = 4;
        tamanio = 45;
        edad = 3;
    }

    /* Métodos y Eventos*/
    public void oler(){}
    public void ladrar(){}
    public void correr(){}
    public void jugar(){}
    public void morder(){}
    public void comer(){}
    public void defensa(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}