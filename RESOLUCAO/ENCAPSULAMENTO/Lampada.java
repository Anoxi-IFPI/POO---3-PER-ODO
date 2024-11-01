public class Lampada {
    private boolean estado;

    public void setEstado(boolean valor) {
        estado = valor;
    }

    public boolean getEstado() {
        return estado;
    }

    public void acenderLampada() {
        estado = true;
    }

    public void apagarLampada() {
        estado = false;
    }

}
