package interfaz;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jlgui.basicplayer.*;
import reproductor.Cancion;
import reproductor.CancionArbolAVL;
import reproductor.ListaDeCanciones;
import reproductor.ListaDeReproduccion;
import reproductor.NodoCancionArbolAVL;

public class Principal extends javax.swing.JFrame {

    public Principal(Cancion c, Integer i, ListaDeCanciones lc, ArrayList<ListaDeReproduccion> listasDeReproduccion) {
        modeloListaCanciones = new DefaultListModel();
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        player = new BasicPlayer();

        this.listasDeReproduccion = listasDeReproduccion;

        if (lc == null) {
            this.lc = new ListaDeCanciones();
        } else {
            this.lc = lc;
        }

        cont = 0;
        arbol = new CancionArbolAVL();

        if (lc == null) {
            BufferedReader br;
            try {
                File file = new File("src/ficheros/Lista De Canciones.txt");
                if (file.exists()) {
                    br = new BufferedReader(new FileReader(file));
                    while ((linea = br.readLine()) != null) {
                        cont++;
                        modeloListaCanciones.addElement(cont + "." + linea);
                        Cancion cancion = new Cancion(linea);
                        this.lc.añadirCancion(cancion);
                        cancion.setId(cont);
                        cancion.setNombre(linea);

                        nodoArbol = new NodoCancionArbolAVL(cont);
                        nodoArbol.setSong(cancion);
                        arbol.Insertar(nodoArbol);
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Cancion cancionAux;
            do {
                cont++;
                cancionAux = lc.recorrerLista();

                if (cancionAux != null) {
                    modeloListaCanciones.addElement(cont + "." + cancionAux.getNombre());
                    nodoArbol = new NodoCancionArbolAVL(cont);
                    nodoArbol.setSong(cancionAux);
                    arbol.Insertar(nodoArbol);
                }
            } while (cancionAux != null);
        }

        /*
        arbol.InOrden(arbol.ObtenerRaiz());
        System.out.println("");
        arbol.PreOrden(arbol.ObtenerRaiz());
        System.out.println("");
        arbol.PostOrden(arbol.ObtenerRaiz());
         */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        botonAgregar = new javax.swing.JButton();
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
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Kristen ITC", 1, 16)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        botonAgregar.setBackground(new java.awt.Color(255, 153, 102));
        botonAgregar.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        botonAgregar.setText("Agregar Canción");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarCancion(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 102));
        jButton2.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jButton2.setText("Listas De Reproducción");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIrAListasDeReproduccion(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        jTabbedPane1.addTab("Inicio", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(439, 439));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaCanciones.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        listaCanciones.setModel(modeloListaCanciones);
        listaCanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaCancionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaCanciones);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 51, 197, 207));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anterior.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetroceder(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 39, 39));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReproducirYPausar(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 39, 39));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/siguiente.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAvanzar(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 39, 39));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stop.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonParar(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 39, 39));

        tituloCancion.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        tituloCancion.setForeground(new java.awt.Color(255, 255, 255));
        tituloCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(tituloCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 230, 24));

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MIS CANCIONES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 17, 159, 22));

        artistaCancion.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        artistaCancion.setForeground(new java.awt.Color(255, 255, 255));
        artistaCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(artistaCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 160, 24));

        albumCancion.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        albumCancion.setForeground(new java.awt.Color(255, 255, 255));
        albumCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(albumCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 160, 24));

        generoCancion.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        generoCancion.setForeground(new java.awt.Color(255, 255, 255));
        generoCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(generoCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 170, 30));

        jButton7.setBackground(new java.awt.Color(255, 153, 102));
        jButton7.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Modificar Datos");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarDatos(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 160, 30));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aleatorio.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAleatorio(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 39, 39));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/audiocolores.gif"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 130, 150));

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

    private void botonModificarDatos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarDatos
        int aux;
        int opcion = 0;

        if (lcAux == null) {
            do {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Digite el número de la canción que desea modificar:"));
                    if (opcion <= lc.getSize()) {
                        aux = 1;
                    } else {
                        aux = 0;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(rootPane, "Dato incorrecto");
                    aux = 0;
                }
            } while (aux == 0);

            NodoCancionArbolAVL nodoArbolAux = arbol.buscar(opcion, arbol.ObtenerRaiz());
            Cancion cancion = nodoArbolAux.getSong();
            modificarDatosCancion m = new modificarDatosCancion(cancion, cancion.getId(), this.lc, this.listasDeReproduccion);
            m.setVisible(true);
            this.dispose();

        } else {
            do {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Digite el número de la canción que desea modificar:"));
                    if (opcion <= lcAux.getSize()) {
                        aux = 1;
                    } else {
                        aux = 0;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(rootPane, "Dato incorrecto");
                    aux = 0;
                }
            } while (aux == 0);

            NodoCancionArbolAVL nodoArbolAux2 = arbolAux.buscar(opcion, arbolAux.ObtenerRaiz());
            Cancion cancion = nodoArbolAux2.getSong();
            modificarDatosCancion m = new modificarDatosCancion(cancion, cancion.getId(), this.lcAux, this.listasDeReproduccion);
            m.setVisible(true);
            this.dispose();
        }
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
        if (listaCanciones.getSelectedIndex() != -1) {
            String x;
            if (lcAux == null) {
                x = lc.avanzar();
                if (!x.equals("final")) {
                    reproducir(x, lc);
                } else {
                    System.out.println("Ya no hay canciones delante");
                }
            } else {
                x = lcAux.avanzar();
                if (!x.equals("final")) {
                    reproducir(x, lcAux);
                } else {
                    System.out.println("Ya no hay canciones delante");
                }
            }
        }
        mostrarDatosCancion();
    }//GEN-LAST:event_botonAvanzar

    private void botonReproducirYPausar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReproducirYPausar
        if (lcAux == null) {
            reproducir(null, lc);
        } else {
            reproducir(null, lcAux);
        }
    }//GEN-LAST:event_botonReproducirYPausar

    private void botonRetroceder(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetroceder
        listaCanciones.setSelectedIndex(listaCanciones.getSelectedIndex() - 1);
        if (listaCanciones.getSelectedIndex() != -1) {
            String x;
            if (lcAux == null) {
                x = lc.retroceder();
                if (!x.equals("inicial")) {
                    reproducir(x, lc);
                } else {
                    System.out.println("Ya no hay canciones atras");
                }
            } else {
                x = lcAux.retroceder();
                if (!x.equals("inicial")) {
                    reproducir(x, lcAux);
                } else {
                    System.out.println("Ya no hay canciones atras");
                }
            }
        }
        mostrarDatosCancion();
    }//GEN-LAST:event_botonRetroceder

    private void listaCancionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCancionesMouseClicked
        mostrarDatosCancion();
    }//GEN-LAST:event_listaCancionesMouseClicked

    private void botonIrAListasDeReproduccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIrAListasDeReproduccion
        ListasDeReproduccion lr = new ListasDeReproduccion(this.listasDeReproduccion, this.lc);
        lr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonIrAListasDeReproduccion

    private void botonAgregarCancion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCancion
        cont++;

        JFileChooser archivo = new JFileChooser("E:\\UPITTA\\3er Semestre\\Estructura De Datos\\ProyectoFinal");
        archivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Audios mp3", "mp3");
        archivo.setFileFilter(filter);
        archivo.showOpenDialog(rootPane);
        String file = archivo.getSelectedFile().getAbsolutePath();
        nombre = archivo.getName(archivo.getSelectedFile()).replace(".mp3", "");
        modeloListaCanciones.addElement(cont + "." + nombre);

        int contador = 0;

        try {
            FileInputStream fis = new FileInputStream(file);
            while (true) {
                int byteEntrada = fis.read();
                contador++;
                if (byteEntrada == -1) {
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
            while (true) {
                int byteEntrada = fis.read();
                if (byteEntrada != -1) {
                    bytes[contador] = byteEntrada;
                }
                contador++;
                if (byteEntrada == -1) {
                    break;
                }
            }
            
            Cancion cancion = new Cancion(nombre);
            cancion.setId(cont);
            lc.añadirCancion(cancion);

            nodoArbol = new NodoCancionArbolAVL(cont);
            nodoArbol.setSong(cancion);
            arbol.Insertar(nodoArbol);
            /*
            arbol.InOrden(arbol.ObtenerRaiz());
            System.out.println("");
            arbol.PreOrden(arbol.ObtenerRaiz());
            System.out.println("");
            arbol.PostOrden(arbol.ObtenerRaiz());
             */
            bw.write(nombre + "\n");
            fis.close();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

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

    private void botonAleatorio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAleatorio
        Random r = new Random();
        int aleatorios[] = new int[lc.getSize()];

        while (true) {
            int random = r.nextInt(lc.getSize() + 1);
            if (aleatorios[lc.getSize() - 1] == 0) {
                if (random != 0) {
                    for (int i = 0; i < lc.getSize(); i++) {
                        if (random == aleatorios[i]) {
                            break;
                        }
                        if (aleatorios[i] == 0) {
                            aleatorios[i] = random;
                            break;
                        }
                    }
                }
            } else {
                break;
            }
        }

        modeloListaCanciones.clear();
        lcAux = new ListaDeCanciones();
        arbolAux = new CancionArbolAVL();

        int cont = 0;

        for (int i = 0; i < aleatorios.length; i++) {
            cont++;
            Cancion cancion = lc.buscarPorId(aleatorios[i]);
            lcAux.añadirCancion(cancion);
            nodoArbolAux = new NodoCancionArbolAVL(i + 1);
            nodoArbolAux.setSong(cancion);
            arbolAux.Insertar(nodoArbolAux);
            modeloListaCanciones.addElement(cont + "." + cancion.getNombre());
        }
    }//GEN-LAST:event_botonAleatorio

    public void reproducir(String cancionAReproducir, ListaDeCanciones tipoLista) {
        int start;
        try {
            int num = Integer.parseInt(listaCanciones.getSelectedValue().substring(0, 2));
            start = 3;
        } catch (NumberFormatException e) {
            start = 2;
        }

        if (listaCanciones.getSelectedIndex() != -1) {
            try {
                if (!cancionActual.equals(listaCanciones.getSelectedValue().substring(start))) {
                    player.stop();
                    System.out.println("CANCIÓN PARADA");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (cancionAReproducir == null) {
                aux = tipoLista.buscarCancion(listaCanciones.getSelectedValue().substring(start)).getNombre();
            } else {
                aux = cancionAReproducir;
            }

            try {
                if (player.getStatus() == BasicPlayer.PLAYING && cancionActual.equals(listaCanciones.getSelectedValue().substring(start))) {
                    player.pause();
                    System.out.println("CANCIÓN PAUSADA");
                } else if (player.getStatus() != BasicPlayer.PLAYING && player.getStatus() != BasicPlayer.PAUSED) {
                    player.open(new File("src/audio/" + aux + ".mp3"));
                    player.play();
                    cancionActual = aux;
                    System.out.println("REPRODUCIENDO");
                } else if (player.getStatus() == BasicPlayer.PAUSED) {
                    player.resume();
                    System.out.println("REPRODUCIENDO DE NUEVO");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void mostrarDatosCancion() {
        int start;
        try {
            int num = Integer.parseInt(listaCanciones.getSelectedValue().substring(0, 2));
            start = 3;
        } catch (NumberFormatException e) {
            start = 2;
        }

        String cancion = listaCanciones.getSelectedValue().substring(start);
        Cancion cancion2 = lc.buscarCancion(cancion);

        tituloCancion.setText("Titulo: " + cancion2.getNombre());

        if (cancion2.getArtista() == null) {
            artistaCancion.setText("\nArtista: Desconocido");
        } else {
            artistaCancion.setText("\nArtista: " + cancion2.getArtista());
        }

        if (cancion2.getAlbum() == null) {
            albumCancion.setText("\nÁlbum: Desconocido");
        } else {
            albumCancion.setText("\nAlbúm: " + cancion2.getAlbum());
        }

        if (cancion2.getGenero() == null) {
            generoCancion.setText("\nGénero: Desconocido");
        } else {
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
                new Principal(null, null, null, null).setVisible(true);
            }
        });
    }

    public static DefaultListModel modeloListaCanciones;
    public static DefaultListModel modeloListaRep;
    public static DefaultListModel modeloCancionesListaRep;
    HashMap modificados[];
    int numTotalLista;
    HashMap map;
    public BasicPlayer player;
    ArrayList<ListaDeReproduccion> listasDeReproduccion;
    String nombre;
    boolean done;
    String nombreLista;
    String linea, cancionActual = "";
    ListaDeCanciones lc;
    ListaDeCanciones lcAux;
    String aux;
    int cont;
    NodoCancionArbolAVL nodoArbol;
    CancionArbolAVL arbol;
    NodoCancionArbolAVL nodoArbolAux;
    CancionArbolAVL arbolAux;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel albumCancion;
    private javax.swing.JLabel artistaCancion;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JLabel generoCancion;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> listaCanciones;
    private javax.swing.JLabel tituloCancion;
    // End of variables declaration//GEN-END:variables
}
