/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Dados.Editora;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class ControladorEditora extends ControllerArquivoBinario {
    private Editora editoraAtual;
    private List <Editora> editoras;
    private static ControladorEditora controlEditora;

    public List<Editora> getEditoras() {
        return editoras;
    }

    public void setEditoras(List<Editora> editoras) {
        this.editoras = editoras;
    }

    public Editora getEditoraAtual() {
        return editoraAtual;
    }

    public void setEditoraAtual(Editora editoraAtual) {
        this.editoraAtual = editoraAtual;
        this.editoraAtual.setIdEditora();
        this.editoraAtual.setId(this.editoraAtual.getIdEditora());
    }

    private ControladorEditora() {
        editoraAtual = new Editora();
        editoras = new ArrayList <Editora> ();
    }

    public static ControladorEditora getControladorEditora () {
        if (controlEditora == null) {
            controlEditora = new ControladorEditora();
        }
        return controlEditora;
    }
    
    public void adiciona () {
        controlEditora.editoras.add(editoraAtual);
        controlEditora.editoraAtual = new Editora();
    }
    
    public void edita (int pos) {
        if (pos != -1) {
            controlEditora.editoras.set(pos, editoraAtual);
        }
        controlEditora.editoraAtual = new Editora();
    }
    
    public int busca (int id) {
        for (int i=0;i < controlEditora.editoras.size();i++) {
            if (id == controlEditora.editoras.get(i).getId()) {
                controlEditora.editoraAtual = controlEditora.editoras.get(i);
                return i;
            }
        }
        return -1;
    }

    public void exclui (int pos) {
        if (pos != -1) {
            controlEditora.editoras.remove(pos);
        }
        if (controlEditora.editoras.isEmpty()) {
            getArquivo().delete();
        }
        controlEditora.editoraAtual = new Editora();
    }
}