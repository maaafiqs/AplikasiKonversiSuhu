
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class KonversiSuhuFrame extends javax.swing.JFrame {

    /**
     * Creates new form KonversiSuhuFrame
     */
    public KonversiSuhuFrame() {
        initComponents();
        konversiSuhu();
        ButtonGroup group = new ButtonGroup();
        group.add(rbToFahrenheit);
        group.add(rbToCelcius);
        group.add(rbToKelvin);
        group.add(rbToReamur);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        hasilLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputSuhu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        skalaSuhuAsal = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        konversiButton = new javax.swing.JButton();
        skalaSuhuTujuan = new javax.swing.JComboBox<>();
        rbToCelcius = new javax.swing.JRadioButton();
        rbToFahrenheit = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        rbToKelvin = new javax.swing.JRadioButton();
        rbToReamur = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        labelSkala = new javax.swing.JLabel();

        hasilLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hasilLabel.setText("hasilLabel");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 0, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APLIKASI KONVERSI SUHU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel2.setText("Masukkan Suhu");

        inputSuhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSuhuActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Hasil");

        skalaSuhuAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin", "Reamur" }));
        skalaSuhuAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skalaSuhuAsalActionPerformed(evt);
            }
        });

        jLabel6.setText("Skala Suhu Asal");

        jLabel7.setText("Skala Suhu Tujuan");

        konversiButton.setText("Konversi");
        konversiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konversiButtonActionPerformed(evt);
            }
        });

        skalaSuhuTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin", "Reamur" }));
        skalaSuhuTujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skalaSuhuTujuanActionPerformed(evt);
            }
        });

        rbToCelcius.setText("Celcius");
        rbToCelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbToCelciusActionPerformed(evt);
            }
        });

        rbToFahrenheit.setText("Fahrenheit");
        rbToFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbToFahrenheitActionPerformed(evt);
            }
        });

        jLabel8.setText("Skala Suhu (Otomatis)");

        rbToKelvin.setText("Kelvin");
        rbToKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbToKelvinActionPerformed(evt);
            }
        });

        rbToReamur.setText("Reamur");
        rbToReamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbToReamurActionPerformed(evt);
            }
        });

        labelSkala.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSkala.setText("labelHasil");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSkala, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSkala)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(konversiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(skalaSuhuAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(74, 74, 74)
                                            .addComponent(skalaSuhuTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(inputSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbToCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbToFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(rbToKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbToReamur, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skalaSuhuAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(skalaSuhuTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbToCelcius)
                    .addComponent(jLabel8)
                    .addComponent(rbToFahrenheit)
                    .addComponent(rbToKelvin)
                    .addComponent(rbToReamur))
                .addGap(18, 18, 18)
                .addComponent(konversiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void konversiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konversiButtonActionPerformed
       konversiButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        konversiSuhu(); // Memanggil metode konversi suhu saat tombol diklik
    }
    });

    }//GEN-LAST:event_konversiButtonActionPerformed

    private void inputSuhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSuhuActionPerformed
        inputSuhu.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0' && c <= '9') || c == '.' || c == '-')) {
                    e.consume();
                }
            }
        });
        
    inputSuhu.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
    @Override
    public void insertUpdate(javax.swing.event.DocumentEvent e) {
        konversiSuhuOtomatis();
    }

    @Override
    public void removeUpdate(javax.swing.event.DocumentEvent e) {
        konversiSuhuOtomatis();
    }

    @Override
    public void changedUpdate(javax.swing.event.DocumentEvent e) {
        konversiSuhuOtomatis();
    }
});

     
    }//GEN-LAST:event_inputSuhuActionPerformed

    private void skalaSuhuTujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skalaSuhuTujuanActionPerformed
        konversiSuhu();        // TODO add your handling code here:
    }//GEN-LAST:event_skalaSuhuTujuanActionPerformed

    private void rbToCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbToCelciusActionPerformed
        rbToCelcius.addItemListener(new java.awt.event.ItemListener() {
    public void itemStateChanged(java.awt.event.ItemEvent evt) {
        if (rbToCelcius.isSelected()) {
            labelSkala.setText("Konversi: Fahrenheit ke Celsius");
            konversiSuhuOtomatis(); // Panggil metode konversi otomatis
        }
    }
});        // TODO add your handling code here:
    }//GEN-LAST:event_rbToCelciusActionPerformed

    private void rbToFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbToFahrenheitActionPerformed
        rbToFahrenheit.addItemListener(new java.awt.event.ItemListener() {
    public void itemStateChanged(java.awt.event.ItemEvent evt) {
        if (rbToFahrenheit.isSelected()) {
            labelSkala.setText("Konversi: Celsius ke Fahrenheit");
            konversiSuhuOtomatis(); // Panggil metode konversi otomatis
        }
    }
});        // TODO add your handling code here:
    }//GEN-LAST:event_rbToFahrenheitActionPerformed

    private void rbToKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbToKelvinActionPerformed
        rbToKelvin.addItemListener(new java.awt.event.ItemListener() {
    public void itemStateChanged(java.awt.event.ItemEvent evt) {
        if (rbToKelvin.isSelected()) {
            labelSkala.setText("Konversi: Celsius ke Kelvin");
            konversiSuhuOtomatis();
        }
    }
});        // TODO add your handling code here:
    }//GEN-LAST:event_rbToKelvinActionPerformed

    private void rbToReamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbToReamurActionPerformed
        rbToReamur.addItemListener(new java.awt.event.ItemListener() {
    public void itemStateChanged(java.awt.event.ItemEvent evt) {
        if (rbToReamur.isSelected()) {
            labelSkala.setText("Konversi: Celsius ke Reamur");
            konversiSuhuOtomatis();
        }
    }
});        // TODO add your handling code here:
    }//GEN-LAST:event_rbToReamurActionPerformed

    private void skalaSuhuAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skalaSuhuAsalActionPerformed
        konversiSuhu();     // TODO add your handling code here:
    }//GEN-LAST:event_skalaSuhuAsalActionPerformed
 


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
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhuFrame().setVisible(true);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel hasilLabel;
    private javax.swing.JTextField inputSuhu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton konversiButton;
    private javax.swing.JLabel labelSkala;
    private javax.swing.JRadioButton rbToCelcius;
    private javax.swing.JRadioButton rbToFahrenheit;
    private javax.swing.JRadioButton rbToKelvin;
    private javax.swing.JRadioButton rbToReamur;
    private javax.swing.JComboBox<String> skalaSuhuAsal;
    private javax.swing.JComboBox<String> skalaSuhuTujuan;
    // End of variables declaration//GEN-END:variables
private void konversiSuhu() {
       try {
        // Cek apakah input suhu valid
        String input = inputSuhu.getText().trim();
        if (input.isEmpty()) {
            hasilLabel.setText("Input suhu kosong");
            return;
        }

        double suhu = Double.parseDouble(input);
        String skalaAsal = (String) skalaSuhuAsal.getSelectedItem();
        String skalaTujuan = (String) skalaSuhuTujuan.getSelectedItem();

        // Pastikan skala suhu asal dan tujuan dipilih
        if (skalaAsal == null || skalaTujuan == null) {
            hasilLabel.setText("Skala suhu belum dipilih");
            return;
        }

        double hasil = 0;

        // Konversi ke Celsius terlebih dahulu
        if (skalaAsal.equals("Fahrenheit")) {
            suhu = (suhu - 32) * 5/9;
        } else if (skalaAsal.equals("Kelvin")) {
            suhu = suhu - 273.15;
        } else if (skalaAsal.equals("Reamur")) {
            suhu = suhu * 5/4;
        }

        // Konversi dari Celsius ke skala tujuan
        if (skalaTujuan.equals("Celsius")) {
            hasil = suhu;
        } else if (skalaTujuan.equals("Fahrenheit")) {
            hasil = (suhu * 9/5) + 32;
        } else if (skalaTujuan.equals("Kelvin")) {
            hasil = suhu + 273.15;
        } else if (skalaTujuan.equals("Reamur")) {
            hasil = suhu * 4/5;
        }

        // Tampilkan hasil konversi
        hasilLabel.setText(String.format("%.2f %s", hasil, skalaTujuan));
    } catch (NumberFormatException ex) {
        // Menangani input yang tidak valid
        hasilLabel.setText("Input tidak valid");
    }
    }

private void konversiSuhuOtomatis() {
    try {
        // Ambil nilai input suhu
        double suhuInput = Double.parseDouble(inputSuhu.getText());
        double hasil = 0.0;
        
        // Lakukan konversi berdasarkan arah yang dipilih
        if (rbToFahrenheit.isSelected()) {
            hasil = (suhuInput * 9/5) + 32; // Celsius ke Fahrenheit
        } else if (rbToCelcius.isSelected()) {
            hasil = (suhuInput - 32) * 5/9; // Fahrenheit ke Celsius
        } else if (rbToKelvin.isSelected()) {
            hasil = suhuInput + 273.15; // Celsius ke Kelvin
        } else if (rbToReamur.isSelected()) {
            hasil = suhuInput * 4/5; // Celsius ke Reamur
        }

        // Tampilkan hasil
        labelSkala.setText("Hasil: " + hasil);
    } catch (NumberFormatException e) {
        labelSkala.setText("Input tidak valid! Masukkan angka saja.");
    }
}
}

