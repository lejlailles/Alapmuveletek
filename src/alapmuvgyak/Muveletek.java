package alapmuvgyak;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Muveletek extends javax.swing.JFrame {

    String mentettFajl;
    int osztasKerdes = 0;
    int osztasProba = 0;

    public Muveletek() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlGyakorlas = new javax.swing.JPanel();
        lblFeladat = new javax.swing.JLabel();
        txtEredmeny = new javax.swing.JTextField();
        btnEllenorzes = new javax.swing.JButton();
        lblValasz = new javax.swing.JLabel();
        btnUj = new javax.swing.JButton();
        btnMegoldas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblOsszKerdes = new javax.swing.JLabel();
        lblOsszProba = new javax.swing.JLabel();
        lblEredmeny = new javax.swing.JLabel();
        lblOsszeadKerdes = new javax.swing.JLabel();
        lblKivonasKerdes = new javax.swing.JLabel();
        lblOsztasKerdes = new javax.swing.JLabel();
        lblSzorzasKerdes = new javax.swing.JLabel();
        lblOsszeadProba = new javax.swing.JLabel();
        lblKivonasProba = new javax.swing.JLabel();
        lblOsztasProba = new javax.swing.JLabel();
        lblSzorzasProba = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFajl = new javax.swing.JMenu();
        mnuFajlMegnyit = new javax.swing.JMenuItem();
        mnuFajlMent = new javax.swing.JMenuItem();
        mnuMentMaskent = new javax.swing.JCheckBoxMenuItem();
        sep1 = new javax.swing.JPopupMenu.Separator();
        mnuFajlKilep = new javax.swing.JMenuItem();
        mnMuvelet = new javax.swing.JMenu();
        mnMuveletOsszeadas = new javax.swing.JRadioButtonMenuItem();
        mnMuveletKivonás = new javax.swing.JRadioButtonMenuItem();
        mnMuveletSzorzas = new javax.swing.JRadioButtonMenuItem();
        mnMuveletOsztas = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alapműveletek gyakoroltatása");

        pnlGyakorlas.setBorder(javax.swing.BorderFactory.createTitledBorder("Gyakorlás"));

        lblFeladat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnEllenorzes.setText("Ellenőrzés");

        lblValasz.setText("visszajelzés");

        javax.swing.GroupLayout pnlGyakorlasLayout = new javax.swing.GroupLayout(pnlGyakorlas);
        pnlGyakorlas.setLayout(pnlGyakorlasLayout);
        pnlGyakorlasLayout.setHorizontalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                        .addComponent(lblFeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEllenorzes)
                .addContainerGap())
        );
        pnlGyakorlasLayout.setVerticalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFeladat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEllenorzes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnUj.setText("Új feladat");

        btnMegoldas.setText("Megoldás");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Statisztika"));

        lblOsszKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszKerdes.setText("Össz kérdések száma: 0");

        lblOsszProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszProba.setText("Össz Probálkozások száma: 0");

        lblEredmeny.setText("Eredmény: 0 %");

        lblOsszeadKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadKerdes.setText("Összeadás: 0");

        lblKivonasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasKerdes.setText("Kivonás: 0");

        lblOsztasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasKerdes.setText("Osztás: 0");

        lblSzorzasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasKerdes.setText("Szorzás: 0");

        lblOsszeadProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadProba.setText("Összeadás: 0");

        lblKivonasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasProba.setText("Kivonás: 0");

        lblOsztasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasProba.setText("Osztás: 0");

        lblSzorzasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasProba.setText("Szorzás: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEredmeny)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOsszeadKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKivonasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsztasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSzorzasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszKerdes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKivonasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSzorzasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszeadProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsztasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszProba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblKivonasKerdes, lblOsszeadKerdes, lblOsztasKerdes, lblSzorzasKerdes});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOsszKerdes)
                    .addComponent(lblOsszProba))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasKerdes))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasProba)))
                .addGap(18, 18, 18)
                .addComponent(lblEredmeny)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnuFajl.setText("Fájl");

        mnuFajlMegnyit.setText("Megnyit");
        mnuFajlMegnyit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMegnyitActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMegnyit);

        mnuFajlMent.setText("Ment");
        mnuFajlMent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMent);

        mnuMentMaskent.setText("Mentés másként");
        mnuMentMaskent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMentMaskentActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuMentMaskent);
        mnuFajl.add(sep1);

        mnuFajlKilep.setText("Kilép");
        mnuFajl.add(mnuFajlKilep);

        jMenuBar1.add(mnuFajl);

        mnMuvelet.setText("Műveletek");

        buttonGroup1.add(mnMuveletOsszeadas);
        mnMuveletOsszeadas.setText("Összeadás");
        mnMuvelet.add(mnMuveletOsszeadas);

        buttonGroup1.add(mnMuveletKivonás);
        mnMuveletKivonás.setText("Kivonás");
        mnMuvelet.add(mnMuveletKivonás);

        buttonGroup1.add(mnMuveletSzorzas);
        mnMuveletSzorzas.setText("Szorzás");
        mnMuvelet.add(mnMuveletSzorzas);

        buttonGroup1.add(mnMuveletOsztas);
        mnMuveletOsztas.setText("Osztás");
        mnMuveletOsztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMuveletOsztasActionPerformed(evt);
            }
        });
        mnMuvelet.add(mnMuveletOsztas);

        jMenuBar1.add(mnMuvelet);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUj, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMegoldas, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMegoldas))
                    .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuMentMaskentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMentMaskentActionPerformed

        JFileChooser jFileChooser1 = new JFileChooser(new File("."));
        jFileChooser1.setDialogTitle("Mentés másként: ");

        //választható fájl típusok
        jFileChooser1.setAcceptAllFileFilterUsed(false);

        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("PNG és Gif képek", "gif", "png");
        jFileChooser1.addChoosableFileFilter(imgFilter);
        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("Csak szöveg (*.txt)", "txt");
        jFileChooser1.addChoosableFileFilter(txtFilter);
        FileNameExtensionFilter ilFilter = new FileNameExtensionFilter("speciális (*.il)", "il");
        jFileChooser1.addChoosableFileFilter(ilFilter);

        jFileChooser1.setFileFilter(txtFilter);

        /*//tesztesetek: nincs név megadva, másik mappa választása, másik kiterjesztés választása, üresen marad a fájl neve, létezik a fájl kérdés nélkül felülírja, kiterjesztéssel választom a meglévő fájlt, akkor ismét mögé rakja a kiterjesztést*/
        int valasztottGomb = jFileChooser1.showSaveDialog(this);
        if (valasztottGomb == JFileChooser.APPROVE_OPTION) {
            File f = jFileChooser1.getSelectedFile();

            String[] kiterjesztes = ((FileNameExtensionFilter) jFileChooser1.getFileFilter()).getExtensions();
            String fn = f.getPath(); // + "." + kiterjesztes[0];

            /*kiterjeztés van e*/
            if (!fn.endsWith("." + kiterjesztes[0])) {
                fn += "." + kiterjesztes[0];
            }
            /*kiterjesztés van e VÉGE*/
            mentettFajl = fn;
            Path path = Paths.get(fn);
            boolean mentes = true;

            /*létezik e a fájl*/
            if (Files.exists(path)) {
                valasztottGomb = JOptionPane.showConfirmDialog(this, "Felülírjam?", "A Fájl létezik", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (valasztottGomb == JOptionPane.YES_OPTION) {
                    mentes = false;

                }
            }
            /*létezik e a fájl vége*/

//            lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>Fájl neve: " + fn + "." + kiterjesztes[0] + "</html>");
            try {
                /* tényleges kiírás */

                if (mentes) {
                    Files.write(path, tartalomOsszeallitas().getBytes());
                }
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Mentés megszakítva", "nincs mentés", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_mnuMentMaskentActionPerformed

    private void mnuFajlMentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentActionPerformed
//        JFileChooser jFileChooser1 = new JFileChooser();
//        jFileChooser1.setDialogTitle("Fájl mentése: ");
//        jFileChooser1.setCurrentDirectory(new File("."));
//        jFileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//        int valasztottGomb = jFileChooser1.showSaveDialog(this);
//        if (valasztottGomb == JFileChooser.APPROVE_OPTION) {
//            File a = jFileChooser1.getSelectedFile();
//            if (a.isDirectory()) {
//                lblEredmeny.setText("<html>Elérés: " + a.getPath() + "<br>Könyvtár" + a.getName() + "</html>");
//                try {
//                    Files.write(Paths.get(a.getPath(), "\\stat.txt"), "Statisztika: ".getBytes());
//                } catch (IOException ex) {
//                    Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//
//        }
        /*az 1. mentés során a mentés másként metódus kell*/
        if (mentettFajl == null) {

            mnuMentMaskentActionPerformed(evt);
        } else {

            try {
                /*további mentéseknél a megadott helyre és megadott néven kell menteni*/
                Files.write(Paths.get(mentettFajl), tartalomOsszeallitas().getBytes());
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_mnuFajlMentActionPerformed

    private void mnuFajlMegnyitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMegnyitActionPerformed

        JFileChooser jFileChooser1 = new JFileChooser(new File("."));
        jFileChooser1.setDialogTitle("Megnyitás: ");
        int megnyitas = jFileChooser1.showOpenDialog(this);
        File f = jFileChooser1.getSelectedFile();
        String fn = f.getPath();

        jFileChooser1.setAcceptAllFileFilterUsed(false);

        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("PNG és Gif képek", "gif", "png");
        jFileChooser1.addChoosableFileFilter(imgFilter);
        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("Csak szöveg (*.txt)", "txt");
        jFileChooser1.addChoosableFileFilter(txtFilter);
        FileNameExtensionFilter ilFilter = new FileNameExtensionFilter("speciális (*.il)", "il");
        jFileChooser1.addChoosableFileFilter(ilFilter);

        jFileChooser1.setFileFilter(txtFilter);

        if (megnyitas == JFileChooser.APPROVE_OPTION) {

//            lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>Fájl neve: " + fn + "." + "</html>");
        } else {
            JOptionPane.showMessageDialog(this, "Megnyitás megszakítva", "nincs megnyitás", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_mnuFajlMegnyitActionPerformed

//    0-100, a hányados egész, 0-val nem osztunk
    private void mnMuveletOsztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMuveletOsztasActionPerformed
        osztasKerdes += 1;
        osztasProba += 1;
        lblOsztasKerdes.setText("Osztás: " + osztasKerdes);
        lblOsztasProba.setText("Osztás: " + osztasProba);
        int osztando, oszto;
        boolean jo;
        do {
            osztando = (int) (Math.random() * 100);
            oszto = (int) (Math.random() * 99) + 1;

            jo = oszto != 0 && osztando % oszto == 0;

        } while (!jo);
  
        lblFeladat.setText(osztando+"+"+oszto+"=");


    }//GEN-LAST:event_mnMuveletOsztasActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muveletek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEllenorzes;
    private javax.swing.JButton btnMegoldas;
    private javax.swing.JButton btnUj;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEredmeny;
    private javax.swing.JLabel lblFeladat;
    private javax.swing.JLabel lblKivonasKerdes;
    private javax.swing.JLabel lblKivonasProba;
    private javax.swing.JLabel lblOsszKerdes;
    private javax.swing.JLabel lblOsszProba;
    private javax.swing.JLabel lblOsszeadKerdes;
    private javax.swing.JLabel lblOsszeadProba;
    private javax.swing.JLabel lblOsztasKerdes;
    private javax.swing.JLabel lblOsztasProba;
    private javax.swing.JLabel lblSzorzasKerdes;
    private javax.swing.JLabel lblSzorzasProba;
    private javax.swing.JLabel lblValasz;
    private javax.swing.JMenu mnMuvelet;
    private javax.swing.JRadioButtonMenuItem mnMuveletKivonás;
    private javax.swing.JRadioButtonMenuItem mnMuveletOsszeadas;
    private javax.swing.JRadioButtonMenuItem mnMuveletOsztas;
    private javax.swing.JRadioButtonMenuItem mnMuveletSzorzas;
    private javax.swing.JMenu mnuFajl;
    private javax.swing.JMenuItem mnuFajlKilep;
    private javax.swing.JMenuItem mnuFajlMegnyit;
    private javax.swing.JMenuItem mnuFajlMent;
    private javax.swing.JCheckBoxMenuItem mnuMentMaskent;
    private javax.swing.JPanel pnlGyakorlas;
    private javax.swing.JPopupMenu.Separator sep1;
    private javax.swing.JTextField txtEredmeny;
    // End of variables declaration//GEN-END:variables

    private String tartalomOsszeallitas() {
        String statisztika = "Alapműveletek gyakoroltatása statisztika: \n";
        JLabel[] lblTomb = new JLabel[]{lblOsszKerdes, lblOsszProba, lblOsszeadProba, lblOsszeadKerdes, lblKivonasKerdes, lblKivonasProba, lblOsztasKerdes, lblOsztasProba, lblSzorzasKerdes, lblSzorzasProba};
        final int HE = 3; // helyi érték 3 hegyen
        int kerdesMaxHossz = lblOsszKerdes.getText().length();
        int probaMaxHossz = lblOsszProba.getText().length();

        for (int i = 0; i < lblTomb.length; i += 2) {
            JLabel labKerdes = lblTomb[i];
            JLabel labProba = lblTomb[i + 1];
            String kerdes = labKerdes.getText();

            String formazo = "%" + (kerdesMaxHossz + HE) + "s%" + (probaMaxHossz + HE) + "s\n";
            statisztika += String.format(formazo, labKerdes.getText(), labProba.getText());
//            statisztika += labKerdes.getText() + "\t";
//            statisztika += labProba.getText() + "\n";

        }
        return statisztika;
    }
}
