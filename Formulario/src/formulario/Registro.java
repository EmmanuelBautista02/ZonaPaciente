/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author emmab
 */
public class Registro extends javax.swing.JPanel {

    private String pac_id;
    private String nombre;
    private String enfermedad;
    private String sangre;
    private String ciudad;
    ArrayList <Registro> pacientes = new ArrayList<>();
    
    public Registro() {
        initComponents();
    }
     public void addEventos(OyenteRegistro oyente){
        botonRegistrar.setName("re");
        botonRegistrar.addActionListener(oyente);
        botonCancelar.setName("ca");
         botonCancelar.addActionListener(oyente);
    }

    public String getPac_id() {
        return pac_id;
    }

    public void setPac_id(String pac_id) {
        this.pac_id = pac_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public JButton getBotonCancelar() {
        return botonCancelar;
    }

    public void setBotonCancelar(JButton botonCancelar) {
        this.botonCancelar = botonCancelar;
    }

    public JButton getBotonRegistrar() {
        return botonRegistrar;
    }

    public void setBotonRegistrar(JButton botonRegistrar) {
        this.botonRegistrar = botonRegistrar;
    }

    public JTextField getCampoCiudad() {
        return campoCiudad;
    }

    public void setCampoCiudad(JTextField campoCiudad) {
        this.campoCiudad = campoCiudad;
    }

    public JTextField getCampoEnfermedad() {
        return campoEnfermedad;
    }

    public void setCampoEnfermedad(JTextField campoEnfermedad) {
        this.campoEnfermedad = campoEnfermedad;
    }

    public JTextField getCampoID() {
        return campoID;
    }

    public void setCampoID(JTextField campoID) {
        this.campoID = campoID;
    }

    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public void setCampoNombre(JTextField campoNombre) {
        this.campoNombre = campoNombre;
    }

    public JTextField getCampoSangre() {
        return campoSangre;
    }

    public void setCampoSangre(JTextField campoSangre) {
        this.campoSangre = campoSangre;
    }
    public void guardar(){
        Registro paciente = new Registro();
        paciente.setNombre(campoNombre.getText());
        paciente.setEnfermedad(campoEnfermedad.getText());
        paciente.setPac_id(campoID.getText());
        paciente.setSangre(campoSangre.getText());
        paciente.setCiudad(campoCiudad.getText());
        pacientes.add(paciente);
        System.out.println("Se ha guardado con exito ");
        System.out.println("Datos almacenados: ");
        Iterator<Registro> a = pacientes.iterator();
        while(a.hasNext()){
	Registro pacientess = a.next();
            System.out.println("ID del paciente: "+pacientess.getPac_id());
            System.out.println("Nombre del paciente: "+pacientess.getNombre());
            System.out.println("Enfermedad del paciente: "+pacientess.getEnfermedad());
           System.out.println("Tipo de sangre del paciente: "+pacientess.getSangre()); 
           System.out.println("Ciudad de nacimiento del paciente: "+pacientess.getCiudad());
}
        
    } 
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        panelCampos = new javax.swing.JPanel();
        etiquetaID = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etiquetaEnfermedad = new javax.swing.JLabel();
        campoEnfermedad = new javax.swing.JTextField();
        etiquetaSangre = new javax.swing.JLabel();
        campoSangre = new javax.swing.JTextField();
        etiquetaCiudad = new javax.swing.JLabel();
        campoCiudad = new javax.swing.JTextField();
        panelBotones = new javax.swing.JPanel();
        botonRegistrar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(3, 1));

        panelTitulo.setBorder(new javax.swing.border.LineBorder(getBackground(), 20, true));

        etiquetaTitulo.setBackground(getBackground());
        etiquetaTitulo.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        etiquetaTitulo.setText("REGISTRO DE PACIENTES");
        etiquetaTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelTitulo.add(etiquetaTitulo);

        add(panelTitulo);

        panelCampos.setBorder(javax.swing.BorderFactory.createLineBorder(getBackground(), 20));
        panelCampos.setLayout(new java.awt.GridLayout(5, 2));

        etiquetaID.setText("ID del paciente");
        panelCampos.add(etiquetaID);
        panelCampos.add(campoID);

        etiquetaNombre.setText("Nombre:");
        panelCampos.add(etiquetaNombre);
        panelCampos.add(campoNombre);

        etiquetaEnfermedad.setText("Enfermedad: ");
        panelCampos.add(etiquetaEnfermedad);
        panelCampos.add(campoEnfermedad);

        etiquetaSangre.setText("Tipo de sangre");
        panelCampos.add(etiquetaSangre);
        panelCampos.add(campoSangre);

        etiquetaCiudad.setText("Ciudad Nac");
        panelCampos.add(etiquetaCiudad);
        panelCampos.add(campoCiudad);

        add(panelCampos);

        panelBotones.setBorder(javax.swing.BorderFactory.createLineBorder(getBackground(), 20));
        panelBotones.setLayout(new java.awt.GridLayout(1, 2));

        botonRegistrar.setText("REGISTRAR");
        panelBotones.add(botonRegistrar);

        botonCancelar.setText("CANCELAR");
        panelBotones.add(botonCancelar);

        add(panelBotones);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField campoCiudad;
    private javax.swing.JTextField campoEnfermedad;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoSangre;
    private javax.swing.JLabel etiquetaCiudad;
    private javax.swing.JLabel etiquetaEnfermedad;
    private javax.swing.JLabel etiquetaID;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaSangre;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelCampos;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}
