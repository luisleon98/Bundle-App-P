package mx.ipn.cenac.dsi.bundles.swaggerui.puebla;

import org.osgi.service.component.annotations.Component;

@Component(service = Swauipuebla.class, property = {
                "osgi.http.whiteboard.resource.pattern=/puebla_ui/*",
                "osgi.http.whiteboard.resource.prefix=/puebla_ui"
})
public class Swauipuebla {

}
