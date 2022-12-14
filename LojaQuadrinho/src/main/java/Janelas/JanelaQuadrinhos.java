/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Janelas;

import Controladores.ControladorQuadrinho;
import Dados.Quadrinho;
import java.awt.HeadlessException;
import java.util.List;

/**
 *
 * @author willi
 */
public class JanelaQuadrinhos extends javax.swing.JFrame {
    
    private ControladorQuadrinho hq =  ControladorQuadrinho.getControladorQuadrinho();
    public static JanelaQuadrinhos janelaQuadrinho;
    private int pos;
    
    private JanelaQuadrinhos()  {
        initComponents();
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    /**
     * Creates new form JanelaQuadrinho1
     */

    public static JanelaQuadrinhos getJanelaQuadrinho () {
        if (janelaQuadrinho == null) {
            janelaQuadrinho = new JanelaQuadrinhos();
        }
        return janelaQuadrinho;
    }
    
    public final void preencheHQ (Dados.Quadrinho historia) {
        historia.setNomeHq(cxNomeHq.getText());
        historia.setLingua(cxLingua.getText());
        historia.setEditora(cxEditora.getText());
        historia.setFormato(cxFormato.getText());
        historia.setEdicoes(Integer.parseInt(cxEdicoes.getText()));
        historia.setPubli(cxPubli.getText());
        historia.setEscritor(cxEscritor.getText());
        historia.setDesenhista(cxDesenhista.getText());
        
        hq.setHqAtual(historia);
    }
    
    public void setCampos () {
        cxNomeHq.setText(hq.getHqAtual().getNomeHq());
        cxLingua.setText(hq.getHqAtual().getLingua());
        cxEditora.setText(hq.getHqAtual().getEditora());
        cxFormato.setText(hq.getHqAtual().getFormato());
        cxEdicoes.setText(String.valueOf(hq.getHqAtual().getEdicoes()));
        cxPubli.setText(hq.getHqAtual().getPubli());
        cxEscritor.setText(hq.getHqAtual().getEscritor());
        cxDesenhista.setText(hq.getHqAtual().getDesenhista());
    }
    
    public void zerarCampos () {
        cxNomeHq.setText("");
        cxLingua.setText("");
        cxEditora.setText("");
        cxFormato.setText("");
        cxEdicoes.setText("");
        cxPubli.setText("");
        cxEscritor.setText("");
        cxDesenhista.setText("");
    }
    
    public void adicionar () {
        preencheHQ(new Dados.Quadrinho ());
        hq.adiciona();
    }
    
    public void editar () {
        hq.edita(pos);
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
        jLabel2 = new javax.swing.JLabel();
        cxLingua = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cxEditora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cxFormato = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cxPubli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cxEdicoes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cxNomeHq = new javax.swing.JTextField();
        cxDesenhista = new javax.swing.JTextField();
        cxEscritor = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("Informa????es dos Quadrinhos");

        jLabel2.setText("Idioma Original");

        jLabel3.setText("Editora de Publica????o");

        jLabel4.setText("Formato de Publica????o");

        jLabel5.setText("Per??odo de Lan??amento");

        jLabel6.setText("Escritor:");

        jLabel7.setText("Desenhista:");

        jLabel8.setText("N?? de Edi????es:");

        jLabel9.setText("Nome da Hist??ria em Quadrinhos");

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cxNomeHq, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(jLabel4)
                                                .addGap(81, 81, 81)
                                                .addComponent(jLabel8))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cxFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21)
                                                .addComponent(cxEdicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(cxPubli, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxEditora, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxLingua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addGap(120, 120, 120)))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxDesenhista, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxNomeHq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxLingua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cxEdicoes)
                    .addComponent(cxFormato))
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxPubli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(cxDesenhista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        switch (hq.getValidar()) {
            case 1:
                adicionar(); hq.mensagens(hq.getValidar());
                break;
            case 2:
                editar(); hq.mensagens(hq.getValidar());
                break;
            case 3:
                btSalvar.enableInputMethods(false);
                break;
        }
        hq.setObjeto(hq.getHqs());
        hq.escrever(false);
        this.dispose(); zerarCampos();
    }//GEN-LAST:event_btSalvarActionPerformed

    /**
     * @param args the command line arguments
     
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaQuadrinhos().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField cxDesenhista;
    private javax.swing.JTextField cxEdicoes;
    private javax.swing.JTextField cxEditora;
    private javax.swing.JTextField cxEscritor;
    private javax.swing.JTextField cxFormato;
    private javax.swing.JTextField cxLingua;
    private javax.swing.JTextField cxNomeHq;
    private javax.swing.JTextField cxPubli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}