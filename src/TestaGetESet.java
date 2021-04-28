
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		// conta.numero = 1337; estou protegido!
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente leandro = new Cliente();
		//conta.titular = leandro;
		leandro.setNome("Leandro Simonato");
		
		conta.setTitular(leandro);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		// Agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();	
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(leandro);
		System.out.println(conta.getTitular());
		
	}

}
