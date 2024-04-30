package mx.ipn.cenac.dsi.bundles.puebla.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentStringPBEConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Util {

    public Integer incDecInteger(Integer num, Integer cantidad) {
        return num + cantidad;
    }

    public String decrypt(String encripted) {
        org.jasypt.encryption.pbe.config.EnvironmentStringPBEConfig enc = new EnvironmentStringPBEConfig();
        enc.setAlgorithm("PBEWithMD5AndDES");
        enc.setPassword(System.getenv("CAMEL_ENCRYPTION_PASSWORD"));

        StandardPBEStringEncryptor se = new StandardPBEStringEncryptor();
        se.setConfig(enc);
        return se.decrypt(encripted);
    }

    public String arrayToString(List<String> arreglo) {
        String concat = "";
        for (String str : arreglo) {
            concat += str + "," ;
        }

        if(!concat.isEmpty()){
            concat = concat.substring(0, concat.length() - 1);
        }
        return concat;
    }

    public void pruebaXml(Exchange exchange) {
        String cadenaXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<Employee><id>123 </id><name>ABC</name><type>senior</type></Employee>";

        String xmlInput = exchange.getIn().getBody(String.class);
        // Aquí va tu lógica para convertir el XML a JSON utilizando Jackson
        ObjectMapper objectMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        try {
            // Leer el XML y convertirlo a un objeto Java
            Object xmlObject = xmlMapper.readValue(xmlInput, Object.class);
            // Convertir el objeto Java a JSON
            String jsonOutput = objectMapper.writeValueAsString(xmlObject);
            // Establecer el JSON resultante en el cuerpo del intercambio
            exchange.getIn().setBody(jsonOutput);
        } catch (Exception e) {
            // Manejar cualquier error de conversión
            e.printStackTrace();
        }

    }

    public void encode64(Exchange exchange) {
        String uspass = exchange.getIn().getHeader("uspass").toString();
        String path = exchange.getIn().getHeader("path").toString();
        String appendData = exchange.getIn().getHeader("appendData").toString();
        String doHash = exchange.getIn().getHeader("doHash").toString();
        String valueIsBase64 = "";

        if (exchange.getIn().getHeaders().containsKey("valueIsBase64")) {
            valueIsBase64 = exchange.getIn().getHeader("valueIsBase64").toString();
        }

        byte[] encodedBytes = Base64.getEncoder().encode(uspass.getBytes());
        exchange.getIn().setHeader("auth", new String(encodedBytes));

        path = path + "?appendData=" + appendData;
        path = path + "&doHash=" + doHash;

        if (!valueIsBase64.equals("") || valueIsBase64 != null) {
            path = path + "&valueIsBase64=" + valueIsBase64;
        }

        exchange.getIn().setHeader("path", path);
    }

    public String replaceGuiones(String cadena) {
        return cadena.replace("--", "&#45;&#45;");
    }

    public void obtenerIp(Exchange exchange) {
        Map<String, Object> headers = exchange.getIn().getHeaders();
        System.out.println("headers:" + headers);
    }

    public void procesarRespuestaDae(Exchange exchange) {

        String respuestaDae = exchange.getIn().getHeader("respuestaDae").toString();
        exchange.getMessage().setBody(respuestaDae);
    }

    public static Map<String, Object> convertInputStreamToMap(InputStream inputStream) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(inputStream, Map.class);
    }
}
