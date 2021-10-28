import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Add1 {
    /**
 *编写加法程序
 * 单独编写类实现ActionListener接口，作为监听器
 **/
 private JTextField txtNumber1=new JTextField(10);
 private JLabel lblFuHao=new JLabel("+");
 private JTextField txtNumber2=new JTextField(10);
 private JButton btnEqual=new JButton("=");
 private JTextField txtSum =new JTextField(10);
 public Add1(){
 setTitle("两个数相加的程序");
 initialize();//单独编写一个initialize方法，免得构造方法里代码太长
 }
 private void initialize(){
     setLayout(new FlowLayout());
     add(txtNumber1);
     add(lblFuHao);
     add(txtNumber2);
     add(btnEqual);
     add(txtSum);
     processEvent pe=new ProcessEvent();
     btnEqual.addActionListener(pe);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);

 }

    public static void main(String[] args) {
        Add1 add=new Add1();
        add.setSize(500,100);
        add.setVisible(true);
        add.setLocationRelativeTo(null);
    }
class ProcessEvent implements ActionListener{
     public void actionPerformed(ActionEvent e){
         if(e.getSource()==btnEqual){
             if(txtNumber1.getText().trim().equals("")||txtNumber2.getText().trim().equals("")){
                 JOptionPane.showMessageDialog(Add1.this,"加数和被加数都不能为空","提示信息",JOptionPane.INFORMATION_MESSAGE);
                 return;
             }
             double a,b,sum;
             try{
                 a=Double.valueOf(txtNumber1.getText());
                 b=Double.valueOf(txtNumber2.getText());
                 sum=a+b;
                 txtSum.setText(String.valueOf(sum));
             }catch (Exception ee){
                 JOptionPane.showMessageDialog(Add1.this,"加数和被加数都必须是数字","提示信息",JOptionPane.INFORMATION_MESSAGE);
                 return;
             }
         }
     }
}
 }