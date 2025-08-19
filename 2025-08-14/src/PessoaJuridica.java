package src;

public class PessoaJuridica extends Contribuinte{
   int numeroFuncionarios;
   double taxa;

    public PessoaJuridica(String nome, double renda_anual, int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
        super(nome, renda_anual);
    }

    @Override
    public double calcularImposto() {
        if (numeroFuncionarios > 10) {
            taxa = 0.14;
        }
        else taxa = 0.16;
        return renda_anual * taxa;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "renda_anual=" + renda_anual +
                ", nome='" + nome + '\'' +
                '}';
    }
}

