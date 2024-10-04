package one.digitalinnovation;

public class No<T> {
    private T conteudo;
    private No<T> noRef;


    public No(T conteudo) {
        this.conteudo = conteudo;
        this.noRef = null;
    }


    public T getConteudo() {
        return conteudo;
    }


    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }


    public No<T> getNoRef() {
        return noRef;
    }


    public void setNoRef(No<T> noRef) {
        this.noRef = noRef;
    }


    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }

    

    

}
