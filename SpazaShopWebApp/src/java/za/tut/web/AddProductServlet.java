/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.tut.web;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import za.ac.tut.bl.ProductFacadeLocal;
import za.ac.tut.entities.Product;
import za.ac.tut.entities.ProductImage;

/**
 *
 * @author User
 */
@MultipartConfig
public class AddProductServlet extends HttpServlet {
@EJB
private ProductFacadeLocal pfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        Long id=Long.parseLong(request.getParameter("id"));
        String name=request.getParameter("name");
        Double price=Double.parseDouble(request.getParameter("price"));
        Integer quantity= Integer.parseInt(request.getParameter("quantity"));
        Date creationDate=new Date();
        Part part=request.getPart("image");
        String img_name=part.getSubmittedFileName();
        InputStream is=part.getInputStream();
        byte[] img_source=convertToByteImage(is);
        ProductImage image=new ProductImage(img_name, img_source);
        
        Product product=new Product(id, name, quantity, price, image);
        pfl.create(product);
        
        RequestDispatcher disp= request.getRequestDispatcher("add_outcome.jsp");
        disp.forward(request, response);
        
    }

    private byte[] convertToByteImage(InputStream is) throws IOException {
        int value;
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        byte[] buffer=new byte[1024];
        byte[] img_src=null;
        
        while((value=is.read(buffer)) !=-1){
          baos.write(buffer, 0, value);
        }
        img_src=baos.toByteArray();
        return img_src;
    }
    
    
    
}
