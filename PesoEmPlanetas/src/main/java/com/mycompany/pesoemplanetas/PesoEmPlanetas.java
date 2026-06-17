package com.mycompany.pesoemplanetas;

import javax.swing.*;
import java.awt.*;

public class PesoEmPlanetas extends JFrame {

    JPanel painel;

    JLabel lblTitulo;
    JLabel lblPeso;
    JLabel lblPlaneta;

    JTextField txtPeso;

    JRadioButton rbMercurio;
    JRadioButton rbVenus;
    JRadioButton rbMarte;
    JRadioButton rbJupiter;
    JRadioButton rbSaturno;
    JRadioButton rbUrano;

    ButtonGroup grupo;

    JButton btnCalcular;

    public PesoEmPlanetas() {
        setTitle("Peso em Planetas");
        setSize(520, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        painel = new JPanel();
        painel.setLayout(null);
        painel.setBackground(new Color(50, 23, 77));
        add(painel);

        lblTitulo = new JLabel("Peso em Planetas diferentes");
        lblTitulo.setFont(new Font("Consolas", Font.BOLD, 24));
        lblTitulo.setForeground(new Color(250, 230, 250));
        lblTitulo.setBounds(50, 20, 400, 40);
        painel.add(lblTitulo);

        lblPeso = new JLabel("Peso na Terra (kg):");
        lblPeso.setFont(new Font("Consolas", Font.BOLD, 14));
        lblPeso.setForeground(new Color(250, 230, 250));
        lblPeso.setBounds(20, 80, 160, 25);
        painel.add(lblPeso);

        txtPeso = new JTextField();
        txtPeso.setBounds(20, 110, 140, 30);
        painel.add(txtPeso);

        btnCalcular = new JButton("Calcular Peso");
        btnCalcular.setFont(new Font("Consolas", Font.BOLD, 14));
        btnCalcular.setBackground(new Color(250, 230, 250));
        btnCalcular.setForeground(new Color(50, 23, 77));
        btnCalcular.setBounds(280, 108, 170, 35);
        painel.add(btnCalcular);

        lblPlaneta = new JLabel("Selecione o Planeta:");
        lblPlaneta.setFont(new Font("Consolas", Font.BOLD, 14));
        lblPlaneta.setForeground(new Color(250, 230, 250));
        lblPlaneta.setBounds(20, 170, 180, 25);
        painel.add(lblPlaneta);

        rbMercurio = new JRadioButton("Mercúrio");
        rbVenus = new JRadioButton("Vênus");
        rbMarte = new JRadioButton("Marte");
        rbJupiter = new JRadioButton("Júpiter");
        rbSaturno = new JRadioButton("Saturno");
        rbUrano = new JRadioButton("Urano");

        rbMercurio.setBounds(30, 210, 120, 30);
        rbMarte.setBounds(180, 210, 120, 30);
        rbSaturno.setBounds(330, 210, 120, 30);

        rbVenus.setBounds(30, 250, 120, 30);
        rbJupiter.setBounds(180, 250, 120, 30);
        rbUrano.setBounds(330, 250, 120, 30);

        JRadioButton[] radios = {
            rbMercurio, rbVenus, rbMarte,
            rbJupiter, rbSaturno, rbUrano
        };

        for (JRadioButton rb : radios) {
            rb.setFont(new Font("Consolas", Font.BOLD, 16));
            rb.setForeground(new Color(250, 230, 250));
            rb.setBackground(new Color(50, 23, 77));
            painel.add(rb);
        }

        grupo = new ButtonGroup();
        grupo.add(rbMercurio);
        grupo.add(rbVenus);
        grupo.add(rbMarte);
        grupo.add(rbJupiter);
        grupo.add(rbSaturno);
        grupo.add(rbUrano);

        btnCalcular.addActionListener(e -> calcularPeso());

        setVisible(true);
    }

    public void calcularPeso() {
        double peso = Double.parseDouble(txtPeso.getText());
        double gravidade = 0;

        if (rbMercurio.isSelected()) {
            gravidade = 0.37;
        }
        else if (rbVenus.isSelected()) {
            gravidade = 0.88;
        }
        else if (rbMarte.isSelected()) {
            gravidade = 0.38;
        }
        else if (rbJupiter.isSelected()) {
            gravidade = 2.64;
        }
        else if (rbSaturno.isSelected()) {
            gravidade = 1.15;
        }
        else if (rbUrano.isSelected()) {
            gravidade = 1.17;
        }
        else {
            JOptionPane.showMessageDialog(null, "Selecione um planeta!");
            return;
        }

        double pesoFinal = (peso / 10) * gravidade;

        JOptionPane.showMessageDialog(
                null,
                "Seu peso nesse planeta é: " + pesoFinal + " kg"
        );
    }

    public static void main(String[] args) {
        new PesoEmPlanetas();
    }
}