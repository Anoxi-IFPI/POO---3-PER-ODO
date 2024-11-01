public class Lampada {
    private boolean estado = true;

    public void setEstado(boolean valor) {
        this.estado = valor;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void acender() {
        this.estado = true;
    }

    public void apagar() {
        this.estado = false;
    }

}
