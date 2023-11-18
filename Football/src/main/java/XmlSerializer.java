import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XmlSerializer {
    public static void whenJavaSerializedToXmlFile_thenCorrect(Team team, String xmlFilePath) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File(xmlFilePath), team);
        File file = new File(xmlFilePath);
    }
}
