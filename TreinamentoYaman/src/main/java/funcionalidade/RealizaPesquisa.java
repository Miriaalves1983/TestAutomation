package funcionalidade;

import pageObjects.PagePesquisa;

public class RealizaPesquisa {

	public void Pesquisar() throws Exception {
		PagePesquisa pagePesquisa = new PagePesquisa();

		String produto = "Playstation 4";
		pagePesquisa.preencherCampoPesquisar(produto);
		pagePesquisa.clicarBotaoPesquisar();

	}
}
