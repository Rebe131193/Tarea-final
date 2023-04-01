package herncia.pastelerias;

public class PruebaDeSabor {

    public static void main(String[] args){
        Pastel pastel = new Pastel();
        pastel.setPrecio(1200);
        System.out.println("Pastel Basico: " + pastel.getSaboractual());
        System.out.println("Precio del Pastel " + "$" + pastel.getPrecio());

        PastelFiestaCumple pastelFiestaCumple = new PastelFiestaCumple();
        pastelFiestaCumple.setVelas(30);
        pastelFiestaCumple.setPrecio(1802);
        System.out.println("Pastel de Cumpleaños: " + pastelFiestaCumple.getSabor());
        System.out.println("Cantidad de velas: " + pastelFiestaCumple.getVelas());
        System.out.println("Precio del Pastel de Cumpleaños: " + "$" + pastelFiestaCumple.getPrecio());

        PastelBoda pastelBoda;
        pastelBoda = new PastelBoda();
        pastelBoda.setPrecio(2800);
        pastelBoda.setSabor("Piña Colada");
        pastelBoda.setNiveles(6);


        System.out.println("Pastel de Bodas: " + pastelBoda.getSabor());
        
        System.out.println("Niveles del Pastel de Bodas: " + pastelBoda.getNiveles());
        System.out.println("Precio del Pastel de Bodas: " + "$" + pastelBoda.getPrecio());
    }
}
