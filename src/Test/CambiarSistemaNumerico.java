package Test;

public class CambiarSistemaNumerico {

    public static String conversorHex(int num){
        int residuo;
      String resultado="";
        do{
            residuo=num%16;


        }while(num%16 > 16);


        return resultado;
    }




}
