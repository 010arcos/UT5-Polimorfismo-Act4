package Act4;

public class Esfera extends Forma {
    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return 4*Math.PI*Math.pow(this.radio,2);

    }

    public Esfera(int radio) {
        super("Esfera");
        this.radio = radio;
    }
}












































