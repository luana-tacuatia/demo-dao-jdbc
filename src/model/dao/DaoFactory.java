package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    //Da forma abaixo, a classe DaoFactory vai expor um método que retorna o tipo da interface, mas internamente vai instanciar uma implementação.
    //Macete para não expor a implementação
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
