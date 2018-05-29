import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class main {
    public static void main(String ... args){
        Usuario usuario1 = new Usuario("Vinícius Ponciano", 200);
        Usuario usuario2 = new Usuario("Natália Possato", 198);
        Usuario usuario3 = new Usuario("Júlia Possato Ponciano", 1000);

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

        Mostrador mostrador = new Mostrador();
        usuarios.forEach(mostrador);

        System.out.println("\n\n---xxx---\n\n");

        for(Usuario u : usuarios) {
            System.out.println(u.getNome());
        }
    }
}

class Mostrador implements Consumer<Usuario> {
    public void accept(Usuario u) {
        System.out.println(u.getNome());
    }
}