package mx.ipn.cenac.dsi.bundles.puebla.modelo.codigo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Contenedor de errores")
public class Error400NoAuth {

    public class Error400NoAuthData {
        @ApiModelProperty(example = "Error en autenticación", value = "Error en autenticación", required = false)
        private String message;

        @ApiModelProperty(example = "Detalle de error en autenticación", value = "Detalle de error en autenticación", required = false)
        private String detail;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }
    }

    @ApiModelProperty(value = "Contenedor de datos del error", required = true)
    private Error400NoAuthData error;

    public Error400NoAuthData getError() {
        return error;
    }

    public void setError(Error400NoAuthData error) {
        this.error = error;
    }
}
