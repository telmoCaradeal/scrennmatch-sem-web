package br.com.projeto.screen.screenmachspring;

import br.com.projeto.screen.screenmachspring.model.DadosSeries;
import br.com.projeto.screen.screenmachspring.services.ConsumoAPI;
import br.com.projeto.screen.screenmachspring.services.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class ScreenmachspringApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ScreenmachspringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoAPI consultaAPI = new ConsumoAPI();
		var json = consultaAPI
				.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=cc3dcf2e");
		System.out.println(json);

		ConverterDados conversor = new ConverterDados();
		DadosSeries dados = conversor.obterDados(json, DadosSeries.class);
		System.out.println(dados);

	}
}
