/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.rmi.cab.controller.CustomerController;
import lk.ijse.rmi.cab.controller.ReservationController;
import lk.ijse.rmi.cab.controller.VehicleController;
import lk.ijse.rmi.cab.controller.paymentController;
import lk.ijse.rmi.cab.dto.CustomerDTO;
import lk.ijse.rmi.cab.dto.PaymentDTO;
import lk.ijse.rmi.cab.dto.ReservationDTO;
import lk.ijse.rmi.cab.dto.VehicleDTO;

/**
 *
 * @author user
 */
public class SerchVehicleForModifyReservation extends javax.swing.JPanel {
String in="";
String out="";
    /**
     * Creates new form M
     */
    public SerchVehicleForModifyReservation() {
        initComponents();
        desableTheDate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCustNicNumber = new javax.swing.JTextField();
        txtCustName = new javax.swing.JTextField();
        txtCustId = new javax.swing.JTextField();
        txtCustDOB = new javax.swing.JTextField();
        txtCustTelNumber = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtCustomerLicenceId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        comboReservationId = new javax.swing.JComboBox<>();
        txtEndDate = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtVehicleId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtPaymentId = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dateStartDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel13 = new javax.swing.JLabel();
        dateEndDate = new org.jdesktop.swingx.JXDatePicker();
        jSeparator2 = new javax.swing.JSeparator();
        btnModifyReservation = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBackground(new java.awt.Color(150, 40, 27));
        setPreferredSize(new java.awt.Dimension(1586, 899));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("NIC_Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Cust_Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Cust_Id");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Cust_DOB");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Cust_Licence_Id");

        txtCustNicNumber.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtCustNicNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustNicNumberActionPerformed(evt);
            }
        });

        txtCustName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txtCustId.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txtCustDOB.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txtCustTelNumber.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 255));
        jLabel23.setText("Cust_Tel_Num");

        txtCustomerLicenceId.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/rmi/cab/resource/admin.png"))); // NOI18N
        jLabel2.setText("Customer Details");

        txtprice.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("Price");

        comboReservationId.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        comboReservationId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));
        comboReservationId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboReservationIdActionPerformed(evt);
            }
        });

        txtEndDate.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txtStartDate.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 255));
        jLabel28.setText("Vehicle_Id");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Start _Date");

        txtVehicleId.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("End_Date");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/rmi/cab/resource/reservationDetails.png"))); // NOI18N
        jLabel12.setText("     Reseve Detail");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 255));
        jLabel26.setText("Reservation_ID");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 255));
        jLabel27.setText("Payment_ID");

        txtPaymentId.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtPaymentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaymentIdActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/rmi/cab/resource/vehicle.png"))); // NOI18N
        jLabel1.setText("Modify Vehicle Reservation  ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Start _Date");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("End_Date");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnModifyReservation.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnModifyReservation.setForeground(new java.awt.Color(51, 51, 255));
        btnModifyReservation.setText("Modify Reservation");
        btnModifyReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyReservationActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Search Available Vehicle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle Id", "Vehicle Brand", "Vehicle Insuarance Id", "Reg_No", "Colour", "Seating Capacity", "FuelType", "Status", "Price", "Insuarance_Company_Id "
            }
        ));
        table.setSelectionBackground(new java.awt.Color(51, 51, 51));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(456, 456, 456)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(txtCustNicNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCustDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel23)
                                .addGap(1, 1, 1)
                                .addComponent(txtCustTelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCustomerLicenceId, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel26)
                                                .addGap(60, 60, 60)
                                                .addComponent(comboReservationId, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel28)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtVehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtPaymentId, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnModifyReservation))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dateEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dateStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(txtCustNicNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCustDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCustTelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCustomerLicenceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboReservationId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPaymentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(txtVehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnModifyReservation)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustNicNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustNicNumberActionPerformed

        
        try {
            String nic=txtCustNicNumber.getText();
            if (nic.matches("[0-9]{9}[vV]")){
                //JOptionPane.showMessageDialog(this, "Valid NIC");
            }else{
                JOptionPane.showMessageDialog(this, "Invalid NIC");
            }
            List<ReservationDTO>reservationDTOs=ReservationController.serchReserveIdForModifyReservation(nic);
            if(reservationDTOs!=null){
                for (ReservationDTO reservationDTO : reservationDTOs) {
                    comboReservationId.setSelectedIndex(0);
                    comboReservationId.addItem(reservationDTO.getReseveId());
                }
            }

            CustomerDTO customerDTO=CustomerController.findBYNicNumber(nic);
            if(customerDTO!=null){
                txtCustId.setText(customerDTO.getCustId()+"");
                txtCustName.setText(customerDTO.getCustName());
                txtCustomerLicenceId.setText(customerDTO.getCustLicenseId());
                txtCustTelNumber.setText(customerDTO.getCustTelNumber());
                txtCustDOB.setText(customerDTO.getCustDob());

            }else{
                JOptionPane.showMessageDialog(this,"No Such Customer");
            }
        } catch (Exception ex) {
            Logger.getLogger(SerchVehicleForModifyReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_txtCustNicNumberActionPerformed

    private void comboReservationIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboReservationIdActionPerformed
        
        try {
            String rid=comboReservationId.getSelectedItem().toString();
            List<PaymentDTO>paymentDTOs=paymentController.serchDetailsForModifyReservation(rid);
            if(paymentDTOs!=null){
                for (PaymentDTO paymentDTO : paymentDTOs) {
                    txtPaymentId.setText(paymentDTO.getPaymentId()+"");
                    txtStartDate.setText(paymentDTO.getReservationDTO().getStartDate());
                    txtEndDate.setText(paymentDTO.getReservationDTO().getEndDate());
                    txtVehicleId.setText(paymentDTO.getReservationDTO().getVehicleDTO().getVehicleId()+"");
                    txtprice.setText(paymentDTO.getReservationDTO().getPrice()+"");

                }
            }
        } catch (Exception ex) {
            Logger.getLogger(SerchVehicleForModifyReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_comboReservationIdActionPerformed

    private void txtPaymentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentIdActionPerformed

    private void btnModifyReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyReservationActionPerformed
        int cust_Id=Integer.parseInt(txtCustId.getText());
        String custName=txtCustName.getText();
        String custDOB=txtCustDOB.getText();
        String custLicenId=txtCustomerLicenceId.getText();
        String custNic=txtCustNicNumber.getText();
        String custTelNum=txtCustTelNumber.getText();

        String reservationId=comboReservationId.getSelectedItem().toString();
       // String startDate=dateStartDate.getDate()+"";
        //String endDate=dateEndDate.getDate()+"";
        
         
            Date startDate=dateStartDate.getDate();
            SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            String formateDateStart=df.format(startDate);

            Date endDate=dateEndDate.getDate();
            SimpleDateFormat dfe=new SimpleDateFormat("yyyy-MM-dd");
            String formatDateEnd=dfe.format(endDate);
         
        double price=Double.parseDouble(txtprice.getText());

        int vehicleId=Integer.parseInt(txtVehicleId.getText());

        int paymentId=Integer.parseInt(txtPaymentId.getText());

        ModifyReservation modiryReservation=new ModifyReservation(cust_Id,custName,custDOB,custLicenId,custNic,custTelNum,reservationId,formateDateStart,formatDateEnd,price,vehicleId,paymentId);
        modiryReservation.setSize(this.getSize());
        this.removeAll();
        this.add(modiryReservation);
        this.repaint();
        this.revalidate();
//        m.setSize(this.getSize());
//        this.removeAll();
//        this.add(m);
//        this.repaint();
//        this.revalidate();

    }//GEN-LAST:event_btnModifyReservationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    try {
        this.in=dateStartDate.getDate()+"";
        this.out=dateEndDate.getDate()+"";
        
        List<ReservationDTO> reservationDTOs=ReservationController.getAllAvailableVehicle(in,out);
        DefaultTableModel dtm=(DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        
        for (ReservationDTO reservationDTO : reservationDTOs) {
            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+reservationDTO.getVehicleDTO().getVehicleId());
            try {
                VehicleDTO v=VehicleController.findVehicle(reservationDTO.getVehicleDTO().getVehicleId());
                Object[]row={v.getVehicleId(),v.getVehicleBrand(),v.getVehicleInsuaranceId(),v.getRegNo(),v.getColour(),
                    v.getSeatingCapacity(),v.getFuelType(),v.getStatus(),v.getPrice(),v.getInsuaranceCompanyDTO().getInsuaranceCompanyId()
                };
                dtm.addRow(row);
            } catch (Exception ex) {
                Logger.getLogger(SerchAvailableVehicle.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        int x=dtm.getRowCount();
        if(x==0){
            JOptionPane.showMessageDialog(this,"All Vehicles are Reseved ");
        }
    } catch (Exception ex) {
        Logger.getLogger(SerchVehicleForModifyReservation.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel dtm=(DefaultTableModel) table.getModel();
        //        String startDate=txtStartDate.getText();
        //        String endDate=txtEndDate.getText();
        int vehicleId=(int) table.getValueAt(table.getSelectedRow(),0);
        txtVehicleId.setText(vehicleId+"");
        //        String vehicleBrand= (String) table.getValueAt(table.getSelectedRow(),1);
        //        String vehicleInsuaranceId= (String) table.getValueAt(table.getSelectedRow(),2);
        //        String vehicleRegNum= (String) table.getValueAt(table.getSelectedRow(),3);
        //        String vehicleColour= (String) table.getValueAt(table.getSelectedRow(),4);
        //        int vehicleSeatinCapacity= (int) table.getValueAt(table.getSelectedRow(),5);
        //        String vehicleFuelType = (String) table.getValueAt(table.getSelectedRow(),6);
        //        String vehicleStatus= (String) table.getValueAt(table.getSelectedRow(),7);
               Double vehiclePrice= (Double) table.getValueAt(table.getSelectedRow(),8);
               txtprice.setText(vehiclePrice+"");
        //        String vehicleInsuaranceCompanyId= (String) table.getValueAt(table.getSelectedRow(),9);
        //
        //        VehicleReserveForm vehicleReserveForm=new VehicleReserveForm(startDate,endDate,vehicleId,vehicleBrand,vehicleInsuaranceId,
            //            vehicleRegNum,vehicleColour,vehicleSeatinCapacity,vehicleFuelType,vehicleStatus,vehiclePrice,vehicleInsuaranceCompanyId);
        //        vehicleReserveForm.setSize(this.getSize());
        //        this.removeAll();
        //        this.add(vehicleReserveForm);
        //        this.repaint();
        //        this.revalidate();

        //
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModifyReservation;
    private javax.swing.JComboBox<String> comboReservationId;
    private org.jdesktop.swingx.JXDatePicker dateEndDate;
    private org.jdesktop.swingx.JXDatePicker dateStartDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCustDOB;
    private javax.swing.JTextField txtCustId;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtCustNicNumber;
    private javax.swing.JTextField txtCustTelNumber;
    private javax.swing.JTextField txtCustomerLicenceId;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtPaymentId;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtVehicleId;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
       private void desableTheDate() {
        Calendar c1=Calendar.getInstance();
        c1.add(Calendar.DATE, 0);
        dateStartDate.getMonthView().setLowerBound(c1.getTime());
        dateEndDate.getMonthView().setLowerBound(c1.getTime());
    }
}