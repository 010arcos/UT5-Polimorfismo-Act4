package Act4;

public class Rectangulo extends Forma {
    private int longitud;
    private int ancho;

    public Rectangulo(int longitud, int ancho) {
        super("Rectangulo");
        this.longitud = longitud;
        this.ancho = ancho;
    }


    @Override
    public double getArea() {
      return this.longitud*this.ancho;

    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
}



