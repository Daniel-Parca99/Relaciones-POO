
package relaciones;

/**
 *
 * @author Ryzen3
 */
public class Cuadrado extends FiguraGeometrica{
    
    private Double lado;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }
    
    
    public Double calcularElPerimetroCirculo(){
        return lado* Math.PI;
    }

    @Override
    public Double calcularArea() {
        return lado * lado;
    }

    @Override
    public Double calcularPerimetro() {
       return lado *4;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
    
        
}
