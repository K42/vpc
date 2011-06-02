/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddVCDialog.java
 *
 * Created on 2011-06-02, 18:49:24
 */
package vpc_conf;

import org.jdesktop.application.Action;

/**
 *
 * @author hash
 */
public class AddVCDialog extends javax.swing.JDialog {

    private VoiceCommand vc = null;

    public boolean isCommandSet(){
        return vc != null;
    }

    public VoiceCommand getVc(){
        return vc;
    }

    public void setVc(VoiceCommand vc){
        this.vc = vc;
        acoustic.setText(vc.getAcoustic());
        command.setText(vc.getCommand());
        name.setText(vc.getName());
    }

    /** Creates new form AddVCDialog */
    public AddVCDialog(java.awt.Frame parent, boolean modal){
        super(parent, modal);
        initComponents();
        emptyAll();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Anuluj = new javax.swing.JButton();
        OK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        command = new javax.swing.JTextField();
        acoustic = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(vpc_conf.Vpc_confApp.class).getContext().getResourceMap(AddVCDialog.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(vpc_conf.Vpc_confApp.class).getContext().getActionMap(AddVCDialog.class, this);
        Anuluj.setAction(actionMap.get("Cancel")); // NOI18N
        Anuluj.setText(resourceMap.getString("Anuluj.text")); // NOI18N
        Anuluj.setName("Anuluj"); // NOI18N

        OK.setAction(actionMap.get("OKHide")); // NOI18N
        OK.setText(resourceMap.getString("OK.text")); // NOI18N
        OK.setEnabled(false);
        OK.setName("OK"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        command.setText(resourceMap.getString("command.text")); // NOI18N
        command.setName("command"); // NOI18N
        command.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                commandKeyTyped(evt);
            }
        });

        acoustic.setText(resourceMap.getString("acoustic.text")); // NOI18N
        acoustic.setName("acoustic"); // NOI18N
        acoustic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                commandKeyTyped(evt);
            }
        });

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        name.setText(resourceMap.getString("name.text")); // NOI18N
        name.setName("name"); // NOI18N
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                commandKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(OK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Anuluj))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addComponent(acoustic, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(command, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acoustic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(command, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anuluj)
                    .addComponent(OK))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void commandKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_commandKeyTyped
        if (acoustic.getText().equals("")
            || command.getText().equals("")
            || name.getText().equals("")) {
            OK.setEnabled(false);
        } else {
            OK.setEnabled(true);
        }
    }//GEN-LAST:event_commandKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run(){
                AddVCDialog dialog = new AddVCDialog(new javax.swing.JFrame(),
                                                     true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e){
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    @Action
    public void OKHide(){
        vc = new VoiceCommand(acoustic.getText(), command.getText(), name.
                getText());
        setVisible(false);
        emptyAll();
    }

    @Action
    public void Cancel(){
        setVisible(false);
        emptyAll();
    }

    private void emptyAll(){
        acoustic.setText("");
        command.setText("");
        name.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anuluj;
    private javax.swing.JButton OK;
    private javax.swing.JTextField acoustic;
    private javax.swing.JTextField command;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
