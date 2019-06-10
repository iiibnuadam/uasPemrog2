package bank;

import java.awt.*;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {
    
   double hasil;
   String operasi,MasukanAngka;
   
    public login() {
        initComponents();
        txtPass.requestFocus(true);
        setLocationRelativeTo(this);
        setExtendedState(MAXIMIZED_BOTH); 
        txtPass.setVisible(false);
        
    }
   
    private void tampilStar(){
        MasukanAngka = txtPass.getText();
        int panjang=0;
        panjang = MasukanAngka.length();
        if (panjang==0) {
            pass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/question.png")));
            pass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/question.png")));
            pass3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/question.png")));
            pass4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/question.png")));
            pass5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/question.png")));
            pass6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/question.png")));
        }else if (panjang==1) {
            pass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
        }else if (panjang==2) {
            pass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
            pass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
        }else if (panjang==3) {
            pass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
            pass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
            pass3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
        }else if (panjang==4) {
            pass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
            pass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
            pass3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
            pass4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
        }else if (panjang==5) {
            pass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
            pass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
            pass3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
            pass4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
            pass5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
        }else{
            pass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
            pass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
            pass3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
            pass4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
            pass5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
            pass6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/star.png")));
        }
        
       
    }
   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        backGround1 = new bank.BackGround();
        jPanel3 = new javax.swing.JPanel();
        satu = new javax.swing.JButton();
        dua = new javax.swing.JButton();
        tiga = new javax.swing.JButton();
        empat = new javax.swing.JButton();
        lima = new javax.swing.JButton();
        enam = new javax.swing.JButton();
        tujuh = new javax.swing.JButton();
        delapan = new javax.swing.JButton();
        sembilan = new javax.swing.JButton();
        nol = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pass1 = new javax.swing.JLabel();
        pass2 = new javax.swing.JLabel();
        pass3 = new javax.swing.JLabel();
        pass4 = new javax.swing.JLabel();
        pass5 = new javax.swing.JLabel();
        pass6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        
        setLocation(200,200);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        satu.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        satu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/one.png"))); // NOI18N
        satu.setText("1");
        satu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        satu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        satu.setIconTextGap(1);
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });

        dua.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        dua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/two.png"))); // NOI18N
        dua.setText("2");
        dua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaActionPerformed(evt);
            }
        });

        tiga.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        tiga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/three.png"))); // NOI18N
        tiga.setText("3");
        tiga.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaActionPerformed(evt);
            }
        });

        empat.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        empat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/four.png"))); // NOI18N
        empat.setText("4");
        empat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatActionPerformed(evt);
            }
        });

        lima.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        lima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/five.png"))); // NOI18N
        lima.setText("5");
        lima.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaActionPerformed(evt);
            }
        });

        enam.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        enam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/six.png"))); // NOI18N
        enam.setText("6");
        enam.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamActionPerformed(evt);
            }
        });

        tujuh.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        tujuh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seven.png"))); // NOI18N
        tujuh.setText("7");
        tujuh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });

        delapan.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        delapan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eight.png"))); // NOI18N
        delapan.setText("8");
        delapan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanActionPerformed(evt);
            }
        });

        sembilan.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sembilan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nine.png"))); // NOI18N
        sembilan.setText("9");
        sembilan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanActionPerformed(evt);
            }
        });

        nol.setFont(new java.awt.Font("Tahoma", 0, 1)); 
        nol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/zero.png"))); 
        nol.setText("0");
        nol.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 48)); 
        clear.setForeground(new java.awt.Color(21, 96, 227));
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Noto Sans", 1, 20)); 
        btnLogin.setForeground(new java.awt.Color(21, 96, 227));
        btnLogin.setText("Enter");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(satu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lima, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(enam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(dua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1)
                                .addComponent(tiga, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delapan)
                            .addComponent(nol, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLogin, clear, delapan, dua, empat, enam, lima, nol, satu, sembilan, tiga, tujuh});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(satu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dua)
                    .addComponent(tiga))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lima)
                    .addComponent(enam)
                    .addComponent(empat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tujuh)
                    .addComponent(delapan)
                    .addComponent(sembilan))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nol)
                    .addComponent(btnLogin))
                .addGap(11, 11, 11))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLogin, clear, delapan, dua, empat, enam, lima, nol, satu, sembilan, tiga, tujuh});

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 18)); 
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Silahkan Masukan PIN Anda");

        pass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/question.png"))); 

        pass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/question.png"))); 
        
        pass3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/question.png"))); 

        pass4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/question.png"))); 

        pass5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/question.png"))); 

        pass6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/question.png"))); 

        jLabel7.setText("PIN: 123456");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 24)); 
        jLabel4.setForeground(java.awt.Color.cyan);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Selamat datang di");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 36)); 
        jLabel5.setForeground(java.awt.Color.cyan);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ATM Bank Unlimity");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); 
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backGround1Layout = new javax.swing.GroupLayout(backGround1);
        backGround1.setLayout(backGround1Layout);
        backGround1Layout.setHorizontalGroup(
            backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGround1Layout.createSequentialGroup()
                .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backGround1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backGround1Layout.createSequentialGroup()
                                .addComponent(pass1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pass2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pass3)
                                .addGap(32, 32, 32)
                                .addComponent(pass4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pass5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pass6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backGround1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(531, Short.MAX_VALUE))
            .addGroup(backGround1Layout.createSequentialGroup()
                .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGround1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backGround1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        backGround1Layout.setVerticalGroup(
            backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGround1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGround1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(backGround1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pass4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pass3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pass5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pass2)
                        .addComponent(pass1))
                    .addComponent(pass6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        if (txtPass.getText().equals("123456")) {
        // Bila Login Sukses Maka Masuk Menu Utama
        new BankATM().show();
        this.dispose(); }
        else {
        // Bila Login Gagal Maka Ulangi Login
        JOptionPane.showMessageDialog(rootPane, "<error> Password Salah, Silahkan Coba Lagi");
        txtPass.setText("");
        txtPass.requestFocus(); }
       
    }

    private void satuActionPerformed(java.awt.event.ActionEvent evt) {
       MasukanAngka = txtPass.getText()+ satu.getText();
       txtPass.setText(MasukanAngka);
       tampilStar();
    }

    private void duaActionPerformed(java.awt.event.ActionEvent evt) {
        MasukanAngka = txtPass.getText()+ dua.getText();
        txtPass.setText(MasukanAngka);
        tampilStar();
    }

    private void tigaActionPerformed(java.awt.event.ActionEvent evt) {
        MasukanAngka = txtPass.getText()+ tiga.getText();
        txtPass.setText(MasukanAngka);
        tampilStar();
    }

    private void empatActionPerformed(java.awt.event.ActionEvent evt) {
        MasukanAngka = txtPass.getText()+ empat.getText();
        txtPass.setText(MasukanAngka);
        tampilStar();
    }

    private void limaActionPerformed(java.awt.event.ActionEvent evt) {
        txtPass.setText(MasukanAngka);
        tampilStar();
    }

    private void enamActionPerformed(java.awt.event.ActionEvent evt) {
        MasukanAngka = txtPass.getText()+ enam.getText();
        txtPass.setText(MasukanAngka);
        tampilStar();
    }

    private void tujuhActionPerformed(java.awt.event.ActionEvent evt) {
        MasukanAngka = txtPass.getText()+ tujuh.getText();
        txtPass.setText(MasukanAngka);
        tampilStar();
    }

    private void delapanActionPerformed(java.awt.event.ActionEvent evt) {
        MasukanAngka = txtPass.getText()+ delapan.getText();
        txtPass.setText(MasukanAngka);
        tampilStar();
    }

    private void sembilanActionPerformed(java.awt.event.ActionEvent evt) {
        MasukanAngka = txtPass.getText()+ sembilan.getText();
        txtPass.setText(MasukanAngka);
        tampilStar();
    }

    private void nolActionPerformed(java.awt.event.ActionEvent evt) {
        MasukanAngka = txtPass.getText()+ nol.getText();
        txtPass.setText(MasukanAngka);
        tampilStar();
    }

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {
      
        txtPass.setText("");
       
        tampilStar();
    }

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        login log = new login();
        log.dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    
    private bank.BackGround backGround1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton clear;
    private javax.swing.JButton delapan;
    private javax.swing.JButton dua;
    private javax.swing.JButton empat;
    private javax.swing.JButton enam;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton lima;
    private javax.swing.JButton nol;
    private javax.swing.JLabel pass1;
    private javax.swing.JLabel pass2;
    private javax.swing.JLabel pass3;
    private javax.swing.JLabel pass4;
    private javax.swing.JLabel pass5;
    private javax.swing.JLabel pass6;
    private javax.swing.JButton satu;
    private javax.swing.JButton sembilan;
    private javax.swing.JButton tiga;
    private javax.swing.JButton tujuh;
    private javax.swing.JPasswordField txtPass;
}