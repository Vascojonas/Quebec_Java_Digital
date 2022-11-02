package junit_gradle_project;

import java.util.logging.Logger;

public class BancoDeDados {
	private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
	
	public static void iniciarConexao() {
		LOGGER.info("iniciou conexao");
	}
	
	public static void finalizarConexao() {
		LOGGER.info("Finalizou conexao");
	}
	
	public static void insertData(Pessoa pesso) {
		LOGGER.info("Inseriu dados");
	}
	
	public static void removetData(Pessoa pesso) {
		LOGGER.info("removeu  dados");
	}
}
