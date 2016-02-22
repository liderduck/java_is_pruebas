package proyecto_Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class dondestoy implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFrame aviso = new JFrame();
		JOptionPane.showMessageDialog(aviso, e.getActionCommand(), "Aviso",JOptionPane.INFORMATION_MESSAGE);

	}

}
