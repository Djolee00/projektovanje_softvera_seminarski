/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schoolmanagement.view.admin;

import schoolmanagement.view.student.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

/**
 *
 * @author ivano
 */
public class AdminGroupsView extends javax.swing.JFrame {

    /**
     * Creates new form StudentHomeView
     */
    public AdminGroupsView() {
        initComponents();
        setLocationRelativeTo(null);
                designTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        lblUserText3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUserText2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGroups = new javax.swing.JTable();
        panelSearch1 = new javax.swing.JPanel();
        btnUpdateStudents = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnAddStudentToGroup = new javax.swing.JButton();
        btnRemoveStudentFromGroup = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        btnUpdateGroupInfo = new javax.swing.JButton();
        btnAddGroup = new javax.swing.JButton();
        panelSearch2 = new javax.swing.JPanel();
        btnUpdateTutors = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        btnAddTutorToGroup = new javax.swing.JButton();
        btnRemoveTutorFromGroup = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 640));
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setMaximumSize(new java.awt.Dimension(900, 640));
        panelMain.setMinimumSize(new java.awt.Dimension(900, 640));
        panelMain.setPreferredSize(new java.awt.Dimension(900, 640));

        panelHeader.setBackground(new java.awt.Color(45, 118, 232));

        lblUserText3.setBackground(new java.awt.Color(45, 118, 232));
        lblUserText3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        lblUserText3.setForeground(new java.awt.Color(255, 255, 255));
        lblUserText3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUserText3.setText("GROUPS");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagement/images/groups.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagement/images/home.png"))); // NOI18N

        lblUserText2.setBackground(new java.awt.Color(45, 118, 232));
        lblUserText2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserText2.setForeground(new java.awt.Color(255, 255, 255));
        lblUserText2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUserText2.setText("Naziv kursa");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addComponent(lblUserText2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addComponent(lblUserText3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 425, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17))))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelHeaderLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblUserText3))
                            .addGroup(panelHeaderLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUserText2))
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        tblGroups.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Number of students"
            }
        ));
        tblGroups.setFocusable(false);
        tblGroups.setRowHeight(25);
        tblGroups.setSelectionBackground(new java.awt.Color(232, 57, 99));
        tblGroups.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tblGroups.setShowGrid(true);
        tblGroups.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblGroups);

        panelSearch1.setBorder(javax.swing.BorderFactory.createTitledBorder("Students"));

        btnUpdateStudents.setText("Update");

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Available", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jList1.setFocusable(false);
        jScrollPane2.setViewportView(jList1);

        btnAddStudentToGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagement/images/rightArrow.png"))); // NOI18N

        btnRemoveStudentFromGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagement/images/leftArrow.png"))); // NOI18N

        jList2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Attending", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jList2.setFocusable(false);
        jScrollPane3.setViewportView(jList2);

        javax.swing.GroupLayout panelSearch1Layout = new javax.swing.GroupLayout(panelSearch1);
        panelSearch1.setLayout(panelSearch1Layout);
        panelSearch1Layout.setHorizontalGroup(
            panelSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearch1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnUpdateStudents)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelSearch1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSearch1Layout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addGap(55, 55, 55))
                    .addGroup(panelSearch1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(panelSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddStudentToGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(btnRemoveStudentFromGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(99, Short.MAX_VALUE))))
        );
        panelSearch1Layout.setVerticalGroup(
            panelSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearch1Layout.createSequentialGroup()
                .addGroup(panelSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSearch1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnAddStudentToGroup)
                        .addGap(36, 36, 36)
                        .addComponent(btnRemoveStudentFromGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSearch1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateStudents)
                .addContainerGap())
        );

        btnUpdateGroupInfo.setText("Update groups");

        btnAddGroup.setText("Add group");

        panelSearch2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tutors"));

        btnUpdateTutors.setText("Update");

        jList3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Available", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jList3.setFocusable(false);
        jScrollPane4.setViewportView(jList3);

        btnAddTutorToGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagement/images/rightArrow.png"))); // NOI18N

        btnRemoveTutorFromGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagement/images/leftArrow.png"))); // NOI18N

        jList4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Delegated", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jList4.setFocusable(false);
        jScrollPane5.setViewportView(jList4);

        javax.swing.GroupLayout panelSearch2Layout = new javax.swing.GroupLayout(panelSearch2);
        panelSearch2.setLayout(panelSearch2Layout);
        panelSearch2Layout.setHorizontalGroup(
            panelSearch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearch2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnUpdateTutors)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelSearch2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelSearch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSearch2Layout.createSequentialGroup()
                        .addComponent(jSeparator4)
                        .addGap(55, 55, 55))
                    .addGroup(panelSearch2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(panelSearch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddTutorToGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(btnRemoveTutorFromGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(99, Short.MAX_VALUE))))
        );
        panelSearch2Layout.setVerticalGroup(
            panelSearch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearch2Layout.createSequentialGroup()
                .addGroup(panelSearch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSearch2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnAddTutorToGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnRemoveTutorFromGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSearch2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelSearch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateTutors)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(btnAddGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btnUpdateGroupInfo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSearch2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdateGroupInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(panelSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelSearch2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setColor(JPanel panel) {
        panel.setBackground(new Color(197, 197, 197));
    }

    private void resetColor(JPanel panel) {
        panel.setBackground(new Color(240, 240, 240));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddGroup;
    private javax.swing.JButton btnAddStudentToGroup;
    private javax.swing.JButton btnAddTutorToGroup;
    private javax.swing.JButton btnRemoveStudentFromGroup;
    private javax.swing.JButton btnRemoveTutorFromGroup;
    private javax.swing.JButton btnUpdateGroupInfo;
    private javax.swing.JButton btnUpdateStudents;
    private javax.swing.JButton btnUpdateTutors;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblUserText2;
    private javax.swing.JLabel lblUserText3;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelSearch1;
    private javax.swing.JPanel panelSearch2;
    private javax.swing.JTable tblGroups;
    // End of variables declaration//GEN-END:variables

    private void designTable() {
        tblGroups.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 15));
        tblGroups.getTableHeader().setOpaque(false);
        tblGroups.getTableHeader().setBackground(new Color(32, 136, 203));
        tblGroups.getTableHeader().setForeground(new Color(255, 255, 255));
        tblGroups.setRowHeight(25);

    }
}
