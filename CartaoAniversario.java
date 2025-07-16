public class CartaoAniversario extends CartaoWeb {

    public CartaoAniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public String retornarMensagem(String remetente) {
        return "Parabéns " + destinatario + "!\n"
             + "Muita saúde, felicidade e sucesso neste novo ciclo.\n"
             + "Abraços,\n" + remetente;
    }
}
