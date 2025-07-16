public class CartaoNatal extends CartaoWeb {

    public CartaoNatal(String destinatario) {
        super(destinatario);
    }

    @Override
    public String retornarMensagem(String remetente) {
        return "Querido(a) " + destinatario + ",\n"
             + "Feliz Natal! Que a paz e a luz dessa época estejam com você.\n"
             + "Com carinho,\n" + remetente;
    }
}
