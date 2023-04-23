import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Frame extends JFrame implements ActionListener {
	
	private JButton borrartexto, traducir;
	private JTextArea textAreaSalida, textAreaEntrada;
	private Traductor miTraductor;
	
	public Frame(){
		super("Traductor"); // Para utilizar la clase traductor
		
		miTraductor = new Traductor();
		// PANEL
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		// ETIQUETA DE TEXTO
		JLabel etiqueta1 = new JLabel("Ingrese texto a traducir:");
		//etiqueta1.setBounds(20, 10, 100, 25);
		panel.add(etiqueta1);
		// CAJA DE TEXTO PARA TRADUCIR
		textAreaEntrada = new JTextArea(5,20);
		panel.add(new JScrollPane(textAreaEntrada));
		// CAJA DE TEXTO PARA DEVOLVER LO TRADUCIDO
		textAreaSalida = new JTextArea(5,20);
		panel.add(new JScrollPane(textAreaSalida));
		// AÑADIR BOTONES
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new BoxLayout(panelBotones,BoxLayout.X_AXIS));
		 // BOTON PARA TRADUCIR
		traducir = new JButton("Traducir");
		//traducir.setBounds(20, 10, 100, 25);
		traducir.addActionListener(this);
		panelBotones.add(traducir);
		// BOTON PARA BORRAR EL TEXTO
		borrartexto = new JButton("Borrar texto");
		//borrartexto.setBounds(20, 10, 100, 25);
		borrartexto.addActionListener(this);
		panelBotones.add(borrartexto);
       
		panel.add(panelBotones);
		//COLOR DE LA VENTANA
        panel.setBackground(new Color(255,204,153));
        
        // add panel to frame
        add(panel);
        // TAMAÑO DE LA VENTANA
        setSize(500, 600);
        setVisible(true);
        ImageIcon iconoPropio = new ImageIcon("IMAGENES/LOGO.jpg");
        setIconImage(iconoPropio.getImage());
    }
	// METODO DE LOS BOTONES 
	 public void actionPerformed(ActionEvent e) {
	      if (e.getSource()==traducir) {
	    	  textAreaSalida.setText(miTraductor.Traducir(textAreaEntrada.getText()));
	      }
	      if (e.getSource()==borrartexto) {
	        textAreaEntrada.setText("");  // BORRAR TEXTO EN LA CAJA DE ENTRADA
	        textAreaSalida.setText("");   // BORRAR TEXTO EN LA CAJA DE SALIDA
	      }
	    
	    }
	 
}