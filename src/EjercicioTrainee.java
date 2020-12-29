import java.util.ArrayList;

public class EjercicioTrainee {

    public static void main (String [ ] args) {
        MetodosAutos metodosAutos = new MetodosAutos();

        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        Vehiculo vehiculo1 = new Vehiculo();
        Vehiculo vehiculo2 = new Vehiculo();
        Vehiculo vehiculo3 = new Vehiculo();
        Vehiculo vehiculo4 = new Vehiculo();

        vehiculo1.setMarca("Peugeot ");
        vehiculo1.setModelo("206 ");
        vehiculo1.setPuertas(4);
        vehiculo1.setTipo("auto");
        vehiculo1.setPrecio(200000.0);

        vehiculo2.setMarca("Honda  ");
        vehiculo2.setModelo("Titan ");
        vehiculo2.setCilindrada("125cc ");
        vehiculo2.setTipo("motocicleta");
        vehiculo2.setPrecio(60000.000);

        vehiculo3.setMarca("Peugeot ");
        vehiculo3.setModelo("208 ");
        vehiculo3.setPuertas(5);
        vehiculo3.setTipo("auto");
        vehiculo3.setPrecio(250000.00);

        vehiculo4.setMarca("Yamaha  ");
        vehiculo4.setModelo("YBR");
        vehiculo4.setTipo("motocicleta");
        vehiculo4.setPrecio(80500.500);

        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);
        vehiculos.add(vehiculo4);

        System.out.println("=============================");
        metodosAutos.obtenerAutoMasCaro(vehiculos);
        metodosAutos.obtenerAutoMasBaratos(vehiculos);
        metodosAutos.obtenerAutoPorLetra(vehiculos);
        metodosAutos.ordenarAutosPorPrecio(vehiculos);



    }
}
