/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u1a4_daisyzho;

/**
 *
 * @author 342795564
 */
public class U1A4_DaisyZhou extends javax.swing.JFrame {
    String [][] studentInfo = new String [30][6];
    String nothing = "";
    int counter = 0;
    
    /**
     * Creates new form U1A4_DaisyZhou
     */
    public U1A4_DaisyZhou() {
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

        jTextField2 = new javax.swing.JTextField();
        studentGrades = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        testOneLabel = new javax.swing.JLabel();
        testTwoLabel = new javax.swing.JLabel();
        testThreeLabel = new javax.swing.JLabel();
        testFourLabel = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        testOne = new javax.swing.JTextField();
        testFour = new javax.swing.JTextField();
        testTwo = new javax.swing.JTextField();
        testThree = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        add = new javax.swing.JButton();
        list = new javax.swing.JButton();
        studentAverage = new javax.swing.JButton();
        classAverage = new javax.swing.JButton();
        message = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Students Grades Program");

        studentGrades.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        studentGrades.setText("Students Grades");

        lastNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastNameLabel.setText("Last Name:");

        firstNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstNameLabel.setText("First Name:");

        testOneLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        testOneLabel.setText("Test 1:");

        testTwoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        testTwoLabel.setText("Test 2:");

        testThreeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        testThreeLabel.setText("Test 3:");

        testFourLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        testFourLabel.setText("Test 4:");

        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });

        testOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testOneActionPerformed(evt);
            }
        });

        output.setEditable(false);
        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        list.setText("List");
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });

        studentAverage.setText("Student Average");
        studentAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentAverageActionPerformed(evt);
            }
        });

        classAverage.setText("Class Average");
        classAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classAverageActionPerformed(evt);
            }
        });

        message.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstName, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(lastName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(testTwoLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(testTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(testThreeLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(testThree))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(testFourLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(testFour))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(testOneLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(testOne, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(list)))))
                .addGap(41, 41, 41)
                .addComponent(studentAverage)
                .addGap(37, 37, 37)
                .addComponent(classAverage)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(studentGrades)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(476, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameLabel)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testOneLabel)
                            .addComponent(testOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testTwoLabel)
                            .addComponent(testTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testThreeLabel)
                            .addComponent(testThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testFourLabel)
                            .addComponent(testFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(studentGrades)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentAverage)
                        .addComponent(classAverage))
                    .addComponent(list))
                .addGap(18, 18, 18)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(firstNameLabel)
                    .addContainerGap(353, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void testOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testOneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testOneActionPerformed

    private void studentAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentAverageActionPerformed
        // TODO add your handling code here:
        String checkFirstName = firstName.getText(), checkLastName = lastName.getText(), testOneInput = testOne.getText(), testTwoInput = testTwo.getText(), testThreeInput = testThree.getText(), testFourInput = testFour.getText();
        boolean kidInArray = false;    
        for (int j = 0; j <= studentInfo.length; j++) {
            if (checkFirstName.equals(studentInfo[j])){ //Array.equals??
                for (int k = 1; k < 2; k++){ //atp the for loop is just for fun...
                    if (checkLastName.equals(studentInfo[j][k])){
                        kidInArray = true;
                        double testNoOne = Double.parseDouble(testOneInput); 
                        double testNoTwo = Double.parseDouble(testTwoInput); //maybe not in the for loop even though it isn't really a loop...
                        double testNoThree = Double.parseDouble(testThreeInput);
                        double testNoFour = Double.parseDouble(testFourInput);
                        double average = Math.round((testNoOne + testNoTwo + testNoThree + testNoFour)/4); //WHY ARE YOU NEVER REEEEAAAADDDDDDD
                        message.setText(checkFirstName + " " + checkLastName + "'s average is " + average);
                        break;
                    }
                }
            }
        }
        if (!kidInArray) {
            message.setText(checkFirstName + " " + checkLastName + " is not in the array. Make sure you have spelt their name correctly and check they are in the array by pressing the list button."); //I sure hope it prints on two lines...
        }
    }//GEN-LAST:event_studentAverageActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String firstNameInput = firstName.getText(), lastNameInput = lastName.getText(), testOneInput = testOne.getText(), testTwoInput = testTwo.getText(), testThreeInput = testThree.getText(), testFourInput = testFour.getText();

        if(firstNameInput.equals("")) { 
            message.setText("Please enter in your first name.");
            return; 
        }
        
        if(lastNameInput.equals("")) {
            message.setText("Please enter in your last name.");
            return; 
        }
        
        if(testOneInput.equals("")) {
            message.setText("Please input your mark for test one.");
            return;
        }
        
        if(testTwoInput.equals("")) {
            message.setText("Please input your mark for test two.");
            return;
        }
        
        if(testThreeInput.equals("")) {
            message.setText("Please input your mark for test three.");
            return;
        }
        
        if(testFourInput.equals("")) {
            message.setText("Please input your mark for test four."); //make sure no duplicate names too
            return; //why is this unnecessary???
        }
//maybe use a try catch in this
           try {
            double testNoOne = Double.parseDouble(testOneInput); //why is it never read
            double testNoTwo = Double.parseDouble(testTwoInput);
            double testNoThree = Double.parseDouble(testThreeInput);
            double testNoFour = Double.parseDouble(testFourInput);
            //if (testNoOne) 
            for (int row = 0; row < studentInfo.length; row++){
                for (int col = 0; col < 6; col++) {
                    if (col == 0){
                        studentInfo[row][0] = firstNameInput;
                    } else if (col == 1) {
                        studentInfo[row][1] = lastNameInput;
                    } else if (col == 2) {
                        studentInfo[row][2] = testOneInput;
                    } else if (col == 3) {
                        studentInfo[row][3] = testTwoInput;
                    } else if (col == 4) {
                        studentInfo[row][4] = testThreeInput;
                    } else if (col == 5) {
                        studentInfo[row][5] = testFourInput;
                    }
                }
                output.setText("\n");
                counter++;
            }
            if (counter == 30) {
             message.setText("You have already entered information for your thirtieth student. You may not enter anymore information");
             return;
         }
           } catch (NumberFormatException e ) { 
               message.setText("Please ensure that the numbers you have entered for your test scores are numbers.");
           }
        }
    }//GEN-LAST:event_addActionPerformed

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        // TODO add your handling code here:
        /*for (String[] row1 : studentInfo) {
            for (String column : row1){
                System.out.println(column);
            }*/
        output.setText("");
        for (int row1 = 0; row1 < studentInfo.length; row1++) { //does the 1 matter since it was in a private void?
            for (int col1 = 0; col1 < 6; col1++) {
                output.setText(nothing + studentInfo[row1][col1] + " "); //enhanced for loop as in for each?
            }
            output.setText("\n");
        }
    }//GEN-LAST:event_listActionPerformed

    private void classAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classAverageActionPerformed
        // TODO add your handling code here:
        for (int p = 0; p <= studentInfo.length; p++){
            for (int h = 2; h < 6; h++) { //multiply counter by 4 to know what to divide by
                double grade = Double.parseDouble(testOne.getText()); //think of this later
            }
        }
    }//GEN-LAST:event_classAverageActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(U1A4_DaisyZhou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(U1A4_DaisyZhou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(U1A4_DaisyZhou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(U1A4_DaisyZhou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new U1A4_DaisyZhou().setVisible(true);
            }
        });
    }
    /* if (col == 0){
                        studentInfo[row][col] = firstNameInput;
                    } else if (col == 1) {
                        studentInfo[row][col] = lastNameInput;
                    } else if (col == 2) {
                        studentInfo[row][col] = testOneInput;
                    } else if (col == 3) {
                        studentInfo[row][3] = testTwoInput;
                    } else if (col == 4) {
                        studentInfo[row][4] = testThreeInput;
                    } else if (col == 5) {
                        studentInfo[row][5] = testFourInput;
                    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton classAverage;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton list;
    private javax.swing.JTextField message;
    private javax.swing.JTextArea output;
    private javax.swing.JButton studentAverage;
    private javax.swing.JLabel studentGrades;
    private javax.swing.JTextField testFour;
    private javax.swing.JLabel testFourLabel;
    private javax.swing.JTextField testOne;
    private javax.swing.JLabel testOneLabel;
    private javax.swing.JTextField testThree;
    private javax.swing.JLabel testThreeLabel;
    private javax.swing.JTextField testTwo;
    private javax.swing.JLabel testTwoLabel;
    // End of variables declaration//GEN-END:variables
}
