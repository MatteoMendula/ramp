/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FileSharingServerJFrame.java
 *
 * Created on 7-nov-2009, 11.00.19
 */

package it.unibo.deis.lia.ramp.service.application;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

/**
 *
 * @author useruser
 */
public class StreamServiceJFrame extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StreamService ss;
    /** Creates new form FileSharingServerJFrame */
    public StreamServiceJFrame(StreamService ss) {
        this.ss=ss;
        initComponents();

        newConnectTimeoutJTextField.setText(""+ss.getConnectTimeout());
        jTextFieldCurrentDirectory.setText(ss.getRepositoryDirectory());
        jButtonRefreshStreamListActionPerformed(null);
        jTextFieldBitrate.setText(""+ss.getBitrate());
        jTextFieldWebcamName.setText(ss.getWebcam());
        jTextFieldVlcDirectory.setText(ss.getVlcDirectory());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldCurrentDirectory = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNewDirectory = new javax.swing.JTextField();
        jButtonChangeDirectory = new javax.swing.JButton();
        jButtonRefreshStreamList = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonChangeBitrate = new javax.swing.JButton();
        jTextFieldBitrate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldWebcamName = new javax.swing.JTextField();
        jButtonChangeWebcam = new javax.swing.JButton();
        jButtonChangeVlcDirectory = new javax.swing.JButton();
        jTextFieldVlcDirectory = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StreamService");
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("current repository directory");

        jTextFieldCurrentDirectory.setEditable(false);

        jLabel2.setText("new repository directory");

        jButtonChangeDirectory.setText("change directory");
        jButtonChangeDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeDirectoryActionPerformed(evt);
            }
        });

        jButtonRefreshStreamList.setText("refresh stream list");
        jButtonRefreshStreamList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshStreamListActionPerformed(evt);
            }
        });

        jLabel3.setText("bitrate (kbit/s)");

        jButtonChangeBitrate.setText("change bitrate");
        jButtonChangeBitrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeBitrateActionPerformed(evt);
            }
        });

        jLabel4.setText("webcam name");

        jButtonChangeWebcam.setText("change webcam");
        jButtonChangeWebcam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeWebcamActionPerformed(evt);
            }
        });

        jButtonChangeVlcDirectory.setText("change vlc directory");
        jButtonChangeVlcDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeVlcDirectoryActionPerformed(evt);
            }
        });

        jLabel5.setText("vlc directory");

        jLabel6.setText("(used only for raw-UDP)");
        
        newConnectTimeoutJTextField = new JTextField();
        newConnectTimeoutJTextField.setColumns(10);
        
        JButton connectTimeoutJButton = new JButton("change connect timeout");
        connectTimeoutJButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String newConnectTimeout = newConnectTimeoutJTextField.getText();
                ss.setTimeoutConnect(Short.parseShort(newConnectTimeout));        	}
        });
        
        JLabel lblTimeout = new JLabel("connect timeout");
        jTextAreaStreamList = new javax.swing.JTextArea();
        jTextAreaStreamList.setTabSize(7);
        
        jTextAreaStreamList.setColumns(10);
        jTextAreaStreamList.setEditable(false);
        jTextAreaStreamList.setRows(4);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jButtonRefreshStreamList))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(10)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel2)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jButtonChangeDirectory, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jTextFieldNewDirectory, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel1)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jTextFieldCurrentDirectory, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextAreaStreamList, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jButtonChangeBitrate, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        								.addComponent(jButtonChangeWebcam, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jButtonChangeVlcDirectory, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(connectTimeoutJButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(lblTimeout)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(newConnectTimeoutJTextField, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        											.addComponent(jLabel4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        											.addComponent(jLabel3, Alignment.LEADING))
        										.addComponent(jLabel5))
        									.addGap(10)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        										.addGroup(layout.createSequentialGroup()
        											.addComponent(jTextFieldBitrate, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
        											.addPreferredGap(ComponentPlacement.RELATED)
        											.addComponent(jLabel6))
        										.addComponent(jTextFieldVlcDirectory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        										.addComponent(jTextFieldWebcamName, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE))))))))
        			.addGap(10))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextFieldCurrentDirectory, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jButtonChangeDirectory)
        				.addComponent(jTextFieldNewDirectory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButtonRefreshStreamList)
        			.addGap(8)
        			.addComponent(jTextAreaStreamList, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonChangeBitrate)
        				.addComponent(jLabel3)
        				.addComponent(jTextFieldBitrate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel6))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonChangeWebcam)
        				.addComponent(jLabel4)
        				.addComponent(jTextFieldWebcamName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonChangeVlcDirectory)
        				.addComponent(jLabel5)
        				.addComponent(jTextFieldVlcDirectory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(connectTimeoutJButton)
        				.addComponent(lblTimeout)
        				.addComponent(newConnectTimeoutJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        	.addGap(10)
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChangeDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeDirectoryActionPerformed
        String newDirectory=jTextFieldNewDirectory.getText();
        if(new java.io.File(newDirectory).isDirectory()){
            ss.setRepositoryDirectory(newDirectory);

            jTextFieldCurrentDirectory.setText(ss.getRepositoryDirectory());
           jButtonRefreshStreamListActionPerformed(null);
        }
        else{
            System.out.println("StreamService: invalid new dirctory "+newDirectory);
        }
    }//GEN-LAST:event_jButtonChangeDirectoryActionPerformed

    private void jButtonRefreshStreamListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshStreamListActionPerformed
        System.out.println("StreamService: jButtonRefreshFileListActionPerformed");
        String[] files=ss.getStreamList();
        String text="";
        for(int i=0; i<files.length; i++){
            text+=files[i]+"\n";
        }
        jTextAreaStreamList.setText(text);
    }//GEN-LAST:event_jButtonRefreshStreamListActionPerformed

    private void jButtonChangeBitrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeBitrateActionPerformed
        int bitrate=Integer.parseInt(jTextFieldBitrate.getText());
        ss.setBitrate(bitrate);
    }//GEN-LAST:event_jButtonChangeBitrateActionPerformed

    private void jButtonChangeWebcamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeWebcamActionPerformed
        ss.setWebcam(jTextFieldWebcamName.getText());
    }//GEN-LAST:event_jButtonChangeWebcamActionPerformed

    private void jButtonChangeVlcDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeVlcDirectoryActionPerformed
        ss.setVlcDirectory(jTextFieldVlcDirectory.getText());
    }//GEN-LAST:event_jButtonChangeVlcDirectoryActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.out.println("StreamService: formWindowClosing");
        ss.stopService();
    }//GEN-LAST:event_formWindowClosing
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangeBitrate;
    private javax.swing.JButton jButtonChangeDirectory;
    private javax.swing.JButton jButtonChangeVlcDirectory;
    private javax.swing.JButton jButtonChangeWebcam;
    private javax.swing.JButton jButtonRefreshStreamList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextArea jTextAreaStreamList;
    private javax.swing.JTextField jTextFieldBitrate;
    private javax.swing.JTextField jTextFieldCurrentDirectory;
    private javax.swing.JTextField jTextFieldNewDirectory;
    private javax.swing.JTextField jTextFieldVlcDirectory;
    private javax.swing.JTextField jTextFieldWebcamName;
    private JTextField newConnectTimeoutJTextField;
}