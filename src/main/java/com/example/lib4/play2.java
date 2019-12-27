package com.example.lib4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class play2 {
    private  static JFrame frame;
    static int chk = 1;
    static int morchk = 1;
    static int ans ;
    static int userr;

    private static JLabel Label;
    private static  JLabel Labe2;
    private static JTextField t3;
    private static JTextField t1;
    private static JTextField t2;
    private static JButton Button;
    public play2(){

        frame = new JFrame("歡樂猜數字");

        frame.setSize(500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        frame.add(panel);

        placeComponents(panel);

        frame.setVisible(true);
    }
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        Label = new JLabel();
        Label.setBounds(10,10,200,50);
        panel.add(Label);
        Labe2 = new JLabel();
        Labe2.setBounds(10,100,300,50);
        panel.add(Labe2);
        t1 = new JTextField();//小的
        t1.setBounds(60,280,100,100);
        panel.add(t1);
        t2 = new JTextField();//大的
        t2.setBounds(300,280,100,100);
        panel.add(t2);
        JLabel userLabe2 = new JLabel("請輸入你要猜的數字:");
        userLabe2.setBounds(90,430,160,50);
        panel.add(userLabe2);
        t3 = new JTextField();//使用者要猜的數字
        t3.setBounds(220,400,100,100);
        panel.add(t3);
        Random r = new Random();
        ans = r.nextInt(2000) + 1;
        System.out.println(ans);
        t1.setText("0");
        t2.setText("2000");
        Label.setText("Welcome to the 2 level");
        JButton Button2 = new JButton("猜起來");
        Button2.setBounds(290, 550, 80, 80);
        panel.add(Button2);
        Button2.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {

                String   user = t3.getText();

                int userr = Integer.parseInt(user.trim());//使用者輸入的文字
                if (ans == userr) {
                    frame.setVisible(false);
                    new play3();
                } else if (ans > userr) {
                    t1.setText(user);
                    Labe2.setText(user+"比答案小");
                } else {
                    t2.setText(user);
                    Labe2.setText(user+"比答案大");
                }
            }



        });
    }

    public static void main(String[] args) {
        play2 m1 =new play2();

    }
}
