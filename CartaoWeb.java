public abstract class CartaoWeb {
    protected String destinatario;

    public CartaoWeb(String destinatario) {
        this.destinatario = destinatario;
    }

    public abstract String retornarMensagem(String remetente);
}
