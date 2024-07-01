package mx.ipn.cenac.dsi.bundles.puebla.modelo.codigo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Contenedor de errores")
public class Error202Validacion {

    public static class Error202ValidacionData {
        @ApiModelProperty(example = "Error en validación", value = "Error inesperado", required = false)
        private String message;

        @ApiModelProperty(example = "Detalle del error de validación", value = "Detalle del error de validación", required = false)
        private String detail;

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    @ApiModelProperty(value = "Contenedor de datos del error", required = true)
    private Error202ValidacionData error;

    public Error202ValidacionData getError() {
        return error;
    }

    public void setError(Error202ValidacionData error) {
        this.error = error;
    }
}
