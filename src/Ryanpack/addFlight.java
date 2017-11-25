package Ryanpack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class addFlight extends javax.swing.JFrame {
    
    Admin admin = new Admin();

    /**
     * Creates new form CreateFlightGUI
     */
    public addFlight() {
        initComponents();
        
        // add padding to text fields
        admin.addPaddingToJTextField(fromFld);
        admin.addPaddingToJTextField(toFld);
        admin.addPaddingToJTextField(departureFld);
        admin.addPaddingToJTextField(arrivalFld);
    }
    
    private String generateFlightID(){
        Random flightNumberGenerator = new Random();
        int flightID = flightNumberGenerator.nextInt(99999 - 00000 + 1) + 00000;
        return Integer.toString(flightID);
    }
    
    private String generatePilotID(){
        Random pilotNumberGenerator = new Random();
        int pilotID = pilotNumberGenerator.nextInt(999 - 000 + 1) + 000;
        return Integer.toString(pilotID);
    }
    
    private String calculateFlightDuration(){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        Date departure;
        Date arrival;
        long duration = 0;

        try {
            departure = format.parse(departureFld.getText());
            
            arrival = format.parse(arrivalFld.getText());

            long difference = arrival.getTime() - departure.getTime();
            long durationInHours = difference / (60 * 60 * 1000) % 24;
            long durationInDays = difference / (24 * 60 * 60 * 1000);

            duration = (durationInDays * 24) + durationInHours;
            
        } catch (ParseException ex) {
            Logger.getLogger(addFlight.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return Long.toString(duration);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        instructionsLbl = new javax.swing.JLabel();
        fromLbl = new javax.swing.JLabel();
        fromFld = new javax.swing.JTextField();
        toLbl = new javax.swing.JLabel();
        toFld = new javax.swing.JTextField();
        departureLbl = new javax.swing.JLabel();
        departureFld = new javax.swing.JTextField();
        arrivalLbl = new javax.swing.JLabel();
        arrivalFld = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        departureFormatLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ryanair - Add Flight");
        setResizable(false);

        instructionsLbl.setText("Please enter the flight details below:");

        fromLbl.setText("From:");

        toLbl.setText("To:");

        departureLbl.setText("Departure Time:");

        arrivalLbl.setText("Arrival Time:");

        addBtn.setText("Add Flight");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        departureFormatLbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        departureFormatLbl.setForeground(java.awt.Color.gray);
        departureFormatLbl.setText("dd/mm/yyyy hh:mm");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel1.setForeground(java.awt.Color.gray);
        jLabel1.setText("dd/mm/yyyy hh:mm");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel2.setForeground(java.awt.Color.gray);
        jLabel2.setText("city, country");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel3.setForeground(java.awt.Color.gray);
        jLabel3.setText("city, country");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromFld)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fromLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(toFld)
                    .addComponent(departureFld)
                    .addComponent(arrivalFld)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(instructionsLbl)
                        .addGap(0, 160, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(toLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(departureLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(departureFormatLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(arrivalLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instructionsLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromLbl)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fromFld, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toLbl)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departureLbl)
                    .addComponent(departureFormatLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(departureFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrivalLbl)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arrivalFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel)admin.table.getModel();
        Object[] newFlight = { "F"+generateFlightID(), "P"+generatePilotID(), fromFld.getText(), toFld.getText(), departureFld.getText(), arrivalFld.getText(), calculateFlightDuration() };
        model.addRow(newFlight);
        this.dispose();
        admin.saveData();
    }//GEN-LAST:event_addBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField arrivalFld;
    private javax.swing.JLabel arrivalLbl;
    private javax.swing.JTextField departureFld;
    private javax.swing.JLabel departureFormatLbl;
    private javax.swing.JLabel departureLbl;
    private javax.swing.JTextField fromFld;
    private javax.swing.JLabel fromLbl;
    private javax.swing.JLabel instructionsLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField toFld;
    private javax.swing.JLabel toLbl;
    // End of variables declaration//GEN-END:variables
}