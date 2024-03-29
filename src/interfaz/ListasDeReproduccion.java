package interfaz;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import reproductor.ListaDeCanciones;
import reproductor.ListaDeReproduccion;

public class ListasDeReproduccion extends javax.swing.JFrame {

    public ListasDeReproduccion(ArrayList<ListaDeReproduccion> listasDeReproduccion, ListaDeCanciones listaDeCanciones) {
        modeloListas = new DefaultComboBoxModel<>();

        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.listaDeCanciones = listaDeCanciones;
        if (listasDeReproduccion == null) {
            this.listasDeReproduccion = new ArrayList<>();
        } else {
            this.listasDeReproduccion = listasDeReproduccion;
            for (int i = 0; i < listasDeReproduccion.size(); i++) {
                modeloListas.addElement(listasDeReproduccion.get(i).getNombreLista());
            }
        }

        if (modeloListas.getSize() == 0) {
            listas.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        listas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Reproducir Lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReproducirLista(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 102));
        jButton2.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Editar Lista");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarLista(evt);
            }
        });

        listas.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        listas.setModel(modeloListas);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Elije una lista de reproducción:");

        jButton3.setBackground(new java.awt.Color(255, 153, 102));
        jButton3.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Agregar Lista");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearListaDeReproduccion(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 102));
        jButton4.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(listas, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearListaDeReproduccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearListaDeReproduccion
        listas.setEnabled(true);
        String nombreLista = JOptionPane.showInputDialog(rootPane, "Ingresa el nombre de la lista de reproducción:");
        modeloListas.addElement(nombreLista);
        lrep = new ListaDeReproduccion(nombreLista);
        listasDeReproduccion.add(lrep);
    }//GEN-LAST:event_crearListaDeReproduccion

    private void botonReproducirLista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReproducirLista
        ListaDeReproduccion lrep;
        for (int i = 0; i < listasDeReproduccion.size(); i++) {
            lrep = listasDeReproduccion.get(i);
            if (lrep.getNombreLista().equals(listas.getSelectedItem().toString())) {
                if (lrep.getSize() != 0) {
                    ReproductorListaDeReproduccion r = new ReproductorListaDeReproduccion(listas.getSelectedItem().toString(), this.listasDeReproduccion, this.listaDeCanciones);
                    r.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "AUN NO TIENES CANCIONES EN LA LISTA");
                }
            }
        }
    }//GEN-LAST:event_botonReproducirLista

    private void botonEditarLista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarLista
        if (listas.isEnabled()) {
            for (int i = 0; i < listasDeReproduccion.size(); i++) {
                ListaDeReproduccion lrepAux = listasDeReproduccion.get(i);
                if (listas.getSelectedItem().toString().equals(lrepAux.getNombreLista())) {
                    tituloLista = lrepAux.getNombreLista();
                    EditarLista e = new EditarLista(tituloLista, listasDeReproduccion, listaDeCanciones);
                    e.setVisible(true);
                    this.dispose();
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Agrega una lista de reporducción");
        }
    }//GEN-LAST:event_botonEditarLista
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Principal p = new Principal(null, null, this.listaDeCanciones, this.listasDeReproduccion);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    public String getTituloLista() {
        return tituloLista;
    }

    public DefaultComboBoxModel<String> modeloListas;
    ListaDeReproduccion lrep;
    public ArrayList<ListaDeReproduccion> listasDeReproduccion;
    private String tituloLista;
    ListaDeCanciones listaDeCanciones;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JComboBox<String> listas;
    // End of variables declaration//GEN-END:variables
}
