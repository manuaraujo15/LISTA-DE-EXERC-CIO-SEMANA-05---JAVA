public class CartaoDiaDosNamorados extends CartaoWeb {

    public CartaoDiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public String retornarMensagem(String remetente) {
        return "Querida " + destinatario + ",\n"
             + "Feliz Dia dos Namorados!\n"
             + "Espero que esse tenha sido o único cartão do dia dos namorados que tenha ganhado nessa data!\n"
             + "De todo meu coração,\n" + remetente;
    }
}
