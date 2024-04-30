package mx.ipn.cenac.dsi.bundles.puebla.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.camel.Converter;
import org.apache.camel.Exchange;

import java.util.Map;
import java.util.logging.Logger;
@Converter
public final class RequestDataConverter {
    @Converter
    public static Map<String, Object> toMapRequest(RequestData rqd, Exchange exchange) {
        Logger log = Logger.getLogger(RequestDataConverter.class.getName());
        log.finest("Coverter Map -> JsonString");
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        Map<String, Object> map = mapper.convertValue(rqd, Map.class);
        return map;
    }

}
