/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABC;


import java.applet.Applet;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.net.URL;
import java.applet.AudioClip;

/**
 *
 * @author asus
 */
public class KBC extends javax.swing.JFrame {

    /**
     * Creates new form KBC
     */
    URL url;
    AudioClip clip;
    public KBC() {
        url=KBC.class.getResource("KbcTheme.wav");
        clip=Applet.newAudioClip(url);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2000, 862));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ABC/images/Picture1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ABC/images/33.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ABC/images/Picture3.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ABC/images/Picture4.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ABC/images/22.jpg"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ABC/images/1111.jpg"))); // NOI18N

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));

        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166)
                .addComponent(jLabel6)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(263, 263, 263)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(260, 260, 260))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5))
                .addGap(189, 189, 189))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int k=0;
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        this.getContentPane().setBackground(Color.black);
        clip.play();
    }//GEN-LAST:event_formMouseMoved
    String SelectedAnswer;
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jTextField1.setText("Want to be a Crorepati?");
        jTextField2.setText("                     ");
        jTextField3.setText("                     ");
        jTextField4.setText("                     ");
        jTextField5.setText("                     ");
        
        
        
        
    }//GEN-LAST:event_formWindowActivated
    
    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed
     int fifty=0;
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        ImageIcon[] imglist1 = new ImageIcon[1];
        for(int i=0;i<imglist1.length;i++)
        { 
            imglist1[i] = new ImageIcon(getClass().getResource("/ABC/images/Picture122.png"));
        }
                if(fifty<0)
                 fifty=1;
            
         jLabel1.setIcon(imglist1[fifty]);
         fifty++;
        if(answer.equals(option1))   //here a is Option 1
        {
            jTextField3.setText("             ");
            jTextField5.setText("             ");
        }
        else if(answer.equals(option2))
        {
            jTextField4.setText("             ");
            jTextField2.setText("             ");
        }
        else if(answer.equals(option3))
        {
            jTextField3.setText("             ");
            jTextField2.setText("             ");
        }
        else
        {
            jTextField4.setText("             ");
            jTextField3.setText("             ");
        }
        //answer should be global
        
    }//GEN-LAST:event_jLabel1MouseClicked
    int ddip=0;
      
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ImageIcon[] imglist1 = new ImageIcon[1];
        for(int i=0;i<imglist1.length;i++)
        { 
            imglist1[i] = new ImageIcon(getClass().getResource("/ABC/images/332.jpg"));
        }
        if(ddip<0)
            ddip=1;
        jLabel2.setIcon(imglist1[ddip]);
        ddip++;
    }//GEN-LAST:event_jLabel2MouseClicked
        int switch1=0;
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ImageIcon[] imglist1 = new ImageIcon[1];
        for(int i=0;i<imglist1.length;i++)
        { 
            imglist1[i] = new ImageIcon(getClass().getResource("/ABC/images/Picture343.png"));
        }
        if(switch1<0)
            switch1=1;
        jLabel3.setIcon(imglist1[switch1]);
        switch1++;
        ChangeQuestion();
    }//GEN-LAST:event_jLabel3MouseClicked
         int call=0;
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        ImageIcon[] imglist1 = new ImageIcon[1];
        for(int i=0;i<imglist1.length;i++)
        { 
            imglist1[i] = new ImageIcon(getClass().getResource("/ABC/images/Picture4435.png"));
        }
        if(call<0)
            call=1;
        jLabel4.setIcon(imglist1[call]);
        call++;
    }//GEN-LAST:event_jLabel4MouseClicked
  
       
    
    String answer;
    String option1,option2,option3,option4;
    private void ChangeQuestion()
    {   jTextField1.setBackground(Color.BLACK);
        jTextField2.setBackground(Color.BLACK);
        jTextField3.setBackground(Color.BLACK);
        jTextField4.setBackground(Color.BLACK);
        jTextField5.setBackground(Color.BLACK);
        try
            {
               
            resultSet = statement.executeQuery("SELECT Question,Option1,Option2,Option3,Option4,CorrectAnswer FROM KBCquestions where QuestionNumber="+(k++));
        
            while(resultSet.next()) {
              jTextField1.setText(resultSet.getString("Question"));
              jTextField2.setText(resultSet.getString("Option1"));
              jTextField3.setText(resultSet.getString("Option2"));
              jTextField4.setText(resultSet.getString("Option3"));
              jTextField5.setText(resultSet.getString("Option4"));
              answer=resultSet.getString("CorrectAnswer");
              option1=resultSet.getString("Option1");
              option2=resultSet.getString("Option2");
              option3=resultSet.getString("Option3");
              option4=resultSet.getString("Option4");
            }
        
            
            }
            catch(SQLException e)
            {
        
            
            }    
        if(k==16)
        {
        try {
                if(null != connection) {
 
                    // cleanup resources, once after processing
                    resultSet.close();
                    statement.close();
 
                    // and then finally close connection
                    connection.close();
                }
            }
            catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
            // Step 3: Closing database connection
        }   
    } 

    int mp=-1;
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        ChangeQuestion();
                       ImageIcon[] imglist1 = new ImageIcon[16];
                       int i;
        if(mp>=1){
          for( i=0;i<16;i++)
        { 
            imglist1[i] = new ImageIcon(getClass().getResource("/ABC/images/mp"+mp+".jpg"));
        }
             
        jLabel6.setIcon(imglist1[mp]);
        }mp++;
        
    }//GEN-LAST:event_jButton1MouseClicked
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
             
                
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        
        SelectedAnswer=jTextField2.getText();
        if(SelectedAnswer.equals(answer))
        {
            jTextField2.setBackground(Color.GREEN);
        }
        else
        {
             jTextField2.setBackground(Color.RED);
        }
        
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        SelectedAnswer=jTextField3.getText();
        if(SelectedAnswer.equals(answer))
        {
            jTextField3.setBackground(Color.GREEN);
        }
        else
        {
             jTextField3.setBackground(Color.RED);
        }
        
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        SelectedAnswer=jTextField4.getText();
        if(SelectedAnswer.equals(answer))
        {
            jTextField4.setBackground(Color.GREEN);
        }
        else
        {
             jTextField4.setBackground(Color.RED);
        }
        
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        SelectedAnswer=jTextField5.getText();
        if(SelectedAnswer.equals(answer))
        {
            jTextField5.setBackground(Color.GREEN);
        }
        else
        {
             jTextField5.setBackground(Color.RED);
        }
        
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        ChangeQuestion();
                       ImageIcon[] imglist1 = new ImageIcon[1];
        for(int i=0;i<imglist1.length;i++)
        { 
            imglist1[i] = new ImageIcon(getClass().getResource("/ABC/images/mp"+k+".jpg"));
        }
        if(mp<0)
            mp=1;
        jLabel6.setIcon(imglist1[mp]);
        mp++;
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    static Connection connection = null;
    static Statement statement = null;
    static ResultSet resultSet = null;
        
    public static void main(String args[]) {
        
        try {
 
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {
 
            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
        }
        try {
 
            String msAccDB = "C:\\Sayali\\MyProjects\\KBC\\KBC.accdb";
            String dbURL = "jdbc:ucanaccess://" + msAccDB; 
 
            connection = DriverManager.getConnection(dbURL); 
            statement = connection.createStatement();
            
        }
        
        
        
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(() -> {
            new KBC().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
