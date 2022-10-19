/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import Controladores.ControllerArquivoBinario;
import java.io.Serializable;

/**
 *
 * @author fabricio
 */
public class Properties implements Serializable {

    private static final long serialVersionUID = 1;

    private String pastaPadrao = System.getProperty("user.dir");
    private String arqEditora = "editora.bin";
    private String arqQuadrinho = "quadrinhos.bin";
    private String arqEscritor = "escritores.bin";
    private String arqDesenhista = "desenhistas.bin";

    /**
     * @return the pastaPadrao
     */
    public String getPastaPadrao() {
        return pastaPadrao;
    }

    /**
     * @param pastaPadrao the pastaPadrao to set
     */
    public void setPastaPadrao(String pastaPadrao) {
        this.pastaPadrao = pastaPadrao;
    }

    public String getArqEditora() {
        return arqEditora;
    }

    public void setArqEditora(String arqEditora) {
        this.arqEditora = arqEditora;
    }

    public String getArqQuadrinho() {
        return arqQuadrinho;
    }

    public void setArqQuadrinho(String arqQuadrinho) {
        this.arqQuadrinho = arqQuadrinho;
    }

    public String getArqEscritor() {
        return arqEscritor;
    }

    public void setArqEscritor(String arqEscritor) {
        this.arqEscritor = arqEscritor;
    }

    public String getArqDesenhista() {
        return arqDesenhista;
    }

    public void setArqDesenhista(String arqDesenhista) {
        this.arqDesenhista = arqDesenhista;
    }

    public final String executa (Properties prop) {
        ControllerArquivoBinario controller = new ControllerArquivoBinario();
        controller.setArquivo("salvar");
        controller.setObjeto(prop);
        controller.escrever(false);
        return controller.getArquivo().getAbsolutePath();
    }
}
