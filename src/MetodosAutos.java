import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;

public class MetodosAutos {


    public static void obtenerAutoMasCaro(ArrayList<Vehiculo> vehiculos){

        double precioComp = 0;
        String vehiculo = "";
        String modelo = "";

        for (int i = 0; i < vehiculos.size(); i++) {


            double precioTemp = vehiculos.get(i).getPrecio();
            String  marcaTemp = vehiculos.get(i).getMarca();
            String  modeloTemp= vehiculos.get(i).getModelo();



            if (precioTemp > precioComp){
                precioComp= precioTemp;
                vehiculo = marcaTemp;
                modelo = modeloTemp;

            }
        }
        System.out.println("Vehiculo mas caro: " + vehiculo + "" + modelo);

    }

    public void obtenerAutoMasBaratos(ArrayList<Vehiculo> vehiculos){

        double precioComp = 0;
        String vehiculo = "";
        String modelo = "";

        double max = 0;

        ArrayList<Double> precios = new ArrayList<Double>();


        for (int i = 0; i < vehiculos.size(); i++) {

            precios.add(vehiculos.get(i).getPrecio());
            max = Collections.max(precios);
        }

        for (int i = 0; i < vehiculos.size(); i++) {

            double precioTemp = vehiculos.get(i).getPrecio();
            String  marcaTemp = vehiculos.get(i).getMarca();
            String  modeloTemp= vehiculos.get(i).getModelo();

            if (precioTemp < max){
                max= precioTemp;
                vehiculo = marcaTemp;
                modelo = modeloTemp;

            }
        }
        System.out.println("Vehiculo mas barato: " + vehiculo + "" + modelo);

    }

    public void obtenerAutoPorLetra(ArrayList<Vehiculo> vehiculos){

        NumberFormat formatoNumero = NumberFormat.getNumberInstance();
        ArrayList<String> modelos = new ArrayList<String>();

        for (int i=0; i< vehiculos.size(); i++){
            modelos.add(vehiculos.get(i).getModelo());

            if(vehiculos.get(i).getModelo().contains("Y")){

                Vehiculo vehiculo = new Vehiculo();
                vehiculo = vehiculos.get(i);

                System.out.println("Vehículo que contiene en el modelo la letra 'Y': "
                                                        + vehiculo.getMarca()
                                                        + vehiculo.getModelo()
                                                        +" "
                                                        + formatoNumero.format (vehiculo.getPrecio()));
            }

        }

    }


    public void ordenarAutosPorPrecio(ArrayList<Vehiculo> vehiculos){

        Collections.sort(vehiculos, Collections.reverseOrder());

        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for (int i=0; i< vehiculos.size(); i++){

            System.out.println(vehiculos.get(i).getMarca()
                                    + vehiculos.get(i).getModelo() );
        }

      }

    }




