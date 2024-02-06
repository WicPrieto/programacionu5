public class TiendaMascotas {
    Mascota [] inventario;
    int cantidadMascotas;
    public TiendaMascotas(){
        this.inventario = new Mascota[100];
        this.cantidadMascotas = 10;
    }

    public void agregarMascota(String nombre, int edad, String tipoAnimal){
        Mascota mascota = new Mascota(nombre, edad, tipoAnimal);
        inventario[cantidadMascotas]=mascota;
        cantidadMascotas++;
        System.out.println("La mascota" + nombre + "Se ha añadido correctamente");
    }
    public void venderMascota(String nombre){
        for (int i = 0; i < cantidadMascotas ; i++) {
            if (inventario[1].getNombre()==nombre);
            System.out.println("La mascota " + inventario[i].getNombre() + "se ha vendido");
            inventario[i]=null;
            for (int j = 0; j < cantidadMascotas; j++) {
                inventario[j] = inventario[j + 1];
            }
            cantidadMascotas--;
            return;

        }
        System.out.println("La mascota con nombre"+nombre+"no se encuentra");
    }
    public void mostrarInventario(){
        System.out.println("El inventario de la tienda:");
        for (int j = 0; j < cantidadMascotas; j++) ;
        System.out.println("Nombre: " +inventario[1].getNombre()+ ", Edad " +inventario[2].getEdad()+ "Tipo: " +inventario[3].getTipoAnimal());

    }
}