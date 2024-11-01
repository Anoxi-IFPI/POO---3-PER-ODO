public class Lampada {
    private boolean estado;

    public Lampada(boolean estado) {
        this.estado = estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public boolean acenderLampada() {
        return this.estado = true;
    }

    public boolean apagarLampada() {
        return this.estado = false;
    }

}
