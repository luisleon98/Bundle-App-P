package mx.ipn.cenac.dsi.bundles.puebla.modelo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Contenedor de errores")
public class ErrorGeneral {

    public class ErrorGeneralData {
        @ApiModelProperty(example = "Error inesperado", value = "Error inesperado", required = false)
        private String message;

        @ApiModelProperty(example = "Detalle del error", value = "Detalle del error", required = false)
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
    private ErrorGeneralData error;

    public ErrorGeneralData getError() {
        return error;
    }

    public void setError(ErrorGeneralData error) {
        this.error = error;
    }
}
