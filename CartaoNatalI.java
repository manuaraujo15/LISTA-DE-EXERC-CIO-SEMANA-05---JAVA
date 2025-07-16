public class CartaoNatal implements CartaoWebI {
    private String destinatario;

    public CartaoNatal(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public String retornarMensagem(String remetente) {
        return "Querido(a) " + destinatario + ",\n"
             + "Feliz Natal!\n"
             + "Com carinho,\n" + remetente;
    }
}
//com interface
