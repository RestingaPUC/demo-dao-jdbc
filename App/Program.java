package App;

import java.util.Date;

import modelDao.DaoFactory;
import modelDao.SellerDao;
import modelEntities.Department;
import modelEntities.Seller;

public class Program {
    public static void main(String[] args) {
        
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
