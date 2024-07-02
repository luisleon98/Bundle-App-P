package mx.ipn.cenac.dsi.bundles.puebla.modelo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Tabla bitacora")
public class BitacoraReq {

    public static class DataBitacoraReq {
        @ApiModelProperty(value = "Movimiento realizado", required = true, example = "alta")
        private String movimiento;
        @ApiModelProperty(value = "Tabla afectada", required = true, example = "bitacora")
        private String tabla_afectada;
        @ApiModelProperty(value = "Identificador del registro afectado", required = true, example = "1")
        private Long id_registro_afectado;
        @ApiModelProperty(value = "Identificador del usuario que realiza el movimiento", required = true, example = "1")
        private Long id_usuario;

        public String getMovimiento() {
            return movimiento;
        }

        public void setMovimiento(String movimiento) {
            this.movimiento = movimiento;
        }

        public String getTabla_afectada() {
            return tabla_afectada;
        }

        public void setTabla_afectada(String tabla_afectada) {
            this.tabla_afectada = tabla_afectada;
        }

        public Long getId_registro_afectado() {
            return id_registro_afectado;
        }

        public void setId_registro_afectado(Long id_registro_afectado) {
            this.id_registro_afectado = id_registro_afectado;
        }

        public Long getId_usuario() {
            return id_usuario;
        }

        public void setId_usuario(Long id_usuario) {
            this.id_usuario = id_usuario;
        }
    }

    @ApiModelProperty(value = "Contenedor de datos", required = true)
    private DataBitacoraReq data;

    public DataBitacoraReq getData() {
        return data;
    }

    public void setData(DataBitacoraReq data) {
        this.data = data;
    }
}
