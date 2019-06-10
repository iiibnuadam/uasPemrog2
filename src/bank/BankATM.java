 package bank;

import javax.swing.JOptionPane;


public class BankATM extends javax.swing.JFrame {

    String operasi;
   
    double hasil;
    String answer,MasukanAngka,noRekening;
    double saldo;
    int masukan;
    public BankATM() {
        initComponents();

        setLocationRelativeTo(this);
        lbInfo.setText("Selamat datang di ATM Bank Unlimity \nBpk. OktaAdam");
    }

    public BankATM(int saldo) {
      this.saldo =saldo;
    }
    
    private void initComponents() {

        backGround1 = new bank.BackGround();
        jPanel6 = new javax.swing.JPanel();
        jtxtTampilan2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbInfo = new javax.swing.JTextPane();
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
        btnEnter = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnCekSaldo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();
        btnAmbil = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jtxtTampilan2.setFont(new java.awt.Font("Noto Sans", 1, 36));  
        jtxtTampilan2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtTampilan2.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTampilan2ActionPerformed(evt);
            }
        });

        lbInfo.setFont(new java.awt.Font("Noto Sans", 0, 14));
        jScrollPane1.setViewportView(lbInfo);

        satu.setFont(new java.awt.Font("Tahoma", 0, 1)); 
        satu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/one.png"))); 
        satu.setText("1");  
        satu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        satu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        satu.setIconTextGap(1);
        satu.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });

        dua.setFont(new java.awt.Font("Tahoma", 0, 1)); 
        dua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/two.png")));         dua.setText("2");
        dua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaActionPerformed(evt);
            }
        });

        tiga.setFont(new java.awt.Font("Tahoma", 0, 1)); 
        tiga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/three.png"))); 
        tiga.setText("3");
        tiga.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaActionPerformed(evt);
            }
        });

        empat.setFont(new java.awt.Font("Tahoma", 0, 1)); 
        empat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/four.png"))); 
        empat.setText("4");
        empat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatActionPerformed(evt);
            }
        });

        lima.setFont(new java.awt.Font("Tahoma", 0, 1)); 
        lima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/five.png"))); 
        lima.setText("5");
        lima.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaActionPerformed(evt);
            }
        });

        enam.setFont(new java.awt.Font("Tahoma", 0, 1)); 
        enam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/six.png"))); 
        enam.setText("6");
        enam.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamActionPerformed(evt);
            }
        });

        tujuh.setFont(new java.awt.Font("Tahoma", 0, 1)); 
        tujuh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seven.png"))); 
        tujuh.setText("7");
        tujuh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });

        delapan.setFont(new java.awt.Font("Tahoma", 0, 1)); 
        delapan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eight.png"))); 
        delapan.setText("8");
        delapan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanActionPerformed(evt);
            }
        });

        sembilan.setFont(new java.awt.Font("Tahoma", 0, 1)); 
        sembilan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nine.png"))); 
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


        btnEnter.setFont(new java.awt.Font("Noto Sans", 1, 20)); 
        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/enter.png"))); 
        btnEnter.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backspace.png"))); 
        btnback.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6); 
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jtxtTampilan2)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(satu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(dua, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(tiga, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lima, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delapan)
                            .addComponent(nol, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enam, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEnter, btnback, delapan, dua, empat, enam, lima, nol, satu, sembilan, tiga, tujuh});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jtxtTampilan2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(satu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dua)
                    .addComponent(tiga))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enam)
                    .addComponent(empat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lima))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tujuh)
                    .addComponent(delapan)
                    .addComponent(sembilan))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nol)
                    .addComponent(btnEnter)
                    .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEnter, btnback, delapan, dua, empat, enam, lima, nol, satu, sembilan, tiga, tujuh}); // meletakkan button 0-9, enter, back pada jpanel16

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 36)); 
        jLabel5.setForeground(java.awt.Color.cyan); 
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); 
        jLabel5.setText("ATM Bank Unlimity"); 

        btnCekSaldo.setFont(new java.awt.Font("Noto Sans", 0, 14)); 
        btnCekSaldo.setText("Cek Saldo");
        btnCekSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekSaldoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 18)); 
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Silahkan Pilih Menu Dibawah ini :");

        btnSimpan.setFont(new java.awt.Font("Noto Sans", 0, 14));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTransfer.setFont(new java.awt.Font("Noto Sans", 0, 14));

        btnTransfer.setText("Transfer");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        btnAmbil.setFont(new java.awt.Font("Noto Sans", 0, 14)); 

        btnAmbil.setText("Ambil");
        btnAmbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmbilActionPerformed(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Noto Sans", 0, 14)); 

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 24));

        jLabel4.setForeground(java.awt.Color.cyan);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Selamat datang di");

        javax.swing.GroupLayout backGround1Layout = new javax.swing.GroupLayout(backGround1);
        backGround1.setLayout(backGround1Layout);
        backGround1Layout.setHorizontalGroup(
            backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGround1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGround1Layout.createSequentialGroup()
                        .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCekSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAmbil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGround1Layout.createSequentialGroup()
                        .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(backGround1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backGround1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(61, 61, 61))))
        );
        backGround1Layout.setVerticalGroup(
            backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGround1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGround1Layout.createSequentialGroup()
                        .addComponent(btnCekSaldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTransfer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAmbil)
                        .addGap(132, 132, 132)
                        .addComponent(btnKeluar))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(backGround1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(backGround1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }

    private void btnCekSaldoActionPerformed(java.awt.event.ActionEvent evt) {
        lbInfo.setText("Saldo Anda Saat Ini adalah : "+saldo); 
        hasil = saldo;
        saldo = hasil;
        answer = String.format(" %,.2f ",saldo);
        jtxtTampilan2.setText(answer); 
    }

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt){ 
        lbInfo.setText("Saldo Anda Saat Ini adalah : "+saldo);
        jtxtTampilan2.setText("");
        lbInfo.setText("Silahkan masukan jumlah uang yang akan disimpan !!");
        operasi="simpan"; 
        
    }

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {
        lbInfo.setText("Saldo Anda Saat Ini adalah : "+saldo+"\n"+"Silahkan Masukan No Rekening Tujuan Anda.");
        jtxtTampilan2.setText("");
        noRekening=JOptionPane.showInputDialog("Silahkan Masukan No Rekening ");
        lbInfo.setText("Silahkan masukan jumlah uang yang akan ditransfer !!");
        operasi="transfer";
       

    }

    private void btnAmbilActionPerformed(java.awt.event.ActionEvent evt) { 
        jtxtTampilan2.setText("");
        lbInfo.setText("Saldo Anda Saat Ini adalah : "+saldo+"\n"+"Silahkan masukan jumlah uang yang akan diambil !!"); 
        operasi="ambil";
        
    }

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {
       int jawab = JOptionPane.showConfirmDialog(this,"Apakah anda akan keluar dari sistem ?" , "Informasi", JOptionPane.YES_NO_OPTION);
        if (jawab == JOptionPane.YES_OPTION) { 
           dispose();
          login log=new login();
          log.setVisible(true);
            
        }      
    }

 		
    private void satuActionPerformed(java.awt.event.ActionEvent evt){
        MasukanAngka = jtxtTampilan2.getText()+ satu.getText();
        jtxtTampilan2.setText(MasukanAngka);
    }

    private void duaActionPerformed(java.awt.event.ActionEvent evt) {
        MasukanAngka = jtxtTampilan2.getText()+ dua.getText();
        jtxtTampilan2.setText(MasukanAngka);
    }

    private void tigaActionPerformed(java.awt.event.ActionEvent evt){
        MasukanAngka = jtxtTampilan2.getText()+ tiga.getText();
        jtxtTampilan2.setText(MasukanAngka);
    }
    private void empatActionPerformed(java.awt.event.ActionEvent evt){
       MasukanAngka = jtxtTampilan2.getText()+ empat.getText();
        jtxtTampilan2.setText(MasukanAngka);
    }
    private void limaActionPerformed(java.awt.event.ActionEvent evt){
       MasukanAngka = jtxtTampilan2.getText()+ lima.getText();
        jtxtTampilan2.setText(MasukanAngka);
    }
    private void enamActionPerformed(java.awt.event.ActionEvent evt) {
        MasukanAngka = jtxtTampilan2.getText()+ enam.getText();
        jtxtTampilan2.setText(MasukanAngka);
    }
    private void tujuhActionPerformed(java.awt.event.ActionEvent evt){
        MasukanAngka = jtxtTampilan2.getText()+ tujuh.getText();
        jtxtTampilan2.setText(MasukanAngka);
    }
    private void delapanActionPerformed(java.awt.event.ActionEvent evt) {
        MasukanAngka = jtxtTampilan2.getText()+ delapan.getText();
        jtxtTampilan2.setText(MasukanAngka);
    }
    private void sembilanActionPerformed(java.awt.event.ActionEvent evt) {
      MasukanAngka = jtxtTampilan2.getText()+ sembilan.getText();
        jtxtTampilan2.setText(MasukanAngka);
    }
    private void nolActionPerformed(java.awt.event.ActionEvent evt) {
       MasukanAngka = jtxtTampilan2.getText()+ nol.getText();
        jtxtTampilan2.setText(MasukanAngka);
    }
    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {
        masukan = Integer.parseInt(jtxtTampilan2.getText());
       
        if (operasi =="simpan") { 
            hasil = saldo + masukan;
            saldo=hasil;
            answer = String.format(" %,.2f ",saldo);
            jtxtTampilan2.setText(answer);
            lbInfo.setText("Saldo Anda Saat Ini adalah : "+saldo);
        }
        else if (operasi =="transfer") { 
            if (saldo < masukan) {
                lbInfo.setText("Maaf saldo anda tidak mencukupi untuk melakukan transfer !!!"+ 
                        "\n"+"Saldo Anda Saat Ini adalah : "+saldo);
                jtxtTampilan2.setText("0");
            } else if (saldo >= masukan) {
                hasil = saldo - masukan;
                saldo=hasil;
                answer = String.format(" %,.2f ", hasil);
                jtxtTampilan2.setText(answer);
                
                lbInfo.setText("Saldo Anda Saat Ini adalah : "+saldo+ 
                        "\n"+ "Berhasil transfer ke No Rekening : "+noRekening+" \n sebesar :"+ masukan);
             }
        
        }
        else if (operasi =="ambil") { 
            if (saldo < masukan) {
                lbInfo.setText("Maaf saldo anda tidak mencukupi untuk pengambilan !!!"+ "\n"+"Saldo Anda Saat Ini adalah : "+saldo);
                jtxtTampilan2.setText("0");
            } else if (saldo >= masukan) {
                hasil = saldo - masukan;
                saldo=hasil;
                answer = String.format(" %,.2f ", hasil);
                jtxtTampilan2.setText(answer);
                
                lbInfo.setText("Saldo Anda Saat Ini adalah : "+saldo+ "\n"+ "Anda Berhasil mengambil sebesar :"+ masukan);
             }
       
        } else {
            
        JOptionPane.showMessageDialog(null," Data yang anda masukan salah. Ulangi lagi!!!"); 
        }

    }

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt){
        String ops = String.valueOf(jtxtTampilan2.getText());
        ops = ops.substring(0, ops.length()-1);
        jtxtTampilan2.setText(ops);

    } 
    private void jtxtTampilan2ActionPerformed(java.awt.event.ActionEvent evt) {        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankATM().setVisible(true);
            }
        });
    }

    private bank.BackGround backGround1;
    private javax.swing.JButton btnAmbil;
    private javax.swing.JButton btnCekSaldo;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JButton btnback;
    private javax.swing.JButton delapan;
    private javax.swing.JButton dua;
    private javax.swing.JButton empat;
    private javax.swing.JButton enam;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxtTampilan2;
    private javax.swing.JTextPane lbInfo;
    private javax.swing.JButton lima;
    private javax.swing.JButton nol;
    private javax.swing.JButton satu;
    private javax.swing.JButton sembilan;
    private javax.swing.JButton tiga;
    private javax.swing.JButton tujuh;
}
