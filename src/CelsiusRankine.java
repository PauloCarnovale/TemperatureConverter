public class CelsiusRankine implements ConversorTemperatura {

    @Override
    public double converteTemperatura(double temperatura) {
        return temperatura * 1.8 + 491.67;
    }

    @Override
    public String nomeOrigem() {
        return "Celsius";
    }

    @Override
    public String nomeDestino() {
        return "Rankine";
    }

    @Override
    public char simboloOrigem() {
        return 'C';
    }

    @Override
    public char simboloDestino() {
        return 'R';
    }
}