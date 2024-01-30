package Act4;

public class Cilindro extends Forma {
    private int radio;
    private int altura;

    public Cilindro( int radio, int altura) {
        super("Cilindro");
        this.radio = radio;
        this.altura = altura;
    }

    /*public double getArea(){
        return ;
    }

*/

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radio, 2) * this.altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "radio=" + radio +
                ", altura=" + altura +
                '}';
    }
}

