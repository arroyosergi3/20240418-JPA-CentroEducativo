package principal.views;

import javax.swing.JPanel;

import principal.controllers.ControladorSexo;
import principal.entities.Estudiante;
import principal.entities.Sexo;

import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Iterator;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class PanelEStudiante extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jtfNombre;
	private JTextField jtfApellido1;
	private JTextField jtfApellido2;
	private JTextField jtdDni;
	private JTextField jtfDireccion;
	private JTextField jtfEmail;
	private JTextField jtfTelefono;
	private JTextField jtfColorFavorito;
	JComboBox <Sexo> jcbSexo ;
	byte[] imagen;
	private int anchoImagen, altoImagen;
	

	/**
	 * Create the panel.
	 */
	public PanelEStudiante(Estudiante e) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		add(lblNombre, gbc_lblNombre);
		
		jtfNombre = new JTextField(e.getNombre());
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 0;
		add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido 1:");
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.anchor = GridBagConstraints.EAST;
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 0;
		gbc_lblApellido.gridy = 1;
		add(lblApellido, gbc_lblApellido);
		
		jtfApellido1 = new JTextField(e.getApellido_1());
		GridBagConstraints gbc_jtfApellido1 = new GridBagConstraints();
		gbc_jtfApellido1.insets = new Insets(0, 0, 5, 0);
		gbc_jtfApellido1.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellido1.gridx = 1;
		gbc_jtfApellido1.gridy = 1;
		add(jtfApellido1, gbc_jtfApellido1);
		jtfApellido1.setColumns(10);
		
		JLabel lblApellido_1 = new JLabel("Apellido 2:");
		GridBagConstraints gbc_lblApellido_1 = new GridBagConstraints();
		gbc_lblApellido_1.anchor = GridBagConstraints.EAST;
		gbc_lblApellido_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido_1.gridx = 0;
		gbc_lblApellido_1.gridy = 2;
		add(lblApellido_1, gbc_lblApellido_1);
		
		jtfApellido2 = new JTextField(e.getApellido_2());
		GridBagConstraints gbc_jtfApellido2 = new GridBagConstraints();
		gbc_jtfApellido2.insets = new Insets(0, 0, 5, 0);
		gbc_jtfApellido2.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellido2.gridx = 1;
		gbc_jtfApellido2.gridy = 2;
		add(jtfApellido2, gbc_jtfApellido2);
		jtfApellido2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DNI:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 3;
		add(lblNewLabel, gbc_lblNewLabel);
		
		jtdDni = new JTextField(e.getDni());
		GridBagConstraints gbc_jtdDni = new GridBagConstraints();
		gbc_jtdDni.insets = new Insets(0, 0, 5, 0);
		gbc_jtdDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtdDni.gridx = 1;
		gbc_jtdDni.gridy = 3;
		add(jtdDni, gbc_jtdDni);
		jtdDni.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.EAST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 0;
		gbc_lblDireccion.gridy = 4;
		add(lblDireccion, gbc_lblDireccion);
		
		jtfDireccion = new JTextField(e.getDireccion());
		GridBagConstraints gbc_jtfDireccion = new GridBagConstraints();
		gbc_jtfDireccion.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDireccion.gridx = 1;
		gbc_jtfDireccion.gridy = 4;
		add(jtfDireccion, gbc_jtfDireccion);
		jtfDireccion.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 5;
		add(lblEmail, gbc_lblEmail);
		
		jtfEmail = new JTextField(e.getMail());
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 1;
		gbc_jtfEmail.gridy = 5;
		add(jtfEmail, gbc_jtfEmail);
		jtfEmail.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.EAST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 0;
		gbc_lblTelefono.gridy = 6;
		add(lblTelefono, gbc_lblTelefono);
		
		jtfTelefono = new JTextField(e.getTelefono());
		GridBagConstraints gbc_jtfTelefono = new GridBagConstraints();
		gbc_jtfTelefono.insets = new Insets(0, 0, 5, 0);
		gbc_jtfTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfTelefono.gridx = 1;
		gbc_jtfTelefono.gridy = 6;
		add(jtfTelefono, gbc_jtfTelefono);
		jtfTelefono.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.anchor = GridBagConstraints.EAST;
		gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSexo.gridx = 0;
		gbc_lblSexo.gridy = 7;
		add(lblSexo, gbc_lblSexo);
		
		 jcbSexo = new JComboBox<Sexo>();
		GridBagConstraints gbc_jcbSexo = new GridBagConstraints();
		gbc_jcbSexo.insets = new Insets(0, 0, 5, 0);
		gbc_jcbSexo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbSexo.gridx = 1;
		gbc_jcbSexo.gridy = 7;
		add(jcbSexo, gbc_jcbSexo);
		
		JLabel lblNewLabel_1 = new JLabel("Color Favorito:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 8;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfColorFavorito = new JTextField(e.getColorFavorito());
		GridBagConstraints gbc_jtfColorFavorito = new GridBagConstraints();
		gbc_jtfColorFavorito.insets = new Insets(0, 0, 5, 0);
		gbc_jtfColorFavorito.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfColorFavorito.gridx = 1;
		gbc_jtfColorFavorito.gridy = 8;
		add(jtfColorFavorito, gbc_jtfColorFavorito);
		jtfColorFavorito.setColumns(10);
		cargarTodosSexos();
		seleccionarSexo(e.getIdSexo());
		
		
		Color color = Color.decode(e.getColorFavorito());
		this.setBackground(color);
		
		JLabel lblImagen = new JLabel("Imagen:");
		GridBagConstraints gbc_lblImagen = new GridBagConstraints();
		gbc_lblImagen.insets = new Insets(0, 0, 0, 5);
		gbc_lblImagen.gridx = 0;
		gbc_lblImagen.gridy = 9;
		add(lblImagen, gbc_lblImagen);
		
	
		
		
		
		

	}
	public void setImagen(byte[] img) {

        if (img != null && img.length > 0) {

            this.imagen = img;

            ImageIcon icono = new ImageIcon(this.imagen);

            this.anchoImagen = icono.getIconWidth();

            this.altoImagen = icono.getIconHeight();

        } else {

            this.imagen = null;

            JLabel lblicono = new JLabel("Sin Icono");

            this.scrollPane.setViewportView(lblicono);

            this.anchoImagen = 0;

            this.altoImagen = 0;
        }

        mostrarImagen();

    }
	
	private void mostrarImagen() {
        if (imagen != null && imagen.length > 0) {
            ImageIcon icono = new ImageIcon(imagen);
            JLabel lblIcono = new JLabel(icono);
            this.scrollPane.setViewportView(lblIcono);
        } else {
            JLabel lblIcono = new JLabel("Sin imagen");
            scrollPane.setViewportView(lblIcono);
        }

    }
	
	
	private void cargarTodosSexos() {
		List<Sexo> l = (List<Sexo>) new ControladorSexo().getInstance().findAll();
		for (Sexo o : l) {
			this.jcbSexo.addItem(o);
		}

	}
	
	
	
	
	
	public void seleccionarSexo(int idSexo) {
		for (int i = 0; i < this.jcbSexo.getItemCount(); i++) {
			if (this.jcbSexo.getItemAt(i).getId() == idSexo) {
				this.jcbSexo.setSelectedIndex(i);
			}
		}
	}
	
	
	
	

}
