import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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

        System.out.println("\n\n---xxx---\n\n");

        Frame frame = new Frame();
        Button button = new Button("Clique neste botão!!!");
        button.addActionListener(event -> {
            System.out.println("Botão: " + event.getActionCommand() + " clicado!");
            Random ran = new Random();
            int color = ran.nextInt();
            Color cor = new Color(color);
            button.setBackground(cor);
        });
        button.setEnabled(true);
        button.setVisible(true);
        frame.add(button);
        frame.setTitle("Teste");
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}