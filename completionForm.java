import java.util.ArrayList;

public class completionForm extends javax.swing.JFrame {

    private Movie mov;
    private String seats;
    private seatSelection seatSel = new seatSelection();
   
    public completionForm(Movie mov, ArrayList<String> seats) {
        this.mov = mov;
        this.seats = seatSel.seatsToString(seats);
        initComponents();
    }

    private void initComponents() {

        tickerNumberText = new javax.swing.JLabel();
        seatNumbersText = new javax.swing.JLabel();
        movieNameText = new javax.swing.JLabel();
        tickerNumber = new javax.swing.JLabel();
        seatNumbers = new javax.swing.JLabel();
        movieName = new javax.swing.JLabel();
        closeAll = new javax.swing.JButton();
        
        // mock account made to print in final dialog box
        MovieAccount mv = new MovieAccount(500, "John doe");
        mv.setId();
        mv.setBalance(500);
        mv.setName("Will Smith");

    
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tickerNumberText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tickerNumberText.setText("Tickect Number:");

        seatNumbersText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        seatNumbersText.setText("Seat Number(s):");

        movieNameText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        movieNameText.setText("Movie Name:");

        tickerNumber.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tickerNumber.setText(String.valueOf(mv.getId()));

        seatNumbers.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        seatNumbers.setText(this.seats);

        movieName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        movieName.setText(mov.getName());

        closeAll.setBackground(new java.awt.Color(255, 0, 0));
        closeAll.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        closeAll.setText("Close");
        closeAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);  
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closeAll)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(seatNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(movieNameText)
                            .addGap(18, 18, 18)
                            .addComponent(movieName))
                        .addComponent(seatNumbersText)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tickerNumberText)
                            .addGap(18, 18, 18)
                            .addComponent(tickerNumber))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tickerNumberText)
                    .addComponent(tickerNumber))
                .addGap(18, 18, 18)
                .addComponent(seatNumbersText)
                .addGap(26, 26, 26)
                .addComponent(seatNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movieNameText)
                    .addComponent(movieName))
                .addGap(18, 18, 18)
                .addComponent(closeAll)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeAll;
    private javax.swing.JLabel movieName;
    private javax.swing.JLabel movieNameText;
    private javax.swing.JLabel seatNumbers;
    private javax.swing.JLabel seatNumbersText;
    private javax.swing.JLabel tickerNumber;
    private javax.swing.JLabel tickerNumberText;
    // End of variables declaration//GEN-END:variables
}
