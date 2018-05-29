import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String ... args){
        Usuario usuario1 = new Usuario("Vinícius Ponciano", 200);
        Usuario usuario2 = new Usuario("Natália Possato", 198);
        Usuario usuario3 = new Usuario("Júlia Possato Ponciano", 1000);

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

        // Lambda -> Viva o JavaScript!!!
        usuarios.forEach(u -> System.out.println(u.getNome()));

        System.out.println("\n\n---xxx---\n\n");

        for(Usuario u : usuarios) {
            System.out.println(u.getNome());
        }

        System.out.println("\n\n---xxx---\n\n");

        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.print(i + " ");
            }
        }).start();
    }
}