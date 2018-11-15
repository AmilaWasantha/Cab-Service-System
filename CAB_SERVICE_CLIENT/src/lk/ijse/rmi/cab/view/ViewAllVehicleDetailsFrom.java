/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.view;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import lk.ijse.rmi.cab.controller.InsuaranceCompanyController;
import lk.ijse.rmi.cab.controller.VehicleController;
import lk.ijse.rmi.cab.dto.InsuaranceCompanyDTO;
import lk.ijse.rmi.cab.dto.VehicleDTO;

/**
 *
 * @author user
 */
public class ViewAllVehicleDetailsFrom extends javax.swing.JPanel {

    /**
     * Creates new form ViewAllVehicleDetailsFrom
     */
    public ViewAllVehicleDetailsFrom() {
        initComponents();
        loadVehicles();
        loadInsuaranceCompany();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtVehicleBrand = new javax.swing.JTextField();
        txtVehicleInsuaranceId = new javax.swing.JTextField();
        txtVehcleRegNumber = new javax.swing.JTextField();
        txtVehicleSeatingCapacity = new javax.swing.JTextField();
        txtVehicleFuelType = new javax.swing.JTextField();
        txtVehicleStatus = new javax.swing.JTextField();
        txtVehiclePrice = new javax.swing.JTextField();
        txtVehicleColour = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtInsuaranceCompanyName = new javax.swing.JTextField();
        txtInsuaranceType = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtVehicleId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVehicles = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        JcomboInsuaranceCompanyId = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(150, 40, 27));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText(" Vehicle Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Vehicle Brand");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Insuarance Id");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Register Number");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Fuel Type");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Vehicle Id");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("Status");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 255));
        jLabel8.setText("Colour");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("Price");

        txtVehicleBrand.setEditable(false);
        txtVehicleBrand.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txtVehicleInsuaranceId.setEditable(false);
        txtVehicleInsuaranceId.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txtVehcleRegNumber.setEditable(false);
        txtVehcleRegNumber.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtVehcleRegNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehcleRegNumberActionPerformed(evt);
            }
        });

        txtVehicleSeatingCapacity.setEditable(false);
        txtVehicleSeatingCapacity.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txtVehicleFuelType.setEditable(false);
        txtVehicleFuelType.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txtVehicleStatus.setEditable(false);
        txtVehicleStatus.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txtVehiclePrice.setEditable(false);
        txtVehiclePrice.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txtVehicleColour.setEditable(false);
        txtVehicleColour.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 255));
        jLabel10.setText("Company Register Id");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 102, 255));
        jLabel11.setText("Insuarance Type");

        txtInsuaranceCompanyName.setEditable(false);
        txtInsuaranceCompanyName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtInsuaranceCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsuaranceCompanyNameActionPerformed(evt);
            }
        });

        txtInsuaranceType.setEditable(false);
        txtInsuaranceType.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 102, 255));
        jLabel12.setText("Insuarance Company Name");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 153, 255));
        jLabel13.setText("Seating Capacity");

        txtVehicleId.setEditable(false);
        txtVehicleId.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        tableVehicles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle_Id", "Brand", "Insuarance_ID", "Reg_No", "Colour", "Seating_Capacity", "Fuel Type", "Status", "Price", "InsuaranceCompanyId"
            }
        ));
        tableVehicles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVehiclesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableVehicles);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 102));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/rmi/cab/resource/List.png"))); // NOI18N
        jLabel14.setText("List Of Vehicles");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/rmi/cab/resource/headLine.png"))); // NOI18N

        JcomboInsuaranceCompanyId.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        JcomboInsuaranceCompanyId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JcomboInsuaranceCompanyIdItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(56, 56, 56))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(39, 39, 39)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtVehicleSeatingCapacity)
                                    .addComponent(txtVehicleInsuaranceId)
                                    .addComponent(txtVehicleFuelType)
                                    .addComponent(txtVehcleRegNumber)
                                    .addComponent(txtVehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(txtVehicleBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtVehicleStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(216, 216, 216)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtVehiclePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtVehicleColour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtInsuaranceType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(32, 32, 32)
                                    .addComponent(txtInsuaranceCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(JcomboInsuaranceCompanyId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(405, 405, 405)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVehcleRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtVehicleInsuaranceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtVehicleBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVehicleFuelType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVehicleSeatingCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehicleStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JcomboInsuaranceCompanyId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInsuaranceCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtInsuaranceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtVehicleColour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtVehiclePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtVehcleRegNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehcleRegNumberActionPerformed
       
    }//GEN-LAST:event_txtVehcleRegNumberActionPerformed

    private void txtInsuaranceCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsuaranceCompanyNameActionPerformed

    }//GEN-LAST:event_txtInsuaranceCompanyNameActionPerformed

    private void tableVehiclesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVehiclesMouseClicked
        DefaultTableModel dtm=(DefaultTableModel) tableVehicles.getModel();
        int vehicleId=(int) tableVehicles.getValueAt(tableVehicles.getSelectedRow(),0);
        String vehicleBrand=(String) tableVehicles.getValueAt(tableVehicles.getSelectedRow(),1);
        String vehicleInsuaranceId=(String) tableVehicles.getValueAt(tableVehicles.getSelectedRow(),2);
        String regNo=(String) tableVehicles.getValueAt(tableVehicles.getSelectedRow(),3);
        String vehicleColour=(String) tableVehicles.getValueAt(tableVehicles.getSelectedRow(),4);
        int vehicleSeatingCapacity=(int) tableVehicles.getValueAt(tableVehicles.getSelectedRow(),5);
        String vehicleFuelType=(String) tableVehicles.getValueAt(tableVehicles.getSelectedRow(),6);
        String vehicleStatues=(String) tableVehicles.getValueAt(tableVehicles.getSelectedRow(),7);
        double vehiclePrice=(double) tableVehicles.getValueAt(tableVehicles.getSelectedRow(),8);
        String InusuaranceCompanyId=(String) tableVehicles.getValueAt(tableVehicles.getSelectedRow(),9);
        txtVehicleId.setText(vehicleId+"");
        txtVehicleBrand.setText(vehicleBrand);
        txtVehicleInsuaranceId.setText(vehicleInsuaranceId);
        txtVehcleRegNumber.setText(regNo);
        txtVehicleColour.setText(vehicleColour);
        txtVehicleSeatingCapacity.setText(vehicleSeatingCapacity+"");
        txtVehicleFuelType.setText(vehicleFuelType);
        txtVehicleStatus.setText(vehicleStatues);
        txtVehiclePrice.setText(vehiclePrice+"");
        JcomboInsuaranceCompanyId.setSelectedItem(InusuaranceCompanyId);
        //txtVehcleRegNumber.requestFocus();
    }//GEN-LAST:event_tableVehiclesMouseClicked

    private void JcomboInsuaranceCompanyIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JcomboInsuaranceCompanyIdItemStateChanged
       
        try {
            String InsurainceCompanyId=JcomboInsuaranceCompanyId.getSelectedItem().toString();
            InsuaranceCompanyDTO insuaranceCompanyDTO=InsuaranceCompanyController.searchById(InsurainceCompanyId);
            //this.insuaranceCompanyDTO=insuaranceCompanyDTO;
            if(insuaranceCompanyDTO!=null){
                txtInsuaranceCompanyName.setText(insuaranceCompanyDTO.getCompanyName());
                txtInsuaranceType.setText(insuaranceCompanyDTO.getInsuaranceType());
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewAllVehicleDetailsFrom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_JcomboInsuaranceCompanyIdItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcomboInsuaranceCompanyId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableVehicles;
    private javax.swing.JTextField txtInsuaranceCompanyName;
    private javax.swing.JTextField txtInsuaranceType;
    private javax.swing.JTextField txtVehcleRegNumber;
    private javax.swing.JTextField txtVehicleBrand;
    private javax.swing.JTextField txtVehicleColour;
    private javax.swing.JTextField txtVehicleFuelType;
    private javax.swing.JTextField txtVehicleId;
    private javax.swing.JTextField txtVehicleInsuaranceId;
    private javax.swing.JTextField txtVehiclePrice;
    private javax.swing.JTextField txtVehicleSeatingCapacity;
    private javax.swing.JTextField txtVehicleStatus;
    // End of variables declaration//GEN-END:variables

    private void loadVehicles() {
          
        
        try {
            DefaultTableModel dtm=(DefaultTableModel) tableVehicles.getModel();
            dtm.setRowCount(0);
            
            List<VehicleDTO>vehicleDTOs=VehicleController.findAllVehicles();

            for (VehicleDTO vehicleDTO : vehicleDTOs) {
                Object[] rowDeta={
                    vehicleDTO.getVehicleId(),
                    vehicleDTO.getVehicleBrand(),
                    vehicleDTO.getVehicleInsuaranceId(),
                    vehicleDTO.getRegNo(),
                    vehicleDTO.getColour(),
                    vehicleDTO.getSeatingCapacity(),
                    vehicleDTO.getFuelType(),
                    vehicleDTO.getStatus(),
                    vehicleDTO.getPrice(),
                    vehicleDTO.getInsuaranceCompanyDTO().getInsuaranceCompanyId()
                    
                };
                dtm.addRow(rowDeta);
                tableVehicles.requestFocus();
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewAllVehicleDetailsFrom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void loadInsuaranceCompany() {
        
        try {
            List<InsuaranceCompanyDTO> insuaranceCompanyDTOs=InsuaranceCompanyController.findAllInsuaranceCompany();
            for (InsuaranceCompanyDTO insuaranceCompanyDTO : insuaranceCompanyDTOs) {
                JcomboInsuaranceCompanyId.addItem(insuaranceCompanyDTO.getInsuaranceCompanyId());
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewAllVehicleDetailsFrom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}