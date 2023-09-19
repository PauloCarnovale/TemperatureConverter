public class RankineCelsius implements ConversorTemperatura {

    @Override
    public double converteTemperatura(double temperatura) {
        return (temperatura - 491.67) / 1.8;
    }

    @Override
    public String nomeOrigem() {
        return "Rankine";
    }

    @Override
    public String nomeDestino() {
        return "Celsius";
    }

    @Override
    public char simboloOrigem() {
        return 'R';
    }

    @Override
    public char simboloDestino() {
        return 'C';
    }
}

