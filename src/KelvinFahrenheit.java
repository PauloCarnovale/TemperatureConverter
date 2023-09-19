public class KelvinFahrenheit implements ConversorTemperatura {

    @Override
    public double converteTemperatura(double temperatura) {
        return (temperatura - 273.15) * 9/5 + 32;
    }

    @Override
    public String nomeOrigem() {
        return "Kelvin";
    }

    @Override
    public String nomeDestino() {
        return "Fahrenheit";
    }

    @Override
    public char simboloOrigem() {
        return 'K';
    }

    @Override
    public char simboloDestino() {
        return 'F';
    }
}
