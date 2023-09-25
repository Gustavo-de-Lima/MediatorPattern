public class User {
    private String nome;
    private ChatMediador mediador;

    public User(String nome, ChatMediador mediador) {
        this.nome = nome;
        this.mediador = mediador;
    }

    public void enviarMsg(String mensagem) {
        System.out.println(nome + " enviando mensagem: " + mensagem);
        mediador.mandarMsg(mensagem, this);
    }

    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebendo mensagem: " + mensagem);
    }
}
