package principal.views;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.ResourceBundle.Control;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import principal.controllers.ControladorEstudiantes;
import principal.controllers.DatosDeTabla;
import principal.controllers.SuperControlador;
import principal.entities.Estudiante;


public class PanelTabla extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tableAlumnos;
	private DefaultTableModel dtm = null;
	private Object datosEnTabla[][] = DatosDeTabla.getDatosDeTabla();
	private String titulosEnTabla[] = DatosDeTabla.getTitulosColumnas();
	
	/**
	 * Create the panel.
	 */
	public PanelTabla() {
		setLayout(new BorderLayout(0, 0));
		
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		add(splitPane, BorderLayout.CENTER);
		this.dtm = getDefaultTableModelNoEditable();
		tableAlumnos = new JTable(dtm);
		JScrollPane scrollPane = new JScrollPane(tableAlumnos);
		
		tableAlumnos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				int indiceFilaSel = tableAlumnos.getSelectedRow();
				int idEstudiante = (int) datosEnTabla[1][indiceFilaSel];
				Estudiante estudianteSeleccionado = ControladorEstudiantes.getInstance().obtenerEstudiantePorId(idEstudiante);
				
				
				
			}
		});
		splitPane.setLeftComponent(tableAlumnos);
	}
	
	private DefaultTableModel getDefaultTableModelNoEditable () {
		DefaultTableModel dtm = new DefaultTableModel(datosEnTabla, titulosEnTabla) {
			
			/**
			 * La sobreescritura de este método nos permite controlar qué celdas queremos que sean editables
			 */
			@Override
			public boolean isCellEditable(int row, int column) {
				if (column != 1) {
					return false;
				}
				return true;
			}
		};
		return dtm;
	}
	
	
}
