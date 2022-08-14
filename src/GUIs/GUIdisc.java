/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;

import DAOs.DAOdisciplina;
import DAOs.DAOturma;
import Entidades.Disciplina;
import Entidades.Turma;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class GUIdisc extends javax.swing.JFrame {

    /**
     * Creates new form GUIdisc
     */
    public GUIdisc() {
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

        jLabel1 = new javax.swing.JLabel();
        codDiscTF = new javax.swing.JTextField();
        pesqDiscBT = new javax.swing.JButton();
        nomeDiscTF = new javax.swing.JTextField();
        turmaDiscTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeladisc = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        addDisc = new javax.swing.JMenuItem();
        saveDisc = new javax.swing.JMenuItem();
        attDisc = new javax.swing.JMenuItem();
        delDisc = new javax.swing.JMenuItem();
        listDisc = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cursoDisc = new javax.swing.JMenuItem();
        alunoDisc = new javax.swing.JMenuItem();
        turmaDisc = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Disciplina");

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel1.setText("Código disciplina:");

        pesqDiscBT.setBackground(new java.awt.Color(153, 255, 153));
        pesqDiscBT.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        pesqDiscBT.setForeground(new java.awt.Color(0, 0, 51));
        pesqDiscBT.setText("Pesquisar");
        pesqDiscBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesqDiscBTActionPerformed(evt);
            }
        });

        nomeDiscTF.setForeground(new java.awt.Color(153, 153, 153));
        nomeDiscTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeDiscTFActionPerformed(evt);
            }
        });

        turmaDiscTF.setForeground(new java.awt.Color(153, 153, 153));
        turmaDiscTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turmaDiscTFActionPerformed(evt);
            }
        });

        tabeladisc.setBackground(new java.awt.Color(153, 0, 255));
        tabeladisc.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        tabeladisc.setForeground(new java.awt.Color(255, 255, 255));
        tabeladisc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome Disciplina", "Turma"
            }
        ));
        jScrollPane1.setViewportView(tabeladisc);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("Nome da Disciplina:");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Turma:");

        jMenu1.setText("Arquivo");

        addDisc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/botao-adicionar.png"))); // NOI18N
        addDisc.setText("Adicionar");
        addDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDiscActionPerformed(evt);
            }
        });
        jMenu1.add(addDisc);

        saveDisc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/verificado.png"))); // NOI18N
        saveDisc.setText("Salvar");
        saveDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDiscActionPerformed(evt);
            }
        });
        jMenu1.add(saveDisc);

        attDisc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/atualizar.png"))); // NOI18N
        attDisc.setText("Atualizar");
        attDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attDiscActionPerformed(evt);
            }
        });
        jMenu1.add(attDisc);

        delDisc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/lixeira.png"))); // NOI18N
        delDisc.setText("Deletar");
        delDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delDiscActionPerformed(evt);
            }
        });
        jMenu1.add(delDisc);

        listDisc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/lista-de-papel.png"))); // NOI18N
        listDisc.setText("Listar");
        listDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listDiscActionPerformed(evt);
            }
        });
        jMenu1.add(listDisc);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cruds");

        cursoDisc.setText("Crud Curso");
        cursoDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursoDiscActionPerformed(evt);
            }
        });
        jMenu2.add(cursoDisc);

        alunoDisc.setText("Crud Aluno");
        alunoDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoDiscActionPerformed(evt);
            }
        });
        jMenu2.add(alunoDisc);

        turmaDisc.setText("Crud Turma");
        turmaDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turmaDiscActionPerformed(evt);
            }
        });
        jMenu2.add(turmaDisc);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(turmaDiscTF, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nomeDiscTF, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(codDiscTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pesqDiscBT)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codDiscTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesqDiscBT))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeDiscTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turmaDiscTF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDiscActionPerformed
        codDiscTF.setEditable(false);

        nomeDiscTF.setEditable(true);

        turmaDiscTF.setEditable(true);
    }//GEN-LAST:event_addDiscActionPerformed

    private void attDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attDiscActionPerformed
         codDiscTF.setEditable(false);
        nomeDiscTF.setEditable(true);

        turmaDiscTF.setEditable(true);
        tabeladisc.setVisible(false);
    }//GEN-LAST:event_attDiscActionPerformed

    private void turmaDiscTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turmaDiscTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turmaDiscTFActionPerformed

    private void nomeDiscTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeDiscTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeDiscTFActionPerformed

    private void turmaDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turmaDiscActionPerformed
        // crud disc para turma
        GUIturma guIturma = new GUIturma();
        guIturma.setVisible(true);
        fecha();
    }//GEN-LAST:event_turmaDiscActionPerformed

    private void cursoDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursoDiscActionPerformed
        //curd disc para curso
        GUIcurso guIcurso = new GUIcurso();
        guIcurso.setVisible(true);
        fecha();
    }//GEN-LAST:event_cursoDiscActionPerformed

    private void alunoDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoDiscActionPerformed
        //crud disc para aluno
        GUIaluno guIaluno = new GUIaluno();
        guIaluno.setVisible(true);
        fecha();
    }//GEN-LAST:event_alunoDiscActionPerformed

    private void delDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delDiscActionPerformed
        String pk3 = codDiscTF.getText();
        DAOdisciplina daOdisciplina = new DAOdisciplina();
        daOdisciplina.deletar(pk3);
        tabeladisc.setVisible(false);
        codDiscTF.setText("");
        nomeDiscTF.setText("");

        turmaDiscTF.setText("");
    }//GEN-LAST:event_delDiscActionPerformed

    private void listDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listDiscActionPerformed
        DAOdisciplina daOdisciplina = new DAOdisciplina();
        DefaultTableModel model;
        model = (DefaultTableModel) tabeladisc.getModel();

        List<Disciplina> lista2 = daOdisciplina.findall();
        try{
        for(int n=0;n<1000;n++){
            
            model.removeRow(n);
        }
        }catch(Exception e){
            
        }
        lista2.forEach(disc -> {
            model.insertRow(model.getRowCount(), new Object[]{disc.getCodDisc(),disc.getNomeDisc(),disc.getTurmaCodigo().getCodigo()});
        });
        tabeladisc.setVisible(true);
    }//GEN-LAST:event_listDiscActionPerformed

    private void saveDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDiscActionPerformed
        String pk2 = codDiscTF.getText();
        DAOturma daOturma = new DAOturma();
        
        DAOdisciplina daOdisciplina = new DAOdisciplina();
        DefaultTableModel model;
        model = (DefaultTableModel) tabeladisc.getModel();
        

        Disciplina disc = new Disciplina();

        String nomeDisc = nomeDiscTF.getText();
        String pk = turmaDiscTF.getText();
        disc = daOdisciplina.consultar(pk2);
       
        
        Turma turma = new Turma();
        
        
        
        turma = daOturma.consultar(pk);

        if (null == turma) {
            JOptionPane.showMessageDialog(null, "Essa turma não existe, adicicone ela primeiro!");
            nomeDiscTF.setEditable(false);
            turmaDiscTF.setEditable(false);
            nomeDiscTF.setText("");
            turmaDiscTF.setText("");
            codDiscTF.setEditable(true);

        } else {
            if (null == disc) {
                Disciplina disc2 = new Disciplina();
                disc2.setCodDisc(pk2);
                disc2.setNomeDisc(nomeDisc);
                disc2.setTurmaCodigo(turma);

                daOdisciplina.criar(disc2);

            } else {
                disc.setNomeDisc(nomeDisc);
                disc.setTurmaCodigo(turma);

                daOdisciplina.atualizar(disc);

            }

            nomeDiscTF.setEditable(false);
            turmaDiscTF.setEditable(false);
            codDiscTF.setEditable(true);

        }
        tabeladisc.setVisible(false);
    }//GEN-LAST:event_saveDiscActionPerformed

    private void pesqDiscBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesqDiscBTActionPerformed
        String pk3 = codDiscTF.getText();
        DAOdisciplina daOdisciplina = new DAOdisciplina();

        Disciplina disc = new Disciplina();
        disc = daOdisciplina.consultar(pk3);

        if (null == disc) {
            tabeladisc.setVisible(false);
            JOptionPane.showMessageDialog(null, "Essa disciplina não existe, adicicone ela!");
            nomeDiscTF.setText("");

            turmaDiscTF.setText("");

        } else {
            tabeladisc.setVisible(false);
            nomeDiscTF.setText(disc.getNomeDisc());
            turmaDiscTF.setText(disc.getTurmaCodigo().getCodigo());
        }

        nomeDiscTF.setEditable(false);

        turmaDiscTF.setEditable(false);
    }//GEN-LAST:event_pesqDiscBTActionPerformed

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
            java.util.logging.Logger.getLogger(GUIdisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIdisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIdisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIdisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIdisc().setVisible(true);
            }
        });
    }
     public void fecha(){
        this.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addDisc;
    private javax.swing.JMenuItem alunoDisc;
    private javax.swing.JMenuItem attDisc;
    private javax.swing.JTextField codDiscTF;
    private javax.swing.JMenuItem cursoDisc;
    private javax.swing.JMenuItem delDisc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem listDisc;
    private javax.swing.JTextField nomeDiscTF;
    private javax.swing.JButton pesqDiscBT;
    private javax.swing.JMenuItem saveDisc;
    private javax.swing.JTable tabeladisc;
    private javax.swing.JMenuItem turmaDisc;
    private javax.swing.JTextField turmaDiscTF;
    // End of variables declaration//GEN-END:variables
}