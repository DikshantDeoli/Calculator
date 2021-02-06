
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;


public class calculator {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextArea textArea = new JTextArea(2, 10);

    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button0 = new JButton("0");

    JButton buttonadd = new JButton("+");
    JButton buttonsub = new JButton("-");
    JButton buttonmul = new JButton("*");
    JButton buttondiv = new JButton("/");
    JButton buttonclear = new JButton("C");
    JButton buttondot = new JButton(".");
    JButton buttonequal = new JButton("=");

    Double number1, number2, result;

    int a = 0, m = 0, d = 0, s = 0;

    public calculator() {
        frame.setSize(340, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Calculator");
        frame.setResizable(false);
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);
        
        panel.add(textArea);
        textArea.setBackground(Color.BLACK);
        Border tboder = BorderFactory.createLineBorder(Color.BLUE, 3);

        textArea.setBorder(tboder);
        Font font = new Font("arial", Font.BOLD, 33);

        textArea.setFont(font);

        textArea.setForeground(Color.WHITE);
        textArea.setPreferredSize(new Dimension(2, 12));
        textArea.setLineWrap(true);

     
     
       
     

     
     
        button1.setPreferredSize(new Dimension(100, 40));
/*         button1.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\button1.png")); */

        button2.setPreferredSize(new Dimension(100, 40));/* 
        button2.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\botton\\button2.png")); */

        button3.setPreferredSize(new Dimension(100, 40));/* 
        button3.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\botton\\button3.png")); */

        button4.setPreferredSize(new Dimension(100, 40));/* 
        button4.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\botton\\button4.png")); */

        button5.setPreferredSize(new Dimension(100, 40));/* 
        button5.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\botton\\button5.png")); */

        button6.setPreferredSize(new Dimension(100, 40));/* 
        button6.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\botton\\button6.png")); */

        button7.setPreferredSize(new Dimension(100, 40));/* 
        button7.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\botton\\button7.png")); */

        button8.setPreferredSize(new Dimension(100, 40));/* 
        button8.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\botton\\button8.png")); */

        button9.setPreferredSize(new Dimension(100, 40));/* 
        button9.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\botton\\button9.png")); */

        button0.setPreferredSize(new Dimension(100, 40));/* 
        button0.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\botton\\button0.png")); */

        buttondot.setPreferredSize(new Dimension(100, 40));/* 
        buttondot.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\botton\\buttondot.png")); */

        buttonadd.setPreferredSize(new Dimension(100, 40));/* 
        buttonadd.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\botton\\buttonadd.png")); */

        buttonsub.setPreferredSize(new Dimension(100, 40));/* 
        buttonsub.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\botton\\buttonsub.png")); */

        buttonmul.setPreferredSize(new Dimension(100, 40));/* 
        buttonmul.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\botton\\buttonmul.png")); */

        buttondiv.setPreferredSize(new Dimension(100, 40));/* 
        buttondiv.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\botton\\buttondiv.png")); */

        buttonequal.setPreferredSize(new Dimension(100, 40));/* 
        buttonequal.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\botton\\buttonequal.png")); */

        buttonclear.setPreferredSize(new Dimension(100, 40));/* 
        buttonclear.setIcon(new ImageIcon("C:\\Users\\diksh\\Desktop\\Calculator\\botton\\buttonclear.png"));
 */
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        panel.add(buttondot);
        panel.add(buttonsub);
        panel.add(buttonmul);
        panel.add(buttondiv);
        panel.add(buttonadd);
        panel.add(buttonequal);
        panel.add(buttonclear);


        button1.addActionListener(this::actionPerformed);
        button2.addActionListener(this::actionPerformed);
        button3.addActionListener(this::actionPerformed);
        button4.addActionListener(this::actionPerformed);
        button5.addActionListener(this::actionPerformed);
        button6.addActionListener(this::actionPerformed);
        button7.addActionListener(this::actionPerformed);
        button8.addActionListener(this::actionPerformed);
        button9.addActionListener(this::actionPerformed);
        button0.addActionListener(this::actionPerformed);
        buttondot.addActionListener(this::actionPerformed);
        buttonsub.addActionListener(this::actionPerformed);
        buttonmul.addActionListener(this::actionPerformed);
        buttondiv.addActionListener(this::actionPerformed);
        buttonadd.addActionListener(this::actionPerformed);
        buttonequal.addActionListener(this::actionPerformed);
        buttonclear.addActionListener(this::actionPerformed);
       

    }

    public void actionPerformed(ActionEvent e) {
        Object source =  e.getSource();
        double addc=0,subc=0,divc=0,mulc=0;
        if (source == buttonclear) {
            number1 = 0.0;
            number2 = 0.0;
            textArea.setText("");
        }
        if(source == button1){
            textArea.setText("1");
        }
        if(source == button2){
            textArea.setText("2");
        }
        if(source == button3){
            textArea.setText("3");
        }
        if(source == button4){
            textArea.setText("5");
        }
        if(source == button5){
            textArea.setText("5");
        }
        if(source == button6){
            textArea.setText("6");
        }
        if(source == button7){
            textArea.setText("7");
        }
        if(source == button8){
            textArea.setText("8");
        }
        if(source == button9){
            textArea.setText("9");
        }
        if(source == button0){
            textArea.setText("0");
        }
        if(source == buttondot){
            textArea.setText(".");
        }
        if(source == buttonadd){
            number1 = number_reader();
            textArea.setText("+");
            addc=1;
            divc=0;
            subc=0;
            mulc=0;

        }
        if(source == buttondiv){
            number1 = number_reader();
            textArea.setText("/");
            addc=0;
            divc=1;
            subc=0;
            mulc=0;

        }
        if(source == buttonsub){
            number1 = number_reader();
            textArea.setText("-");
            addc=0;
            divc=0;
            subc=1;
            mulc=0;

        }
        if(source == buttonmul){
            number1 = number_reader();
            textArea.setText("*");
            addc=0;
            divc=0;
            subc=0;
            mulc=1;

        }
        if(source == buttonequal){
            number2 = number_reader();
            if (addc>0) {
                result =number1+number2;
                textArea.setText(Double.toString(result));
            }
            if (subc>0) {
                result = number1 -number2;
                textArea.setText(Double.toString(result));
            }
            if (mulc>0) {
                result = number1 *number2;
                textArea.setText(Double.toString(result));
            }
            if (divc>0) {
                result = number1 /number2;
                textArea.setText(Double.toString(result));
            }
        }
    }

    public double number_reader() {


        double num1;
        String s;
        s= textArea.getText();
        num1=Double.valueOf(s);
        return num1;
    }
    public static void main(String[] args) {
        calculator c = new calculator();
        
    }
}