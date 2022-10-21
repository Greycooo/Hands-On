import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame
{
public static void main(String [] args)
{
new SimpleCalculator().show();
}




JLabel ol1 = new JLabel();
JLabel opl = new JLabel();
JLabel ol2 = new JLabel();
JLabel rel = new JLabel();

JTextField ot1= new JTextField();
JTextField opt= new JTextField();
JTextField ot2= new JTextField();
JTextField ret= new JTextField();



JButton calc = new JButton();
JButton exit = new JButton();


public SimpleCalculator()
{
setTitle("Simple Calculator");

getContentPane().setLayout(new GridBagLayout());
GridBagConstraints gc = new GridBagConstraints();

ol1.setText("Operand 1:");
gc.gridx = 0;
gc.gridy = 0;
getContentPane().add(ol1, gc);

opl.setText("Operator:");
gc.gridx = 0;
gc.gridy = 1;
getContentPane().add(opl, gc);

ol2.setText("Operand 2:");
gc.gridx = 0;
gc.gridy = 2;
getContentPane().add(ol2, gc);

rel.setText("Result");
gc.gridx = 0;
gc.gridy = 3;
getContentPane().add(rel, gc);


calc.setText("Calculate");
gc.gridx = 0;
gc.gridy = 4;
getContentPane().add(calc, gc);

calc.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
calcActionPerformed(e);
}
});


exit.setText("Exit");
gc.gridx = 2;
gc.gridy = 4;
getContentPane().add(exit, gc);

exit.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
exitActionPerformed(e);
}
});



ot1.setColumns(10);
gc.gridx = 1;
gc.gridy = 0;
getContentPane().add(ot1, gc);

opt.setColumns(10);
gc.gridx = 1;
gc.gridy = 1;
getContentPane().add(opt, gc);

ot2.setColumns(10);
gc.gridx = 1;
gc.gridy = 2;
getContentPane().add(ot2, gc);

ret.setColumns(10);
gc.gridx = 1;
gc.gridy = 3;
getContentPane().add(ret, gc);

pack();
}
private void calcActionPerformed(ActionEvent e)
{

}
private void exitActionPerformed(ActionEvent e)
{
JFrame f;
f = new JFrame();
JOptionPane.showMessageDialog(f, "Exit");
}

}