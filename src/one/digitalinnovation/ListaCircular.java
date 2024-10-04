package one.digitalinnovation;

public class ListaCircular<T> {

    private No<T> noCabeca;
    private No<T> noCauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.noCauda = null;
        this.noCabeca = null;
        this.tamanhoLista = 0;
    }

    public void add(T elemento){

        No<T> novoNo = new No<>(elemento);

        if(tamanhoLista == 0){
            this.noCabeca = novoNo;
            this.noCauda = novoNo;
            noCabeca.setNoRef(noCauda);
        }
        else{
            novoNo.setNoRef(this.noCauda);
            this.noCabeca.setNoRef(novoNo);
            this.noCauda = novoNo;
        }
        this.tamanhoLista++;

    }

    public void remove(int index){
        
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("o Indice é maior que o tamnhao da lista");

        No<T> noAuxiliar = this.noCauda;

        if(index == 0){
            this.noCauda = this.noCauda.getNoRef();
            this.noCabeca.setNoRef(noCauda);
        }else{
            for(int i = 0; i< index-1; i++){
            noAuxiliar=noAuxiliar.getNoRef();
            }
        noAuxiliar.setNoRef(noAuxiliar.getNoRef().getNoRef());
        }
        tamanhoLista--;
    }

    public T get(int index){
        return getNo(index).getConteudo();   
    }

    private No<T> getNo(int index){
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("A Lista está vazia");

        if(index == 0){
            return this.noCauda;
        }

        No<T> noAuxiliar = this.noCauda;

        for(int i = 0; i< index; i++){
            noAuxiliar = noAuxiliar.getNoRef();
        }
        return noAuxiliar;

    }

    public boolean isEmpty(){
        return tamanhoLista == 0? true: false;
    }

    public int size(){
        return tamanhoLista;
    }

    @Override
    public String toString() {

        String strRetorno = "";
        No<T> noAuxiliar = noCauda;
        for(int i=0; i<this.size(); i++){
            strRetorno += i + "°: " + noAuxiliar.getConteudo() + "\n";
            noAuxiliar = noAuxiliar.getNoRef();
        }
        
        strRetorno += !this.isEmpty() ? "retorna ao inicio " : "Lista Vazia"; 
        return strRetorno;
    }

    

    

}
