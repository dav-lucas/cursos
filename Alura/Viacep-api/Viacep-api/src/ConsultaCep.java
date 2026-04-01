import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ConsultaCep {
    public Endereco buscaEndereco(String cep) {
        String endereco = "https://viacep.com.br/ws/" + cep + "/json/";
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, BodyHandlers.ofString());
            return (Endereco)(new Gson()).fromJson((String)response.body(), Endereco.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}