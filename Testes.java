package testes;

import java.io.IOException;

import elementos.Elementos;
import executa.Executa;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import massadedados.MassadeDados;
import metodos.Metodos;

public class Testes extends Metodos {

	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();
	MassadeDados massadedados = new MassadeDados();

	
	//Testes1//
	@Given("que eu esteja no site da livelo não logado")
	public void que_eu_esteja_no_site_da_livelo_não_logado() throws InterruptedException {
		Executa.abrirnavegador();

		Thread.sleep(8000);

	}

	@Given("clico em compre pontos")
	public void clico_em_compre_pontos() throws InterruptedException {
		Metodos.clicar(elementos.comprepontos);
		Thread.sleep(4000);

	}

	@Given("clico em para voce")
	public void clico_em_para_voce() throws InterruptedException {

		Metodos.clicar(elementos.paravoce);
		Thread.sleep(4000);
	}

	@When("preencho as informações")
	public void preencho_as_informações() throws InterruptedException {
		Metodos.escrever(elementos.pontoscomprar, massadedados.pontoscomprar);
		Metodos.escrever(elementos.inserircupom, massadedados.inserircupom);
		Thread.sleep(4000);
	}

	@When("clico em comprar pontos")
	public void clico_em_comprar_pontos() throws InterruptedException {
		Metodos.clicar(elementos.comprarpontos);
		Thread.sleep(4000);
	}

	@Then("sou redirecionado para a tela de login")
	public void sou_redirecionado_para_a_tela_de_login() throws InterruptedException, IOException {

		Metodos.evidenciarteste("CT01 - validar");
		Thread.sleep(4000);
	}

	
	//Teste2//
	@Given("que eu esteja no site da livelo  e não logado")
	public void que_eu_esteja_no_site_da_livelo_e_não_logado() throws InterruptedException {
		Executa.abrirnavegador();

		Thread.sleep(8000);
	}

	@Given("clico em compre pontos novamente")
	public void clico_em_compre_pontos_novamente() throws InterruptedException {
		Metodos.clicar(elementos.cookiesautorizar);
		Thread.sleep(4000);
		Metodos.clicar(elementos.comprepontos);
		Thread.sleep(5000);
	}

	@Given("clico em para um amigo")
	public void clico_em_para_um_amigo() throws InterruptedException {
		Metodos.clicar(elementos.paraumamigo);
		Thread.sleep(5000);
	}

	@When("preencho todas as informações")
	public void preencho_todas_as_informações() throws InterruptedException {
		Metodos.clicar(elementos.mais);
		Thread.sleep(2000);
		Metodos.escrever(elementos.cpf, massadedados.cpf);
		Thread.sleep(2000);
		Metodos.escrever(elementos.inserircupom, massadedados.inserircupom);
		Thread.sleep(4000);

	}

	@When("clico em comprar pontos novamente")
	public void clico_em_comprar_pontos_novamente() throws InterruptedException {
		Metodos.clicar(elementos.comprarpontosnovamente);
		Thread.sleep(4000);
	}

	@Then("sou redirecionado para a tela de login de acesso")
	public void sou_redirecionado_para_a_tela_de_login_de_acesso() throws InterruptedException, IOException {
		Metodos.evidenciarteste("CT02 - validar");
		Thread.sleep(4000);
	}

}
