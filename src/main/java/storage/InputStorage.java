package storage;

import java.util.List;

public class InputStorage {
    private static List<String> inputData;

    public static void setInputData(List<String> input) {
        InputStorage.inputData = input;
    }

    public static List<String> getInputData() {
        return inputData;
    }
}
