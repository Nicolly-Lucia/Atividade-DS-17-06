package com.mycompany.pedrapapeletesoura;

import javax.swing.*;
import java.awt.*;

public class PedraPapelETesoura extends JFrame {

    JPanel painel;

    JLabel lblTitulo;
    JLabel lblResultado;
    JLabel lblAmigo;

    JRadioButton rbPedra;
    JRadioButton rbPapel;
    JRadioButton rbTesoura;

    ButtonGroup grupo;

    JButton btnJogar;

    public PedraPapelETesoura() {
        setTitle("Pedra, Papel, Tesoura");
        setSize(550, 320);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        painel = new JPanel();
        painel.setLayout(null);
        painel.setBackground(new Color(50, 23, 77));
        add(painel);

        lblTitulo = new JLabel("Pedra, Papel ou Tesoura?");
        lblTitulo.setFont(new Font("Consolas", Font.BOLD, 24));
        lblTitulo.setForeground(new Color(250, 230, 250));
        lblTitulo.setBounds(60, 20, 350, 40);
        painel.add(lblTitulo);

        rbPedra = new JRadioButton("Pedra!");
        rbPapel = new JRadioButton("Papel!");
        rbTesoura = new JRadioButton("Tesoura!");

        rbPedra.setBounds(30, 90, 150, 30);
        rbPapel.setBounds(30, 140, 150, 30);
        rbTesoura.setBounds(30, 190, 150, 30);

        rbPedra.setFont(new Font("Consolas", Font.BOLD, 24));
        rbPapel.setFont(new Font("Consolas", Font.BOLD, 24));
        rbTesoura.setFont(new Font("Consolas", Font.BOLD, 24));

        rbPedra.setForeground(new Color(250, 230, 250));
        rbPapel.setForeground(new Color(250, 230, 250));
        rbTesoura.setForeground(new Color(250, 230, 250));

        rbPedra.setBackground(new Color(50, 23, 77));
        rbPapel.setBackground(new Color(50, 23, 77));
        rbTesoura.setBackground(new Color(50, 23, 77));

        painel.add(rbPedra);
        painel.add(rbPapel);
        painel.add(rbTesoura);

        grupo = new ButtonGroup();
        grupo.add(rbPedra);
        grupo.add(rbPapel);
        grupo.add(rbTesoura);

        btnJogar = new JButton("Jogar");
        btnJogar.setFont(new Font("Consolas", Font.BOLD, 14));
        btnJogar.setBackground(new Color(250, 230, 250));
        btnJogar.setForeground(new Color(50, 23, 77));
        btnJogar.setBounds(350, 80, 120, 35);
        painel.add(btnJogar);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setFont(new Font("Consolas", Font.BOLD, 18));
        lblResultado.setForeground(new Color(250, 230, 250));
        lblResultado.setBounds(250, 190, 260, 30);
        painel.add(lblResultado);

        lblAmigo = new JLabel("Amigo escolheu:");
        lblAmigo.setFont(new Font("Consolas", Font.BOLD, 18));
        lblAmigo.setForeground(new Color(250, 230, 250));
        lblAmigo.setBounds(250, 140, 260, 30);
        painel.add(lblAmigo);

        btnJogar.addActionListener(e -> jogar());

        setVisible(true);
    }

    public static int randInt(int min, int max) {
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public void jogar() {
        int jogador;

        if (rbPedra.isSelected()) {
            jogador = 0;
        } else if (rbPapel.isSelected()) {
            jogador = 1;
        } else if (rbTesoura.isSelected()) {
            jogador = 2;
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma opção pra jogar.");
            return;
        }

        int amigo = randInt(0, 2);

        String escolhaAmigo;

        if (amigo == 0) {
            escolhaAmigo = "Pedra";
        } else if (amigo == 1) {
            escolhaAmigo = "Papel";
        } else {
            escolhaAmigo = "Tesoura";
        }

        String resultado;

        if (jogador == amigo) {
            resultado = "Empate!";
        } else if (
                (jogador == 0 && amigo == 2) ||
                (jogador == 1 && amigo == 0) ||
                (jogador == 2 && amigo == 1)
        ) {
            resultado = "Você venceu!";
        } else {
            resultado = "Amigo venceu!";
        }

        lblResultado.setText("Resultado: " + resultado);
        lblAmigo.setText("Amigo escolheu: " + escolhaAmigo);
    }

    public static void main(String[] args) {
        new PedraPapelETesoura();
    }
}