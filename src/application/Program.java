package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        SellerDao sellerDao = DaoFactory.createSellerDao(); //forma de injetar uma dependência sem explicitar a implementação; Assim o programa não conhece a implementação, conhece somente a interface.

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
