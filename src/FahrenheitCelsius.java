public class FahrenheitCelsius implements ConversorTemperatura {

    @Override
    public double converteTemperatura(double temperatura) {
        return (temperatura - 32) * 5/9;
    }

    @Override
    public String nomeOrigem() {
        return "Fahrenheit";
    }

    @Override
    public String nomeDestino() {
        return "Celsius";
    }

    @Override
    public char simboloOrigem() {
        return 'F';
    }

    @Override
    public char simboloDestino() {
        return 'C';
    }
}
