import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("1", "FC Barcelona", "1899", new Footballer[]{new Footballer("Lionel", "Messi",10), new Footballer("Luis", "Suarez", 9)}, "Xavi");
        System.out.println(team);
        String xmlFilePath = "team.xml";
        

        try {
            XmlSerializer.whenJavaSerializedToXmlFile_thenCorrect(team, xmlFilePath);
            System.out.println("Об'єкт був серіалізований у XML.");
        } catch (IOException e) {
            e.printStackTrace();
        }


        Team deserializedTeam = null;
        try {
            deserializedTeam = XmlDeserializer.whenJavaGotFromXmlFile_thenCorrect(xmlFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (deserializedTeam != null) {
            System.out.println(deserializedTeam);
        } else {
            System.out.println("Не вдалося десеріалізувати об'єкт з XML.");
        }
    }
}
