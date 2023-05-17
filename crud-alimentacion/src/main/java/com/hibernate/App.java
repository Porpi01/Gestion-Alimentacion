package com.hibernate;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class App {

	private JFrame frame;
	private JTable tableAlimentos;
	private JTextField textFieldGrasas;
	private JTextField textFieldAzúcar;
	private JTextField textFieldProteinas;
	private JTextField textFieldSal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 693, 589);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tableAlimentos = new JTable();
		tableAlimentos.setBounds(88, 150, 508, -101);
		frame.getContentPane().add(tableAlimentos);
		
		 DefaultTableModel modelTabla = new DefaultTableModel() {
		        
		        @Override
		        /**
		         * Este metodo sirve para que las celdas de la tabla no sean editables 
		         * @param filas: este parametro son las filas de la tabla
		         * @param columnas: las columnas de la tabla
		         * @return: false, asi no se pueden editar las celdas 
		         */
				public boolean isCellEditable(int filas,int columnas) {
					return false;
				}
				};
				
				modelTabla.addColumn("Alimento");
				modelTabla.addColumn("Grasas");
				modelTabla.addColumn("Grasas Saturadas");
				modelTabla.addColumn("HC");
				modelTabla.addColumn("Azúcar");
				modelTabla.addColumn("Proteinas");
				modelTabla.addColumn("Sal");
				modelTabla.addColumn("Valor calórico por 100g");
				
			
				tableAlimentos = new JTable(modelTabla);
				
				tableAlimentos.setBounds(26, 251, 489, -159);
				frame.getContentPane().add(tableAlimentos);
				
				JScrollPane scrollPaneProductos = new JScrollPane(tableAlimentos);
				scrollPaneProductos.setBounds(32, 76, 624, 183);
				frame.getContentPane().add(scrollPaneProductos);
				
				JLabel lblDatos = new JLabel("INTRODUCIR DATOS");
				lblDatos.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblDatos.setBounds(32, 290, 243, 20);
				frame.getContentPane().add(lblDatos);
				
				JLabel lblGrasas = new JLabel("Grasas");
				lblGrasas.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblGrasas.setBounds(32, 330, 46, 14);
				frame.getContentPane().add(lblGrasas);
				
				JLabel lblAzucar = new JLabel("Azucar");
				lblAzucar.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblAzucar.setBounds(32, 355, 83, 14);
				frame.getContentPane().add(lblAzucar);
				
				JLabel lblProtenas = new JLabel("Proteínas");
				lblProtenas.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblProtenas.setBounds(32, 380, 83, 14);
				frame.getContentPane().add(lblProtenas);
				
				JLabel lblSal = new JLabel("Sal");
				lblSal.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblSal.setBounds(32, 405, 46, 14);
				frame.getContentPane().add(lblSal);
				
				textFieldGrasas = new JTextField();
				textFieldGrasas.setBounds(152, 324, 209, 20);
				frame.getContentPane().add(textFieldGrasas);
				textFieldGrasas.setColumns(10);
				
				textFieldAzúcar = new JTextField();
				textFieldAzúcar.setColumns(10);
				textFieldAzúcar.setBounds(152, 349, 209, 20);
				frame.getContentPane().add(textFieldAzúcar);
				
				textFieldProteinas = new JTextField();
				textFieldProteinas.setColumns(10);
				textFieldProteinas.setBounds(152, 374, 209, 20);
				frame.getContentPane().add(textFieldProteinas);
				
				textFieldSal = new JTextField();
				textFieldSal.setColumns(10);
				textFieldSal.setBounds(152, 399, 209, 20);
				frame.getContentPane().add(textFieldSal);
				
				JButton btnNewButton = new JButton("Guardar");
				btnNewButton.setBackground(new Color(191, 225, 251));
				btnNewButton.setBounds(32, 500, 89, 23);
				frame.getContentPane().add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("Actualizar");
				btnNewButton_1.setBackground(new Color(191, 225, 251));
				btnNewButton_1.setBounds(288, 500, 113, 23);
				frame.getContentPane().add(btnNewButton_1);
				
				JButton btnNewButton_2 = new JButton("Borrar");
				btnNewButton_2.setBackground(new Color(191, 225, 251));
				btnNewButton_2.setBounds(567, 500, 89, 23);
				frame.getContentPane().add(btnNewButton_2);
				
				JLabel lblSmartDietician = new JLabel("SMART DIETICIAN");
				lblSmartDietician.setFont(new Font("Tahoma", Font.BOLD, 30));
				lblSmartDietician.setBounds(171, 35, 346, 30);
				frame.getContentPane().add(lblSmartDietician);
				
	}
}
