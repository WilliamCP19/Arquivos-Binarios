/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Janelas;

import Controladores.ControladorEscritor;


/**
 *
 * @author willi
 */
public class JanelaEscritores extends javax.swing.JFrame{
    
    private ControladorEscritor escritor = ControladorEscritor.getControladorEscritor();
    private static JanelaEscritores janelaEscritor, janelaDesenhista;
    private int posD, posE;

    public void setPosD(int posD) {
        this.posD = posD;
    }

    public void setPosE(int posE) {
        this.posE = posE;
    }
    
    /**
     * Creates new form Janela1
     */
    
    public JanelaEscritores(boolean append) {
        initComponents();
        csDesenhista.setSelected(append);
        csDesenhista.setEnabled(!append);
    }
    public static JanelaEscritores getJanelaCadEscritor (boolean isDesenhista) {
        if (isDesenhista) {
            if (janelaDesenhista == null) {
                janelaDesenhista = new JanelaEscritores (true);
            }
            return janelaDesenhista;
        } else {
            if (janelaEscritor == null) {
                janelaEscritor = new JanelaEscritores(false);
            }
            return janelaEscritor;
        }
    }

    
    public final void preencheCargo (Dados.Escritor esc) {
        esc.setNome(cxNome.getText());
        esc.setNacionalidade(cxNacionalidade.getText());
        esc.setDiaNasc(Integer.parseInt(cxDiaNasc.getText()));
        esc.setMesNasc(Integer.parseInt(cxMesNasc.getText()));
        esc.setAnoNasc(Integer.parseInt(cxAnoNasc.getText()));
        esc.setDesenhista(csDesenhista.isSelected());
        
        escritor.setCargoAtual(esc);
    } 
    
    public void setCampos () {
        cxNome.setText(escritor.getCargoAtual().getNome());
        cxNacionalidade.setText(escritor.getCargoAtual().getNacionalidade());
        cxDiaNasc.setText(String.valueOf(escritor.getCargoAtual().getDiaNasc()));
        cxMesNasc.setText(String.valueOf(escritor.getCargoAtual().getMesNasc()));
        cxAnoNasc.setText(String.valueOf(escritor.getCargoAtual().getAnoNasc()));
        csDesenhista.setSelected(escritor.getCargoAtual().isDesenhista());
    }
    
    public void camposVazios () {
        cxNome.setText("");
        cxNacionalidade.setText("");
        cxAnoNasc.setText("");
        cxMesNasc.setText("");
        cxDiaNasc.setText("");
        csDesenhista.setSelected(false);
    }
    
    public void adicionar () {
        preencheCargo(new Dados.Escritor ());
        escritor.adiciona();
    }
    
    public void editar () {
        escritor.edita(posD, posE);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPremios = new javax.swing.JTable();
        cxNacionalidade = new javax.swing.JTextField();
        cxDiaNasc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrincTrabalhos = new javax.swing.JTable();
        cxMesNasc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cxAnoNasc = new javax.swing.JTextField();
        csDesenhista = new javax.swing.JCheckBox();
        lbTitulo = new javax.swing.JLabel();
        btPremios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btPrincTrabalhos = new javax.swing.JButton();
        cxNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel5.setText("Pr??mios");

        tblPremios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblPremios);

        jLabel3.setText("Data de Nascimento:");

        tblPrincTrabalhos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome da HQ", "Editora", "Primeiro Lan??amento", "Escritor"
            }
        ));
        jScrollPane1.setViewportView(tblPrincTrabalhos);

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel4.setText("Principais Trabalhos");

        csDesenhista.setText("?? Desenhista?");

        lbTitulo.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lbTitulo.setText("Informa????es dos autores");

        btPremios.setText("Adicionar Pr??mios");
        btPremios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPremiosActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        btPrincTrabalhos.setText("Adicionar Principais Trabalhos");
        btPrincTrabalhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrincTrabalhosActionPerformed(evt);
            }
        });

        jLabel2.setText("Nacionalidade:");

        btSalvar.setText("Salvar ");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxDiaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxMesNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxAnoNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(csDesenhista))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cxNacionalidade)))))
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btPremios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btPrincTrabalhos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btSalvar)
                        .addGap(163, 163, 163)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(117, 117, 117))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(cxNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cxDiaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxMesNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxAnoNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(csDesenhista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btPrincTrabalhos)
                            .addComponent(btPremios))
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar)
                        .addGap(16, 16, 16))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        switch (escritor.getValidar()) {
            case 1:
                adicionar();
                escritor.mensagens(escritor.getValidar());
                break;
            case 2:
                editar(); escritor.mensagens(escritor.getValidar());
                break;
            case 3:
                btSalvar.enableInputMethods(false);
                break;
            default:
                break;
        }
        if (escritor.getCargoAtual().isDesenhista()) {
            escritor.setObjeto(escritor.getDesenhistas());
        } else {
            escritor.setObjeto(escritor.getEscritores());
        }
        escritor.escrever(false);
        camposVazios(); this.dispose();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btPremiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPremiosActionPerformed
        escritor.preencheTabela(tblPremios, 2);
        if (escritor.getCargoAtual().isDesenhista()) {
            escritor.setObjeto(escritor.getDesenhistas());
        } else {
            escritor.setObjeto(escritor.getEscritores());
        }
        escritor.escrever(false);
    }//GEN-LAST:event_btPremiosActionPerformed

    private void btPrincTrabalhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrincTrabalhosActionPerformed
        escritor.preencheTabela(tblPrincTrabalhos, 1);
        if (escritor.getCargoAtual().isDesenhista()) {
            escritor.setObjeto(escritor.getDesenhistas());
        } else {
            escritor.setObjeto(escritor.getEscritores());
        }
        escritor.escrever(false);
    }//GEN-LAST:event_btPrincTrabalhosActionPerformed

    /**
     * @param args the command line arguments
     
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaEscritores().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPremios;
    private javax.swing.JButton btPrincTrabalhos;
    private javax.swing.JButton btSalvar;
    private javax.swing.JCheckBox csDesenhista;
    private javax.swing.JTextField cxAnoNasc;
    private javax.swing.JTextField cxDiaNasc;
    private javax.swing.JTextField cxMesNasc;
    private javax.swing.JTextField cxNacionalidade;
    private javax.swing.JTextField cxNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tblPremios;
    private javax.swing.JTable tblPrincTrabalhos;
    // End of variables declaration//GEN-END:variables
}