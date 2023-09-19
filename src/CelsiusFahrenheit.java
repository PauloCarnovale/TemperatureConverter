public class CelsiusFahrenheit implements ConversorTemperatura {

    @Override
    public double converteTemperatura(double temperatura) {
        return (temperatura * 9/5) + 32 im q;
    }

    @Override
    public String nomeOrigem() {
        return "Celsius";
    }

    @Override
    public String nomeDestino() {
        return "Fahrenheit";
    }

    @Override
    public char simboloOrigem() {
        return 'C';
    }

    @Override
    public char simboloDestino() {
        return 'F';
    }
}
