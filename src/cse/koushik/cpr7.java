package cse.koushik;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class cpr7 extends javax.swing.JFrame {
    public String s1;
    public cpr7() {
        initComponents();
    }
    public cpr7(String name)
    {
        initComponents();
        l1.setText("Welcome "+name);
    }
    public String name;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t2 = new javax.swing.JComboBox<>();
        t4 = new javax.swing.JSpinner();
        t5 = new javax.swing.JSpinner();
        t6 = new javax.swing.JSpinner();
        t7 = new javax.swing.JSpinner();
        t8 = new javax.swing.JSpinner();
        t9 = new javax.swing.JSpinner();
        t10 = new javax.swing.JSpinner();
        t11 = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        l1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 0));
        l1.setText("Welcome "+ this.s1);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Year");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Total number of Students");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("No of Students Passed");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("No of Students Placed");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("No of Students Placed In Individual companies");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("TCS");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("WIPRO");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("GOOGLE");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("NEXT-JUMP");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("SAINT-GOBLIN");

        t1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 0, 153));

        t3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t3.setForeground(new java.awt.Color(0, 0, 153));

        t2.setForeground(new java.awt.Color(0, 0, 153));
        t2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2014", "2015", "2016" }));

        t4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 800, 1));

        t5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));

        t6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));

        t7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));

        t8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));

        t9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));

        t10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));

        t11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));

        jButton5.setBackground(new java.awt.Color(153, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 0));
        jButton5.setText("Insert");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 0));
        jButton6.setText("Retrieve");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 0));
        jButton7.setText("Delete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 0, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 0));
        jButton8.setText("Change password");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 0, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 0));
        jButton9.setText("Clear");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(153, 0, 0));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 0));
        jButton10.setText("Logout");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Home");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton8))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(jButton9)
                                        .addGap(55, 55, 55)
                                        .addComponent(jButton10)))
                                .addGap(0, 20, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton11)
                                .addGap(67, 67, 67)
                                .addComponent(l1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(l1))
                    .addComponent(jButton11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   
        int i1=Integer.parseInt(t1.getText());
        int i2=Integer.parseInt(t2.getSelectedItem().toString());
        String i3=t3.getText();
        int i4=(Integer)t4.getValue();
        int i5=(Integer)t5.getValue();
        int i6=(Integer)t6.getValue(); //no of students placed
        int i7=(Integer)t7.getValue();
        int i8=(Integer)t8.getValue();
        int i9=(Integer)t9.getValue();
        int i10=(Integer)t10.getValue();
        int i11=(Integer)t11.getValue();
        if(i2==2014)
        {
            try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                PreparedStatement ps=con.prepareStatement("insert into COLLEGE_DETAILS2014 values(?,?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1,i1);
                ps.setString(2,i3);
                ps.setInt(3,i4);
                ps.setInt(4,i5);
                ps.setInt(5,i6);
                ps.setInt(6,i7);
                ps.setInt(7,i8);
                ps.setInt(8,i9);
                ps.setInt(9,i10);
                ps.setInt(10,i11);
                int d=i6-(i11+i10+i9+i8+i7);
                ps.setInt(11,d);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Successfully inserted", "Success Message"
                        , JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
                  
        }
        else if(i2==2015)
        {
            try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                PreparedStatement ps=con.prepareStatement("insert into COLLEGE_DETAILS2015 values(?,?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1,i1);
                ps.setString(2,i3);
                ps.setInt(3,i4);
                ps.setInt(4,i5);
                ps.setInt(5,i6);
                ps.setInt(6,i7);
                ps.setInt(7,i8);
                ps.setInt(8,i9);
                ps.setInt(9,i10);
                ps.setInt(10,i11);
                int d=i6-(i11+i10+i9+i8+i7);
                ps.setInt(11,d);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Successfully inserted", "Success Message"
                        , JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        else if(i2==2016)
        {
            try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                PreparedStatement ps=con.prepareStatement("insert into COLLEGE_DETAILS2015 values(?,?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1,i1);
                ps.setString(2,i3);
                ps.setInt(3,i4);
                ps.setInt(4,i5);
                ps.setInt(5,i6);
                ps.setInt(6,i7);
                ps.setInt(7,i8);
                ps.setInt(8,i9);
                ps.setInt(9,i10);
                ps.setInt(10,i11);
                int d=i6-(i11+i10+i9+i8+i7);
                ps.setInt(11,d);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Successfully inserted", "Success Message"
                        , JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Year Invalid", "Year error"
                        , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int i1=Integer.parseInt(t1.getText());
        int i2=Integer.parseInt(t2.getSelectedItem().toString());
        if(i2==2014)
        {
            try
            {
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                 PreparedStatement ps=con.prepareStatement("select * from COLLEGE_DETAILS2014 where id=?");
                 ps.setInt(1,i1);
                 ResultSet rs=ps.executeQuery();
                 if(rs.next())
                 {
                    
                         t3.setText(rs.getString(2));
                        t4.setValue(rs.getInt(3));
                        t5.setValue(rs.getInt(4));
                        t6.setValue(rs.getInt(5)); 
                        t7.setValue(rs.getInt(6));
                        t8.setValue(rs.getInt(7));
                        t9.setValue(rs.getInt(8));
                        t10.setValue(rs.getInt(9));
                        t11.setValue(rs.getInt(10));
                    
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(rootPane, "Record not Available", "Not Available"
                        , JOptionPane.ERROR_MESSAGE);
                 }
                 
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        else if(i2==2015)
        {
            try
            {
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                 PreparedStatement ps=con.prepareStatement("select * from COLLEGE_DETAILS2015 where id=?");
                 ps.setInt(1,i1);
                 ResultSet rs=ps.executeQuery();
                 if(rs.next())
                 {
                    
                         t3.setText(rs.getString(2));
                        t4.setValue(rs.getInt(3));
                        t5.setValue(rs.getInt(4));
                        t6.setValue(rs.getInt(5)); 
                        t7.setValue(rs.getInt(6));
                        t8.setValue(rs.getInt(7));
                        t9.setValue(rs.getInt(8));
                        t10.setValue(rs.getInt(9));
                        t11.setValue(rs.getInt(10));
                    
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(rootPane, "Record not Available", "Not Available"
                        , JOptionPane.ERROR_MESSAGE);
                 }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        else if(i2==2016)
        {
            try
            {
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                 PreparedStatement ps=con.prepareStatement("select * from COLLEGE_DETAILS2015 where id=?");
                 ps.setInt(1,i1);
                 ResultSet rs=ps.executeQuery();
                 if(rs.next())
                 {
                    
                         t3.setText(rs.getString(2));
                        t4.setValue(rs.getInt(3));
                        t5.setValue(rs.getInt(4));
                        t6.setValue(rs.getInt(5)); 
                        t7.setValue(rs.getInt(6));
                        t8.setValue(rs.getInt(7));
                        t9.setValue(rs.getInt(8));
                        t10.setValue(rs.getInt(9));
                        t11.setValue(rs.getInt(10));
                    
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(rootPane, "Record not Available", "Not Available"
                        , JOptionPane.ERROR_MESSAGE);
                 }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Year Invalid", "Year error"
                        , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int i1=Integer.parseInt(t1.getText());
        int i2=Integer.parseInt(t2.getSelectedItem().toString());
        if(i2==2014)
        {
            try
            {
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                 PreparedStatement ps=con.prepareStatement("delete from COLLEGE_DETAILS2014 where id=?");
                 ps.setInt(1,i1);
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(rootPane, "Deleted the record Successfully","Success",
                            JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        else if(i2==2015)
        {
            try
            {
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                 PreparedStatement ps=con.prepareStatement("delete from COLLEGE_DETAILS2015 where id=?");
                 ps.setInt(1,i1);
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(rootPane, "Deleted the record Successfully","Success",
                            JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        else if(i2==2016)
        {
            try
            {
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                 PreparedStatement ps=con.prepareStatement("delete from COLLEGE_DETAILS2015 where id=?");
                 ps.setInt(1,i1);
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(rootPane, "Deleted the record Successfully","Success",
                            JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Year Invalid", "Year error"
                        , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        cpr8 c8=new cpr8();
        c8.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        t3.setText("");
        t4.setValue(0);
        t5.setValue(0);
        t6.setValue(0); 
        t7.setValue(0);
        t8.setValue(0);
        t9.setValue(0);
        t10.setValue(0);
        t11.setValue(0);        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        cpr3 c3=new cpr3();
        c3.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        cpr2 c=new cpr2();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cpr7().setVisible(true);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l1;
    private javax.swing.JTextField t1;
    private javax.swing.JSpinner t10;
    private javax.swing.JSpinner t11;
    private javax.swing.JComboBox<String> t2;
    private javax.swing.JTextField t3;
    private javax.swing.JSpinner t4;
    private javax.swing.JSpinner t5;
    private javax.swing.JSpinner t6;
    private javax.swing.JSpinner t7;
    private javax.swing.JSpinner t8;
    private javax.swing.JSpinner t9;
    // End of variables declaration//GEN-END:variables
}
