public class MediadorExample {


    public static void main(String[] args) {
            ChatMediadorImpl mediador = new ChatMediadorImpl();

            User user1 = new User("User1", mediador);
            User user2 = new User("User2", mediador);
            User user3 = new User("User3", mediador);

            mediador.addUser(user1);
            mediador.addUser(user2);
            mediador.addUser(user3);

            user1.enviarMsg("Ola, user 1 enviou");
            user2.enviarMsg("Oi, User 2 enviou!");
        }
}
