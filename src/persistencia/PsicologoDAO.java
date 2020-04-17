/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import negocio.Psicologo;

/**
 *
 * @author mathe
 */
public class PsicologoDAO implements IPsicologoDAO{
    
    private Connection connection;
    
    public PsicologoDAO(){
    
        this.connection = new ConFactory().getConnection();
    
    }
    
    public void adiciona(Psicologo psicologo){
    
        String sql = "insert into psicologo " +
                "(nome, cpf, crp, telefone, login, senha)" +
                " values (?,?,?,?,?,?,)";
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, psicologo.getNome());
            stmt.setString(2, psicologo.getCpf());
            stmt.setString(3, psicologo.getCrp());
            stmt.setString(4, psicologo.getTelefone());
            stmt.setString(5, psicologo.getLogin());
            stmt.setString(6, psicologo.getSenha());
            
            stmt.execute();
            stmt.close();
            
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(Psicologo psicologo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Psicologo> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Psicologo getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
