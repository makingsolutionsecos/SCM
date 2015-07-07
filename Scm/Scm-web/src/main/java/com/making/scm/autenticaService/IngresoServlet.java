    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.autenticaService;

import com.making.scm.manageBeans.UsuarioManagedBean;
import com.making.scm.manageBeans.util.JsfUtil;
import java.io.IOException;
import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Your Name
 */
public class IngresoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FacesContext facesContext = JsfUtil.getFacesContext(req, resp);
        UsuarioManagedBean beanInst = (UsuarioManagedBean) findBean("usuarioManagedBean", facesContext);
        beanInst.listarUsuarios();
    }

    
    public static <T> T findBean(String beanName, FacesContext context) {
        Application app = context.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = context.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, "#{" + beanName + "}", Object.class);
        return (T) valueExp.getValue(elContext);
    }

}
