public class RankineFahrenheit implements ConversorTemperatura {

    @Override
    public double converteTemperatura(double temperatura) {
        return temperatura - 459.67;
    }

    @Override
    public String nomeOrigem() {
        return "Rankine";
    }

    @Override
    public String nomeDestino() {
        return "Fahrenheit";
    }

    @Override
    public char simboloOrigem() {
        return 'R';
    }

    @Override
    public char simboloDestino() {
        return 'F';
    }
}

