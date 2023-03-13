
package javaapplication16;

import java.util.ArrayList;
import java.util.Iterator;

public class Transportes {
    private ArrayList<Taxi> taxis;

    public Transportes() {
        taxis = new ArrayList<>();
    }

    public void registrarTaxi(String placa, int movil, String conductor, String modelo, String marca) {
        Taxi taxi = new Taxi(placa, movil, conductor, modelo, marca);
        taxis.add(taxi);
        System.out.println("Se ha registrado el taxi: " + taxi);
    }

    public void buscarPorModelo(String modelo) {
        System.out.println("Taxis con modelo " + modelo + ":");
        Iterator<Taxi> iterator = taxis.iterator();
        while (iterator.hasNext()) {
            Taxi taxi = iterator.next();
            if (taxi.getModelo().equals(modelo)) {
                System.out.println(taxi);
            }
        }
    }

    public void eliminarTaxi(String placa) {
        Iterator<Taxi> iterator = taxis.iterator();
        while (iterator.hasNext()) {
            Taxi taxi = iterator.next();
            if (taxi.getPlaca().equals(placa)) {
                iterator.remove();
                System.out.println("Se ha eliminado el taxi con placa " + placa);
                return;
            }
        }
        System.out.println("No se ha encontrado un taxi con la placa " + placa);
    }

    public void modificarTaxi(String placa, String conductor) {
        Iterator<Taxi> iterator = taxis.iterator();
        while (iterator.hasNext()) {
            Taxi taxi = iterator.next();
            if (taxi.getPlaca().equals(placa)) {
                taxi.setConductor(conductor);
                System.out.println("Se ha modificado el conductor del taxi con placa " + placa);
                return;
            }
        }
        System.out.println("No se ha encontrado un taxi con la placa " + placa);
    }

    public void listarTaxis() {
        System.out.println("Lista de taxis:");
        for (Taxi taxi : taxis) {
            System.out.println(taxi);
}
}
}