public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB hijoIzq;
    private TElementoAB hijoDer;
    private T datos;

    /**
     * @param unaEtiqueta
     * @param unosDatos
     * @return
     */
    @SuppressWarnings("unchecked")
    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }

    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    @Override
    public TElementoAB<T> getHijoIzq() {
        return this.hijoIzq;
    }

    @Override
    public TElementoAB<T> getHijoDer() {
        return this.hijoDer;
    }

    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        this.hijoIzq = elemento;

    }

    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        this.hijoDer = elemento;
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        TElementoAB<T> resultado = null;
        if (unaEtiqueta.compareTo(this.getEtiqueta()) == 0) {
            resultado = this;
        } else if (unaEtiqueta.compareTo(this.getEtiqueta()) < 0) {
            if (this.getHijoIzq() != null) {
                resultado = this.getHijoIzq().buscar(unaEtiqueta);
            }
        } else {
            if (this.getHijoDer() != null) {
                resultado = this.getHijoDer().buscar(unaEtiqueta);
            }
        }
        return resultado;

    }

    @Override
    public boolean insertar(TElementoAB<T> elemento) {
        if(this.etiqueta == elemento.etiqueta){
            return false;
        }
        if(elemento.etiqueta.compareTo(this.etiqueta) < 0){
            if(getHijoIzq() == null){
                setHijoIzq(elemento);
                return true;
            }
            else{
                return this.getHijoIzq().insertar(elemento);
            }
        }
        else{
            if(getHijoDer() == null){
                setHijoDer(elemento);
                return true;
            }
            else{
                return this.getHijoDer().insertar(elemento);
            }
        }
    }

    @Override
    public String preOrden() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'preOrden'");
    }

    @Override
    public String inOrden() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inOrden'");
    }

    @Override
    public String postOrden() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postOrden'");
    }

    @Override
    public T getDatos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDatos'");
    }

    @Override
    public TElementoAB eliminar(Comparable unaEtiqueta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

}
