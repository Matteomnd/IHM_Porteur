import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class IHM extends JFrame implements ActionListener {
    private JButton demarrer;
    private JButton parametres;
    private JPanel myPanel;

    public IHM() {
        //création de la fenêtre principale
        super();
        this.setAlwaysOnTop(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("Commande du Porteur : Menu Principal");

        this.myPanel = new JPanel();
        JPanel start_left = new JPanel();
        JPanel start_right = new JPanel();





        //ajout de l'ensemble à l'IHM
        this.add(myPanel);

        //affichage de la fenêtre
        this.setVisible(true);

        //arrêt du code lors de la fermeture de la fenêtre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





        JButton Arret = new JButton("Arrêt d'urgence");
        JButton End = new JButton("Fin de la simulation");




        myPanel.setLayout(new BorderLayout(5, 5));
        myPanel.add(start_left, BorderLayout.WEST);
        myPanel.add(start_right, BorderLayout.EAST);

        start_left.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        start_right.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        start_right.add(Arret);
        start_right.add(End);


        start_right.setVisible(true);
        myPanel.setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
            String event = e.getActionCommand();
            System.out.println(event);
            if (event.equals("Démarrer")){




            }
            else if(event.equals("parametres")){
                //JFrame
            }

    }
}
