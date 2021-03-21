package App.Main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
	private final FileWorker worker;

	@Autowired
	public MainApplication(FileWorker worker) {
		this.worker = worker;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainApplication.class, args);
	}
}
