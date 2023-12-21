import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hii "+name);

        int age = Integer.parseInt( JOptionPane.showInputDialog("Enter you age "));
        JOptionPane.showMessageDialog(null,"You are "+age+" years old");
    }
}
