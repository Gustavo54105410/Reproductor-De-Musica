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
import reproductor.ListaDeCanciones;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        modeloListaCanciones = new DefaultListModel();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        player = new BasicPlayer();
        lc = new ListaDeCanciones();
        BufferedReader br;
        try {
            File file = new File("src/ficheros/Lista De Canciones.txt");
            if(file.exists()){
                br = new BufferedReader(new FileReader(file));
                while((linea = br.readLine()) != null){
                     modeloListaCanciones.addElement(linea);
                     lc.añadirCancion(linea);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jTabbedPane1.addTab("Inicio", jPanel1);

        listaCanciones.setModel(modeloListaCanciones);
        listaCanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaCancionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaCanciones);

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetroceder(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReproducirYPausar(evt);
            }
        });

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAvanzar(evt);
            }
        });

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonParar(evt);
            }
        });

        tituloCancion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tituloCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MIS CANCIONES");

        artistaCancion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        artistaCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        albumCancion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        albumCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        generoCancion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        generoCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton7.setText("Modificar Datos");

        jButton8.setText("jButton8");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(albumCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tituloCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(artistaCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(generoCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(tituloCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(artistaCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(albumCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generoCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Canciones", jPanel2);

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
        ListasDeReproduccion lr = new ListasDeReproduccion(null);
        lr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonIrAListasDeReproduccion

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
                new Principal().setVisible(true);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel albumCancion;
    private javax.swing.JLabel artistaCancion;
    private javax.swing.JLabel generoCancion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> listaCanciones;
    private javax.swing.JLabel tituloCancion;
    // End of variables declaration//GEN-END:variables
}
