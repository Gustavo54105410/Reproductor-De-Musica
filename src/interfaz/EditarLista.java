package interfaz;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import reproductor.Cancion;
import reproductor.ListaDeCanciones;
import reproductor.ListaDeReproduccion;

public class EditarLista extends javax.swing.JFrame {

    public EditarLista(String nombreLista, ArrayList<ListaDeReproduccion> listasDeReproduccion, ListaDeCanciones listaDeCanciones) {
        modeloMisCanciones = new DefaultListModel();
        modeloMiListaDeReproduccion = new DefaultListModel();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.tituloLista = nombreLista;
        titulo.setText("Mi lista:" + nombreLista);
        this.lc = listaDeCanciones;

        int cont = 0;

        BufferedReader br;
        try {
            Cancion cancion;
            do {
                cont++;
                cancion = lc.recorrerLista();
                if (cancion != null) {
                    modeloMisCanciones.addElement(cancion.getNombre());
                }
            } while (cancion != null);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.listasDeReproduccion = new ArrayList<>();
        this.listasDeReproduccion = listasDeReproduccion;
        for (int i = 0; i < this.listasDeReproduccion.size(); i++) {
            lrep = this.listasDeReproduccion.get(i);
            if (nombreLista.equals(lrep.getNombreLista())) {
                break;
            }
        }
        while (true) {
            Cancion cancion = lrep.recorrerListaDeReproduccion();
            if (cancion != null) {
                modeloMiListaDeReproduccion.addElement(cancion.getNombre());
            } else {
                break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        misCanciones = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        miLista = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        misCanciones.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        misCanciones.setModel(modeloMisCanciones);
        misCanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonQuitarSeleccion1(evt);
            }
        });
        jScrollPane1.setViewportView(misCanciones);

        miLista.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        miLista.setModel(modeloMiListaDeReproduccion);
        miLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonQuitarSeleccion2(evt);
            }
        });
        jScrollPane2.setViewportView(miLista);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MIS CANCIONES");

        titulo.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCancionAListaDeReproduccion(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 102));
        jButton4.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresar(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(25, 25, 25))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jButton1)))
                .addGap(25, 25, 25))
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

    private void agregarCancionAListaDeReproduccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCancionAListaDeReproduccion
        if (misCanciones.getSelectedIndex() != -1) {
            modeloMiListaDeReproduccion.addElement(misCanciones.getSelectedValue());

            lrep.añadirAListaDeReproduccion(misCanciones.getSelectedValue());
        }
    }//GEN-LAST:event_agregarCancionAListaDeReproduccion

    private void botonQuitarSeleccion1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonQuitarSeleccion1
        if (miLista.isSelectedIndex(miLista.getSelectedIndex())) {
            miLista.clearSelection();
        }
    }//GEN-LAST:event_botonQuitarSeleccion1

    private void botonRegresar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresar
        ListasDeReproduccion l = new ListasDeReproduccion(this.listasDeReproduccion, this.lc);
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonRegresar

    private void botonQuitarSeleccion2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonQuitarSeleccion2
        if (misCanciones.isSelectedIndex(misCanciones.getSelectedIndex())) {
            misCanciones.clearSelection();
        }
    }//GEN-LAST:event_botonQuitarSeleccion2

    public DefaultListModel modeloMisCanciones;
    DefaultListModel modeloMiListaDeReproduccion;
    ArrayList<ListaDeReproduccion> listasDeReproduccion;
    ListaDeCanciones lc;
    ListaDeReproduccion lrep;
    String tituloLista;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> miLista;
    public javax.swing.JList<String> misCanciones;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
