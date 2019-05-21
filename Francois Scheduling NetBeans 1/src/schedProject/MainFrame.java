package schedProject;

import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Francois
 */
public class MainFrame extends javax.swing.JFrame {

    boolean boolForOne = false;
    boolean boolForTwo = false;
    boolean boolForThree = false;
    boolean boolForFour = false;

    int oneLetter = 1;
    int twoLetter = 1;
    int threeLetter = 1;
    int fourLetter = 1;

    int oneNumber = 1;
    int twoNumber = 1;
    int threeNumber = 1;
    int fourNumber = 1;

    int iMenuFunction = 1; //1 = RR, 2 = P, 3 = MQ

    public MainFrame() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        jComboBox4.setSelectedIndex(2);
        jComboBox3.setSelectedIndex(1);

        ImageIcon fizIn = new ImageIcon(getClass().getResource("/schedProject/no.png"));
        Image imageLogo = fizIn.getImage(); // transform it 
        this.setIconImage(imageLogo);

        jComboBox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent arg0) {
                //Do Something
                if (jComboBox1.getSelectedIndex() == 0 || jComboBox1.getSelectedIndex() == 1) {
                    DontShowMultiple();

                } else if (jComboBox1.getSelectedIndex() == 2) {
                    ShowMultiple();
                }

            }
        });

        jLabel9.setVisible(false);
        jLabel50.setVisible(false);
        jLabel34.setVisible(false);
        jLabel51.setVisible(false);
        jLabel35.setVisible(false);
        jLabel52.setVisible(false);
        jLabel36.setVisible(false);
        jLabel53.setVisible(false);

        jLabel43.setVisible(false);
        jLabel42.setVisible(false);
        jLabel41.setVisible(false);
        jLabel40.setVisible(false);
        jLabel39.setVisible(false);
        jLabel38.setVisible(false);
        jLabel37.setVisible(false);

        jLabel49.setVisible(false);
        jLabel48.setVisible(false);
        jLabel47.setVisible(false);
        jLabel46.setVisible(false);
        jLabel45.setVisible(false);
        jLabel44.setVisible(false);

        ImageIcon fizOut = new ImageIcon(getClass().getResource("/schedProject/no.png"));
        Image image = fizOut.getImage(); // transform it 
        Image newimg = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        fizOut = new ImageIcon(newimg);  // transform it back
        jLabel10.setIcon(fizOut);
        jLabel13.setIcon(fizOut);
        jLabel12.setIcon(fizOut);
        jLabel11.setIcon(fizOut);
        jLabel15.setIcon(fizOut);

        //jLabel16.setIcon(fizOut);
        jLabel17.setIcon(fizOut);
        jLabel18.setIcon(fizOut);
        jLabel19.setIcon(fizOut);
        jLabel20.setIcon(fizOut);
        jLabel21.setIcon(fizOut);

        //jLabel22.setIcon(fizOut);
        jLabel23.setIcon(fizOut);
        jLabel24.setIcon(fizOut);
        jLabel25.setIcon(fizOut);
        jLabel26.setIcon(fizOut);
        jLabel27.setIcon(fizOut);

        jLabel28.setIcon(fizOut);
        //jLabel29.setIcon(fizOut);
        jLabel30.setIcon(fizOut);
        jLabel31.setIcon(fizOut);
        jLabel32.setIcon(fizOut);
        jLabel33.setIcon(fizOut);

        jLabel14.setVisible(false);
        jLabel10.setVisible(false);
        jLabel13.setVisible(false);
        jLabel12.setVisible(false);
        jLabel11.setVisible(false);
        jLabel15.setVisible(false);

        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);

        jLabel22.setVisible(false);
        jLabel23.setVisible(false);
        jLabel24.setVisible(false);
        jLabel25.setVisible(false);
        jLabel26.setVisible(false);
        jLabel27.setVisible(false);

        jLabel28.setVisible(false);
        jLabel29.setVisible(false);
        jLabel30.setVisible(false);
        jLabel31.setVisible(false);
        jLabel32.setVisible(false);
        jLabel33.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ITRW 316");
        setBackground(new java.awt.Color(36, 47, 65));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(188, 213, 238));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel3.setText("Type:");

        jComboBox3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A - important", "B - not important" }));

        jComboBox4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 - short process", "3 - moderate process", "5 - large process" }));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/add (2).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel4.setText("Process:");

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Round-Robin (2-node-cycle)", "Priority", "Multiple Qeues" }));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/stop.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/play 2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/icons8-schedule-50.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Scheduling");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton1)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 250, 490));

        jPanel2.setBackground(new java.awt.Color(246, 245, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/1.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/2.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/3.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 204, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/4.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 278, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel14.setText("A");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 64, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel16.setText("B");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 138, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 130, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 130, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 130, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 130, -1, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel22.setText("B");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 212, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 278, -1, -1));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel29.setText("B");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 286, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 278, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 278, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 278, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 278, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel9.setText("System processes");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        jLabel34.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel34.setText("Interactive processes");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel35.setText("Batch processes");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        jLabel36.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel36.setText("Student processes");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        jLabel42.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel42.setText("B");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/4.png"))); // NOI18N
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedProject/no.png"))); // NOI18N
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jLabel49.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel49.setText("A");
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        jLabel50.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel50.setText("FCFS");
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        jLabel51.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel51.setText("SJF");
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        jLabel52.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel52.setText("RR");
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        jLabel53.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel53.setText("Priority");
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowMultiple() {
        //System.out.print("sdasd\n");
        jLabel9.setVisible(true);
        jLabel50.setVisible(true);
        jLabel34.setVisible(true);
        jLabel51.setVisible(true);
        jLabel35.setVisible(true);
        jLabel52.setVisible(true);
        jLabel36.setVisible(true);
        jLabel53.setVisible(true);

        jLabel43.setVisible(true);
        jLabel42.setVisible(true);
        jLabel41.setVisible(true);
        jLabel40.setVisible(true);
        jLabel39.setVisible(true);
        jLabel38.setVisible(true);
        jLabel37.setVisible(true);

        jLabel49.setVisible(true);
        jLabel48.setVisible(true);
        jLabel47.setVisible(true);
        jLabel46.setVisible(true);
        jLabel45.setVisible(true);
        jLabel44.setVisible(true);

        jLabel7.setVisible(false);
        jLabel29.setVisible(false);
        jLabel14.setVisible(false);
        jLabel16.setVisible(false);
        jLabel22.setVisible(false);
        jLabel28.setVisible(false);

        jLabel10.setVisible(true);
        jLabel13.setVisible(true);
        jLabel12.setVisible(true);
        jLabel11.setVisible(true);
        jLabel15.setVisible(true);

        jLabel17.setVisible(true);
        jLabel18.setVisible(true);
        jLabel19.setVisible(true);

        jLabel25.setVisible(true);
        jLabel23.setVisible(true);
        jLabel27.setVisible(true);
        jLabel24.setVisible(true);
        jLabel26.setVisible(true);

        jLabel32.setVisible(true);
        jLabel31.setVisible(true);
        jLabel30.setVisible(true);
        jLabel33.setVisible(true);
        jLabel28.setVisible(true);

    }

    private void DontShowMultiple() {
        //System.out.print("nnnnnn");
        jLabel9.setVisible(false);
        jLabel50.setVisible(false);
        jLabel34.setVisible(false);
        jLabel51.setVisible(false);
        jLabel35.setVisible(false);
        jLabel52.setVisible(false);
        jLabel36.setVisible(false);
        jLabel53.setVisible(false);

        jLabel43.setVisible(false);
        jLabel42.setVisible(false);
        jLabel41.setVisible(false);
        jLabel40.setVisible(false);
        jLabel39.setVisible(false);
        jLabel38.setVisible(false);
        jLabel37.setVisible(false);

        jLabel49.setVisible(false);
        jLabel48.setVisible(false);
        jLabel47.setVisible(false);
        jLabel46.setVisible(false);
        jLabel45.setVisible(false);
        jLabel44.setVisible(false);

        jLabel7.setVisible(true);
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (boolForOne == false) {
            if (jComboBox3.getSelectedItem().toString() == "A - important") {
                jLabel14.setText("A");
                oneLetter = 1;
            } else {
                jLabel14.setText("B");
                oneLetter = 2;
            }

            if (jComboBox4.getSelectedItem().toString() == "1 - short process") {
                jLabel10.setVisible(true);
                if (jComboBox1.getSelectedItem().toString() == "Round-Robin (2-node-cycle)" || jComboBox1.getSelectedItem().toString() == "Priority") {
                    jLabel14.setVisible(true);
                }
                boolForOne = true;
                oneNumber = 1;
            }
            if (jComboBox4.getSelectedItem().toString() == "3 - moderate process") {
                if (jComboBox1.getSelectedItem().toString() == "Round-Robin (2-node-cycle)" || jComboBox1.getSelectedItem().toString() == "Priority") {
                    jLabel14.setVisible(true);
                }
                jLabel10.setVisible(true);
                jLabel13.setVisible(true);
                jLabel12.setVisible(true);
                boolForOne = true;
                oneNumber = 3;
            }
            if (jComboBox4.getSelectedItem().toString() == "5 - large process") {
                if (jComboBox1.getSelectedItem().toString() == "Round-Robin (2-node-cycle)" || jComboBox1.getSelectedItem().toString() == "Priority") {
                    jLabel14.setVisible(true);
                }
                jLabel10.setVisible(true);
                jLabel13.setVisible(true);
                jLabel12.setVisible(true);
                jLabel11.setVisible(true);
                jLabel15.setVisible(true);
                boolForOne = true;
                oneNumber = 5;
            }

        } else if (boolForTwo == false) {
            if (jComboBox3.getSelectedItem().toString() == "A - important") {
                jLabel16.setText("A");
                twoLetter = 1;
            } else {
                jLabel16.setText("B");
                twoLetter = 2;
            }

            if (jComboBox4.getSelectedItem().toString() == "1 - short process") {
                if (jComboBox1.getSelectedItem().toString() == "Round-Robin (2-node-cycle)" || jComboBox1.getSelectedItem().toString() == "Priority") {
                    jLabel16.setVisible(true);
                }
                jLabel17.setVisible(true);
                boolForTwo = true;
                twoNumber = 1;
            }
            if (jComboBox4.getSelectedItem().toString() == "3 - moderate process") {
                if (jComboBox1.getSelectedItem().toString() == "Round-Robin (2-node-cycle)" || jComboBox1.getSelectedItem().toString() == "Priority") {
                    jLabel16.setVisible(true);
                }
                jLabel17.setVisible(true);
                jLabel18.setVisible(true);
                jLabel19.setVisible(true);
                boolForTwo = true;
                twoNumber = 3;
            }
            if (jComboBox4.getSelectedItem().toString() == "5 - large process") {
                if (jComboBox1.getSelectedItem().toString() == "Round-Robin (2-node-cycle)" || jComboBox1.getSelectedItem().toString() == "Priority") {
                    jLabel16.setVisible(true);
                }
                jLabel17.setVisible(true);
                jLabel18.setVisible(true);
                jLabel19.setVisible(true);
                jLabel20.setVisible(true);
                jLabel21.setVisible(true);
                boolForTwo = true;
                twoNumber = 5;
            }

        } else if (boolForThree == false) {

            if (jComboBox3.getSelectedItem().toString() == "A - important") {
                jLabel22.setText("A");
                threeLetter = 1;
            } else {
                jLabel22.setText("B");
                threeLetter = 2;
            }

            if (jComboBox4.getSelectedItem().toString() == "1 - short process") {
                if (jComboBox1.getSelectedItem().toString() == "Round-Robin (2-node-cycle)" || jComboBox1.getSelectedItem().toString() == "Priority") {
                    jLabel22.setVisible(true);
                }
                jLabel25.setVisible(true);
                boolForThree = true;
                threeNumber = 1;
            }
            if (jComboBox4.getSelectedItem().toString() == "3 - moderate process") {
                if (jComboBox1.getSelectedItem().toString() == "Round-Robin (2-node-cycle)" || jComboBox1.getSelectedItem().toString() == "Priority") {
                    jLabel22.setVisible(true);
                }
                jLabel25.setVisible(true);
                jLabel23.setVisible(true);
                jLabel27.setVisible(true);
                boolForThree = true;
                threeNumber = 3;
            }
            if (jComboBox4.getSelectedItem().toString() == "5 - large process") {
                if (jComboBox1.getSelectedItem().toString() == "Round-Robin (2-node-cycle)" || jComboBox1.getSelectedItem().toString() == "Priority") {
                    jLabel22.setVisible(true);
                }
                jLabel25.setVisible(true);
                jLabel23.setVisible(true);
                jLabel27.setVisible(true);
                jLabel24.setVisible(true);
                jLabel26.setVisible(true);
                boolForThree = true;
                threeNumber = 5;
            }

        } else if (boolForFour == false) {

            if (jComboBox3.getSelectedItem().toString() == "A - important") {
                jLabel29.setText("A");
                fourLetter = 1;
            } else {
                jLabel29.setText("B");
                fourLetter = 2;
            }

            if (jComboBox4.getSelectedItem().toString() == "1 - short process") {
                if (jComboBox1.getSelectedItem().toString() == "Round-Robin (2-node-cycle)" || jComboBox1.getSelectedItem().toString() == "Priority") {
                    jLabel29.setVisible(true);
                }
                jLabel32.setVisible(true);
                boolForFour = true;
                fourNumber = 1;
            }
            if (jComboBox4.getSelectedItem().toString() == "3 - moderate process") {
                if (jComboBox1.getSelectedItem().toString() == "Round-Robin (2-node-cycle)" || jComboBox1.getSelectedItem().toString() == "Priority") {
                    jLabel29.setVisible(true);
                }
                jLabel32.setVisible(true);
                jLabel31.setVisible(true);
                jLabel30.setVisible(true);
                boolForFour = true;
                fourNumber = 3;
            }
            if (jComboBox4.getSelectedItem().toString() == "5 - large process") {
                if (jComboBox1.getSelectedItem().toString() == "Round-Robin (2-node-cycle)" || jComboBox1.getSelectedItem().toString() == "Priority") {
                    jLabel29.setVisible(true);
                }
                jLabel32.setVisible(true);
                jLabel31.setVisible(true);
                jLabel30.setVisible(true);
                jLabel33.setVisible(true);
                jLabel28.setVisible(true);
                boolForFour = true;
                fourNumber = 5;
            }

        }

        if (jComboBox3.getSelectedItem().toString() == "B - not important") {
            jComboBox3.setSelectedIndex(0);
        } else if (jComboBox3.getSelectedItem().toString() == "A - important") {
            jComboBox3.setSelectedIndex(1);
        }

        if (jComboBox4.getSelectedIndex() == 2) {
            jComboBox4.setSelectedIndex(1);
        } else if (jComboBox4.getSelectedIndex() == 1) {
            jComboBox4.setSelectedIndex(2);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Thread trd = new Thread(new Tuna(1));
        trd.start();
        //System.out.print("jdjd");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //jLabel15.setVisible(false);
        ImageIcon fizOut = new ImageIcon(getClass().getResource("/schedProject/no.png"));
        Image image = fizOut.getImage(); // transform it 
        Image newimg = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        fizOut = new ImageIcon(newimg);  // transform it back
        jLabel10.setIcon(fizOut);
        jLabel13.setIcon(fizOut);
        jLabel12.setIcon(fizOut);
        jLabel11.setIcon(fizOut);
        jLabel15.setIcon(fizOut);

        //jLabel16.setIcon(fizOut);
        jLabel17.setIcon(fizOut);
        jLabel18.setIcon(fizOut);
        jLabel19.setIcon(fizOut);
        jLabel20.setIcon(fizOut);
        jLabel21.setIcon(fizOut);

        //jLabel22.setIcon(fizOut);
        jLabel23.setIcon(fizOut);
        jLabel24.setIcon(fizOut);
        jLabel25.setIcon(fizOut);
        jLabel26.setIcon(fizOut);
        jLabel27.setIcon(fizOut);

        jLabel28.setIcon(fizOut);
        //jLabel29.setIcon(fizOut);
        jLabel30.setIcon(fizOut);
        jLabel31.setIcon(fizOut);
        jLabel32.setIcon(fizOut);
        jLabel33.setIcon(fizOut);

        jLabel14.setVisible(false);
        jLabel10.setVisible(false);
        jLabel13.setVisible(false);
        jLabel12.setVisible(false);
        jLabel11.setVisible(false);
        jLabel15.setVisible(false);

        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);

        jLabel22.setVisible(false);
        jLabel23.setVisible(false);
        jLabel24.setVisible(false);
        jLabel25.setVisible(false);
        jLabel26.setVisible(false);
        jLabel27.setVisible(false);

        jLabel28.setVisible(false);
        jLabel29.setVisible(false);
        jLabel30.setVisible(false);
        jLabel31.setVisible(false);
        jLabel32.setVisible(false);
        jLabel33.setVisible(false);

        boolForOne = false;
        boolForTwo = false;
        boolForThree = false;
        boolForFour = false;

     
        jLabel41.setIcon(fizOut);

        jLabel40.setIcon(fizOut);

        jLabel39.setIcon(fizOut);

        jLabel38.setIcon(fizOut);

        jLabel37.setIcon(fizOut);

        jLabel48.setIcon(fizOut);

        jLabel47.setIcon(fizOut);

        jLabel46.setIcon(fizOut);

        jLabel45.setIcon(fizOut);

        jLabel44.setIcon(fizOut);
    }//GEN-LAST:event_jButton2ActionPerformed

    public class Tuna implements Runnable {

        public Tuna(int i) {

        }

        //this runs when you start thread
        @Override
        public void run() {
            //System.out.print("jdjd");
            try {
                //System.out.print("jdjd");

                //BufferedImage fiz = ImageIO.read(new File("/schedProject/yes.png"));
                ImageIcon fiz = new ImageIcon(getClass().getResource("/schedProject/yes.png"));

                Image image = fiz.getImage(); // transform it 
                Image newimg = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
                fiz = new ImageIcon(newimg);  // transform it back
                //Thread.sleep(300);
                //jLabel10.setIcon(fiz);

                //Thread.sleep(300);
                //jLabel13.setIcon(fiz);
                //Thread.sleep(300);
                //jLabel12.setIcon(fiz);
                //Thread.sleep(300);
                //jLabel11.setIcon(fiz);
                //Thread.sleep(300);
                //jLabel15.setIcon(fiz);
                if (jComboBox1.getSelectedItem().toString() == "Round-Robin (2-node-cycle)") {
                    Thread.sleep(200);
                    jLabel10.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel13.setIcon(fiz);

                    Thread.sleep(200);
                    jLabel17.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel18.setIcon(fiz);

                    Thread.sleep(200);
                    jLabel25.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel23.setIcon(fiz);

                    Thread.sleep(200);
                    jLabel32.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel31.setIcon(fiz);

                    Thread.sleep(200);
                    jLabel12.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel11.setIcon(fiz);

                    Thread.sleep(200);
                    jLabel19.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel20.setIcon(fiz);

                    Thread.sleep(200);
                    jLabel27.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel24.setIcon(fiz);

                    Thread.sleep(200);
                    jLabel30.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel33.setIcon(fiz);

                    Thread.sleep(200);
                    jLabel15.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel21.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel26.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel28.setIcon(fiz);

                }

                //Prioriy
                if (jComboBox1.getSelectedItem().toString() == "Priority") {

                    if (oneLetter == 1) {
                        //System.out.print("helelelele");
                        Thread.sleep(200);
                        jLabel10.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel13.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel12.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel11.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel15.setIcon(fiz);
                    }
                    if (twoLetter == 1) {
                        Thread.sleep(200);
                        jLabel17.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel18.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel19.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel20.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel21.setIcon(fiz);
                    }

                    if (threeLetter == 1) {
                        Thread.sleep(200);
                        jLabel25.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel23.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel27.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel24.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel26.setIcon(fiz);
                    }
                    if (fourLetter == 1) {
                        Thread.sleep(200);
                        jLabel32.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel31.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel30.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel33.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel28.setIcon(fiz);
                    }

                    if (oneLetter == 2) {
                        Thread.sleep(200);
                        jLabel10.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel13.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel12.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel11.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel15.setIcon(fiz);
                    }
                    if (twoLetter == 2) {
                        Thread.sleep(200);
                        jLabel17.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel18.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel19.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel20.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel21.setIcon(fiz);
                    }

                    if (threeLetter == 2) {
                        Thread.sleep(200);
                        jLabel25.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel23.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel27.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel24.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel26.setIcon(fiz);
                    }
                    if (fourLetter == 2) {
                        Thread.sleep(200);
                        jLabel32.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel31.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel30.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel33.setIcon(fiz);
                        Thread.sleep(200);
                        jLabel28.setIcon(fiz);
                    }

                }

                if (jComboBox1.getSelectedItem().toString() == "Multiple Qeues") {
                    Thread.sleep(200);
                    jLabel10.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel13.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel12.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel11.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel15.setIcon(fiz);

                    Thread.sleep(200);
                    jLabel17.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel18.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel19.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel20.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel21.setIcon(fiz);

                    Thread.sleep(200);
                    jLabel25.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel23.setIcon(fiz);

                    Thread.sleep(200);
                    jLabel32.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel31.setIcon(fiz);

                    Thread.sleep(200);
                    jLabel27.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel24.setIcon(fiz);

                    Thread.sleep(200);
                    jLabel30.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel33.setIcon(fiz);

                    Thread.sleep(200);
                    jLabel26.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel28.setIcon(fiz);

                    Thread.sleep(200);
                    jLabel41.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel40.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel39.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel38.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel37.setIcon(fiz);

                    Thread.sleep(200);
                    jLabel48.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel47.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel46.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel45.setIcon(fiz);
                    Thread.sleep(200);
                    jLabel44.setIcon(fiz);
                }

            } catch (InterruptedException e) {
            }
        }
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
