package interfaz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jlgui.basicplayer.*;
import reproductor.Cancion;
import reproductor.CancionArbolAVL;
import reproductor.ListaDeCanciones;
import reproductor.NodoCancionArbolAVL;

public class Principal extends javax.swing.JFrame {

    public Principal(ListaDeCanciones lc) {
        modeloListaCanciones = new DefaultListModel();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        System.out.println("-------PRINCIPAL---------");
        player = new BasicPlayer();
        
        if(lc == null){
            this.lc = new ListaDeCanciones();
        }else{
            this.lc = new ListaDeCanciones();
            this.lc = lc;
            //lc.listaTotal();
        }
        
        int cont = 0;
        arbol = new CancionArbolAVL();
        
        BufferedReader br;
        try {
            File file = new File("src/ficheros/Lista De Canciones.txt");
            if(file.exists()){
                br = new BufferedReader(new FileReader(file));
                while((linea = br.readLine()) != null){
                     if(lc == null){
                        modeloListaCanciones.addElement(linea);
                        this.lc.añadirCancion(linea);
                        
                        cont++;
                        nodoArbol = new NodoCancionArbolAVL(cont);
                        arbol.Insertar(cont);
                     }else{
                        String aux = lc.recorrerLista();
                        modeloListaCanciones.addElement(aux);
                        //this.lc.añadirCancion(aux);
                        
                        cont++;
                        nodoArbol = new NodoCancionArbolAVL(cont);
                     }
                }
            }
        } catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCanciones = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        tituloCancion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        artistaCancion = new javax.swing.JLabel();
        albumCancion = new javax.swing.JLabel();
        generoCancion = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Agregar Canción");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarCancion(evt);
            }
        });

        jButton2.setText("Listas De Reproducción");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIrAListasDeReproduccion(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jTabbedPane1.addTab("Inicio", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaCanciones.setModel(modeloListaCanciones);
        listaCanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaCancionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaCanciones);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 51, 197, 207));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetroceder(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 39, 39));

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReproducirYPausar(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 39, 39));

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAvanzar(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 39, 39));

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonParar(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 39, 39));

        tituloCancion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tituloCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(tituloCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 160, 24));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MIS CANCIONES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 17, 159, 22));

        artistaCancion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        artistaCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(artistaCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 160, 24));

        albumCancion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        albumCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(albumCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 160, 24));

        generoCancion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        generoCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(generoCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 160, 30));

        jButton7.setText("Modificar Datos");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarDatos(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 135, -1));

        jButton8.setText("jButton8");
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 39, 39));

        jTabbedPane1.addTab("Canciones", jPanel2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Buscar por:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jButton9.setText("jButton9");

        jButton10.setText("jButton10");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarDatos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarDatos
        this.dispose();
        modificarDatosCancion m = new modificarDatosCancion(listaCanciones.getSelectedValue(), lc);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonModificarDatos

    private void botonParar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonParar
        try {
            player.stop();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonParar

    private void botonAvanzar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAvanzar
        listaCanciones.setSelectedIndex(listaCanciones.getSelectedIndex() + 1);
        if(listaCanciones.getSelectedIndex() != -1){
            //System.out.println("DEVUELVE: " + lc.avanzar());
            String x = lc.avanzar();
            if(!x.equals("final")){
                System.out.println(x);
                reproducir(x);
            }else{
                System.out.println("Ya no hay canciones delante");
            }
        }

        mostrarDatosCancion();
    }//GEN-LAST:event_botonAvanzar

    private void botonReproducirYPausar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReproducirYPausar
        reproducir(null);
    }//GEN-LAST:event_botonReproducirYPausar

    private void botonRetroceder(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetroceder
        listaCanciones.setSelectedIndex(listaCanciones.getSelectedIndex() - 1);
        if(listaCanciones.getSelectedIndex() != -1){
            //System.out.println("DEVUELVE: " + lc.retroceder());
            String x = lc.retroceder();
            if(!x.equals("inicial")){
                System.out.println(x);
                reproducir(x);
            }else{
                System.out.println("Ya no hay canciones atras");
            }
        }

        mostrarDatosCancion();
    }//GEN-LAST:event_botonRetroceder

    private void listaCancionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCancionesMouseClicked
        mostrarDatosCancion();
    }//GEN-LAST:event_listaCancionesMouseClicked

    private void botonIrAListasDeReproduccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIrAListasDeReproduccion
        ListasDeReproduccion lr = new ListasDeReproduccion(null, this.lc);
        lr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonIrAListasDeReproduccion

    private void botonAgregarCancion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCancion
        JFileChooser archivo = new JFileChooser("E:\\UPITTA\\3er Semestre\\Estructura De Datos\\ProyectoFinal");
        archivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Audios mp3", "mp3");
        //archivo.addChoosableFileFilter(filter);
        archivo.setFileFilter(filter);
        archivo.showOpenDialog(rootPane);
        String file = archivo.getSelectedFile().getAbsolutePath();
        nombre = archivo.getName(archivo.getSelectedFile()).replace(".mp3", "");
        modeloListaCanciones.addElement(nombre);
        //System.out.println(nombre);

        int contador = 0;

        try {
            FileInputStream fis = new FileInputStream(file);
            while(true){
                int byteEntrada = fis.read();
                contador++;
                if(byteEntrada == -1){
                    break;
                }
            }
            fis.close();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        int bytes[] = new int[contador];

        // Guarda canciones en un txt y guarda la canción en el paquete correspondiente
        contador = 0;
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/ficheros/Lista De Canciones.txt", true));
            while(true){
                int byteEntrada = fis.read();
                if(byteEntrada != -1){
                    bytes[contador] = byteEntrada;
                }
                contador++;
                if(byteEntrada == -1){
                    break;
                }
            }
            lc.añadirCancion(nombre);
            bw.write(nombre + "\n");
            fis.close();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(contador);

        try {
            FileOutputStream fos = new FileOutputStream("src/audio/" + nombre + ".mp3");
            for (int i = 0; i < bytes.length; i++) {
                fos.write(bytes[i]);
            }
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(rootPane, "CANCIÓN AGREGADA CON EXITO");
    }//GEN-LAST:event_botonAgregarCancion

    public void reproducir(String cancionAReproducir){
        System.out.println("CAnción Actual: " + cancionActual);
        if(listaCanciones.getSelectedIndex() != -1){
            try{
                
                if(!cancionActual.equals(listaCanciones.getSelectedValue())){
                    player.stop();
                    System.out.println("STOP");
                }
            }catch(Exception e){
                System.out.println("ERROR ZERO");
            }
 
            if(cancionAReproducir == null){
                aux = lc.buscarCancion(listaCanciones.getSelectedValue()).getNombre();
            }else{
                aux = cancionAReproducir;
            }

            try{          
                System.out.println("Cancion antes de play: " + cancionActual);

                if(player.getStatus() == BasicPlayer.PLAYING && cancionActual.equals(listaCanciones.getSelectedValue())){
                    player.pause();
                    System.out.println("PAUSADA");
                }else if(player.getStatus() != BasicPlayer.PLAYING && player.getStatus() != BasicPlayer.PAUSED){
                    player.open(new File("src/audio/" + aux + ".mp3"));
                    player.play();
                    cancionActual = aux;
                    System.out.println("REPRODUCIENDO");
                }else if(player.getStatus() == BasicPlayer.PAUSED){
                    player.resume();
                    System.out.println("REPRODUCIENDO DE NUEVO");
                }
            }catch(Exception e){
                System.out.print("ERROR --- ");
                e.printStackTrace();
            }
        }
    }
    
    private void mostrarDatosCancion(){
        String cancion = listaCanciones.getSelectedValue();
        Cancion cancion2 = lc.buscarCancion(cancion);
        
        tituloCancion.setText("Titulo: " + cancion2.getNombre());
        
        if(cancion2.getArtista() == null){
            artistaCancion.setText("\nArtista: Desconocido");
        }else{
            artistaCancion.setText("\nArtista: " + cancion2.getArtista());
        }
        
        if(cancion2.getAlbum() == null){
            albumCancion.setText("\nÁlbum: Desconocido");
        }else{
            albumCancion.setText("\nAlbúm: " + cancion2.getAlbum());
        }
        
        if(cancion2.getGenero() == null){
            generoCancion.setText("\nGénero: Desconocido");
        }else{
            generoCancion.setText("\nGénero: " + cancion2.getGenero());
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal(null).setVisible(true);
            }
        });
    }

    public static DefaultListModel modeloListaCanciones;
    public static DefaultListModel modeloListaRep;
    public static DefaultListModel modeloCancionesListaRep;
    public BasicPlayer player;
    //ArrayList<ListaReproduccion> listasDeReproduccion;
    String nombre;
    String nombreLista;
    String linea, cancionActual = "";
    ListaDeCanciones lc;
    //ListaReproduccion lrep;
    String aux;
    NodoCancionArbolAVL nodoArbol;
    CancionArbolAVL arbol;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel albumCancion;
    private javax.swing.JLabel artistaCancion;
    private javax.swing.JLabel generoCancion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> listaCanciones;
    private javax.swing.JLabel tituloCancion;
    // End of variables declaration//GEN-END:variables
}
