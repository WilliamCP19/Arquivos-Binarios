/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Janelas;

import Controladores.ControladorEscritor;
import Dados.Escritor;
import java.util.List;
/**
 *
 * @author willi
 */
public class JanelaEscritor extends javax.swing.JFrame {
    private final ControladorEscritor escritor = ControladorEscritor.getControladorEscritor();
    private JanelaEscritores janelaEscritores;
    private static JanelaEscritor janelaEscritor, janelaDesenhista;
    private String quem;

    public static JanelaEscritor getJanelaEscritor() {
        return janelaEscritor;
    }

    public static JanelaEscritor getJanelaDesenhista() {
        return janelaDesenhista;
    }

    public String getQuem() {
        return quem;
    }
    /**
     * Creates new form JanelaEscritores
     */
    
    private JanelaEscritor (String pri, String seg, String nome1, String nome2, String Autor) {
        initComponents();
        quem = Autor;
        lbTitulo.setText(Autor); lbSubTitulo.setText("Alguns dos "+Autor+" mais conhecidos");
        escritor.inicializaTudo(pri, nome1, lbImagem, lbNome);
        escritor.inicializaTudo(seg, nome2, lbImagem2, lbNome2);
        lbNome.setText (nome1);
        lbNome2.setText (nome2);
    }
    
    public final static JanelaEscritor getJanelaEscritor (boolean isDesenhista, String prop) {
        if (isDesenhista) {
            if (janelaDesenhista == null) {
                janelaDesenhista = new JanelaEscritor ("frank.jpg", "jack.jfif", "Frank Miller", "Jack Kirby","Desenhistas");
            }
            if (prop != null) {
                janelaDesenhista.escritor.preencheArqProp(janelaDesenhista.escritor, prop, "Desenhistas");
                if (janelaDesenhista.escritor.ler()) {
                    janelaDesenhista.escritor.setDesenhistas((List<Escritor>) janelaDesenhista.escritor.getObjeto());
                }
            }
            janelaDesenhista.janelaEscritores = JanelaEscritores.getJanelaCadEscritor(isDesenhista);
            return janelaDesenhista;
        } else {
            if (janelaEscritor == null) {
                janelaEscritor = new JanelaEscritor("alanMoore.jpg", "markMiller.jpg", "Alan Moore", "Mark Miller", "Escritores");
            }
            if (prop != null) {
                janelaEscritor.escritor.preencheArqProp(janelaEscritor.escritor, prop, "Escritores");
                if (janelaEscritor.escritor.ler()) {
                    janelaEscritor.escritor.setEscritores((List<Escritor>) janelaEscritor.escritor.getObjeto());
                }
            }
            janelaEscritor.janelaEscritores = JanelaEscritores.getJanelaCadEscritor(isDesenhista);
            return janelaEscritor;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbImagem2 = new javax.swing.JLabel();
        lbImagem = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbSubTitulo = new javax.swing.JLabel();
        btAdicionar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        lbNome2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbImagem2.setText("Imagem 2");

        lbImagem.setText("Imagem 1");

        lbTitulo.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lbTitulo.setText("Titulo");

        lbSubTitulo.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        lbSubTitulo.setText("Sub Titulo");

        btAdicionar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btBuscar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        lbNome.setText("Pessoa 1");

        lbNome2.setText("Pessoa 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(lbSubTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btEditar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btBuscar)
                                .addGap(30, 30, 30)
                                .addComponent(btExcluir))
                            .addComponent(lbImagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNome2)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(3, 3, 3)
                .addComponent(lbSubTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbImagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNome2)
                    .addComponent(lbNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btAdicionar)
                        .addComponent(btEditar)
                        .addComponent(btBuscar)))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        if (escritor.verificarArquivo()) {
            if (quem.equals("Escritores")) {
                escritor.setEscritores((List<Escritor>) escritor.getObjeto());
            } else {
                escritor.setDesenhistas((List<Escritor>) escritor.getObjeto());
            }
        }
        escritor.setValidar(1); JanelaInicial.criaThread(janelaEscritores, true);
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        if (escritor.verificarArquivo()) {
            if (quem.equals("Escritores")) {
                escritor.setEscritores((List<Escritor>) escritor.getObjeto());
            } else {
                escritor.setDesenhistas((List<Escritor>) escritor.getObjeto());
            }
        }
        int identificador = escritor.buscador(quem);
        if (janelaDesenhista.isVisible()) {
            janelaEscritores.setPosD(escritor.buscaDesenhista(identificador));
        } else {
            janelaEscritores.setPosE(escritor.buscaEscritor(identificador));
            if (janelaEscritor.escritor.getCargoAtual().isDesenhista()) {
                janelaEscritores.setPosD(escritor.buscaDesenhista(identificador));
            }
        }
        janelaEscritores.setCampos(); escritor.setValidar(2);
        JanelaInicial.criaThread(janelaEscritores, true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (escritor.verificarArquivo()) {
            if (quem.equals("Escritores")) {
                escritor.setEscritores((List<Escritor>) escritor.getObjeto());
            } else {
                escritor.setDesenhistas((List<Escritor>) escritor.getObjeto());
            }
        }
        int identificador = escritor.buscador(quem);
        escritor.exclui(escritor.buscaDesenhista(identificador), escritor.buscaEscritor(identificador));
        janelaEscritores.camposVazios(); escritor.mensagens(3);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        if (escritor.verificarArquivo()) {
            if (quem.equals("Escritores")) {
                escritor.setEscritores((List<Escritor>) escritor.getObjeto());
            } else {
                escritor.setDesenhistas((List<Escritor>) escritor.getObjeto());
            }
        }
        if (janelaDesenhista.isVisible()) {
            escritor.buscaDesenhista(escritor.buscador(quem));
        } else {
            escritor.buscaEscritor(escritor.buscador(quem));
        }
        janelaEscritores.setCampos();
        JanelaInicial.criaThread(janelaEscritores, true);
    }//GEN-LAST:event_btBuscarActionPerformed

    
    
    /**
     * @param args the command line arguments
     
    public static void main(String args[]) {

        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaEscritor().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbImagem2;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNome2;
    private javax.swing.JLabel lbSubTitulo;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}