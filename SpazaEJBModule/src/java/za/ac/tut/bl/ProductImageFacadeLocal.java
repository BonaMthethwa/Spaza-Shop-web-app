/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.ProductImage;

/**
 *
 * @author User
 */
@Local
public interface ProductImageFacadeLocal {

    void create(ProductImage productImage);

    void edit(ProductImage productImage);

    void remove(ProductImage productImage);

    ProductImage find(Object id);

    List<ProductImage> findAll();

    List<ProductImage> findRange(int[] range);

    int count();
    
}
