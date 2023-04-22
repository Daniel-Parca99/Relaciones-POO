
package relaciones;

/**
 *
 * @author Ryzen3
 */
public class Circulo extends FiguraGeometrica {

    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }
    
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    
    public Double calcularDiametro() {
        return 2 * radio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public Double calcularPerimetro() {
        return Math.PI * radio * 2;
    }

}