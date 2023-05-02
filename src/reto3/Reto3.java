package reto3;

// Importación de librerias basica para mostrar ventana
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.jtattoo.plaf.mint.MintLookAndFeel;

public class Reto3 {

    JFrame frame = new JFrame("Reto 3 - Interfaz grafica");

    JPanel panelB = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();

    String[] items = {"Opcion 1", "Opcion 2", "Opcion 3"};

    Reto3() {
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        frame.add(panelB);

        // Opciones para la barra de menu
        JMenuItem opcion1 = new JMenuItem("Libreria 1");
        JMenuItem opcion2 = new JMenuItem("Libreria 2");
        JMenuItem opcion3 = new JMenuItem("Libreria 3");

        // Declaración de la barra de menu
        JMenuBar menuBar = new JMenuBar();

        // Agregar las opciones a la barra de menu
        menuBar.add(opcion1);
        menuBar.add(opcion2);
        menuBar.add(opcion3);

        frame.setJMenuBar(menuBar);

        // Libreria 1
        // Label
        Label label = new Label("Libreria awt");
        panel1.add(label);

        // Checkbox
        Checkbox checkbox1 = new Checkbox("Opcion 1");
        Checkbox checkbox2 = new Checkbox("Opcion 2");
        Panel panelCheck = new Panel();
        panelCheck.add(checkbox1);
        panelCheck.add(checkbox2);

        // Botones
        Button boton1 = new Button("Boton 1");
        Button boton2 = new Button("Boton 2");
        Panel panelBotones = new Panel();
        panelBotones.add(boton1);
        panelBotones.add(boton2);

        // Selectores
        Choice selector = new Choice();
        selector.add("Opcion 1");
        selector.add("Opcion 2");
        selector.add("Opcion 3");
        Panel panelSelect = new Panel();
        panelSelect.add(selector);

        // TextField
        TextField texto = new TextField("", 20);
        Panel panelTexto = new Panel();
        panelTexto.add(texto);

        // TextArea
        TextArea areaTexto = new TextArea("", 3, 20);
        Panel panelAreaTexto = new Panel();
        panelAreaTexto.add(areaTexto);

        // List
        List lista = new List();
        lista.add("Opcion 1");
        lista.add("Opcion 2");
        lista.add("Opcion 3");
        Panel panelLista = new Panel();
        panelLista.add(lista);

        // Scrollbar
        Scrollbar barraScroll = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 2, 4);
        Panel panelScroll = new Panel();
        panelScroll.add(barraScroll);

        // Agregar elementos al panel 1
        panel1.add(panelCheck);
        panel1.add(panelBotones);
        panel1.add(panelSelect);
        panel1.add(panelTexto);
        panel1.add(panelAreaTexto);
        panel1.add(panelLista);
        panel1.add(panelScroll);

        // Libreria 2
        // Label
        JLabel jLabel = new JLabel("Libreria swing");
        panel2.add(jLabel);

        // Checkbox
        JCheckBox jCheck1 = new JCheckBox("Opcion 1");
        JCheckBox jCheck2 = new JCheckBox("Opcion 2");
        JPanel jPanelCheck = new JPanel();
        jPanelCheck.add(jCheck1);
        jPanelCheck.add(jCheck2);

        // Botones
        JButton jBoton1 = new JButton("Boton 1");
        JButton jBoton2 = new JButton("Boton 2");
        JPanel jPanelBoton = new JPanel();
        jPanelBoton.add(jBoton1);
        jPanelBoton.add(jBoton2);

        // Selectores
        JComboBox jSelector = new JComboBox(items);
        JPanel jPanelSelect = new JPanel();
        jPanelSelect.add(jSelector);

        // TextField
        JTextField jTexto = new JTextField("", 15);
        JPanel jPanelTexto = new JPanel();
        jPanelTexto.add(jTexto);

        // TextArea
        JTextArea jAreaTexto = new JTextArea("", 3, 15);
        JPanel jPanelAreaTexto = new JPanel();
        jPanelAreaTexto.add(jAreaTexto);

        // List
        JList jLista = new JList(items);
        JPanel jPanelLista = new JPanel();
        jPanelLista.add(jLista);

        // Scroolbar
        JScrollBar jBarraScroll = new JScrollBar(Scrollbar.VERTICAL);
        JPanel jPanelScroll = new JPanel();
        jPanelScroll.add(jBarraScroll);

        // Agregar elementos al panel 2
        panel2.add(jPanelCheck);
        panel2.add(jPanelBoton);
        panel2.add(jPanelSelect);
        panel2.add(jPanelTexto);
        panel2.add(jPanelAreaTexto);
        panel2.add(jPanelLista);
        panel2.add(jPanelScroll);

        // Libreria 3
        // Label
        JLabel uILabel = new JLabel("Libreria jtattoo");
        panel3.add(uILabel);

        // Checkbox
        JCheckBox uICheck1 = new JCheckBox("Opcion 1");
        JCheckBox uICheck2 = new JCheckBox("Opcion 2");
        JPanel uIPanelCheck = new JPanel();
        uIPanelCheck.add(uICheck1);
        uIPanelCheck.add(uICheck2);

        // Botones
        JButton uIBoton1 = new JButton("Boton 1");
        JButton uIBoton2 = new JButton("Boton 2");
        JPanel uIPanelBoton = new JPanel();
        uIPanelBoton.add(uIBoton1);
        uIPanelBoton.add(uIBoton2);

        // Selectores
        JComboBox uISelector = new JComboBox(items);
        JPanel uIPanelSelect = new JPanel();
        uIPanelSelect.add(uISelector);

        // TextField
        JTextField uITexto = new JTextField("", 15);
        JPanel uIPanelTexto = new JPanel();
        uIPanelTexto.add(uITexto);

        // TextArea
        JTextArea uIAreaTexto = new JTextArea("", 3, 15);
        JPanel uIPanelAreaTexto = new JPanel();
        uIPanelAreaTexto.add(uIAreaTexto);

        // List
        JList uILista = new JList(items);
        JPanel uIPanelLista = new JPanel();
        uIPanelLista.add(uILista);

        // Scroolbar
        JScrollBar uIBarraScroll = new JScrollBar(Scrollbar.VERTICAL);
        JPanel uIPanelScroll = new JPanel();
        uIPanelScroll.add(uIBarraScroll);

        // Agregar elementos al panel 3
        panel3.add(uIPanelCheck);
        panel3.add(uIPanelBoton);
        panel3.add(uIPanelSelect);
        panel3.add(uIPanelTexto);
        panel3.add(uIPanelAreaTexto);
        panel3.add(uIPanelLista);
        panel3.add(uIPanelScroll);

        // Eventos
        EventoMenu EventoMenu = new EventoMenu();
        opcion1.addActionListener(EventoMenu);
        opcion2.addActionListener(EventoMenu);
        opcion3.addActionListener(EventoMenu);

        // Mensaje
        JLabel mensaje = new JLabel("Selecciona una opcion en el menu");
        panelB.add(mensaje, BorderLayout.PAGE_START);

        // Configuracion de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public void libreria1() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel1);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }

    }

    public void libreria2() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel2);
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }

    }

    public void libreria3() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel3);
        try {
            UIManager.setLookAndFeel(new MintLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new Reto3();
    }

    public class EventoMenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case "Libreria 1" -> {
                    libreria1();
                }
                case "Libreria 2" -> {
                    libreria2();
                }
                case "Libreria 3" -> {
                    libreria3();
                }
            }

            SwingUtilities.updateComponentTreeUI(frame);
        }
    }
}
