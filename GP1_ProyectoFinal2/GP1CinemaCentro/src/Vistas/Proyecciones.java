/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Persistencia.*;
import Entidades.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.sql.Time;

/**
 *
 * @author lucio
 */
public class Proyecciones extends javax.swing.JInternalFrame {
 private DefaultTableModel modelo= new DefaultTableModel();
    PeliculaData peliD = new PeliculaData();
    SalaData salaD = new SalaData ();
    ProyeccionData proyeD = new ProyeccionData();

    public Proyecciones() {
        initComponents();
        cabecera();
        cargarCombosP();
        cargarCombosS();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcbSalas = new javax.swing.JComboBox<>();
        jcbPeliculas = new javax.swing.JComboBox<>();
        jtIdiomas = new javax.swing.JTextField();
        jrbApto = new javax.swing.JRadioButton();
        jrSubtitulada = new javax.swing.JRadioButton();
        jsHoraInicio = new javax.swing.JSpinner();
        jsHoraFin = new javax.swing.JSpinner();
        jtPrecio = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jtIdPro = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProyecciones = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jbMostrar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proyeccion/Funcion");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Salas: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Peliculas:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Idioma:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Es 3D:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Es subtitulada:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Hora de Finalizacion:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Hora de Inicio:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Precio Lugar:");

        jcbSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSalasActionPerformed(evt);
            }
        });

        jtIdiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdiomasActionPerformed(evt);
            }
        });

        jrbApto.setText("Apto para 3D");
        jrbApto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAptoActionPerformed(evt);
            }
        });

        jrSubtitulada.setText("Subtitulada");
        jrSubtitulada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrSubtituladaActionPerformed(evt);
            }
        });

        jsHoraInicio.setModel(new javax.swing.SpinnerDateModel());
        jsHoraInicio.setToolTipText("");
        jsHoraInicio.setEditor(new javax.swing.JSpinner.DateEditor(jsHoraInicio, " HH:mm"));

        jsHoraFin.setModel(new javax.swing.SpinnerDateModel());
        jsHoraFin.setEditor(new javax.swing.JSpinner.DateEditor(jsHoraFin, "HH:mm"));

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Id Proyeccion:");

        jbBuscar.setText("Buscar");

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");

        jtProyecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtProyecciones);

        jbSalir.setText("Salir");

        jbMostrar.setText("Mostrar");
        jbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jcbSalas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcbPeliculas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtIdiomas)
                                        .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jrbApto)
                                                .addComponent(jrSubtitulada))
                                            .addGap(11, 11, 11)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jsHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jsHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(198, 198, 198))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addGap(51, 51, 51)
                                .addComponent(jbBuscar)
                                .addGap(76, 76, 76)
                                .addComponent(jbEliminar)
                                .addGap(51, 51, 51)
                                .addComponent(jbModificar)))
                        .addGap(231, 231, 231))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtIdiomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jrbApto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jrSubtitulada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jsHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jsHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jbBuscar)
                    .addComponent(jbGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbMostrar)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSalir)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtIdiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdiomasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdiomasActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        cargarProyeccion();
        limpiarCampos();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jcbSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSalasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcbSalasActionPerformed

    private void jrbAptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAptoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jrbAptoActionPerformed

    private void jrSubtituladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrSubtituladaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jrSubtituladaActionPerformed

    private void jbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarActionPerformed
        // TODO add your handling code here:
        mostraPro();
    }//GEN-LAST:event_jbMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbMostrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Object> jcbPeliculas;
    private javax.swing.JComboBox<Object> jcbSalas;
    private javax.swing.JRadioButton jrSubtitulada;
    private javax.swing.JRadioButton jrbApto;
    private javax.swing.JSpinner jsHoraFin;
    private javax.swing.JSpinner jsHoraInicio;
    private javax.swing.JTextField jtIdPro;
    private javax.swing.JTextField jtIdiomas;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTable jtProyecciones;
    // End of variables declaration//GEN-END:variables

    private void cargarProyeccion(){
        
        Pelicula peliSele = (Pelicula) jcbPeliculas.getSelectedItem();
        Sala salaSele = (Sala) jcbSalas.getSelectedItem();
        
        Date horaInicio = (Date) jsHoraInicio.getValue();
        java.sql.Time horaI = new java.sql.Time(horaInicio.getTime());
        
        Date horaFin = (Date) jsHoraFin.getValue();
        java.sql.Time horaF = new java.sql.Time(horaFin.getTime());
        
        String idiomas = jtIdiomas.getText();
        
        boolean apto = false; 
        boolean sub = false;
        
        if (jrbApto.isSelected() == true) {
            
            apto = true;
        } 
        
        if (jrSubtitulada.isSelected() == true) {
            
            sub = true;
        }
        try{
            
            int idPeli = peliSele.getIdPelicula();
            int nroSala = salaSele.getIdSala();
            
            double precio = Double.parseDouble(jtPrecio.getText());    
            
            if (horaInicio == null || horaFin == null || idiomas.isEmpty() || precio == 0 || idPeli == 0 || nroSala == 0 ) {
                
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");

            } else {
                
                Proyeccion proy = new Proyeccion(idiomas, apto, sub, horaI, horaF, precio);
                
                proyeD.guardarProyeccion(proy, idPeli, nroSala);
                
                
            }
        } catch (NumberFormatException x){
            
            JOptionPane.showMessageDialog(this, "Numero Invalido.");
        } 
    }
    
    public void mostraPro(){
        
        Pelicula peliSele = (Pelicula) jcbPeliculas.getSelectedItem();
        Sala salaSele = (Sala) jcbSalas.getSelectedItem();
        
        List <Proyeccion> lista = proyeD.listarProyecciones();
        modelo.setRowCount(0);
        String apta, sub;
        
        for (Proyeccion p: lista) {
            
            if (p.isEs3D() == true) {
                
                apta = "Apta para 3D";
            } else {
                
                apta = "No es Apta para 3D";
            }
            
            if (p.isSubtitulada() == true) {
                
                sub = "Subtitulada";
            } else {
                
                sub = "No esta Subtitulada";
            }
            
            modelo.addRow(new Object []{
                
               p.getIdProyeccion(),
                p.getSala().getNroSala(),
                p.getPelicula().getTitulo(),
                sub,
                apta,
                p.getIdioma(),
                p.getHoraInicio(),
                p.getHoraFin(),
                p.getPrecioLugar()
            });
        }
    }
    
    
    
    
    
    
    
    //------------Visuales------------
    
    private void cargarCombosP(){
        jcbPeliculas.removeAllItems();
        
        for (Pelicula p: peliD.listarPeliculas()) {
            
            jcbPeliculas.addItem(p);         
        }
    }
    
     private void cargarCombosS(){
        jcbSalas.removeAllItems();
        
        for (Sala s: salaD.listarSala()) {
            
            jcbSalas.addItem(s);
        }
    }
    private void cabecera(){
        
        modelo.addColumn("Id Proyecciones");
        modelo.addColumn("Nro Salas");
        modelo.addColumn("Pelicula");
        modelo.addColumn("Subtitulada");
        modelo.addColumn("Apta 3D");
        modelo.addColumn("Idioma");
        modelo.addColumn("Hora de Inicio");
        modelo.addColumn("Hora de Finalizacion");
        modelo.addColumn("Precio");
        
        jtProyecciones.setModel(modelo);
    }
    
     private void limpiarCampos(){
         
            jcbPeliculas.setSelectedIndex(0);
            jcbSalas.setSelectedIndex(0);
            
            jsHoraInicio.setValue(new java.util.Date());
            jsHoraFin.setValue(new java.util.Date());
            
            jrSubtitulada.setSelected(false);
            jrSubtitulada.setSelected(false);
            
            jtIdPro.setText("");
            jtPrecio.setText("");
            jtIdiomas.setText("");
            
            
            
     }

}
