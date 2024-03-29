import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App implements ActionListener {

	// Main application
	public static void main(String[] args) {
		App main = new App();
	}

	// Elementos del formulario
	JFrame frame, frame2;
	JPanel panel1, panel2, panel3,panel4;
	JLabel nom, ape, mail, cel, dir, gen, img, nombre, apellido, email, celular, direccion;
	JTextField tfNom, tfApe, tfMail, tfCel, tfDir;
	JButton btnImg, btnCon, btnRec, btnIr, btnSave, btnDel, btnMod, btnLim, btnSalir;
	JComboBox<String> select;
	JTable tabla;
	JScrollPane scroll;

	private void frame() {
		frame = new JFrame();
		frame.setLayout(null);
		frame.setTitle("Formulario de contacto");
		frame.setSize(550, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.add(panel1);
	}
	void frame2() {
		frame = new JFrame();
		frame.setLayout(null);
		frame.setTitle("Formulario de contacto");
		frame.setSize(250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(frame);
		frame.setVisible(true);
		frame.add(panel3);
		
	}
	void titulos() {
		// Etiquetas
		nom = new JLabel("Nombre del contacto");
		nom.setBounds(20, 25, 160, 40);
		nom.setFont(new Font("arial", Font.BOLD, 12));
		ape = new JLabel("Apellido del contacto");
		ape.setBounds(20, 70, 160, 40);
		ape.setFont(new Font("arial", Font.BOLD, 12));
		mail = new JLabel("Emails");
		mail.setBounds(20, 115, 180, 40);
		mail.setFont(new Font("arial", Font.BOLD, 12));
		cel = new JLabel("Celular");
		cel.setBounds(180, 115, 220, 40);
		cel.setFont(new Font("arial", Font.BOLD, 12));
		dir = new JLabel("Direccion");
		dir.setBounds(20, 160, 220, 40);
		dir.setFont(new Font("arial", Font.BOLD, 12));
		gen = new JLabel("Sexo");
		gen.setBounds(315, 160, 220, 40);
		gen.setFont(new Font("arial", Font.BOLD, 12));
		img = new JLabel("Imagen");
		img.setBounds(315, 40, 200, 102);
		img.setHorizontalAlignment(SwingConstants.CENTER);
		img.setBorder(BorderFactory.createLineBorder(Color.gray));

		nombre = new JLabel("");
		nombre.setBounds(20, 25, 160, 40);
		nombre.setFont(new Font("arial", Font.BOLD, 12));
		apellido = new JLabel("");
		apellido.setBounds(20, 45, 160, 40);
		apellido.setFont(new Font("arial", Font.BOLD, 12));
		email = new JLabel("");
		email.setBounds(20, 65, 180, 40);
		email.setFont(new Font("arial", Font.BOLD, 12));
		celular = new JLabel("");
		celular.setBounds(20, 85, 220, 40);
		celular.setFont(new Font("arial", Font.BOLD, 12));
		direccion = new JLabel("");
		direccion.setBounds(20, 105, 220, 40);
		direccion.setFont(new Font("arial", Font.BOLD, 12));

	}

	void campos() {
		// Campos
		tfNom = new JTextField();
		tfNom.setBounds(20, 60, 252, 20);
		tfApe = new JTextField();
		tfApe.setBounds(20, 100, 252, 20);
		tfMail = new JTextField();
		tfMail.setBounds(20, 145, 150, 20);
		tfCel = new JTextField();
		tfCel.setBounds(180, 145, 90, 20);
		tfDir = new JTextField();
		tfDir.setBounds(20, 190, 252, 20);
	}

	void botones() {
		// Botones
		btnImg = new JButton("Cargar imagen");
		btnImg.setBounds(315, 145, 200, 23);
		btnCon = new JButton("Probar conexion");
		btnCon.setBounds(20, 230, 250, 20);
		btnRec = new JButton("Reconectar");
		btnRec.setBounds(315, 230, 200, 20);
		btnIr = new JButton("Ir");
		btnIr.setBounds(20, 440, 45, 40);
		btnSave = new JButton("Guardar");
		btnSave.setBounds(60, 440, 85, 40);
		btnDel = new JButton("Eliminar");
		btnDel.setBounds(140, 440, 85, 40);
		btnMod = new JButton("Modificar");
		btnMod.setBounds(220, 440, 100, 40);
		btnLim = new JButton("Limpiar");
		btnLim.setBounds(320, 440, 95, 40);
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(410, 440, 60, 40);
		// ComboBox
		select = new JComboBox<>();
		select.addItem("Seleccionar");
		select.addItem("Femenino");
		select.addItem("Masculino");
		select.setBounds(315, 190, 200, 23);
		select.setBackground(Color.white);
	}

	void actions() {
		btnSave.addActionListener(this);
	}

	void tabla() {
		// tabla
		String[] columnas = new String[] { "Nombres", "Apellidos", "Email", "Telefono", "Direccion", "Sexo" };
		String[][] filas = new String[][] {};
		tabla = new JTable(filas, columnas);
		tabla.setBounds(30, 40, 200, 300);
		scroll = new JScrollPane(tabla);
		scroll.setBounds(0, 0, 485, 170);
	}

	void paneles() {
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel1.setLayout(null);
		panel2.setLayout(null);
		panel3.setLayout(null);
		panel4.setLayout(null);
		panel1.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.gray), "Datos Personales", 1, 2));
		panel1.setBounds(5, 5, 523, 500);
		panel2.setBounds(20, 260, 484, 170);
		panel3.setBounds(5, 5, 223, 200);
		panel4.setBounds(20, 260, 184, 70);
		panel3.add(panel4);
		panel3.add(nombre);
		panel3.add(apellido);
		panel3.add(email);
		panel3.add(celular);
		panel3.add(direccion);
		panel1.add(panel2);
		panel1.add(nom);
		panel1.add(ape);
		panel1.add(mail);
		panel1.add(cel);
		panel1.add(dir);
		panel1.add(gen);
		panel1.add(img);
		panel1.add(tfNom);
		panel1.add(tfApe);
		panel1.add(tfMail);
		panel1.add(tfCel);
		panel1.add(tfDir);
		panel1.add(btnImg);
		panel1.add(btnCon);
		panel1.add(btnRec);
		panel1.add(btnIr);
		panel1.add(btnSave);
		panel1.add(btnDel);
		panel1.add(btnMod);
		panel1.add(btnLim);
		panel1.add(btnSalir);
		panel1.add(select);
		panel2.add(scroll);
	}

	public App() {
		titulos();
		campos();
		botones();
		tabla();
		paneles();
		frame();
		actions();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Is Working!!");
		nombre.setText("El nombre es: "+tfNom.getText());
		apellido.setText("El apellido es: "+tfApe.getText());
		email.setText("El email es: "+tfMail.getText());
		celular.setText("El celular es: "+tfCel.getText());
		direccion.setText("La direccion es: "+tfDir.getText());
		frame2();

	}
}
