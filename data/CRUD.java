package data;

import model.ModeloModel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface CRUD {
    public boolean incluir(ModeloModel obj) throws Exception;
    public boolean editar(ModeloModel obj) throws Exception;
    public boolean excluir(int id) throws Exception;
    public ArrayList<ModeloModel> pesquisar(String pesquisa) throws Exception;
    public ModeloModel obter(int id) throws Exception;
}
