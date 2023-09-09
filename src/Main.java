import java.io.*;

public class Main {
    public static void main(String[] args) {
        LeerFichero lecturaFichero = new LeerFichero();
        EscribirFichero escribeFichero = new EscribirFichero();

        try {
            lecturaFichero.leeDatos();
            escribeFichero.escribeDatos();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un problema.");
            e.printStackTrace();
        }
    }
}

class LeerFichero {

    public void leeDatos() throws IOException {
        FileReader entrada = new FileReader("./fichero1.txt");
        BufferedReader miBuffer = new BufferedReader(entrada);

        String linea = "";

        while (linea != null) {
            linea = miBuffer.readLine();
            if (linea != null) System.out.println(linea);
        }

        entrada.close();
    }
}

class EscribirFichero {

    public void escribeDatos() throws IOException {
        FileWriter escritura = new FileWriter("fichero2.txt");
        BufferedWriter miBuffer = new BufferedWriter(escritura);
        String texto = "Escritura del texto";

        miBuffer.write(texto);
        miBuffer.flush();

        miBuffer.close();
    }
}