import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Uppgift3 {
    public static ImageIcon createImageIcon(String path) throws MalformedURLException {
        URL imgURL = new URL(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image");
        frame.setSize(150, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = null;
        try {
            label = new JLabel( createImageIcon("https://webshare.mah.se/ak4314/gubbe.jpg") );
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        frame.add(label, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}