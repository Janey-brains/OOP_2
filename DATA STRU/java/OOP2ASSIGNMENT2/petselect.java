package OOP2ASSIGNMENT2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class petselect extends JFrame implements ActionListener {
    private JLabel petImageLabel;
    private JRadioButton dogRadioButton;
    private JRadioButton catRadioButton;
    private JRadioButton birdRadioButton;
    private JRadioButton pigRadioButton;
    private JRadioButton rabbitRadioButton;
    private JButton checkButton;
    private JLabel resultLabel;
    private String correctPetType;

    public petselect() {
        setTitle("Pet Display");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        dogRadioButton = new JRadioButton("Dog");
        catRadioButton = new JRadioButton("Cat");
        birdRadioButton = new JRadioButton("Bird");
        pigRadioButton = new JRadioButton("Pig");
        rabbitRadioButton = new JRadioButton("Rabbit");

        dogRadioButton.addActionListener(this);
        catRadioButton.addActionListener(this);
        birdRadioButton.addActionListener(this);
        pigRadioButton.addActionListener(this);
        rabbitRadioButton.addActionListener(this);


        ButtonGroup group = new ButtonGroup();
        group.add(dogRadioButton);
        group.add(catRadioButton);
        group.add(birdRadioButton);
        group.add(pigRadioButton);
        group.add(rabbitRadioButton);


        petImageLabel = new JLabel();
        petImageLabel.setHorizontalAlignment(JLabel.CENTER);
        petImageLabel.setVerticalAlignment(JLabel.CENTER);


        checkButton = new JButton("Check");
        checkButton.addActionListener(this);
        resultLabel = new JLabel();
        resultLabel.setHorizontalAlignment(JLabel.CENTER);


         JPanel radioButtonPanel = new JPanel(new GridLayout(5, 1));
         radioButtonPanel.add(dogRadioButton);
         radioButtonPanel.add(catRadioButton);
         radioButtonPanel.add(birdRadioButton);
         radioButtonPanel.add(pigRadioButton);
         radioButtonPanel.add(rabbitRadioButton);
 
         JPanel controlPanel = new JPanel(new GridLayout(2, 1));
         controlPanel.add(checkButton);
         controlPanel.add(resultLabel);
 
         add(radioButtonPanel, BorderLayout.WEST);
         add(petImageLabel, BorderLayout.CENTER);
         add(controlPanel, BorderLayout.SOUTH);
 
 
         displayRandomPetImage();
     }
 
     private void displayRandomPetImage() {
         Random random = new Random();
         int randomNumber = random.nextInt(5); // Generate a random number between 0 and 4
         String[] petTypes = {"Dog", "Cat", "Bird", "Pig", "Rabbit"};
         correctPetType = petTypes[randomNumber];
         ImageIcon petImage = new ImageIcon(getClass().getResource(correctPetType.toLowerCase() + ".jpg"));
         petImageLabel.setIcon(petImage);
     }
 
     private void checkPet() {
         if (dogRadioButton.isSelected() && "Dog".equals(correctPetType)) {
             resultLabel.setText("Correct!");
             resultLabel.setForeground(Color.BLACK);
             displayRandomPetImage();
         } else if (catRadioButton.isSelected() && "Cat".equals(correctPetType)) {
             resultLabel.setText("Correct!");
             resultLabel.setForeground(Color.BLACK);
             displayRandomPetImage();
         } else if (birdRadioButton.isSelected() && "Bird".equals(correctPetType)) {
             resultLabel.setText("Correct!");
             resultLabel.setForeground(Color.BLACK);
             displayRandomPetImage();
         } else if (pigRadioButton.isSelected() && "Pig".equals(correctPetType)) {
             resultLabel.setText("Correct!");
             resultLabel.setForeground(Color.BLACK);
             displayRandomPetImage();
         } else if (rabbitRadioButton.isSelected() && "Rabbit".equals(correctPetType)) {
             resultLabel.setText("Correct!");
             resultLabel.setForeground(Color.BLACK);
             displayRandomPetImage();
         } else {
             resultLabel.setText("Incorrect!");
             resultLabel.setForeground(Color.RED);
             displayRandomPetImage();
         }
     }
 
     @Override
     public void actionPerformed(ActionEvent e) {
         if (e.getSource() == checkButton) {
             checkPet();
         }
     }
 
     public static void main(String[] args) {
         SwingUtilities.invokeLater(() -> {
            petselect app = new petselect();
             app.setVisible(true);
         });
     }
 }
