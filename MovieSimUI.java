
import java.text.NumberFormat;

import javax.swing.UIManager;

public class MovieSimUI extends javax.swing.JFrame {

    /**
     * Creates new form MovieSimUI
     */

    //Global Variables
    seatSelectionMenu ssm;
    int movieIndex;
    double seatCost;

    public MovieSimUI() {
        initComponents();
        
    }

    
    public void initComponents() {


        // Ui manager get the look and feel  of users
        // system and replicates that look for the gui
        try {
            UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieSimUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        popCornSizes = new javax.swing.ButtonGroup();
        drinkSizes = new javax.swing.ButtonGroup();
        movieSelection = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        seatSelectionButton = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();
        totalCostIntText = new javax.swing.JLabel();
        completePurchase = new javax.swing.JButton();
        smallPop = new javax.swing.JRadioButton();
        medPop = new javax.swing.JRadioButton();
        largePop = new javax.swing.JRadioButton();
        smallDrink = new javax.swing.JRadioButton();
        medDrink = new javax.swing.JRadioButton();
        largeDrink = new javax.swing.JRadioButton();
        drinkPic = new javax.swing.JLabel();
        popPic1 = new javax.swing.JLabel();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movie Theater Simulator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(450, 500));
        setResizable(false);

        // creating a movieSelection object
        // that holds the current movies
        // populates movie selection combo box with preMade movies
        movieSelection movSel = new movieSelection();
        
        

        movieSelection.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        movieSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] 
        {movSel.getMovieSelection(0).getName(),movSel.getMovieSelection(1).getName(),
        movSel.getMovieSelection(2).getName(),movSel.getMovieSelection(3).getName(),}));
        movieSelection.setToolTipText("");

        movieSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
                
                
                // creates a new seatMenu
                ssm = new seatSelectionMenu();

                // gets the movies index in respect to the combo Box 
                movieIndex = movieSelection.getSelectedIndex();

                // get the price of said movie
                seatCost = movSel.getMovieSelection(movieIndex).getTicketPrice();

                // formats the double to look like currency
                NumberFormat formatter = NumberFormat.getCurrencyInstance();
                // displays correct price per seat in the seat selection menu
                ssm.perSeatCost.setText(formatter.format(seatCost));
                // work on getting correct movie from this box
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Movie Selection:");

        seatSelectionButton.setText("Seat Selection Menu");
        seatSelectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatSelectionButtonActionPerformed(evt);
            }
        });

        totalLabel.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        totalLabel.setText("Total:");

        totalCostIntText.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        totalCostIntText.setText("$0.00");

        completePurchase.setText("Complete Purchase");

        popCornSizes.add(smallPop);
        smallPop.setText("Small");

        popCornSizes.add(medPop);
        medPop.setText("Medium");

        popCornSizes.add(largePop);
        largePop.setText("Large");

        drinkSizes.add(smallDrink);
        smallDrink.setText("Small");

        drinkSizes.add(medDrink);
        medDrink.setText("Medium");

        drinkSizes.add(largeDrink);
        largeDrink.setText("Large");

        drinkPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("drinkPic.jpg")));

        popPic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("popPic.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(movieSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(totalCostIntText)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(popPic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(218, 218, 218))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(completePurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatSelectionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(medPop, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(smallPop, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(largePop, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(largeDrink)
                                    .addComponent(smallDrink)
                                    .addComponent(medDrink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(drinkPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movieSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatSelectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalCostIntText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(popPic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(drinkPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(smallDrink)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(medDrink)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(largeDrink))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(smallPop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(medPop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(largePop)))
                        .addGap(62, 62, 62)))
                .addComponent(completePurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        pack();
    }

    private void seatSelectionButtonActionPerformed(java.awt.event.ActionEvent evt) {

        // if a movie has not been selected yet
        // this method will just return
        try {
            ssm.setVisible(true);   
        } catch (Exception e) {
            //TODO: handle exception
            return;
        }


        
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration
    private javax.swing.JButton completePurchase;
    private javax.swing.JLabel drinkPic;
    private javax.swing.ButtonGroup drinkSizes;
    private javax.swing.JComboBox<String> movieSelection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton largeDrink;
    private javax.swing.JRadioButton largePop;
    private javax.swing.JRadioButton medDrink;
    private javax.swing.JRadioButton medPop;
    private javax.swing.ButtonGroup popCornSizes;
    private javax.swing.JLabel popPic1;
    private javax.swing.JButton seatSelectionButton;
    private javax.swing.JRadioButton smallDrink;
    private javax.swing.JRadioButton smallPop;
    private javax.swing.JLabel totalCostIntText;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration
}
