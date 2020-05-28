public class RungeKutta {
    private double h;
    public RungeKutta(double h){
        this.h=h;
    }
    private double getFuncion(double y){
        return 9.8-((0.5/5)*Math.pow(y,2));
    }

    public double cicloRungeKutta(double yCero, double finIntervalo) {
        double valor=h;
        double yInicio=yCero;
        double k1,k2,k3,k4;
        while (valor <= finIntervalo){
           // System.out.println("t= "+valor);
           k1=getFuncion(yInicio);
            //System.out.println("k1: "+k1);
            k2=getFuncion(yInicio+(0.5*h*k1));
            //System.out.println("k2: "+k2);
            k3=getFuncion(yInicio+(0.5*h*k2));
            //System.out.println("k3: "+k3);
            k4=getFuncion(yInicio+(h*k3));
            //System.out.println("k4: "+k4);
            yInicio=yInicio+((h/6)*(k1+(2*k2)+(2*k3)+k4));
            System.out.println("Y("+valor+")= "+yInicio);
            valor=valor+h;
        }
        return yInicio;
    }
}
