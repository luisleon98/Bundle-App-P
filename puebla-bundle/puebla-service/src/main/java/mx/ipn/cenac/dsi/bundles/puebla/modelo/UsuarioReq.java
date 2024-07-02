package mx.ipn.cenac.dsi.bundles.puebla.modelo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Tabla usuarios")
public class UsuarioReq {

    public static class DataUsuarioReq {

        @ApiModelProperty(value = "Nombre del usuario", required = true, example = "Enrique López")
        private String user_name;
        @ApiModelProperty(value = "Password", required = true, example = "12345")
        private String password;
        @ApiModelProperty(value = "Recordar token", required = true, example = "acb")
        private String remember_token;

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getRemember_token() {
            return remember_token;
        }

        public void setRemember_token(String remember_token) {
            this.remember_token = remember_token;
        }
    }

    @ApiModelProperty(value = "Contenedor de datos", required = true)
    private DataUsuarioReq data;

    public DataUsuarioReq getData() {
        return data;
    }

    public void setData(DataUsuarioReq data) {
        this.data = data;
    }
}
