import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Add3 extends JFrame{
        private JTextField txtNumber1 = new JTextField(10);
        private JLabel lblFuHao = new JLabel("+");
        private JTextField txtNumber2 = new JTextField(10);
        private JButton btnEqual = new JButton("=");
        private JTextField txtSum = new JTextField(10);

        public Add3() {
            setTitle("两个数相加的程序");
            initialize();//单独编写一个initialize方法，免得构造方法里代码太长
        }
    private void initialize() {
        setLayout(new FlowLayout());
        add(txtNumber1);
        add(lblFuHao);
        add(txtNumber2);
        add(btnEqual);
        add(txtSum);
        btnEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txtNumber1.getText().trim().equals("") || txtNumber2.getText().trim().equals("")) {
                    JOptionPane.showMessageDialog(Add3.this, "加数和被加数都不能为空","提示信息",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                double a, b, sum;
                try {
                    a = Double.valueOf(txtNumber1.getText());
                    b = Double.valueOf(txtNumber2.getText());
                    sum = a + b;
                    txtSum.setText(String.valueOf(sum));
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(Add3.this, "加数和被加数都必须是数字", "提示信息",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
        }) ;
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);}

    public static void main(String[] args) {
        Add3 add=new Add3();
        add.setSize(500,100);
        add.setVisible(true);
        add.setLocationRelativeTo(null);
    }
    }

