package Test;

public class LenguajeHacker {
    private String mensaje = "";

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String GenerarMensaje(String mensaje) {
        this.mensaje = mensaje.toLowerCase();

        this.mensaje = this.mensaje.replace("a", "4")
                .replace("e", "3")
                .replace("i", "1")
                .replace("o", "0");

        return this.mensaje;
    }


}
