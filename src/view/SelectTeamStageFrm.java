/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.Stage;
import dao.StageDAO;
import dao.TeamDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Registered;
import model.Team;

public class SelectTeamStageFrm extends javax.swing.JFrame implements ActionListener{
    ArrayList<Stage> listStage = new ArrayList<>();
    ArrayList<Team> listTeam = new ArrayList<>();
    private Registered r;
    Stage s = new Stage();
    Team t = new Team();
    public SelectTeamStageFrm() {
        
        initComponents();
        loadDataToCombobox();
        btnConfirm.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() ==  btnConfirm) {
            for(int i = 0; i < listStage.size(); i++){
                if(listStage.get(i).getName() == cbxStage.getSelectedItem().toString()){
                    s.setId(listStage.get(i).getId());
                }
            }
            for(int i = 0; i < listTeam.size(); i++){
                if(listTeam.get(i).getName() == cbxTeam.getSelectedItem().toString()){
                    t.setId(listTeam.get(i).getId());
                }
            }
            (new SelectDriverFrm(cbxTeam.getSelectedItem().toString(), s,t)).setVisible(true);
            this.dispose();
        }
        
    }
    public void loadDataToCombobox(){
        StageDAO sd = new StageDAO();
        TeamDAO td = new TeamDAO();
        listStage = sd.getStageList();
        listTeam = td.getTeamList();
        for(Stage s : listStage){
            cbxStage.addItem(s.getName());
        }
        for(Team t : listTeam){
            cbxTeam.addItem(t.getName());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxStage = new javax.swing.JComboBox<>();
        cbxTeam = new javax.swing.JComboBox<>();
        btnConfirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbxStage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxStageActionPerformed(evt);
            }
        });

        cbxTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTeamActionPerformed(evt);
            }
        });

        btnConfirm.setText("Xác nhận");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Chọn chặng đua và đội đua");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(cbxStage, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxStage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(btnConfirm)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTeamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTeamActionPerformed

    private void cbxStageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxStageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxStageActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmActionPerformed

    /**
     * @param args the command line arguments
     */
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cbxStage;
    private javax.swing.JComboBox<String> cbxTeam;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
