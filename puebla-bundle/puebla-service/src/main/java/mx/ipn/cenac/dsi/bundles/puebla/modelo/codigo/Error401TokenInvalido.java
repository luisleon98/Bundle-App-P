package mx.ipn.cenac.dsi.bundles.puebla.modelo.codigo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Contenedor de errores")
public class Error401TokenInvalido {

    public class Error401TokenInvalidoData {
        @ApiModelProperty(example = "Token inválido", value = "Token inválido", required = false)
        private String message;

        @ApiModelProperty(example = "Detalle de token inválido", value = "Detalle de token inválido", required = false)
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
    private Error401TokenInvalidoData error;

    public Error401TokenInvalidoData getError() {
        return error;
    }

    public void setError(Error401TokenInvalidoData error) {
        this.error = error;
    }
}
