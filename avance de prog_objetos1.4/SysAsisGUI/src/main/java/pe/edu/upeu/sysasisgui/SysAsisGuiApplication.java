package pe.edu.upeu.sysasisgui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SysAsisGuiApplication extends Application {

	private static ConfigurableApplicationContext applicationContext;
	private Parent root;

	public static void main(String[] args) {
		//SpringApplication.run(SysAsisGuiApplication.class, args);
		launch(args);
	}

	@Override
	public void init() throws Exception {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(SysAsisGuiApplication.class);

		builder.application().setWebApplicationType(WebApplicationType.NONE);
		applicationContext = builder.run(getParameters().getRaw().toArray(new String[0]));
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/main_asistencia.fxml"));
		loader.setControllerFactory(applicationContext::getBean);
		root = loader.load();
	}

	@Override
	public void start(Stage stage) throws Exception {
		Scene scene = new Scene(root);
		double preferredWidth = root.prefWidth(-1);
		double preferredHeigh = root.prefHeight(-1);
		stage.setMinWidth(preferredWidth);
		stage.setMinHeight(preferredHeigh);
		stage.setScene(scene);
		stage.setTitle("Registro de Asistencia");
		stage.show();
	}
}
