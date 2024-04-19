import java.util.List;
import java.util.ArrayList;

public class Endereco {
    private List<Logradouro> logradouros = new ArrayList<>();
    private Integer numero;
    private String complemento;
    private Integer cep;
    private TipoEndereco tipoEndereco;

    public void addLogradouro(Logradouro logradouro) {
        logradouros.add(logradouro);
    }

    public void removeLogradouro(Logradouro logradouro) {
        logradouros.remove(logradouro);
    }

    public List<Logradouro> getLogradouros() {
        return logradouros;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }
    
    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }
}
