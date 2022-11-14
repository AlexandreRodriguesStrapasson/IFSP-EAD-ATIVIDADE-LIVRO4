package data;

import model.Cargo;

import java.util.List;

public interface CargoDAO extends DAO<Cargo> {
    @Override
    void salvar(Cargo type);

    @Override
    void apagar(Cargo type);

    @Override
    void atualizar(Cargo type);

    @Override
    Cargo buscar(int id);

    List<Cargo> BuscarTodos();
}
