import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;
class Calc implements ActionListener {
    JFrame frame;
    JTextField t;
    boolean check = true , used = false;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bmul, bdiv, beq, bdel, bdec, bclr;
    static double a=0, b=0, result=0;
    static int operator=0;
    int max=200;
    int min=50;
    int max2=750;
    int min2=550;
    int max1=500;
    int min1=250;
    int max3=900;
    int min3=800;






    Calc() {
        frame = new JFrame("MAGICAL CALCULATOR");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 80, 1000, 450);
        frame.setResizable(true);
        frame.setBackground(Color.yellow);
        frame.getContentPane().setBackground(new Color(214,239,237));
        Font fo = new Font("Arial", Font.BOLD, 20);
        t = new JTextField();
        t.setFont(fo);
        t.setBackground(new Color(249,249,249));
//        t.setBackground(Color.red);
        t.setBounds(40, 40, 900, 50);

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        badd = new JButton("+");
        badd.setFont(fo);
        bsub = new JButton("-");
        bsub.setFont(fo);
        bdiv = new JButton("/");
        bdiv.setFont(fo);
        bmul = new JButton("*");
        bmul.setFont(fo);
        bdec = new JButton(".");
        bdec.setFont(fo);
        beq = new JButton("=");
        beq.setFont(fo);
        bdel = new JButton("Delete");
        bclr = new JButton("Clear");

        b7.setBounds( (int)(Math.random()*(max-min+1)+min),100, 50, 40);
        b8.setBounds( (int)(Math.random()*(max1-min1+1)+min1),100, 50, 40);
        b9.setBounds( (int)(Math.random()*(max2-min2+1)+min2), 100,50, 40);
        bdiv.setBounds( (int)(Math.random()*(max3-min3+1)+min3), 100,50, 40);

        b4.setBounds((int)(Math.random()*(max-min+1)+min), 160, 50, 40);
        b5.setBounds((int)(Math.random()*(max2-min2+1)+min2), 160, 50, 40);
        b6.setBounds( (int)(Math.random()*(max1-min1+1)+min1), 160, 50, 40);
        bmul.setBounds( (int)(Math.random()*(max3-min3+1)+min3), 160, 50, 40);

        b1.setBounds((int)(Math.random()*(max3-min3+1)+min3), 210, 50, 40);
        b2.setBounds((int)(Math.random()*(max-min+1)+min), 210, 50, 40);
        b3.setBounds( (int)(Math.random()*(max1-min1+1)+min1), 210, 50, 40);
        bsub.setBounds( (int)(Math.random()*(max2-min2+1)+min2), 210, 50, 40);

        bdec.setBounds((int)(Math.random()*(max2-min2+1)+min2), 260, 50, 40);
        b0.setBounds((int)(Math.random()*(max3-min3+1)+min3), 260, 50, 40);
        beq.setBounds( (int)(Math.random()*(max-min+1)+min), 260, 50, 40);
        badd.setBounds( (int)(Math.random()*(max1-min1+1)+min1), 260, 50, 40);

        bdel.setBounds((int)(Math.random()*(max-min+1)+min), 310, 100, 40);
        bclr.setBounds( (int)(Math.random()*(max1-min1+1)+min1), 310, 100, 40);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bclr.addActionListener(this);
        bdel.addActionListener(this);

        frame.add(t);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b0);
        frame.add(badd);
        frame.add(bsub);
        frame.add(bmul);
        frame.add(bdiv);
        frame.add(bdel);
        frame.add(bclr);
        frame.add(beq);
        frame.add(bdec);
    }

    public static void main(String args[]) {

        new Calc();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bclr) {
            t.setText("");
        }
        if(e.getSource()==bdel) {
            String s = t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;++i) {
                t.setText(t.getText()+s.charAt(i));
            }
        }
        if(e.getSource()==b1) {
            if(used){
                t.setText("");
                used = false;
            }
            t.setText(t.getText().concat("1"));
        }
        if(e.getSource()==b2) {
            if(used){
                t.setText("");
                used = false;
            }
            t.setText(t.getText().concat("2"));
        }
        if(e.getSource()==b3) {
            if(used){
                t.setText("");
                used = false;
            }
            t.setText(t.getText().concat("3"));
        }
        if(e.getSource()==b4) {
            if(used){
                t.setText("");
                used = false;
            }
            t.setText(t.getText().concat("4"));
        }
        if(e.getSource()==b5) {
            if(used){
                t.setText("");
                used = false;
            }
            t.setText(t.getText().concat("5"));
        }
        if(e.getSource()==b6) {
            if(used){
                t.setText("");
                used = false;
            }
            t.setText(t.getText().concat("6"));
        }
        if(e.getSource()==b7) {
            if(used){
                t.setText("");
                used = false;
            }
            t.setText(t.getText().concat("7"));
        }
        if(e.getSource()==b8) {
            if(used){
                t.setText("");
                used = false;
            }
            t.setText(t.getText().concat("8"));
        }
        if(e.getSource()==b9) {
            if(used){
                t.setText("");
                used = false;
            }
            t.setText(t.getText().concat("9"));
        }
        if(e.getSource()==b0) {
            if(used){
                t.setText("");
                used = false;
            }
            t.setText(t.getText().concat("0"));
        }
        if(e.getSource()==bdec) {
            t.setText(t.getText().concat("."));
        }
        if(e.getSource()==badd) {
            result = Double.parseDouble(t.getText());
            used = true;
//            System.out.println("going to clear ");
//            t.setText("");
            System.out.print("before - ");
            System.out.println(a);
            if(check){
                a= result;
                operator = 1;
                check = false;

            }else{
                switch(operator) {
                    case 1: a=a+result;
                        break;
                    case 2: a=a-result;
                        break;
                    case 3: a=a*result;
                        break;
                    case 4: a=a/result;
                        break;
                }
                operator=1;
            }
            System.out.print("after - ");
            System.out.println(a);
            t.setText(""+a);

        }
        if(e.getSource()==bsub) {

            result = Double.parseDouble(t.getText());
            used = true;
//            System.out.println("going to clear ");
//            t.setText("");
            System.out.print("before - ");
            System.out.println(a);
            if(check){
                a= result;
                operator = 2;
                check = false;

            }else{
                switch(operator) {
                    case 1: a=a+result;
                        break;
                    case 2: a=a-result;
                        break;
                    case 3: a=a*result;
                        break;
                    case 4: a=a/result;
                        break;
                }
                operator=2;
            }
            System.out.print("after - ");
            System.out.println(a);
            t.setText(""+a);
        }
        if(e.getSource()==bmul) {
            result = Double.parseDouble(t.getText());
            used = true;
//            System.out.println("going to clear ");
//            t.setText("");
            System.out.print("before - ");
            System.out.println(a);
            if(check){
                a= result;
                operator = 3;
                check = false;

            }else{
                switch(operator) {
                    case 1: a=a+result;
                        break;
                    case 2: a=a-result;
                        break;
                    case 3: a=a*result;
                        break;
                    case 4: a=a/result;
                        break;
                }
                operator=3;
            }
            System.out.print("after - ");
            System.out.println(a);
            t.setText(""+a);
        }
        if(e.getSource()==bdiv) {
            result = Double.parseDouble(t.getText());
            used = true;
//            System.out.println("going to clear ");
//            t.setText("");
            System.out.print("before - ");
            System.out.println(a);
            if(check){
                a= result;
                operator = 4;
                check = false;

            }else{
                switch(operator) {
                    case 1: a=a+result;
                        break;
                    case 2: a=a-result;
                        break;
                    case 3: a=a*result;
                        break;
                    case 4: a=a/result;
                        break;
                }
                operator=4;
            }
            System.out.print("after - ");
            System.out.println(a);
            t.setText(""+a);
        }
        if(e.getSource()==beq) {
            used = true;
            b = Double.parseDouble(t.getText());
            switch(operator) {
                case 1: result=a+b;
                    break;
                case 2: result=a-b;
                    break;
                case 3: result=a*b;
                    break;
                case 4: result=a/b;
                    break;
            }
            check = true;
            a=0;
            t.setText(""+result);
        }
        if(e.getSource()==bclr){
            check = true;
            a=0;
            t.setText("");

        }

    }

}
