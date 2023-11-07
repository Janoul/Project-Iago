import java.util.ArrayList;

public class UsuarioColaborador extends Usuario{
    private String cpf;
    private CarrinhoDeCompras carrinho;
    private Biblioteca biblioteca;
    private ArrayList<Ebook> ebooksPublicados;

    public UsuarioColaborador(String nome, String email,String endereco,String numeroContato,String cpf, CarrinhoDeCompras carrinho, Biblioteca biblioteca) {
        super(nome,email,endereco,numeroContato);
        this.cpf = cpf;
        this.carrinho = carrinho;
        this.biblioteca = biblioteca;
        this.ebooksPublicados = new ArrayList<>();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCarrinho() {
        return Carrinho;
    }

    public void setCarrinho(CarrinhoDeCompras carrinho) {
        this.carrinho = carrinho;
    }

    public String getBiblioteca() {
        return Biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public ArrayList<Ebook> getEbooksEscritos() {
        return ebooksEscritos;
    }

    public void setEbooksEscritos(ArrayList<Ebook> ebooksEscritos) {
        this.ebooksEscritos = ebooksEscritos;
    }

    public void adicionarEbook(Ebook ebook) {
        ebooksEscritos.add(ebook);
    }

    public void excluirEbook(Ebook ebook) {
        ebooksEscritos.remove(ebook);
    }


}