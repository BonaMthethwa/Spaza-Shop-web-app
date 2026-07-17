/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.ProductFacadeLocal;
import za.ac.tut.entities.Product;

/**
 *
 * @author User
 */
@MultipartConfig
public class SearchProductServlet extends HttpServlet {
@EJB
private ProductFacadeLocal pfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        Long id=Long.parseLong(request.getParameter("id"));
        String url="";
        Product product=pfl.find(id);
        if(product !=null){
        
        request.setAttribute("product", product);
        url="search_outcome.jsp";
        }
        else{
           url="productNotFound.jsp"; 
        }
        RequestDispatcher disp= request.getRequestDispatcher(url);
        disp.forward(request, response);
        
    }
    
}
