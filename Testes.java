package testes;

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

	@Given("que eu esteja em no site da livelo")
	public void que_eu_esteja_em_no_site_da_livelo() throws InterruptedException {

		Executa.abrirnavegador();
		Thread.sleep(2000);
	}

	@After
	public void fecharnavegador() {

		Executa.fecharnavegador();
	}

	@Given("clica em compre pontos")
	public void clica_em_compre_pontos() {

		metodos.clicar(elementos.comprepontos);

	}

	@Given("clico em para você")
	public void clico_em_para_você() throws InterruptedException {
		metodos.clicar(elementos.paravoce);
		Thread.sleep(2000);
	}

	@Given("preencho quantos pontos voce quer comprar")
	public void preencho_quantos_pontos_voce_quer_comprar() throws InterruptedException {
		metodos.escrever(elementos.pontoscomprar, massadedados.pontoscomprar);
		Thread.sleep(2000);
	}

	@Given("preencho cupom de desconto")
	public void preencho_cupom_de_desconto() throws InterruptedException {
		metodos.escrever(elementos.inserircupom, massadedados.inserircupom);
		Thread.sleep(2000);
	}

	@When("clico em comprar pontos")
	public void clico_em_comprar_pontos() throws InterruptedException {
		metodos.clicar(elementos.comprarpontos);
		Thread.sleep(2000);
	}

	@Then("sou redirecionado para a tela de login")
	public void sou_redirecionado_para_a_tela_de_login() {

	}

}
