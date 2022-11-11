
public class Mascotas {
    public static void main(String[] args) {
        Perro Karin = new Perro();
        System.out.println("            Perro");
        System.out.println("Nombre: " + Karin.getNombre());
        System.out.println("Pelaje: " + Karin.getPelaje());
        System.out.println("Color: " + Karin.getColor());
        System.out.println("Tamanio: " + Karin.getTamanio() + " cm");
        System.out.println("Edad: " + Karin.getEdad() + " anios");
        System.out.println("Patas: " + Karin.getPatas());

        Pez Lucy = new Pez();
        System.out.println("            Pez");
        System.out.println("Nombre: " + Lucy.getNombre());
        System.out.println("Color: " + Lucy.getColor());
        System.out.println("Escamas: " + Lucy.getEscamas());
        System.out.println("Cola: " + Lucy.getCola() + " cm");
        System.out.println("Tamanio: " + Lucy.getTamanio() + " cm");
        System.out.println("peso: " + Lucy.getPeso() + " gr");

        Conejo Copo = new Conejo();
        System.out.println("            Conejo");
        System.out.println("Nombre: " + Copo.getNombre());
        System.out.println("pelaje: " + Copo.getPelaje());
        System.out.println("color: " + Copo.getColor());
        System.out.println("orejas: " + Copo.getOrejas() + " cm");
        System.out.println("Tamanio: " + Copo.getTamanio() + " cm");
        System.out.println("Patas: " + Copo.getPatas());
        System.out.println("peso: " + Copo.getPeso() + " kg");

        Periquito benji = new Periquito();
        System.out.println("            Periquito");
        System.out.println("Nombre: " + benji.getNombre());
        System.out.println("color: " + benji.getColor());
        System.out.println("plumaje: " + benji.getPlumaje());
        System.out.println("longitud: " + benji.getLongitud() + " cm");
        System.out.println("peso: " + benji.getPeso() + " gr");
        System.out.println("Patas: " + benji.getPatas());

    }
}