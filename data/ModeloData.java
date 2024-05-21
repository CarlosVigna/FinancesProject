package data;

import model.ModeloModel;

import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloData extends Conexao implements CRUD {

    public ModeloData() throws Exception {
    }

    @Override
    public boolean incluir(ModeloModel obj) throws Exception {
        return false;
    }

    @Override
    public boolean editar(ModeloModel obj) throws Exception {
        return false;
    }

    @Override
    public boolean excluir(int id) throws Exception {
        return false;
    }

    @Override
    public ArrayList<ModeloModel> pesquisar(String pesquisa) throws Exception {
        return null;
    }

    @Override
    public ModeloModel obter(int id) throws Exception {
        return null;
    }
}
