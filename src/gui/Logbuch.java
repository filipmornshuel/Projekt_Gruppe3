package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logbuch extends JFrame{
    private JPanel mainPanel;
    private JTabbedPane tabPane;
    private JScrollBar logBar;
    private JPanel stammdaten;
    private JPanel logPanel;
    private JTextField textEingebenTextField;
    private JList list1;
    private JScrollBar scrollBar1;
    private JList list2;
    private JScrollBar scrollBar2;
    private JList list3;
    private JScrollBar scrollBar3;
    private JButton button2;
    private JButton button1;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JScrollBar scrollBar4;
    private JTextPane textPane1;
    private JList list4;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JScrollBar scrollBar5;
    private JTextField trullyLeonTextField;
    private JCheckBox HRMitarbeiterCheckBox;
    private JCheckBox administratorCheckBox;
    private JList Übersicht;
    private JScrollBar scrollBar6;
    private JTextField trulliTheoTextField;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField financeTextField;
    private JList list5;
    private JScrollBar scrollBar7;
    private JTextField nameEingebenTextField;
    private JTextField trulliTheoTextField1;
    private JTextField financeTextField1;
    private JRadioButton zARadioButton;
    private JRadioButton aZRadioButton;
    private JRadioButton keineRadioButton2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JList list6;
    private JList list7;
    private JScrollBar scrollBar8;
    private JScrollBar scrollBar9;

    public Logbuch() {
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("I am looking for");
        frame.setContentPane(new Logbuch().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createUIComponents() {

    }


}
