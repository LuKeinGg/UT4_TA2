public class TArbolBB<T> implements IArbolBB<T> {

    private TElementoAB<T> raiz;

    /**
     * Separador utilizado entre elemento y elemento al imprimir la lista
     */
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB() {
        raiz = null;
    }

    @Override
    public boolean insertar(TElementoAB<T> unElemento) {

        throw new UnsupportedOperationException("Unimplemented method 'insertar'");
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {

        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public String preOrden() {

        throw new UnsupportedOperationException("Unimplemented method 'preOrden'");
    }

    @Override
    public String inOrden() {

        throw new UnsupportedOperationException("Unimplemented method 'inOrden'");
    }

    @Override
    public String postOrden() {

        throw new UnsupportedOperationException("Unimplemented method 'postOrden'");
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {

        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

}
