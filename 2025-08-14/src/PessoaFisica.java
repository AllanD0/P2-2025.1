package src;

public class PessoaFisica extends Contribuinte{
    double gastosSaude;
    double taxa;

    public PessoaFisica(String nome, double renda_anual, double gastosSaude) {
        this.gastosSaude = gastosSaude;
        super(nome, renda_anual);
    }

    @Override
    public double calcularImposto() {
        if (renda_anual < 20000) {
        taxa = 0.15;
        }
        else taxa = 0.25;
        double impostoBruto = taxa * renda_anual;
        double abatimento =  gastosSaude * 0.5;

        return impostoBruto - abatimento;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "renda_anual=" + renda_anual +
                ", nome='" + nome + '\'' +
                '}';
    }
}
