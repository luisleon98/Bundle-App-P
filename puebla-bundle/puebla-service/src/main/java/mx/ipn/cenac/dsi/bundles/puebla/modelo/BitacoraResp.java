package mx.ipn.cenac.dsi.bundles.puebla.modelo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Tabla bitacora")
public class BitacoraResp {

    public class DataBitacoraResp {
        @ApiModelProperty(value = "Llave de la bitacora", required = true, example = "1")
        private Long id;
        @ApiModelProperty(value = "Movimiento realizado", required = true, example = "alta")
        private String movimiento;
        @ApiModelProperty(value = "Tabla afectada", required = true, example = "bitacora")
        private String tabla_afectada;
        @ApiModelProperty(value = "Identificador del registro afectado", required = true, example = "1")
        private Long id_registro_afectado;
        @ApiModelProperty(value = "Identificador del usuario que realiza el movimiento", required = true, example = "1")
        private Long id_usuario;
        @ApiModelProperty(value = "Fecha de creación", required = true, example = "1719605912000")
        private Long created_at;
        @ApiModelProperty(value = "Fecha de actualización", required = true, example = "1719605912000")
        private Long updated_at;
        @ApiModelProperty(value = "Fecha de borrado", required = true, example = "1719605912000")
        private Long deleted_at;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

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

        public Long getCreated_at() {
            return created_at;
        }

        public void setCreated_at(Long created_at) {
            this.created_at = created_at;
        }

        public Long getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(Long updated_at) {
            this.updated_at = updated_at;
        }

        public Long getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Long deleted_at) {
            this.deleted_at = deleted_at;
        }
    }

    @ApiModelProperty(value = "Contenedor de datos", required = true)
    private DataBitacoraResp data;

    public DataBitacoraResp getData() {
        return data;
    }

    public void setData(DataBitacoraResp data) {
        this.data = data;
    }
}
