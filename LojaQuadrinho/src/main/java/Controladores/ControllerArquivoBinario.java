/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Dados.Properties;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class ControllerArquivoBinario extends ControllerArquivo{
    private Object objeto = null;
    private ObjectInputStream leitor;
    private ObjectOutputStream escritor;

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }
    
    @Override
    public boolean ler() {
        try {
           leitor = new ObjectInputStream (new FileInputStream(arquivo));
           objeto = leitor.readObject(); leitor.close(); return true;
        }catch (ClassNotFoundException ex) {
            System.out.println("Classe não encotrada!!!"); return false;
        } catch (EOFException fim) {
            return false;
        } catch (IOException erro) {
            System.out.println(arquivo);
            System.err.println("Erro de Leitura!!" + erro);
            return false;
        } 
    }

    @Override
    public boolean escrever(boolean append) {
        if (arquivo != null) {
            try {
                escritor = new ObjectOutputStream (new FileOutputStream (arquivo, append));
                escritor.writeObject(objeto);
                escritor.close(); return true;
            } catch (IOException erro) {
                System.err.println("Erro para escrever!!!\n" + erro.getMessage());
                return false;
            }   
        } else {
            return false;
        }
    }
    
    public void preencheArqProp (ControllerArquivoBinario control, String path, String departamento) {
        control.setArquivo(new File (path));
        control.ler();
        control.atribuiArqProp(control.getObjeto(), departamento);
    }
    
    public void atribuiArqProp(Object propriedades, String departamento) {
        setPropriedades((Properties) propriedades);
        setArqPorDep(departamento);
    }
    
    public final void setArqPorDep (String departamento) {
        switch (departamento) {
            case "Editora":
                arquivo = new File (getPropriedades().getPastaPadrao(), getPropriedades().getArqEditora());
                try {
                    if (arquivo.createNewFile()) {}
                } catch (IOException ex) {
                    System.out.println("ERRO!!!!Arquivo não criado");
                }
                break;

            case "Quadrinhos":
                arquivo = new File (getPropriedades().getPastaPadrao(), getPropriedades().getArqQuadrinho());
                try {
                    if (arquivo.createNewFile()) {}
                } catch (IOException ex) {
                    System.out.println("ERRO!!!!Arquivo não criado");
                }
                break;
            case "Escritores":
                arquivo = new File (getPropriedades().getPastaPadrao(), getPropriedades().getArqEscritor());
                try {
                    if (arquivo.createNewFile()) {}
                } catch (IOException ex) {
                    System.out.println("ERRO!!!!Arquivo não criado");
                }
                break;
            case "Desenhistas":
                arquivo = new File (getPropriedades().getPastaPadrao(), getPropriedades().getArqDesenhista());
                try {
                    if (arquivo.createNewFile()) {}
                } catch (IOException ex) {
                    System.out.println("ERRO!!!!Arquivo não criado");
                }
                break;
            default:
                arquivo = null;
                JOptionPane.showMessageDialog(null, "ERRO! Departamento não existe!");
                break;
        }
    }
    public final boolean verificarArquivo () {
        if (getArquivo() == null) {
            JOptionPane.showMessageDialog(null, "Arquivo está nulo!!!\nSelecione o arquivo para armazenamento");
            setArquivo("Salvar");
            return ler();
        }
        return false;
    }
}
