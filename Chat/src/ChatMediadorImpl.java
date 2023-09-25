import java.util.ArrayList;
import java.util.List;

public class ChatMediadorImpl implements ChatMediador {
    private List<User> users;

    public ChatMediadorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void mandarMsg(String mensagem, User user) {
        for (User u : users) {
            if (u != user) {
                u.receberMensagem(mensagem);
            }
        }
    }
}
