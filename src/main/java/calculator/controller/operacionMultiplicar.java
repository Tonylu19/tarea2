package calculator.controller;

//marco antonio salvatierra salas
//1190-22-10134
public class operacionMultiplicar implements operaciones {

    @Override
    public double calcular(double n1, double n2) {
        double resultado = 0;

        resultado = n1 * n2;

        return resultado;
    }

}
