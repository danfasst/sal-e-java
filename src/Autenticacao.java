public class Autenticacao {
    public static boolean autenticar(String username, String password) {
        if ("admin".equals(username) && "senha123".equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
