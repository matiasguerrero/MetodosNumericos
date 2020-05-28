public class Euler {
    private double h;
    public Euler (double h){
        this.h=h;
    }
    private double getFuncion(double y){
        return 9.8-((0.5/5)*Math.pow(y,2));
    }

    public double cicloEuler(double yCero, double finIntervalo){
        double valor=0+h;
        double valorEvaluado=yCero;
        while (valor <= finIntervalo){
            valorEvaluado=valorEvaluado+(h*getFuncion(valorEvaluado));
            System.out.println("Valor: " + String.valueOf(valorEvaluado));
            valor=valor+h;
        }
        return valorEvaluado;
    }
}
