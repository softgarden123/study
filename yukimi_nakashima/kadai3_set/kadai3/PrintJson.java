package kadai3;

public class PrintJson {
    public static void main(String[] args) {

        LoadJson handler = new LoadJson();
        LoadJson.GetJson data = handler.readFromFile("src/testData/peronalInfo.json");

        System.out.println("ID:" + data.getId());
        System.out.println("name:" + data.getName());
        System.out.println("sikaku:" + data.getSikaku());

    }
}