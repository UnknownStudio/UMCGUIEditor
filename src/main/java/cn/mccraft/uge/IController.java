package cn.mccraft.uge;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.nio.charset.StandardCharsets;

public interface IController {
    default Parent init(String name) {
        try {
            FXMLLoader loader = new FXMLLoader(IController.class.getResource("/fxml/" + name + ".fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.setCharset(StandardCharsets.UTF_8);
            return loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
