package mx.ipn.cenac.dsi.bundles.puebla.converter;

import com.luciad.imageio.webp.WebPWriteParam;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Base64;

public class WebpConverter {

    public static String convertToWebp(String file) throws Exception {

//        File.createTempFile("alejo",".txt", new File("/home/venayo/"));

        BufferedImage image = ImageIO.read(new File(file));
//        ImageIO.write(image, "webp", new File("/home/venayo/salida.webp"));

//        ImageIO.write(image, "webp", new File("salida.webp"));
//        ImageIO.write(image, "webp", File.createTempFile("2wewee",".webp", new File("/home/venayo/")));

        // Obtain a WebP ImageWriter instance
//        ImageWriter writer = ImageIO.getImageWritersByMIMEType("image/webp").next();

        // Configure encoding parameters
//        WebPWriteParam writeParam = new WebPWriteParam(writer.getLocale());
//        writeParam.setCompressionMode(WebPWriteParam.MODE_DEFAULT);
//        writeParam.setCompressionType(writeParam.getCompressionTypes()[WebPWriteParam.LOSSLESS_COMPRESSION]);

        // Configure the output on the ImageWriter
//        writer.setOutput(new FileImageOutputStream(new File("salida.webp")));

        // Encode
//        writer.write(null, new IIOImage(image, null, null), writeParam);



        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        //ImageIO.write(image, "webp", new File("salida/" + file.substring(0, file.lastIndexOf(".")) + ".webp"));
        ImageIO.write(image, "webp", baos);
//
//        String base64 = Base64.getEncoder().encodeToString(null);
//        return base64;
return "";
//        return null;
    }
}