public class FahrenheitKelvin implements ConversorTemperatura {

    @Override
    public double converteTemperatura(double temperatura) {
        return (temperatura - 32) * 5/9 + 273.15;
    }

    @Override
    public String nomeOrigem() {
        return "Fahrenheit";
    }

    @Override
    public String nomeDestino() {
        return "Kelvin";
    }

    @Override
    public char simboloOrigem() {
        return 'F';
    }

    @Override
    public char simboloDestino() {
        return 'K';
    }
}
