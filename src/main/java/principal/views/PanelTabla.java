package principal.views;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JTable;

import principal.controllers.ControladorEstudiantes;
import principal.controllers.SuperControlador;
import principal.entities.Estudiante;


public class PanelTabla extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tableAlumnos;

	/**
	 * Create the panel.
	 */
	public PanelTabla() {
		setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		add(splitPane, BorderLayout.CENTER);
		
		tableAlumnos = new JTable();
		splitPane.setLeftComponent(tableAlumnos);

	}
	
	
	
	public static Object[][] getDatosDeTabla() {
		// Obtengo todas las personas
		List<Estudiante> estudiantes = 
		// Preparo una estructura para pasar al constructor de la JTable
		Object[][] datos = new Object[estudiantes.size()][8];
		// Cargo los datos de la lista de personas en la matriz de los datos
		for (int i = 0; i < personas.size(); i++) {
			Persona persona = personas.get(i);
			datos[i][0] = persona.getId();
			datos[i][1] = persona.getNombre();
			datos[i][2] = persona.getPrimerApellido();
			datos[i][3] = persona.getSegundoApellido();
			datos[i][4] = persona.getFechaNacimiento();
			datos[i][5] = persona.getEdad();
			datos[i][6] = persona.getActivo();
			datos[i][7] = persona.getProvincia();
		}
		
		return datos;
	}

}
