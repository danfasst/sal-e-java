public class Autenticacao {
    
    public static boolean autenticar(String username, String password) {
        
        if ("admin".equals(username) && "123".equals(password)) {
            return true;
        } 
    
        return false;
    }
}
