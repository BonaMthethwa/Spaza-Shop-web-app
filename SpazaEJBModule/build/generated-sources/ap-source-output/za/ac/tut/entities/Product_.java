package za.ac.tut.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.entities.ProductImage;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-03T04:28:09")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, ProductImage> image;
    public static volatile SingularAttribute<Product, Integer> quantity;
    public static volatile SingularAttribute<Product, Double> price;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Long> id;
    public static volatile SingularAttribute<Product, Date> creationDate;

}