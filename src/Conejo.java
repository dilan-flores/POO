public class Conejo {
    /* Atributos*/

    String nombre,pelaje, color;
    int tamanio, patas, peso, orejas;

    public Conejo(){
        nombre = "Copo";
        pelaje = "mediano";
        color = "blanco";
        orejas = 7;
        tamanio = 33;
        patas = 4;
        peso = 2;
    }

    /* Métodos y Eventos*/
    public void saltar(){}
    public void comer(){}
    public void jugar(){}
    public void carinio(){}
    public void peligro(){}

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

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getOrejas() {
        return orejas;
    }

    public void setOrejas(int orejas) {
        this.orejas = orejas;
    }
}
