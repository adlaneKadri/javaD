public class Test {
    public static void main(String[] args) {
        Server serveurEnseignant = new Server(Server.port);
        serveurEnseignant.manageRequests();
    }
}
