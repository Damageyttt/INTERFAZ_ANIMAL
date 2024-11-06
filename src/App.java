import main.model.Elefante;
import main.model.Murcielago;
import main.model.Pato;

public class App {
    public static void main(String[] args) throws Exception {
        Elefante elefante = new Elefante();
        Murcielago murcielago = new Murcielago();
        Pato pato = new Pato();

        System.out.println("Animales que respiran");
        elefante.respirar();
        murcielago.respirar();
        pato.respirar();

        System.out.println("\nAnimales que nadan");
        pato.nadar();

        System.out.println("/nAnimales que vuelan");
        murcielago.volar();
    }
}
