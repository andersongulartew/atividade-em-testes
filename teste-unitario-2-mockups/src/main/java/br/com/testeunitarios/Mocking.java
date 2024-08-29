package br.com.testeunitarios;

public class Mocking {
    private static User user;

    public void setUser(User user) {
        this.user = user;
    }


    public static int assignPermission() {
        if(user.getRole().equals("admin")) {
            String username = user.getUsername();
            System.out.println("Atribuir permissões para o usuário: " + username);
            return 1;
        }else{
            System.out.println("Não é possível atribuir permissão");
            return -1;
        }
    }
}

