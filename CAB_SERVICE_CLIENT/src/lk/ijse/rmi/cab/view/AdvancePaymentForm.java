/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

import lk.ijse.rmi.cab.controller.ReservationController;
import lk.ijse.rmi.cab.controller.VehicleController;
import lk.ijse.rmi.cab.controller.paymentController;
import lk.ijse.rmi.cab.dto.CustomerDTO;
import lk.ijse.rmi.cab.dto.InsuaranceCompanyDTO;
import lk.ijse.rmi.cab.dto.PaymentDTO;
import lk.ijse.rmi.cab.dto.ReservationDTO;
import lk.ijse.rmi.cab.dto.VehicleDTO;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author user
 */
public class AdvancePaymentForm extends javax.swing.JPanel {
    String checkIN;
    String checkOut;
    long fullCost;
    /**
     * Creates new form AdvancePaymentForm
     */
    public AdvancePaymentForm() {
        initComponents();
        showDate();
        loadDate();
        
        
    }



    AdvancePaymentForm(String ReservationId, String checkIn, String checkOut, int vehicleId, String custName, String custNic, String custLicenId, String custTel, String custDOB, String vehicleBrand, String vehicleInsuaranceId, String vehicleRegNumber, String vehiclcolour, int vehicleSeatingCapacity, String vehicleFuelType, String vehicleStatus, Double vehiclePrice, String vehicleInsuaranceCompanyID, String vehicleInsuaranceCompanyName, String vehicleInsuaranceCompanyType) {
        initComponents();
        this.txtReservationId.setText(ReservationId);
        
        //dateCount();
        this.checkIN=checkIn;
        this.checkOut=checkOut;
       
        this.txtStartDate.setText(this.checkIN);
        this.txtEndDate.setText(this.checkOut);
        //this.txtCustomerId.setText(custId);
        this.txtVehicleId.setText(vehicleId+"");
        
        this.txtCustName.setText(custName);
        this.txtCustomerNiceNumber.setText(custNic);
        this.txtCustLicenId.setText(custLicenId);
        this.txtCustTel.setText(custTel);
        this.txtCustDOB.setText(custDOB);
        
        this.txtVehicleBrand.setText(vehicleBrand);
        this.txtVehicleInsuaranceId.setText(vehicleInsuaranceId);
        this.txtVehicleRegNo.setText(vehicleRegNumber);
        this.txtVehicleColour.setText(vehiclcolour);
        this.txtVehicleSeatingCapacity.setText(vehicleSeatingCapacity+"");
        this.txtVehicleFuelType.setText(vehicleFuelType);
        this.txtVehicleStatus.setText(vehicleStatus);
        this.txtPrice.setText(vehiclePrice+"");
        this.txtVehicleInsuaranceCompanyId.setText(vehicleInsuaranceCompanyID);
        
        this.txtVehicleInsuaranceCompanyType.setText(vehicleInsuaranceCompanyName);
        this.txtVehicleInsuaranceCompanyName.setText(vehicleInsuaranceCompanyName);
        this.txtVehicleInsuaranceCompanyType.setText(vehicleInsuaranceCompanyType);
        dateCount();
        
        
    }

    
    
    private void dateCount(){
            try {
                showDate();
                
                SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
                String in1 = checkIN;
                String in2 = checkOut;
                Date d1 = s1.parse(in1);
                Date d2 = s1.parse(in2);
                
                long diff = d2.getTime() - d1.getTime();
                long x = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
                System.out.println("Day : " + x);
                int vehicleId = Integer.parseInt(txtVehicleId.getText());
                
              
                try {
                    VehicleDTO vehicleDTO=VehicleController.findVehicle(vehicleId);
                    if(vehicleDTO!=null){
                        double vehiclePrice=vehicleDTO.getPrice();
                        System.out.println("fdjflsjfljsflkjslkfjls"+vehiclePrice);
                        fullCost = (long) (x * vehiclePrice);
                        txtAmount.setText( fullCost+"");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(AdvancePaymentForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
               
            } catch (ParseException ex) {
                Logger.getLogger(AdvancePaymentForm.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelpaymentdetail = new javax.swing.JLabel();
        labelguestid = new javax.swing.JLabel();
        labeladvance = new javax.swing.JLabel();
        labeldate = new javax.swing.JLabel();
        labeltime = new javax.swing.JLabel();
        labelamount = new javax.swing.JLabel();
        txtVehicleId = new javax.swing.JTextField();
        txtOfCurrentDate = new javax.swing.JTextField();
        textadvance = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        labelreservationid1 = new javax.swing.JLabel();
        labelreservationid2 = new javax.swing.JLabel();
        txtReservationId = new javax.swing.JTextField();
        txtCustomerId = new javax.swing.JTextField();
        txtArrears = new javax.swing.JTextField();
        labelarrears = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtOfCurrentTime = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        labelpaymentdetail1 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        txtEndDate = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JLabel();
        txtCustomerNiceNumber = new javax.swing.JLabel();
        txtPrice = new javax.swing.JLabel();
        txtCustDOB = new javax.swing.JLabel();
        txtCustName = new javax.swing.JLabel();
        txtCustTel = new javax.swing.JLabel();
        txtVehicleBrand = new javax.swing.JLabel();
        txtCustLicenId = new javax.swing.JLabel();
        txtVehicleRegNo = new javax.swing.JLabel();
        txtVehicleSeatingCapacity = new javax.swing.JLabel();
        txtVehicleInsuaranceId = new javax.swing.JLabel();
        txtVehicleFuelType = new javax.swing.JLabel();
        txtVehicleStatus = new javax.swing.JLabel();
        txtVehicleInsuaranceCompanyType = new javax.swing.JLabel();
        txtVehicleInsuaranceCompanyName = new javax.swing.JLabel();
        txtVehicleInsuaranceCompanyId = new javax.swing.JLabel();
        txtVehicleColour = new javax.swing.JLabel();

        setBackground(new java.awt.Color(150, 40, 27));
        setPreferredSize(new java.awt.Dimension(1564, 0));

        labelpaymentdetail.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelpaymentdetail.setForeground(new java.awt.Color(51, 51, 255));
        labelpaymentdetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/rmi/cab/resource/payment.png"))); // NOI18N
        labelpaymentdetail.setText(" Payment Detail");

        labelguestid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelguestid.setForeground(new java.awt.Color(102, 102, 255));
        labelguestid.setText("Customer_Id");

        labeladvance.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labeladvance.setForeground(new java.awt.Color(102, 102, 255));
        labeladvance.setText("Advance");

        labeldate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labeldate.setForeground(new java.awt.Color(102, 102, 255));
        labeldate.setText("Date");

        labeltime.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labeltime.setForeground(new java.awt.Color(102, 102, 255));
        labeltime.setText("Time");

        labelamount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelamount.setForeground(new java.awt.Color(102, 102, 255));
        labelamount.setText("Full Amount");

        txtVehicleId.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtVehicleId.setBorder(null);
        txtVehicleId.setOpaque(false);
        txtVehicleId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleIdActionPerformed(evt);
            }
        });

        txtOfCurrentDate.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtOfCurrentDate.setBorder(null);
        txtOfCurrentDate.setOpaque(false);
        txtOfCurrentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOfCurrentDateActionPerformed(evt);
            }
        });

        textadvance.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        textadvance.setBorder(null);
        textadvance.setOpaque(false);
        textadvance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textadvanceActionPerformed(evt);
            }
        });

        txtAmount.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtAmount.setBorder(null);
        txtAmount.setOpaque(false);
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnsave.setForeground(new java.awt.Color(102, 102, 255));
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/rmi/cab/resource/save.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Payment Id", "Reservation Id", "Date", "Time", "Amount", "Advance"
            }
        ));
        jScrollPane1.setViewportView(table);

        labelreservationid1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelreservationid1.setForeground(new java.awt.Color(102, 102, 255));
        labelreservationid1.setText("Reservation Id");

        labelreservationid2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelreservationid2.setForeground(new java.awt.Color(102, 102, 255));
        labelreservationid2.setText("Vehicle_Id");

        txtReservationId.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtReservationId.setBorder(null);
        txtReservationId.setOpaque(false);
        txtReservationId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReservationIdActionPerformed(evt);
            }
        });

        txtCustomerId.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtCustomerId.setBorder(null);
        txtCustomerId.setOpaque(false);
        txtCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerIdActionPerformed(evt);
            }
        });

        txtArrears.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtArrears.setBorder(null);
        txtArrears.setOpaque(false);

        labelarrears.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelarrears.setForeground(new java.awt.Color(102, 102, 255));
        labelarrears.setText("Arrears");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 0, 51));

        txtOfCurrentTime.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtOfCurrentTime.setBorder(null);
        txtOfCurrentTime.setOpaque(false);
        txtOfCurrentTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOfCurrentTimeActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));

        labelpaymentdetail1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelpaymentdetail1.setForeground(new java.awt.Color(102, 102, 255));
        labelpaymentdetail1.setText("       Payment Table");

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(150, 40, 27));
        jPanel1.setForeground(new java.awt.Color(150, 40, 27));

        txtEndDate.setForeground(new java.awt.Color(150, 40, 27));

        txtStartDate.setBackground(new java.awt.Color(255, 0, 0));
        txtStartDate.setForeground(new java.awt.Color(150, 40, 27));

        txtCustomerNiceNumber.setForeground(new java.awt.Color(150, 40, 27));

        txtPrice.setForeground(new java.awt.Color(150, 40, 27));

        txtCustDOB.setForeground(new java.awt.Color(150, 40, 27));

        txtCustName.setForeground(new java.awt.Color(150, 40, 27));

        txtCustTel.setForeground(new java.awt.Color(150, 40, 27));

        txtVehicleBrand.setForeground(new java.awt.Color(150, 40, 27));

        txtCustLicenId.setForeground(new java.awt.Color(150, 40, 27));

        txtVehicleRegNo.setForeground(new java.awt.Color(150, 40, 27));

        txtVehicleSeatingCapacity.setForeground(new java.awt.Color(150, 40, 27));

        txtVehicleInsuaranceId.setForeground(new java.awt.Color(150, 40, 27));

        txtVehicleFuelType.setForeground(new java.awt.Color(150, 40, 27));

        txtVehicleStatus.setForeground(new java.awt.Color(150, 40, 27));

        txtVehicleInsuaranceCompanyType.setForeground(new java.awt.Color(150, 40, 27));

        txtVehicleInsuaranceCompanyName.setForeground(new java.awt.Color(150, 40, 27));

        txtVehicleInsuaranceCompanyId.setForeground(new java.awt.Color(150, 40, 27));

        txtVehicleColour.setForeground(new java.awt.Color(150, 40, 27));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVehicleColour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtVehicleSeatingCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtVehicleFuelType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtVehicleStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtVehicleInsuaranceCompanyId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtVehicleInsuaranceCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtVehicleInsuaranceCompanyType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtCustomerNiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtCustDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtCustTel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(txtCustLicenId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtVehicleBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(txtVehicleInsuaranceId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtVehicleRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVehicleRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustLicenId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtVehicleBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtVehicleInsuaranceId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCustTel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerNiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVehicleStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehicleInsuaranceCompanyId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVehicleInsuaranceCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehicleInsuaranceCompanyType, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtVehicleColour, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtVehicleSeatingCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtVehicleFuelType, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(493, 493, 493)
                .addComponent(labelpaymentdetail, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(labelguestid)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(labeldate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(labelreservationid1))
                                            .addGap(80, 80, 80)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtReservationId)
                                        .addComponent(txtCustomerId)
                                        .addComponent(jSeparator3)
                                        .addComponent(txtOfCurrentDate)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelreservationid2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator4)
                                        .addComponent(txtVehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(256, 256, 256)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labeltime, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator6)
                                    .addComponent(txtOfCurrentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labeladvance, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelamount, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(77, 77, 77)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator7)
                                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(textadvance, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(labelarrears, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator10)
                            .addComponent(txtArrears, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(labelpaymentdetail1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(labelpaymentdetail)
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelamount))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labeladvance)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelarrears)
                                .addComponent(textadvance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtArrears, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(labelpaymentdetail1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelreservationid1)
                            .addComponent(txtReservationId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelguestid)
                            .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelreservationid2)
                            .addComponent(txtVehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labeldate)
                            .addComponent(txtOfCurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labeltime)
                            .addComponent(txtOfCurrentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsave)
                        .addGap(35, 35, 35)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtVehicleIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleIdActionPerformed
        System.out.println("");        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleIdActionPerformed

    private void txtOfCurrentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOfCurrentDateActionPerformed

    }//GEN-LAST:event_txtOfCurrentDateActionPerformed

    private void textadvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textadvanceActionPerformed
        double advanceCost = Double.parseDouble(textadvance.getText());
        double arreas = fullCost - advanceCost;
        txtArrears.setText("" + arreas);
    }//GEN-LAST:event_textadvanceActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        textadvance.requestFocus();
    }//GEN-LAST:event_txtAmountActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
            PaymentDTO paymentDTO=new PaymentDTO();
            paymentDTO.setDate(txtOfCurrentDate.getText());
            paymentDTO.setTime(txtOfCurrentTime.getText());
            paymentDTO.setAmmountPaid(Double.parseDouble(txtAmount.getText()));
            paymentDTO.setAdvance(Double.parseDouble(textadvance.getText()));
            
            ReservationDTO reservationDTO=new ReservationDTO();
            reservationDTO.setReseveId(txtReservationId.getText());
            reservationDTO.setStartDate(txtStartDate.getText());
            reservationDTO.setEndDate(txtEndDate.getText());
            reservationDTO.setPrice(Double.parseDouble(txtPrice.getText()));
            
            CustomerDTO customerDTO=new CustomerDTO();
            customerDTO.setCustId(Integer.parseInt(txtCustomerId.getText()));
            customerDTO.setCustName(txtCustName.getText());
            customerDTO.setCustNic(txtCustomerNiceNumber.getText());
            customerDTO.setCustLicenseId(txtCustLicenId.getText());
            customerDTO.setCustTelNumber(txtCustTel.getText());
            customerDTO.setCustDob(txtCustDOB.getText());
            
            
            VehicleDTO vehicleDTO=new VehicleDTO();
            vehicleDTO.setVehicleId(Integer.parseInt(txtVehicleId.getText()));
            vehicleDTO.setVehicleBrand(txtVehicleBrand.getText());
            vehicleDTO.setVehicleInsuaranceId(txtVehicleInsuaranceId.getText());
            vehicleDTO.setRegNo(txtVehicleRegNo.getText());
            vehicleDTO.setColour(txtVehicleColour.getText());
            vehicleDTO.setSeatingCapacity(Integer.parseInt(txtVehicleSeatingCapacity.getText()));
            vehicleDTO.setFuelType(txtVehicleFuelType.getText());
            vehicleDTO.setStatus(txtVehicleStatus.getText());
            vehicleDTO.setPrice(Double.parseDouble(txtPrice.getText()));
            
            InsuaranceCompanyDTO insuaranceCompanyDTO=new InsuaranceCompanyDTO();
            insuaranceCompanyDTO.setInsuaranceCompanyId(txtVehicleInsuaranceCompanyId.getText());
            insuaranceCompanyDTO.setCompanyName(txtVehicleInsuaranceCompanyName.getText());
            insuaranceCompanyDTO.setInsuaranceType(txtVehicleInsuaranceCompanyType.getText());
            
            vehicleDTO.setInsuaranceCompanyDTO(insuaranceCompanyDTO);
            reservationDTO.setCustomerDTO(customerDTO);
            reservationDTO.setVehicleDTO(vehicleDTO);
            
            
            paymentDTO.setReservationDTO(reservationDTO);
            
            boolean isAdded=paymentController.addPayment(paymentDTO);
            if(isAdded){
                loadDate();
                JOptionPane.showMessageDialog(this,"Added");
            }else{
                JOptionPane.showMessageDialog(this,"Not Added");
            }
        } catch (Exception ex) {
            Logger.getLogger(AdvancePaymentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerIdActionPerformed

    private void txtOfCurrentTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOfCurrentTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOfCurrentTimeActionPerformed

    private void txtReservationIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReservationIdActionPerformed
        try {
            String reservationId=txtReservationId.getText();
            ReservationDTO reservationDTO=ReservationController.findResrvation(reservationId);
            if(reservationDTO!=null){
                txtCustomerId.setText(reservationDTO.getCustomerDTO().getCustId()+"");
               txtVehicleId.setText(reservationDTO.getVehicleDTO().getVehicleId()+"");
                //txtAmount.setText(reservationDTO.getPrice()+"");
            }
        } catch (Exception ex) {
            Logger.getLogger(AdvancePaymentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtReservationIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel labeladvance;
    private javax.swing.JLabel labelamount;
    private javax.swing.JLabel labelarrears;
    private javax.swing.JLabel labeldate;
    private javax.swing.JLabel labelguestid;
    private javax.swing.JLabel labelpaymentdetail;
    private javax.swing.JLabel labelpaymentdetail1;
    private javax.swing.JLabel labelreservationid1;
    private javax.swing.JLabel labelreservationid2;
    private javax.swing.JLabel labeltime;
    private javax.swing.JTable table;
    private javax.swing.JTextField textadvance;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtArrears;
    private javax.swing.JLabel txtCustDOB;
    private javax.swing.JLabel txtCustLicenId;
    private javax.swing.JLabel txtCustName;
    private javax.swing.JLabel txtCustTel;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JLabel txtCustomerNiceNumber;
    private javax.swing.JLabel txtEndDate;
    private javax.swing.JTextField txtOfCurrentDate;
    private javax.swing.JTextField txtOfCurrentTime;
    private javax.swing.JLabel txtPrice;
    private javax.swing.JTextField txtReservationId;
    private javax.swing.JLabel txtStartDate;
    private javax.swing.JLabel txtVehicleBrand;
    private javax.swing.JLabel txtVehicleColour;
    private javax.swing.JLabel txtVehicleFuelType;
    private javax.swing.JTextField txtVehicleId;
    private javax.swing.JLabel txtVehicleInsuaranceCompanyId;
    private javax.swing.JLabel txtVehicleInsuaranceCompanyName;
    private javax.swing.JLabel txtVehicleInsuaranceCompanyType;
    private javax.swing.JLabel txtVehicleInsuaranceId;
    private javax.swing.JLabel txtVehicleRegNo;
    private javax.swing.JLabel txtVehicleSeatingCapacity;
    private javax.swing.JLabel txtVehicleStatus;
    // End of variables declaration//GEN-END:variables

    private void showDate() {
        Timer tTimer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                Calendar cal = new GregorianCalendar();
                Date d1 = new Date(); //java.util.Date ->get Current date and time
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String formatDate = df.format(d1);
                //checkIN.setText(formatDate);
                // checkOut.setText(formatDate);
                txtOfCurrentDate.setText(formatDate);

                int AM_PM = cal.get(Calendar.AM_PM);

                String day_night = "";
                if (AM_PM == 1) {
                    day_night = "PM";
                } else {
                    day_night = "AM";
                }
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                String formattedTime = sdf.format(d);
                txtOfCurrentTime.setText(formattedTime);
            }

        });
        tTimer.start();

    }

    private void loadDate() {
        try {
            DefaultTableModel dtm=(DefaultTableModel) table.getModel();
            dtm.setRowCount(0);
            
            List<PaymentDTO>paymentDTOs=paymentController.findAllPayments();
            
            for (PaymentDTO paymentDTO : paymentDTOs) {
                Object[] rowdate={
                    paymentDTO.getPaymentId(),
                    paymentDTO.getReservationDTO().getReseveId(),
                    paymentDTO.getDate(),
                    paymentDTO.getTime(),
                    paymentDTO.getAmmountPaid(),
                    paymentDTO.getAdvance()
                        
                };
                dtm.addRow(rowdate);
                
            }
        } catch (Exception ex) {
            Logger.getLogger(AdvancePaymentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    
}
