package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_01.Docente;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_1_1 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_1_1 frame = new Problema_1_1();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_1_1() {
		setTitle("Problema_1_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 403);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		//Declare y cree un objeto de tipo Docente.
		Docente d=new Docente();
		//Ingrese datos fijos.
		d.codigo=1;
		d.horas=5;
		d.nombre="Juan";
		d.tarifa=10.50;
		double sb, des, sn;
		sb=d.sueldobru();
		des=d.descuento(sb);
		sn=d.sueldoneto(sb, des);
		//Visualice todos sus datos.
		imprimir("  BOLETA DE PAGO");
		imprimir("Código  : "+"\t" +d.codigo);
		imprimir("Nombre  : "+"\t" +d.nombre);
		imprimir("Horas  : "+"\t" +d.horas);
		imprimir("Tarifa  : "+"\t" +d.tarifa);
		imprimir("Sueldo básico  : "+"\t" +sb);
		imprimir("Descuento: "+"\t" +des);
		imprimir("Sueldo neto  : "+"\t" +sn);
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
}