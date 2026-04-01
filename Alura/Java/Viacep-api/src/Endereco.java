public class Endereco {
    private String logradouro;
    private String cep;
    private String localidade;
    private String uf;

    public String getCep() {
        return this.cep;
    }

    public String getLocalidade() {
        return this.localidade;
    }

    public String getUf() {
        return this.uf;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }


    @Override
    public String toString() {
        return "Endereço: " +
                "\nLogradouro: " + this.logradouro +
                "\nCEP: " + this.cep +
                "\nCidade: " + this.localidade +
                "\nUF: " + this.uf;
    }
}