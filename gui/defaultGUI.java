import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.ButtonGroup;
import javax.swing.SwingUtilities;

/**
 Program has text, 2 radio buttons, a check box, and lines. hits the sprint 0 requirements
 */
public class defaultGUI extends JFrame {

  /*GUI Frame */
  public defaultGUI() {
   // Temporary title for now
    setTitle("Solitaire Example GUI");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 300);
    setLayout(new FlowLayout());

    // Text requirement, reiterating title
    add(new JLabel("Solitaire Example GUI"));

    // Radio buttons 1 and 2 (Will be repurposed into gamemode or difficulty)
    JRadioButton button1 = new JRadioButton("Button 1");
    JRadioButton button2 =new JRadioButton("Button 2 ");
    ButtonGroup group = new ButtonGroup();
    group.add(button1);
    group.add(button2);
    add(button1);
    add(button2);

    //CheckBox, unsure what to use here so set as increase difficulty, although radio buttons might do that later
    add(new JCheckBox("Increase Difficulty?"));

    //Lines 
    JPanel linePanel = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // 3 lines each above each other
        g.drawLine(10, 10, 50, 10);
        g.drawLine(10, 20, 50, 20);
        g.drawLine(10, 30, 50, 30);
      }
    };
    linePanel.setPreferredSize(new Dimension(100, 80));
    add(linePanel);
  }

  /* Start */
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      new defaultGUI().setVisible(true);
    });
  }
}
