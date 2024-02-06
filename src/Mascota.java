public class Mascota {
    private String nombre;
    private int edad;
    private String tipoAnimal;
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {
            TiendaMascotas tiendaMascota = new TiendaMascotas();

            tiendaMascota.agregarMascota("Piruleta", 4, "Nutria" );
            tiendaMascota.agregarMascota("Gusanita", 2, "Serpiente" );
            tiendaMascota.agregarMascota("Maravillosa", 6, "Vaca" );
        }
    }
    public Mascota(String nombre, int edad, String tipoAnimal){
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal = tipoAnimal;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getTipoAnimal() {
        return tipoAnimal;
    }
}
