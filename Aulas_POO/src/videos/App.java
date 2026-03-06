package videos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JColorChooser;


public class App {
	public static void main(String[] args) throws Exception {
		//ADICONAR OS CAMPOS
		JFrame janela = new JFrame();
		JLabel labelUsuario = new JLabel ("Usuario: ");
		JTextField campoUsuario = new JTextField();
		JButton botaoLogar = new JButton ("Clique aqui!");
		JPasswordField campoSenha = new JPasswordField ();
		
		janela.getContentPane().setBackground(Color.blue);
		janela.setLayout(null);
		janela.add(botaoLogar);
		janela.add(labelUsuario);
		janela.add(campoUsuario);
		janela.add(campoSenha);
		
		// DEFINIR O TAMANHO DA JANELA 
		janela.setBounds(960, 540, 400 , 500);
		//COMPONENTES CENTRALIZADOS
		labelUsuario.setBounds(125,170,150,30);
		campoUsuario.setBounds(125,210,150,30);
		botaoLogar.setBounds(125, 310, 150, 30);
		campoSenha.setBounds(125,260,150,30);
		
		//ADICIONAR EVERTO NO BOTAO 
		botaoLogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String usuario = campoUsuario.getText();
				String senha = new String(campoSenha.getPassword());
				System.out.printf("Usuario: %s\nSenha: %s ", usuario , senha );
			}
		});

		//iSTO FAZ COM QUE FECHE A APLICAÇAO QUANDO FECHAR A JANELA
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
}
