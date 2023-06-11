import java.io.*;

public class fileLnfileOut {
    public static void Ficheros(String fileln, String fileOut) throws IOException {
        InputStream fichero = new FileInputStream(fileln);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fichero);
        OutputStream outputStream = new FileOutputStream(fileOut);
        PrintStream printStream = new PrintStream(outputStream);

        int datos = bufferedInputStream.read();
        while(datos != -1){
            System.out.println((char) datos);
            datos = bufferedInputStream.read();
        }

    }
}
