public class Periquito {
    /* Atributo */

    String nombre, color, plumaje;
    int longitud, peso, patas;

    public Periquito(){
        nombre = "Benji";
        color = "Verde, azul, amarillo";
        plumaje = "atractivo y llamativo";
        longitud = 17;
        peso = 35;
        patas = 2;
    }

    /* Método y Evento*/
    public void volar(){};
    public void comer(){};
    public void chirridos(){};
    public void cantar(){};
    public void pacifico(){};

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

    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
