
import java.io.IOException;
import java.io.RandomAccessFile;

public class P2LeeDatos {
    private final static int TAMANIO_CABECERA = 4;

    private final static int TAMANIO_REGISTRO = 2+4+8*2;
    public static void main(String[] args) throws IOException {

        try(RandomAccessFile raf= new RandomAccessFile("marcas.dat","r")){
        double valorMin,valorMax;
        int registroActual=0;
        do{
            raf.seek(registroActual * TAMANIO_REGISTRO +TAMANIO_CABECERA);
            int dia=raf.readInt();
            switch (dia){
                case 1:
                    int cont1=raf.readInt();
                     valorMin=raf.readDouble();
                     valorMax=raf.readDouble();
                    System.out.printf("Lunes: %d marcas; min= %f; max=%f",cont1,valorMin,valorMax);
                case 2:
                    int cont2=raf.readInt();
                    valorMin=raf.readDouble();
                    valorMax=raf.readDouble();
                    System.out.printf("Martes: %d marcas; min= %f; max=%f",cont2,valorMin,valorMax);

                case 3:
                    int cont3=raf.readInt();
                    valorMin=raf.readDouble();
                    valorMax=raf.readDouble();
                    System.out.printf("Miercoles: %d marcas; min= %f; max=%f",cont3,valorMin,valorMax);

                case 4:
                    int cont4=raf.readInt();
                    valorMin=raf.readDouble();
                    valorMax=raf.readDouble();
                    System.out.printf("Jueves: %d marcas; min= %f; max=%f",cont4,valorMin,valorMax);

                case 5:
                    int cont5=raf.readInt();
                    valorMin=raf.readDouble();
                    valorMax=raf.readDouble();
                    System.out.printf("Viernes: %d marcas; min= %f; max=%f",cont5,valorMin,valorMax);

            }
            registroActual++;
        }while (true);

        }
    }
}
