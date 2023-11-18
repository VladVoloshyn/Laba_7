import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XmlDeserializer {
    public static Team whenJavaGotFromXmlFile_thenCorrect(String path) throws IOException {
        File file = new File(path);
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(file, Team.class);
    }
}
