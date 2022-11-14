package data;

import model.Candidato;

import java.util.List;

public interface CandidatoDAO extends DAO<Candidato>{
    void salvar(Candidato candidato);
    void atualizar(Candidato candidato);
    void apagar(Candidato candidato);
    Candidato buscar(int numero);
    List<Candidato> buscarTodos();

}
