package testes;

import java.io.IOException;

import elementos.Elementos;
import executa.Executa;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import massadedados.MassadeDados;
import metodos.Metodos;

public class Testes extends Metodos {

	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();
	MassadeDados massadedados = new MassadeDados();

	@Given("que eu esteja no site da livelo não logado")
	public void que_eu_esteja_no_site_da_livelo_não_logado() throws InterruptedException {
		Executa.abrirnavegador();

		Thread.sleep(3000);

	}

	@After
	public void fecharnavegador() {

		Executa.fecharnavegador();
	}

	@Given("clico em compre pontos")
	public void clico_em_compre_pontos() throws InterruptedException {
		metodos.clicar(elementos.comprepontos);
		Thread.sleep(2000);

	}

	@Given("clico em para voce")
	public void clico_em_para_voce() throws InterruptedException {

		metodos.clicar(elementos.paravoce);
		Thread.sleep(2000);
	}

	@When("preencho as informações")
	public void preencho_as_informações() throws InterruptedException {
		metodos.escrever(elementos.pontoscomprar, massadedados.pontoscomprar);
		metodos.escrever(elementos.inserircupom, massadedados.inserircupom);
		Thread.sleep(2000);
	}

	@When("clico em comprar pontos")
	public void clico_em_comprar_pontos() throws InterruptedException {
		metodos.clicar(elementos.comprarpontos);
		Thread.sleep(2000);
	}

	@Then("sou redirecionado para a tela de login")
	public void sou_redirecionado_para_a_tela_de_login() throws InterruptedException, IOException {

		Metodos.evidenciarteste("CT01 - validar");
		Thread.sleep(2000);
	}

}
