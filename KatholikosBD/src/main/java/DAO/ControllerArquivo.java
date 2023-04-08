package Controladores;

import Dados.Properties;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author fabricio@utfpr.edu.br
 */
public abstract class ControllerArquivo {
    private Properties propriedades;
    protected File arquivo = null;
    public abstract boolean ler();
    public abstract boolean escrever(boolean append);
    protected int validar;
    
    /**
     * @return the arquivo
     */
    public File getArquivo() {
        return arquivo;
    }
        
    public void setArquivo (File arquivo) {
        this.arquivo = arquivo;
    }

    public Properties getPropriedades() {
        return propriedades;
    }

    public void setPropriedades(Properties propriedades) {
        this.propriedades = propriedades;
    }

    public int getValidar() {
        return validar;
    }

    public void setValidar(int validar) {
        this.validar = validar;
    }
    

    /**
     * @param TextoBotao o texto para o botão de escolha do usuário
     */
    public void setArquivo(String TextoBotao) {
        arquivo = null;
        String pastainicial = System.getProperty("user.dir");
        JFileChooser chooser = new JFileChooser(pastainicial);
        if (chooser.showDialog(null, TextoBotao) == JFileChooser.APPROVE_OPTION) {
            arquivo = chooser.getSelectedFile();
        }     
    }
        
    public final void informativo () {
        JOptionPane.showMessageDialog(
                null, "O ID é auto incremental e começa em 1, significa que a cada novo cadastro este ID recebe incremento de 1\nDito isto.",
                "Informativo", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public final int buscador (String departamento) {
        informativo();
        int marcador = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Digite o número de identificação do "+departamento,
                "Identificador de "+departamento,
                JOptionPane.QUESTION_MESSAGE));
        return marcador;
    } 
    
    public final void alteraImagens (String diretorio, JLabel quadro) {
        ImageIcon image = new ImageIcon ("src/main/java/Dados/Imagens/"+diretorio);
        image.setImage(image.getImage().getScaledInstance(quadro.getWidth(), quadro.getHeight(), 1));
        quadro.setIcon(image);
    }
    public final void inicializaTudo (String diretorio, String nomePes,JLabel imagem, JLabel nomeLB) {
        alteraImagens (diretorio, imagem);
        nomeLB.setText(nomePes);
    }
    
    public final void mensagens (int esc) {
        switch (esc) {
            case 1:
                JOptionPane.showMessageDialog (null, "Adição realizada com sucesso", "Adicionar", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Edição feita com sucesso", "Editar", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Exlusão Realizada com Sucesso", "Excluir", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                break;
        }
    }
}
