/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Janelas;

import Controladores.ControladorEditora;
import Dados.Editora;
import java.util.List;

/**
 *
 * @author willi
 */
public class JanelaEditoras extends javax.swing.JFrame {
    
    ControladorEditora EDITORA = ControladorEditora.getControladorEditora();
    private static JanelaEditoras janelaEditora;
    private int pos;

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
    
    /**
     * Creates new form JanelaEditora1
     */
    private JanelaEditoras() {
        initComponents();
    }
    
    public static JanelaEditoras getJanelaCadEditora () {
        if (janelaEditora == null) {
            janelaEditora = new JanelaEditoras ();
        }
        return janelaEditora;
    }
    
    public final void preencherEditora (Dados.Editora dados) {
        dados.setNome(cxNome.getText());
        dados.setFundador(cxFundador.getText());
        dados.setPresidente(cxPresidente.getText());
        dados.setSede(cxSede.getText());
        dados.setAnoFund(Integer.parseInt(cxAnoFund.getText()));
        dados.setSituacao(rbAtiva.isSelected());
        dados.setWebsite(cxWebsite.getText());
        
        EDITORA.setEditoraAtual(dados);
    }
    
    public void setCampos () {
        cxNome.setText(EDITORA.getEditoraAtual().getNome());
        cxFundador.setText(EDITORA.getEditoraAtual().getFundador());
        cxPresidente.setText(EDITORA.getEditoraAtual().getPresidente());
        cxSede.setText(EDITORA.getEditoraAtual().getSede());
        cxAnoFund.setText(String.valueOf(EDITORA.getEditoraAtual().getAnoFund()));
        cxWebsite.setText(EDITORA.getEditoraAtual().getWebsite());
        rbAtiva.setSelected(EDITORA.getEditoraAtual().isSituacao());
        rbDesativada.setSelected(!EDITORA.getEditoraAtual().isSituacao());
    }
    
    public void zeraCampos () {
        cxNome.setText("");
        cxFundador.setText("");
        cxSede.setText("");
        cxPresidente.setText("");
        cxWebsite.setText("");
        cxAnoFund.setText("");
        rbAtiva.setSelected(false);
        rbDesativada.setSelected(false);
    }
    
    public void adiciona () {
        preencherEditora(new Dados.Editora ());
        EDITORA.adiciona();
    }
    public void altera () {
        EDITORA.edita(pos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grSituacao = new javax.swing.ButtonGroup();
        lbPresidente = new javax.swing.JLabel();
        cxFundador = new javax.swing.JTextField();
        cxPresidente = new javax.swing.JTextField();
        lbFundador = new javax.swing.JLabel();
        cxSede = new javax.swing.JTextField();
        lbSede = new javax.swing.JLabel();
        cxAnoFund = new javax.swing.JTextField();
        lbAnoFund = new javax.swing.JLabel();
        rbAtiva = new javax.swing.JRadioButton();
        rbDesativada = new javax.swing.JRadioButton();
        lbSituacao = new javax.swing.JLabel();
        cxWebsite = new javax.swing.JTextField();
        lbTitulo = new javax.swing.JLabel();
        lbsalvar = new javax.swing.JButton();
        lbWebsite = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbPresidente.setText("Presidente da Editora");

        lbFundador.setText("Fundador da Editora");

        lbSede.setText("Localidade da Sede");

        lbAnoFund.setText("Ano de Fundação");

        grSituacao.add(rbAtiva);
        rbAtiva.setText("Ativa");

        grSituacao.add(rbDesativada);
        rbDesativada.setText("Desativada");

        lbSituacao.setText("Situação");

        lbTitulo.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lbTitulo.setText("Informações da Editora");

        lbsalvar.setText("Salvar");
        lbsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbsalvarActionPerformed(evt);
            }
        });

        lbWebsite.setText("Website");

        jLabel1.setText("Nome da Editora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbsalvar)
                .addGap(131, 131, 131))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxWebsite)
                            .addComponent(cxSede)
                            .addComponent(cxPresidente)
                            .addComponent(cxFundador)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cxAnoFund)
                                        .addGap(36, 36, 36))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(lbAnoFund))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(lbWebsite)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbDesativada, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rbAtiva, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbSituacao)
                                        .addGap(33, 33, 33))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(lbSede))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(lbPresidente))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(lbFundador)))
                        .addGap(49, 49, 49))))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbFundador)
                .addGap(10, 10, 10)
                .addComponent(cxFundador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPresidente)
                .addGap(11, 11, 11)
                .addComponent(cxPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSede)
                .addGap(12, 12, 12)
                .addComponent(cxSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbSituacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAtiva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbDesativada))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbAnoFund)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxAnoFund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbWebsite)))
                .addGap(4, 4, 4)
                .addComponent(cxWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbsalvar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbsalvarActionPerformed
        switch (EDITORA.getValidar()) {
            case 1:
                adiciona();
                EDITORA.mensagens(EDITORA.getValidar());
                break;
            case 2:
                altera();
                EDITORA.mensagens(EDITORA.getValidar());
                break;
            case 3:
                lbsalvar.enableInputMethods(false);
                break;
            default:
                break;
        }
        EDITORA.setObjeto(EDITORA.getEditoras());
        EDITORA.escrever(false);
        this.dispose(); zeraCampos();
    }//GEN-LAST:event_lbsalvarActionPerformed

    /**
     * @param args the command line arguments
     
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaEditoras().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cxAnoFund;
    private javax.swing.JTextField cxFundador;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPresidente;
    private javax.swing.JTextField cxSede;
    private javax.swing.JTextField cxWebsite;
    private javax.swing.ButtonGroup grSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbAnoFund;
    private javax.swing.JLabel lbFundador;
    private javax.swing.JLabel lbPresidente;
    private javax.swing.JLabel lbSede;
    private javax.swing.JLabel lbSituacao;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbWebsite;
    private javax.swing.JButton lbsalvar;
    private javax.swing.JRadioButton rbAtiva;
    private javax.swing.JRadioButton rbDesativada;
    // End of variables declaration//GEN-END:variables
}
