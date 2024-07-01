package mx.ipn.cenac.dsi.bundles.puebla.modelo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Respuesta operación exitosa")
public class OperationOkResp {

    public static class DataOperationOkResp {
        @ApiModelProperty(value = "Mensaje", required = true, example = "Operación exitosa")
        private String mensaje;

        public String getMensaje() {
            return mensaje;
        }

        public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
        }
    }

    @ApiModelProperty(value = "Contenedor de datos", required = true)
    private DataOperationOkResp data;

    public DataOperationOkResp getData() {
        return data;
    }

    public void setData(DataOperationOkResp data) {
        this.data = data;
    }
}
