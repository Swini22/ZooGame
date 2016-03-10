package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import zooGame.User;

public class StartScreen extends JFrame {

    private JLabel welcomeLabel;
    private Font standart = new Font("Arial", Font.PLAIN, 20);
    private JLabel moneyLabel;
    private JButton cageButton;
    private JButton animalButton;
    private JLabel moneyPerMinuteTextLabel;
    private JLabel moneyPerMinuteLabel;
    private User user;

    public StartScreen(User user) {
        super("Zoo");
        this.user = user;
        prepareGui();
    }

    private void prepareGui() {
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        this.getContentPane().setBackground(new Color(44, 62, 80));

        welcomeLabel = new JLabel("Zoo Game");
        welcomeLabel.setSize(150, 30);
        welcomeLabel.setLocation(50, 50);
        welcomeLabel.setFont(standart);
        welcomeLabel.setForeground(Color.WHITE);

        moneyLabel = new JLabel(user.getMoney()+"");
        moneyLabel.setSize(150, 30);
        moneyLabel.setLocation(100, 100);
        moneyLabel.setFont(standart);
        moneyLabel.setForeground(Color.WHITE);
        
        moneyPerMinuteTextLabel = new JLabel("Zoo Game");
        moneyPerMinuteTextLabel.setSize(150, 30);
        moneyPerMinuteTextLabel.setLocation(50, 50);

        moneyPerMinuteLabel = new JLabel("Money");
        moneyPerMinuteLabel.setSize(150, 30);
        moneyPerMinuteLabel.setLocation(100, 100);

        cageButton = new JButton("zu den Gehegen");
        cageButton.setSize(200, 50);
        cageButton.setLocation(50, 300);
        cageButton.setFont(standart);
        cageButton.setForeground(Color.WHITE);
        cageButton.setBackground(new Color(41, 128, 185));
        cageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                // new CageScreen(user);
            }
        });

        animalButton = new JButton("zu den Tieren");
        animalButton.setSize(200, 50);
        animalButton.setLocation(400, 300);
        animalButton.setFont(standart);
        animalButton.setForeground(Color.WHITE);
        animalButton.setBackground(new Color(41, 128, 185));
        animalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                // new AnimalScreen(user);
            }
        });

        add(welcomeLabel);
        add(moneyLabel);
        add(cageButton);
        add(animalButton);
        setVisible(true);
    }

    public void dispose() {
        setVisible(false);
    }

}