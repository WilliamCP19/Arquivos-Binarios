/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Dados.Escritor;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Janelas.JanelaEscritor;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class ControladorEscritor  extends ControllerArquivoBinario {
    private Escritor cargoAtual;
    private List <Escritor> escritores; 
    private List <Escritor> desenhistas; 
    private static ControladorEscritor controlEscritor;
    
    public List<Escritor> getEscritores() {
        return escritores;
    }

    public void setEscritores(List<Escritor> escritores) {
        this.escritores = escritores;
    }

    public List<Escritor> getDesenhistas() {
        return desenhistas;
    }

    public void setDesenhistas(List<Escritor> desenhistas) {
        this.desenhistas = desenhistas;
    }

    public Escritor getCargoAtual() {
        return cargoAtual;
    }

    public void setCargoAtual(Escritor cargoAtual) {
        this.cargoAtual = cargoAtual;
        this.cargoAtual.setIdEscritor();
        this.cargoAtual.setId(this.cargoAtual.getIdEscritor());
    }
    
    private ControladorEscritor() {
        cargoAtual = new Escritor();
        escritores = new ArrayList <Escritor> ();
        desenhistas = new ArrayList <Escritor>();
     }
    public static ControladorEscritor getControladorEscritor () {
         if (controlEscritor == null) {
             controlEscritor = new ControladorEscritor();
         }
         return controlEscritor;
     }
     
    public void adiciona () {
        if (JanelaEscritor.getJanelaDesenhista().isVisible()) {
            controlEscritor.desenhistas.add(cargoAtual);
        } else {
            controlEscritor.escritores.add(cargoAtual);
            if (controlEscritor.cargoAtual.isDesenhista()) {
                controlEscritor.desenhistas.add(cargoAtual);
            }
        }
        controlEscritor.cargoAtual = new Escritor();
     }
     
    public void edita (int posD, int posE) {
        controlEscritor.setCargoAtual(cargoAtual);
        if (posD != -1) {
            System.out.println("DESENHISTAS");
            controlEscritor.desenhistas.set(posD, cargoAtual);
        }
        if (posE != -1){
            System.out.println("ESCRITOR");
            controlEscritor.escritores.set(posE, cargoAtual);
        } 
        controlEscritor.cargoAtual = new Escritor();
    }
    
    public int buscaDesenhista (int id) {
        for (int i=0;i < controlEscritor.desenhistas.size();i++) {
                if (id == controlEscritor.desenhistas.get(i).getId()) {
                    controlEscritor.cargoAtual = controlEscritor.desenhistas.get(i);
                    return i;
                }
            }
        return -1;
    }
    public int buscaEscritor (int id) {
        for (int i=0;i < controlEscritor.escritores.size();i++) {
            if (id == controlEscritor.escritores.get(i).getId()) {
                controlEscritor.cargoAtual = controlEscritor.escritores.get(i);
                return i;
                }
            }
        return -1;
        } 
    
    public void exclui (int posD, int posE) {
        if (posD != -1) {
            controlEscritor.desenhistas.remove(posD);
            if (controlEscritor.desenhistas.isEmpty()) {
                getArquivo().delete();
            }
        } 
        if (posE != -1) {
            controlEscritor.escritores.remove(posE);
            if (controlEscritor.escritores.isEmpty()) {
                getArquivo().delete();
            }
        }
        controlEscritor.cargoAtual = new Escritor();
    }
    
    public final void cadastraParaTabela (String pergunta, String titulo, int identificador) {
        StringBuilder aux = new StringBuilder();
        aux.append(JOptionPane.showInputDialog(null,pergunta, titulo, JOptionPane.QUESTION_MESSAGE)); aux.append(";");
        if (identificador == 1) {
            if (controlEscritor.cargoAtual.getPrincTrabalhos() != null) {
                controlEscritor.cargoAtual.getPrincTrabalhos().append(aux);
            } else {
                controlEscritor.cargoAtual.setPrincTrabalhos(aux);
            }
        } else if (identificador == 2) {
            if (controlEscritor.cargoAtual.getPremios() != null) {
                controlEscritor.cargoAtual.getPremios().append(aux);
                controlEscritor.cargoAtual.getPremios().append("-");                
            } else {
                controlEscritor.cargoAtual.setPremios(aux);
            }
        }
    }
    
    public void separaBuilder (int identificador, int pos, DefaultTableModel tbl) {
        StringTokenizer frase;
        
        if (identificador == 1) {
           frase = new StringTokenizer (controlEscritor.cargoAtual.getPrincTrabalhos().toString(), ";");
           //setTexto(getTexto()+controlEscritor.cargoAtual.getPrincTrabalhos());
        } else {
            frase = new StringTokenizer (controlEscritor.cargoAtual.getPremios().toString(), ";");
            //setTexto(getTexto()+controlEscritor.cargoAtual.getPremios());
        }
        while (frase.hasMoreElements()) {
            tbl.insertRow(pos, new Object[] {frase.nextToken(), frase.nextToken(), frase.nextToken(), frase.nextToken()}); pos++;
        }
    }

    public void preencheTabela (JTable tabela, int num) {
        DefaultTableModel tab = (DefaultTableModel) tabela.getModel();
        tab.setRowCount(0);
        cadastraParaTabela("Digite o nome da HQ:", "História em Quadrinhos", num);
        cadastraParaTabela("Digite o nome da Editora:", "Editora da HQ", num);
        cadastraParaTabela("Digite a data da primeira publicação da revista:", "Primeira publicação", num);
        cadastraParaTabela("Digite o nome do "+(controlEscritor.cargoAtual.isDesenhista() ? "Desenhista" : "Escritor"), "Trabalho Conjunto", num);
        separaBuilder(num, 0, tab);
     }
}