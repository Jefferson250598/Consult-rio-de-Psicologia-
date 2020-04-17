/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Sessao;
/**
 *
 * @author mathe
 */
public interface ISessaoDAO {
    public void adiciona(Sessao sessao);
    public void altera(Sessao sesao);
    public void remove (int id);
    public List<Sessao> listarTodos();
    public Sessao getByID(int id);
    
}
