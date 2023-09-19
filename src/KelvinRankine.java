public class KelvinRankine implements ConversorTemperatura {

    @Override
    public double converteTemperatura(double temperatura) {
        return temperatura * 9/5;
    }

    @Override
    public String nomeOrigem() {
        return "Kelvin";
    }

    @Override
    public String nomeDestino() {
        return "Rankine";
    }

    @Override
    public char simboloOrigem() {
        return 'K';
    }

    @Override
    public char simboloDestino() {
        return 'R';
    }
}
