package com.mycompany.tiposdetriangulo;

import javax.swing.*;
import java.awt.*;

public class TiposDeTriangulo extends JFrame {

    JPanel painel;

    JLabel lblTitulo;
    JLabel lblLado1;
    JLabel lblLado2;
    JLabel lblLado3;
    JLabel lblResultado;
    JLabel lblTipo;

    JTextField txtLado1;
    JTextField txtLado2;
    JTextField txtLado3;

    JButton btnVerificar;

    public TiposDeTriangulo() {
        setTitle("Tipos de Triângulos");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        painel = new JPanel();
        painel.setLayout(null);
        painel.setBackground(new Color(50, 23, 77));
        add(painel);

        // Título
        lblTitulo = new JLabel("Tipos de Triângulos");
        lblTitulo.setFont(new Font("Consolas", Font.BOLD, 24));
        lblTitulo.setForeground(new Color(250, 230, 250));
        lblTitulo.setBounds(170, 20, 300, 40);
        painel.add(lblTitulo);

        // Lado 1
        lblLado1 = new JLabel("Lado 1:");
        lblLado1.setFont(new Font("Consolas", Font.BOLD, 18));
        lblLado1.setForeground(new Color(250, 230, 250));
        lblLado1.setBounds(20, 80, 100, 30);
        painel.add(lblLado1);

        txtLado1 = new JTextField();
        txtLado1.setBounds(100, 80, 120, 30);
        painel.add(txtLado1);

        // Lado 2
        lblLado2 = new JLabel("Lado 2:");
        lblLado2.setFont(new Font("Consolas", Font.BOLD, 18));
        lblLado2.setForeground(new Color(250, 230, 250));
        lblLado2.setBounds(20, 140, 100, 30);
        painel.add(lblLado2);

        txtLado2 = new JTextField();
        txtLado2.setBounds(100, 140, 120, 30);
        painel.add(txtLado2);

        // Lado 3
        lblLado3 = new JLabel("Lado 3:");
        lblLado3.setFont(new Font("Consolas", Font.BOLD, 18));
        lblLado3.setForeground(new Color(250, 230, 250));
        lblLado3.setBounds(20, 200, 100, 30);
        painel.add(lblLado3);

        txtLado3 = new JTextField();
        txtLado3.setBounds(100, 200, 120, 30);
        painel.add(txtLado3);

        // Botão
        btnVerificar = new JButton("Verificar Triângulo");
        btnVerificar.setBackground(new Color(250, 230, 250));
        btnVerificar.setFont(new Font("Consolas", Font.BOLD, 14));
        btnVerificar.setBounds(20, 270, 200, 35);
        painel.add(btnVerificar);

        // Resultado
        lblResultado = new JLabel("Resultado");
        lblResultado.setFont(new Font("Consolas", Font.BOLD, 24));
        lblResultado.setForeground(new Color(250, 230, 250));
        lblResultado.setBounds(350, 100, 150, 30);
        painel.add(lblResultado);

        lblTipo = new JLabel("");
        lblTipo.setFont(new Font("Consolas", Font.BOLD, 18));
        lblTipo.setForeground(Color.WHITE);
        lblTipo.setBounds(350, 160, 200, 30);
        painel.add(lblTipo);

        btnVerificar.addActionListener(e -> verificarTriangulo());

        setVisible(true);
    }

    public void verificarTriangulo() {
        int lado1 = Integer.parseInt(txtLado1.getText());
        int lado2 = Integer.parseInt(txtLado2.getText());
        int lado3 = Integer.parseInt(txtLado3.getText());

        if (lado1 == lado2 && lado2 == lado3) {
            lblTipo.setText("Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            lblTipo.setText("Isósceles");
        } else {
            lblTipo.setText("Escaleno");
        }
    }

    public static void main(String[] args) {
        new TiposDeTriangulo();
    }
}