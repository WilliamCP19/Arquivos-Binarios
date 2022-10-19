/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Dados.Quadrinho;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author willi
 */
public class ControladorQuadrinho extends ControllerArquivoBinario {
    private Quadrinho hqAtual;
    private List <Quadrinho> hqs;
    private static ControladorQuadrinho controlQuadrinho;

    public List<Quadrinho> getHqs() {
        return hqs;
    }

    public void setHqs(List<Quadrinho> hqs) {
        this.hqs = hqs;
    }

    public Quadrinho getHqAtual() {
        return hqAtual;
    }

    public void setHqAtual(Quadrinho hqAtual) {
        this.hqAtual = hqAtual;
        this.hqAtual.setIdQuadrinho();
        this.hqAtual.setId(this.hqAtual.getIdQuadrinho());
    }
    
    private ControladorQuadrinho() {
        hqAtual = new Quadrinho();
        hqs = new ArrayList <Quadrinho> ();
    }
    public static ControladorQuadrinho getControladorQuadrinho () {
        if (controlQuadrinho == null) {
            controlQuadrinho = new ControladorQuadrinho();
        }
        return controlQuadrinho;
    }
    
    public void adiciona () {
        controlQuadrinho.hqs.add(hqAtual);
        controlQuadrinho.hqAtual = new Quadrinho();
    }
    
    public void edita (int pos) {
        if (pos != -1) {
            controlQuadrinho.setHqAtual(hqAtual);
            controlQuadrinho.hqs.set(pos, hqAtual);
            controlQuadrinho.hqAtual = new Quadrinho();
        }
    }
    
    public int busca (int id) {
        for (int i=0;i < controlQuadrinho.hqs.size();i++) {
            if (id == controlQuadrinho.hqs.get(i).getId()) {
                controlQuadrinho.hqAtual = controlQuadrinho.hqs.get(i);
                return i;
            }
        }
        return -1;
    }
    public void exclui (int pos) {
        if (pos != -1) {
            controlQuadrinho.hqs.remove(pos);
            controlQuadrinho.hqAtual = new Quadrinho();
        } if (controlQuadrinho.hqs.isEmpty()) {
            getArquivo().delete();
        }
    }
}