import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CartaoWeb[] cartoes = new CartaoWeb[6];

        // Criando cartões alternadamente
        cartoes[0] = new CartaoDiaDosNamorados("Maria");
        cartoes[1] = new CartaoNatal("José");
        cartoes[2] = new CartaoAniversario("Ana");
        cartoes[3] = new CartaoDiaDosNamorados("Pedro");
        cartoes[4] = new CartaoNatal("Beatriz");
        cartoes[5] = new CartaoAniversario("Carlos");

        System.out.print("Digite seu nome (remetente): ");
        String remetente = sc.nextLine();

        System.out.println("\n--- MENSAGENS DOS CARTÕES ---");
        for (CartaoWeb c : cartoes) {
            System.out.println("\n" + c.retornarMensagem(remetente));
        }

        sc.close();
    }
}
