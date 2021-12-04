package interfaz;

import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javazoom.jlgui.basicplayer.BasicPlayer;
import reproductor.ListaDeCanciones;
import reproductor.ListaDeReproduccion;

public class ReproductorListaDeReproduccion extends javax.swing.JFrame {

    public ReproductorListaDeReproduccion(String nombreLista, ArrayList<ListaDeReproduccion> listasDeReproduccion) {
        modeloListaDeReproduccion = new DefaultListModel();
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        player = new BasicPlayer();
        
        this.listasDeReproduccion = listasDeReproduccion;
        
        lc = new ListaDeCanciones();
        
        for (int i = 0; i < listasDeReproduccion.size(); i++) {
            lrep = listasDeReproduccion.get(i);
            if(nombreLista.equals(lrep.getNombreLista())){
                break;
            }
        }
        
        while(true){
            String cancion = lrep.recorrerListaDeReproduccion();
            if(cancion != null){
                System.out.println("+++++++++++++++" + cancion);
                modeloListaDeReproduccion.addElement(cancion);
            }else{
                break;
            }
        }
    }

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
                aux = lrep.getCola().buscarCancion(listaCanciones.getSelectedValue()).getNombre();
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCanciones = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaCanciones.setModel(modeloListaDeReproduccion);
        jScrollPane1.setViewportView(listaCanciones);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetroceder(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReproducirYPausar(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAvanzar(evt);
            }
        });

        jButton4.setText("jButton4");

        jButton5.setText("Regresar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresar(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
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

    private void botonReproducirYPausar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReproducirYPausar
        reproducir(null);
    }//GEN-LAST:event_botonReproducirYPausar

    private void botonAvanzar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAvanzar
        listaCanciones.setSelectedIndex(listaCanciones.getSelectedIndex() + 1);
        if(listaCanciones.getSelectedIndex() != -1){
            //System.out.println("DEVUELVE: " + lc.avanzar());
            String x = lrep.getCola().avanzar();
            if(!x.equals("final")){
                System.out.println(x);
                reproducir(x);
            }else{
                System.out.println("Ya no hay canciones delante");
            }
        }
    }//GEN-LAST:event_botonAvanzar

    private void botonRetroceder(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetroceder
        listaCanciones.setSelectedIndex(listaCanciones.getSelectedIndex() - 1);
        if(listaCanciones.getSelectedIndex() != -1){
            //System.out.println("DEVUELVE: " + lc.retroceder());
            String x = lrep.getCola().retroceder();
            if(!x.equals("inicial")){
                System.out.println(x);
                reproducir(x);
            }else{
                System.out.println("Ya no hay canciones atras");
            }
        }
    }//GEN-LAST:event_botonRetroceder

    private void botonRegresar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresar
        ListasDeReproduccion l = new ListasDeReproduccion(this.listasDeReproduccion, null);
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonRegresar

    BasicPlayer player;
    ArrayList<ListaDeReproduccion> listasDeReproduccion;
    String nombre;
    String nombreLista;
    String linea, cancionActual = "";
    ListaDeCanciones lc;
    ListaDeReproduccion lrep;
    String aux;
    DefaultListModel modeloListaDeReproduccion;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaCanciones;
    // End of variables declaration//GEN-END:variables
}
