package data;

import model.Cargo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class CargoSQliteDAO implements CargoDAO{
    @Override
    public void salvar(Cargo ca) {
        String sql = "INSERT INTO cargo VALUES (?, ?)";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1, ca.getIdCargo());
            stmt.setString(2, ca.getCargo());
            stmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void apagar(Cargo ca) {
        String sql = "DELETE FROM cargo WHERE idCargo=?";

        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1, ca.getIdCargo());
            stmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Cargo ca){
        String sql = "UPDATE cargo SET cargo=? WHERE idCargo=?";

        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setString(1, ca.getCargo());
            stmt.setInt(2, ca.getIdCargo());
            stmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Cargo buscar(int id) {
        String sql = "SELECT * FROM cargo WHERE idCargo=?";
        Cargo ca = null;
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                ca = new Cargo(rs.getInt("IdCargo"), rs.getString("Cargo"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return ca;
    }

    @Override
    public List<Cargo> buscarTodos() {
        return null;
    }

    @Override
    public List<Cargo> BuscarTodos() {
        return null;
    }
}
