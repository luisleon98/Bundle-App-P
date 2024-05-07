package mx.ipn.cenac.dsi.bundles.puebla.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Representa entrada de datos para convertir imagen a webp")
public class WebpConverterReq {

    public class DataWebpConverterReq {
        @ApiModelProperty(value = "Ruta del archivo", required = true, example = "/home/venayo/Pictures/2.JPG")
        private String rutaArchivo;

        public String getRutaArchivo() {
            return rutaArchivo;
        }

        public void setRutaArchivo(String rutaArchivo) {
            this.rutaArchivo = rutaArchivo;
        }
    }

    @ApiModelProperty(value = "Contenedor de datos", required = true)
    private DataWebpConverterReq data;

    public DataWebpConverterReq getData() {
        return data;
    }

    public void setData(DataWebpConverterReq data) {
        this.data = data;
    }
}
