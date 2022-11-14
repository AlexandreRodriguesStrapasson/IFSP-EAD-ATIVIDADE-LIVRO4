package data;

import model.Candidato;
import java.sql.*;
import java.util.List;

public class CandidatoSQliteDAO implements CandidatoDAO{
    @Override
    public void salvar(Candidato c) {

        String sql = "INSERT INTO candidato values (?, ?, ?, ?)";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)) {
            stmt.setInt(1, c.getNumero());
            stmt.setString(2, c.getNome());
            stmt.setInt(3, c.getIdpartido());
            stmt.setInt(4, c.getIdcargo());
            stmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Candidato c) {
        String sql = "UPDATE candidato SET nome=?, partido=?, cargo=? WHERE numero=?";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setString(1, c.getNome());
            stmt.setInt(2, c.getIdpartido());
            stmt.setInt(3, c.getIdcargo());
            stmt.setInt(4, c.getNumero());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void apagar(Candidato c) {
        String sql = "DELETE FROM candidato WHERE numero=?";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1, c.getNumero());
            stmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

        /*
    numero integer primary key,
    nome text,
    partido integer,
    cargo integer,
     */


    @Override
    public Candidato buscar(int numero) {
        String sql = "SELECT * FROM candidato WHERE numero=?";
        Candidato c = null;
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1, numero);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                c = new Candidato(rs.getInt("numero"), rs.getString("nome"),
                        rs.getInt("partido"), rs.getInt("cargo"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public List<Candidato> buscarTodos() {
        return null;
    }
}
