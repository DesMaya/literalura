package estudos.maya.literalura;

import estudos.maya.literalura.principal.Principal;
import estudos.maya.literalura.repository.AutoresRepository;
import estudos.maya.literalura.repository.LivrosRepository;
import estudos.maya.literalura.service.BookApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	@Autowired
	private AutoresRepository repositorio;
	@Autowired
	private LivrosRepository repositorioLivro;
	@Autowired
	private BookApiService bookApiService;
	@Autowired
	private LivrosRepository livroRepository;
	@Autowired
	private AutoresRepository autorRepository;

	public static void main(String[] args) {

		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

		Principal principal = new Principal(bookApiService, livroRepository, autorRepository);
		principal.exibeMenu();

	}

}
