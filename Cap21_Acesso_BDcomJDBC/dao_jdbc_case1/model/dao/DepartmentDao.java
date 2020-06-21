package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.dao_jdbc_case1.model.dao;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.dao_jdbc_case1.model.entities.Department;

import java.util.List;

public interface DepartmentDao {
    void insert (Department obj);

    void update(Department obj);

    void deleteById(Integer id);

    Department findById(Integer id);

    List<Department> findAll ();

}
