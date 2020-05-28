public class EulerMejorado {
    private double h;
    public EulerMejorado (double h){
        this.h=h;
    }
    private double getFuncion(double y){
        return 9.8-((0.5/5)*Math.pow(y,2));
    }
    public double cicloEulerMejorado(double yCero, double finIntervalo){
        double valor=0+h;
        double valorEvaluado=yCero;
        double valorEvaluadoAnt1=0;
        double valorEvaluadoAnt2=0;
        while (valor <= finIntervalo){
            if (valor == h) {
                valorEvaluadoAnt1=yCero;
                valorEvaluado = valorEvaluado + (h * getFuncion(valorEvaluado));
                System.out.println("Primer valor: "+ String.valueOf(valorEvaluado));
                valorEvaluadoAnt2=valorEvaluado;
            }
            else {
                valorEvaluado = valorEvaluado + ((h/2) * (getFuncion(valorEvaluadoAnt1) + getFuncion(valorEvaluadoAnt2)));
                System.out.println("Valor: " + String.valueOf(valorEvaluado) + " Anterior (F1): " + String.valueOf(valorEvaluadoAnt1) +
                        " Anterior2 (F2): "+ String.valueOf(valorEvaluadoAnt2));
                valorEvaluadoAnt1=valorEvaluadoAnt2;
                valorEvaluadoAnt2=valorEvaluado;
            }
            valor=valor+h;
        }
        return valorEvaluado;
    }

}
