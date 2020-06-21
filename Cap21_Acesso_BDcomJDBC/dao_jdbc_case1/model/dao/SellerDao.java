package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.dao_jdbc_case1.model.dao;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.dao_jdbc_case1.model.entities.Department;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.dao_jdbc_case1.model.entities.Seller;

import java.util.List;

public interface SellerDao {void insert (Seller obj);

    void update(Seller obj);

    void deleteById(Integer id);

    Seller findById(Integer id);

    List<Seller> findAll ();

    List<Seller> findByDepartment (Department department);

}