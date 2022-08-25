package sgh.mansilla.vista.abm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sgh.mansilla.modelo.datos.facturacion.ClienteComprobante;
import sgh.mansilla.modelo.negocio.ABM;
import sgh.mansilla.modelo.negocio.persona.TipoDocumentoABM;


@Controller
@RequestMapping("/clientecomprobante")
public class ClienteComprobanteABMController extends AbstractABMController<Integer, ClienteComprobante>{





    @Autowired
    @Qualifier("clienteComprobanteABM")
    protected void setAbm(ABM<Integer, ClienteComprobante> abm) {
        super.setAbm(abm);
    }

    public ClienteComprobanteABMController() {
        super("abm/clienteComprobante");
    }

    @Override
    protected ClienteComprobante createEntity() {
        return new ClienteComprobante();
    }

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false);
//        binder.registerCustomEditor(Date.class, "fechaDeNacimiento", new CustomDateEditor(dateFormat, true));
//
//        binder.registerCustomEditor(TipoDocumento.class, new TipoDocumentoEditor());
//
//    }
//
//    private class TipoDocumentoEditor extends PropertyEditorSupport {
//
//        private SimpleTypeConverter typeConverter = new SimpleTypeConverter();
//
//        @Override
//        public void setAsText(String text) {
//            if(text == null || 0 == text.length()) {
//                setValue(null);
//                return;
//            }
//
//            setValue(tipoDocumentoABM.buscarPorId(typeConverter.convertIfNecessary(text, Integer.class)));
//        }
//
//    }



}
