public class FahrenheitRankine implements ConversorTemperatura {

    @Override
    public double converteTemperatura(double temperatura) {
        return temperatura + 459.67;
    }

    @Override
    public String nomeOrigem() {
        return "Fahrenheit";
    }

    @Override
    public String nomeDestino() {
        return "Rankine";
    }

    @Override
    public char simboloOrigem() {
        return 'F';
    }

    @Override
    public char simboloDestino() {
        return 'R';
    }
}

