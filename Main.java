package A3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String P1;
		String P2;
		String P3;
		String P5;
		String P6;
		String P7;
		String P8;
		String P9;
		String func;
		String dnv = "n";
		String prosseguir = "n";
		Cliente cli = new Cliente();
		Admin adm = new Admin();
		Animal ani = new Animal();
		AgendamentoVeterinario agendvet = new AgendamentoVeterinario();
		Vacina vacina = new Vacina ();
		do {
		P1= JOptionPane.showInputDialog("Olá, seja bem vindo ao CoraPets 1.0 \n Você já possui cadastro ou deseja criar um novo? [possuo/criar]");
		if ((P1.equals("possuo")) || (P1.equals("Possuo"))) {
			func = JOptionPane.showInputDialog(null, "Certo, antes de continuarmos, preciso lhe fazer uma pergunta: \n Você é funcionário? [s/n]");
			if((func.equals("s")) || (func.equals("S"))) {
				adm.setNumRegistro(JOptionPane.showInputDialog("Informe o seu número de registro: "));
				prosseguir = JOptionPane.showInputDialog("Acesso liberado, deseja prosseguir? [s/n]");
			} else if ((func.equals("n")) || (func.equals("N"))){
				cli.setCpf(JOptionPane.showInputDialog("Informe o CPF cadastrado: "));
				prosseguir = JOptionPane.showInputDialog("Acesso liberado, deseja prosseguir? [s/n]");
			} else {
				JOptionPane.showMessageDialog(null, "Por favor, insira uma opção válida!");
			}
		} else if ((P1.equals("criar")) || (P1.equals("Criar"))) {
			func = JOptionPane.showInputDialog(null, "Certo, antes de continuarmos, preciso lhe fazer uma pergunta: \n Você é funcionário? [s/n]");
			if ((func.equals("s"))||(func.equals ("S"))) {
				JOptionPane.showMessageDialog(null, "Certo! Iremos prosseguir com o seu cadastro! ");
				adm.setNome(JOptionPane.showInputDialog("Insira o seu nome: "));
				adm.setEndereco(JOptionPane.showInputDialog("Insira o seu Endereço: "));
				adm.setEmail(JOptionPane.showInputDialog("Insira o seu Email: "));
				adm.setTelefone(JOptionPane.showInputDialog("Insira o seu Telefone: "));
				adm.setCpf(JOptionPane.showInputDialog("Insira o seu CPF: "));
				adm.setNumRegistro(JOptionPane.showInputDialog("Insira o seu Nro de Registro: "));
				prosseguir = JOptionPane.showInputDialog("Acesso liberado, deseja prosseguir? [s/n]");
			} else if ((func.equals("n"))||(func.equals ("N"))) {
				JOptionPane.showMessageDialog(null, "Certo! Iremos prosseguir com o seu cadastro! ");
				cli.setNome(JOptionPane.showInputDialog("Qual o seu nome?"));
				cli.setEndereco(JOptionPane.showInputDialog("Qual o seu Endereço?"));
				cli.setEmail(JOptionPane.showInputDialog("Qual o seu Email?"));
				cli.setTelefone(JOptionPane.showInputDialog("Qual o seu Telefone?"));
				cli.setCpf(JOptionPane.showInputDialog("Qual o seu CPF?"));			
				JOptionPane.showMessageDialog(null, "Perfeito! Iremos agora cadastrar o seu pet! ");
				do {
					ani.setnomepet(JOptionPane.showInputDialog("Qual o nome do seu pet?"));
					ani.setRaca(JOptionPane.showInputDialog("Qual a raça do seu animal? [gato/cachorro]"));
					ani.setPorte(JOptionPane.showInputDialog("Qual o porte do seu animal? "));
					ani.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do seu animal?")));
					ani.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Qual o peso?")));
					P2 = JOptionPane.showInputDialog("Deseja cadastrar mais algum pet? [s/n]");
				} while ((P2.equals("s")) || (P2.equals("S")));
				prosseguir = JOptionPane.showInputDialog("Acesso liberado, deseja prosseguir? [s/n]");
			} else {
				JOptionPane.showMessageDialog(null, "Por favor, insira uma opção válida!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Por favor, insira uma opção válida!");
			dnv = JOptionPane.showInputDialog("Deseja tentar novamente? [s/n]");
			if ((dnv.equals("s")) || (dnv.equals("S")))  {
				JOptionPane.showMessageDialog(null, "Ótimo, vamos te redirecionar!");
			}
			if ((dnv.equals("n")) || (dnv.equals("N")))  {
				JOptionPane.showMessageDialog(null, "Certo, lamentamos pelo ocorrido!\n Esperamos por você em breve!");
				System.exit(0);
			}
		} 
		} while (((dnv.equals("s")) || (dnv.equals("S"))) || ((prosseguir.equals("n")) || (prosseguir.equals("N"))));
		P3 = JOptionPane.showInputDialog("Okay, o que você deseja fazer agora? \n Opções: \n ➤Ver perfil [perfil] \n ➤Agendar Veteriário [vet] \n ➤Agendar PetShop [pet]");
		if ((P3.equals("Perfil")) || (P3.equals("perfil"))) {
			cli.mostrarcliente();
			ani.mostraranimal();
			
		} else if ((P3.equals("vet")) || (P3.equals("Vet"))) {
			JOptionPane.showMessageDialog(null, "Antes de prosseguirmos, aqui vai uma informação: \n ➤Todas as nossas consultas possuem um valor fixo de R$ 50,00!");
			agendvet.setdiavet(JOptionPane.showInputDialog("Dias disponíveis: \n ▶ 03/07 \n ➥ 08:00 hrs | 11:00 hrs | 14:00 hrs | 15:00 hrs\n"
				+ "▶ 04/07 \n ➥ 09:00 hrs | 11:00 hrs | 13:00 hrs\n"
				+ "▶ 05/07 \n ➥ 10:00 hrs \n"
				+ "▶ 07/07 \n ➥ 08:00 hrs | 09:00 hrs | 15:00 hrs | 17:00 hrs \n"));
			P6 = agendvet.getdiavet();
			if((P6.equals("03/07"))|| (P6.equals("04/07")) || (P6.equals("05/07")) || (P6.equals("07/07"))) {
				JOptionPane.showMessageDialog(null, "Data confirmada! (" + agendvet.getdiavet() + ")");
			} else {
				JOptionPane.showMessageDialog(null, "Por favor, insira uma data válida!");
				System.exit(0);
			}
			agendvet.setTipoconsulta(JOptionPane.showInputDialog(null,"Sua consulta será para vacinação ou apenas preventiva?"));
			P5 = agendvet.getTipoconsulta();
			P7 = ani.getRaca();
;			if((P5.equals("vacinacao")) || (P5.equals("Vacinacao")) || (P5.equals("vacinação")) || (P5.equals("Vacinação"))) {
				if ((P7.equals("Cachorro")) || (P7.equals("cachorro"))) {
					vacina.setTipo(JOptionPane.showInputDialog("Informe a vacina desejada: \n"
							+ "▶ Múltipla canina/polivalente V10 ou V8 - R$ 80,00 [polivalente] \n"
							+ "▶ Antirrábica/raiva - R$ 50,00 [raiva]"));
					P8 = vacina.getTipo();
					if((P8.equals("polivalente")) || (P8.equals("Polivalente")) ) {
						vacina.valorpolivanteca();
					} else if ((P8.equals("raiva")) || (P8.equals("Raiva"))) {
						vacina.valorraiva();
					}else {
						JOptionPane.showMessageDialog(null, "Por favor, insira uma opção válida!");
						System.exit(0);
					}
				} else if ((P7.equals("Gato")) || (P7.equals("gato"))) {
					vacina.setTipo(JOptionPane.showInputDialog("Informe a vacina desejada: \n"
							+ "▶ Antirrábica/raiva - R$ 50,00 [raiva] \n"
							+ "▶ Tríplice/polivalente V3 -  R$ 80,00 [v3]\n"
							+ "▶ Quádrupla/polivalente V4 - R$ 80,00 [v4]\n"
							+ "▶ Quíntupla/polivalente V5 - R$ 80,00 [v5]"));
					P9 = vacina.getTipo();
					if((P9.equals("raiva")) || (P9.equals("Raiva"))) {
						vacina.valorraiva();
					} else if ((P9.equals("v3")) || (P9.equals("V3")) || (P9.equals("v4")) || (P9.equals("V4"))|| (P9.equals("v5")) || (P9.equals("V5"))) {
						vacina.valorV();
					} else {
						JOptionPane.showMessageDialog(null, "Por favor, insira uma opção válida!");
						System.exit(0);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Desculpe, nosso sistema não encontrou a raça do seu Pet!");
					System.exit(0);
				}
			} else if ((P5.equals("preventiva")) || (P5.equals("Preventiva"))){
				vacina.valorconsulta();
			} else {
				JOptionPane.showMessageDialog(null, "Por favor, insira uma opção válida!");
				System.exit(0);
			}
		} else if ((P3.equals("pet")) || (P3.equals("Pet"))) {
			JOptionPane.showMessageDialog(null, "Você irá ver o seu agendamento de pet! ");
		}else {
			JOptionPane.showMessageDialog(null, "Por favor, insira uma opção válida!");
		}
		
		
		
		//JOptionPane.showMessageDialog(null, cli.getCpf()+ " " + cli.getEmail()+ " " + cli.getEmail()+ " " + cli.getEndereco()+ " " + cli.getNome()+ " " + cli.getTelefone());
	}

	
}
