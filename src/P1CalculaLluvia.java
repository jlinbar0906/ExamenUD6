import java.io.*;
import java.util.Arrays;

public class P1CalculaLluvia {
    public static void main(String[] args) throws IOException {

        try(BufferedReader r = new BufferedReader(new FileReader("lluvia.txt"))) {
            double lluviaMinima = Double.parseDouble(r.readLine());
            double lluviaTotal = 0;
            while (true) {
                String registro = r.readLine();
                if (registro == null) break;

                double lluviames = 0;
                String[] registroMes = registro.split(" ");
                String mes = registroMes[0];

                for (int i = 1; i <= registroMes.length - 1; i++) {
                    if (Double.parseDouble(registroMes[i]) != -1) {
                        lluviames += Double.parseDouble(registroMes[i]);
                    }
                }


                    try (PrintWriter w = new PrintWriter(new FileWriter("salida.txt"))) {
                    if (lluviames > lluviaMinima) {
                        w.println(mes + ":" + lluviames);
                        lluviaTotal += lluviames;
//                        w.flush();

                    }
                    w.println(lluviaTotal);


                }

            }
        }


        /*try(DataInputStream dis = new DataInputStream(new FileReader("lluvia.txt"))){
            double lluviaMinima=dis.readDouble();
            double lluviaTotal=0;
            while(true){
                String mes= dis.readUTF();
                double lluvia;
                double lluviames=0;
                do{
                    lluvia=dis.readDouble();

                    if(lluvia!=-1){
                        lluviames+=lluvia;
                    }
                }while(lluvia!=-1);
                lluviaTotal+=lluviames;
                try(DataOutputStream dos= new DataOutputStream(new FileOutputStream("salida.txt"))){
                    if(lluviames>lluviaMinima){
                        dos.writeUTF(mes);
                        dos.writeDouble(lluviames);
                    }
                    dos.writeUTF("Total: ");
                    dos.writeDouble(lluviaTotal);
                }
            }



        }catch (EOFException e){

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        */

    }
}


