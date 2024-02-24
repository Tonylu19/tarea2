package calculator.controller;

public class Impl_Factory implements Operaciones_AbstractFactory {

    @Override
    public operaciones efectuarSuma() {
        return new operacionSuma();
    }

    @Override
    public operaciones efectuarResta() {
        return new operacionResta();
    }

    @Override
    public operaciones efectuarMultiplicar() {
        return new operacionMultiplicar();
    }

    @Override
    public operaciones efectuarDividir() {
        return new operacionDividir();

    }

}
