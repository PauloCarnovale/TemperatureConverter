public class RankineKelvin implements ConversorTemperatura {

    @Override
    public double converteTemperatura(double temperatura) {
        return temperatura / 1.8;
    }

    @Override
    public String nomeOrigem() {
        return "Rankine";
    }

    @Override
    public String nomeDestino() {
        return "Kelvin";
    }

    @Override
    public char simboloOrigem() {
        return 'R';
    }

    @Override
    public char simboloDestino() {
        return 'K';
    }
}

