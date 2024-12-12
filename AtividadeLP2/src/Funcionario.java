
public class Funcionario {

		private String nome;
		private String cpf;
		private String rg;
		private int matricula;
		private String dataContratacao;
		private float salario;
		private float horasTrabalhadas;
		private float salarioBase;
		private int geraMatricula;
		
		
		public Funcionario(String nome, float horasTrabalhadas, float salarioBase, String dataContratacao) {
			this.nome = nome;
			this.horasTrabalhadas = horasTrabalhadas;
			this.salarioBase = salarioBase;
			this.dataContratacao = dataContratacao;
			this.matricula = ++geraMatricula;
			
		}
		
		public void calculaSalario() {
			Calculo c1 = new Calculo();
			c1.calculaSalario(salarioBase,horasTrabalhadas);
			this.salario = c1.getTotalSalario();
		}
		
		public void imprimeDados(){
	        System.out.println("Nome: "+ this.getNome());
	        System.out.println("CPF: "+ this.getCpf());
	        System.out.println("RG: "+ this.getRg());
	        System.out.println("Data de contratação: "+ this.getDataContratacao());
	        System.out.println("Salário: "+ this.getSalario());
	        System.out.println("Matrícula: "+ this.getMatricula());
	        System.out.println("Horas Tabalhadas: "+ this.getHorasTrabalhadas());
	        System.out.println("Salario Base: "+ this.getSalarioBase());

	    }
		
		public String getNome() {
			return nome;
		}

		public String getCpf() {
			return cpf;
		}

		public String getRg() {
			return rg;
		}

		public int getMatricula() {
			return matricula;
		}

		public String getDataContratacao() {
			return dataContratacao;
		}

		public double getSalario() {
			return salario;
		}

		public double getHorasTrabalhadas() {
			return horasTrabalhadas;
		}

		public int getGeraMatricula() {
			return geraMatricula;
		}

		public double getSalarioBase() {
			return salarioBase;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		
}
