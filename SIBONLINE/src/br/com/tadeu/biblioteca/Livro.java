package br.com.tadeu.biblioteca;

import br.com.tadeu.sistemacentraldaescola.*;

public class Livro extends Aluno {
	
	private String titulo;
	private int isbn;
	private int ano;
	private String editora;
	private String palavraChave;
	private String genero;
	private int quantidadeExistente;
	private int quantidadeNaoDisponivel;	
	private int dataInicial;
	
	// A data final (data de devolução) deverá ser calculada automaticamente pelo 
	// sistema através da regra – 10 dias corridos a partir da data inicial do empréstimo.
	private int dataFinal = this.dataInicial + 10;
	
	private String horaInicial;
	private String horaFinal;
	private int entrega;
	private int limiteReserva;	
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getPalavraChave() {
		return palavraChave;
	}

	public void setPalavraChave(String palavraChave) {
		this.palavraChave = palavraChave;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getQuantidadeExistente() {
		return quantidadeExistente;
	}

	public void setQuantidadeExistente(int quantidadeExistente) {
		this.quantidadeExistente = quantidadeExistente;
	}

	public int getQuantidadeNaoDisponivel() {
		return quantidadeNaoDisponivel;
	}

	public void setQuantidadeNaoDisponivel(int quantidadeNaoDisponivel) {
		this.quantidadeNaoDisponivel = quantidadeNaoDisponivel;
	}

	public int getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(int dataInicial) {
		this.dataInicial = dataInicial;
	}

	public int getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(int dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getHoraInicial() {
		return horaInicial;
	}

	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}

	public String getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}

	public int getEntrega() {
		return entrega;
	}

	public void setEntrega(int entrega) {
		this.entrega = entrega;
	}

	public int getLimiteReserva() {
		return limiteReserva;
	}

	public void setLimiteReserva(int limiteReserva) {
		this.limiteReserva = limiteReserva;
	}	
	
	// Métodos para acesso do Administrador
	public void emitirComprovante() {		
		
		System.out.println("Título do livro: " + getTitulo());
		System.out.println("Nome do aluno: " + getNome());
		System.out.println("Data do empréstimo: " + this.dataInicial);
		System.out.println("Data de devolução: " + this.dataFinal);
	}	
	
	public void devolver() {
		System.out.println("Programação para devolução de livro a ser desenvolvida...\n");
		setDataFinal(0);
		emitirComprovante();
	}
	
	public void realizarEmprestimo(String nome, String perfil, int matricula, int[] senha,
			String situacao, boolean primeiroAcesso, String  email, String titulo, int isbn,
			int ano, String editora, String palavraChave, String genero, 
			int quantidadeExistente, int quantidadeNaoDisponivel, int di, int df,
			String hi, String hf) {

		/* O sistema deve possibilitar ao bibliotecário a Realização de Empréstimo de
		 * Livros.		 * 
		 * Somente é permitido realizar o empréstimo para o usuário cadastrado no sistema
		 * e que seja um aluno da escola.		 * 
		 * Para cada empréstimo o sistema deve armazenar informações do aluno,
		 * livro(s) e data e hora inicial e final do empréstimo.
		 */		

		this.setTitulo(titulo);
		this.setIsbn(isbn);
		this.setAno(ano);
		this.setEditora(editora);
		this.setPalavraChave(palavraChave);
		this.setGenero(genero);
		this.setQuantidadeExistente(quantidadeExistente);
		this.setQuantidadeNaoDisponivel(quantidadeNaoDisponivel);	
		this.setNome(nome);
		this.setPerfil(perfil);
		this.setMatricula(matricula);
		this.setSenha(senha);
		this.setSituacao(situacao);
		this.setPrimeiroAcesso(primeiroAcesso);
		this.setEmail(email);
		this.dataInicial = di;
		this.dataFinal = df;
		this.horaInicial = hi;
		this.horaFinal = hf;			
		System.out.println("Empréstimo efetuado com sucesso");

		System.out.println();
		System.out.println("Imprimindo dados do empréstimo...\n");
		System.out.println("Nome do aluno: " + getNome());
		System.out.println("Perfil do aluno: " + getPerfil());
		System.out.println("Matrícula do aluno: " + getMatricula());
		//System.out.println("Senha do aluno: " + getSenha());
		System.out.println("Situação do aluno: " + getSituacao());
		System.out.println("Primeiro acesso: " + isPrimeiroAcesso());
		System.out.println("E-mail do aluno: " + getEmail());
		System.out.println("Título do livro: " + getTitulo());
		System.out.println("ISBN do livro: " + getIsbn());
		System.out.println("Ano do livro: " + getAno());
		System.out.println("Editora do livro: " + getEditora());
		System.out.println("Palavra-chave do livro: " + getPalavraChave());
		System.out.println("Gênero do livro: " + getGenero());
		System.out.println("Quantidade não existente do livro: " + getQuantidadeExistente());
		System.out.println("Quantidade não disponível do livro: " + getQuantidadeNaoDisponivel());
		System.out.println("Data Inicial do empréstimo do livro: " + getDataInicial());
		System.out.println("Data final de devoluçao do livro: " + getDataFinal());
		System.out.println("Hora inicial do empréstimo do livro: " + getHoraInicial());
		System.out.println("Hora final do empréstimo do livro: " + getHoraFinal());
		
		/* Após a realização do empréstimo, o sistema deve emitir um comprovante com as
		 * informações título do livro, nome aluno, data do empréstimo e data de devolução.
		 */
		emitirComprovante();

	}		
	
	public void emitirRelatorio(int periodoInicial, int periodoFinal) {		
		
		if (this.dataInicial >= periodoInicial && this.dataInicial <= periodoFinal) {
			System.out.println("1 - Nome do aluno: " + getNome());
			System.out.println("2 - Data inicial: " + getDataInicial());
			System.out.println("3 - Data final: " + getDataFinal());
			System.out.println("4 - ISBN do Livro: " + getIsbn());
			System.out.println("5 - Título do Livro: " + getTitulo());		
			
			if (this.entrega > this.dataFinal) {
				System.out.println("6 - Entrega atrasada em: " + (this.entrega - this.dataFinal) + "dias!");
			} else {
				System.out.println("6 - Entrega em dia!");
			}		
		} else {
			System.out.println();
			System.out.println("Não há registros no período informado!");
		}				
	}
	
	public void estornarEmprestimo() {
		
		this.dataInicial = 0;
		this.dataFinal = 0;
		this.horaInicial = "";
		this.horaFinal = "";	
		
		System.out.println("Estorno de empréstimo efetuado com sucesso!\n");
		System.out.println("Data Inicial: " + getDataInicial());
		System.out.println("Dat Final: " + getDataFinal());
		System.out.println("Hora Inicial: " + getHoraInicial());
		System.out.println("Hora Final: " + getHoraFinal());
		
	}
	
	public void manter() {
		
		System.out.println("Programação para manter livro a ser desenvolvida...");
		/* ISBN, título,
		 * ano, editora, palavras-chave, gênero e quantidade de livros existentes e não
		 * disponível) 
		 */
	}
	
	public void verificarDisponibildade() {
		
		/* Diariamente o sistema verifica a disponibilidade do livro. Caso exista a
		 * disponibilidade, os usuários que registraram interesse receberão um e-mail informando a
 		 * disponibilidade.
 		 */
		
		if(this.quantidadeExistente > 0) {
			System.out.println("Enviar e-mail aos usuários que registraram interesse informando a disponibilidade");
			System.out.println("Programação para verificação automática de livros e envio"
					+ "de e-mail aos usuários que registrarem interesse caso"
					+ "exista disponibilidade a ser desenvolvida...");			
		}
	}	 
	
	// Métodos para acesso do Aluno
	public void consultar() {
		
		System.out.println("Programação para consultar livro a ser desenvolvida...");
	}
	
	public void efetuarReserva() {
		
		System.out.println("Programação para efetuar reserva de livro a ser desenvolvida...");
		
	}
	
	public void registrarInteresse(int dataReserva) {
				
		this.limiteReserva = 3;
		
		if (this.limiteReserva > 3) {
			System.out.println("O limite de reserva é de: " + this.limiteReserva + " livros por aluno");
		}
		
		if(dataReserva > 3) {
			System.out.println("Reserva cancelada, " + this.limiteReserva + " dias excedidos!");
		}		
	}	
}