import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Directivo directivo = new Directivo("Carlos","Ruiz", 50000);

        Operario operario = new Operario("Ivan","Romanov", 50000);

        Oficial oficial = new Oficial ("Gato","Romanov",5000);

        Tecnico tecnico = new Tecnico ("Perro","Romanov",5000);

        directivo.mostrarDatos2();
        operario.mostrarDatos2();
        oficial.mostrarDatos2();
        tecnico.mostrarDatos2();

    }
}