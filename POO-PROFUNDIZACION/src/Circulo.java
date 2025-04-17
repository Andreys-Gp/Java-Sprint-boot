public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radio, 2);
    }

}
