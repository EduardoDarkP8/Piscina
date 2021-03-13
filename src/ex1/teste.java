package ex1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class teste extends JFrame{
	
	 
		
		private JTextField tfAlt;
		private JTextField tfLag;
		private JTextField tfComp;
		private JTextField tfResult;
		private JLabel lblAlt;
		private JLabel lblComp;
		private JLabel lblLag;
		private JLabel lblResult;
		private JButton btConfirm;
		private JButton btLimp;
		private static teste frame;
		public teste()
		{
			inicializarComponetes();
			defenirEventos();
		}
		private void inicializarComponetes() 
		{
			setTitle("Piscina");
			setBounds(0,0,600,900);
			setLayout (null);
			tfAlt = new JTextField(5);
			tfLag = new JTextField(5);
			tfComp = new JTextField(5);
			tfResult = new JTextField(5);
			lblAlt = new JLabel("Altura:");
			lblLag = new JLabel("Largura:");
			lblComp = new JLabel("Comprimento:");
			lblResult = new JLabel("Resultado:");
			btConfirm =  new JButton("Caucular:");
			btLimp =  new JButton("Limpar:");
			tfAlt.setBounds(225,100,150,25);
			tfLag.setBounds(225,300,150,25);
			tfComp.setBounds(225,500,150,25);
			tfResult.setBounds(225,700,150,25);
			btConfirm.setBounds(20,800,100,25);
			btLimp.setBounds(140,800,100,25);
			lblAlt.setBounds(225,75,100,25);
			lblLag.setBounds(225,275,100,25);
			lblComp.setBounds(225,475,100,25);
			lblResult.setBounds(225,675,100,25);
			tfResult.setEnabled(false);
			add(lblAlt);
			add(lblLag);
			add(lblComp);
			add(lblResult);
			add(tfAlt);
			add(tfLag);
			add(tfComp);
			add(tfResult);
			add(btLimp);
			add(btConfirm);
			
		}
		double alt = 0, lag = 0, comp = 0, result = 0;
		
		private void defenirEventos()
		{
			btConfirm.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e) {
							try
							{
								
							
							alt = Double.parseDouble(tfAlt.getText());
							lag = Double.parseDouble(tfAlt.getText());
							comp = Double.parseDouble(tfComp.getText());
							result = (alt*lag*comp) * 300;
							tfResult.setText(""+ result);
							}
							catch(NumberFormatException erro) 
							{
								tfResult.setText("Erro de Valores");
							}
												
							
							
							
							
						}
					});
			btLimp.addActionListener (new ActionListener() 
			{
				public void actionPerformed (ActionEvent e)
				{
					tfResult.setText("");
					tfComp.setText("");
					tfAlt.setText("");
					tfLag.setText("");
				}
			});
		}
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() 
			{
				frame = new teste();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
				frame.setLocation((tela.width - frame.getSize().width)/2, (tela.height - frame.getSize().height)/2);
				frame.setVisible(true);
			}
		});

	}

}
