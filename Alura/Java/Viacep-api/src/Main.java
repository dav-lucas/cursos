import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsultaCep consultaCep = new ConsultaCep();
        Scanner leitura = new Scanner(System.in);
        List<Endereco> enderecos = new ArrayList();
        String cep = "";

        while(!cep.equalsIgnoreCase("sair")) {
            System.out.println("Digite o CEP desejado: ");
            cep = leitura.nextLine();
            if (cep.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                Endereco novoEndereco = consultaCep.buscaEndereco(cep);
                enderecos.add(novoEndereco);
                System.out.println(novoEndereco);
                GeradorArquivo gerador = new GeradorArquivo();
                gerador.geraJson(enderecos);
            } catch (Exception e) {
                System.out.println("Erro ao buscar o CEP: " + e.getMessage());
            }
        }

    }
}