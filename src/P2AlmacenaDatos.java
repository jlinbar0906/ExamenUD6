import java.io.*;
import java.util.Scanner;

public class P2AlmacenaDatos {
    private final static int TAMANIO_CABECERA = 4;

    private final static int TAMANIO_REGISTRO = 2+4+8*2;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
            try(RandomAccessFile raf= new RandomAccessFile("marcas.dat","rw")){
            int dia;
            double marca;
            double marcaMin=0, marcaMax=0;
            int contMarcas=0;

            do {
                dia = sc.nextInt();

                if (dia > 0 && dia < 6) {
                    raf.seek(dia +TAMANIO_REGISTRO+TAMANIO_CABECERA);
                    marca = sc.nextDouble();
                    if(marca<marcaMin){
                        marcaMin=marca;
                    }
                    if(marca>marcaMax){
                        marcaMax=marca;
                    }
                    raf.writeInt(dia);
                    raf.writeInt(contMarcas);
                    raf.writeDouble(marcaMin);
                    raf.writeDouble(marcaMax);
                } else {
                    System.out.println("Dia incorrecto");
                }
            } while (dia != 0);
        }
    }
}
