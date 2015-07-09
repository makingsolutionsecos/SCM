package com.making.scm.manageBeans;

import com.making.scm.accesoDatos.RespuestaRegistroDal;
import com.making.scm.persistencia.RespuestaRegistro;
import com.making.scm.manageBeans.util.JsfUtil;
import com.making.scm.manageBeans.util.JsfUtil.PersistAction;
import java.io.IOException;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.servlet.ServletContext;

@ManagedBean(name = "respuestaRegistroController")
@SessionScoped
public class RespuestaRegistroController implements Serializable {

    @EJB
    private com.making.scm.accesoDatos.RespuestaRegistroDal respuestaRegistroDal;
    private List<RespuestaRegistro> items = null;
    private RespuestaRegistro selected;

    public RespuestaRegistroController() {
    }

    public RespuestaRegistro getSelected() {
        return selected;
    }

    public void setSelected(RespuestaRegistro selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private RespuestaRegistroDal getFacade() {
        return respuestaRegistroDal;
    }

    public RespuestaRegistro prepareCreate() {
        selected = new RespuestaRegistro();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("RespuestaRegistroCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("RespuestaRegistroUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("RespuestaRegistroDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<RespuestaRegistro> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public List<RespuestaRegistro> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<RespuestaRegistro> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = RespuestaRegistro.class)
    public static class RespuestaRegistroControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            RespuestaRegistroController controller = (RespuestaRegistroController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "respuestaRegistroController");
            return controller.getFacade().find(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof RespuestaRegistro) {
                RespuestaRegistro o = (RespuestaRegistro) object;
                return getStringKey(o.getIdRegistroRespuesta());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), RespuestaRegistro.class.getName()});
                return null;
            }
        }

    }

    public void consultarRegistroRespuesta(Long idRegistro) {
        items = respuestaRegistroDal.findByIdRegistro(idRegistro);
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            ServletContext servletContext = (ServletContext) context.getCurrentInstance().getExternalContext().getContext();
            context.getExternalContext().redirect(servletContext.getContextPath() + "/faces/respuestaRegistro/List.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(HomeManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
