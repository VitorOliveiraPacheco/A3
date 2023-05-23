package A3;

import java.util.List;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args)throws Exception {
		BaseDeDados db = new BaseDeDados();
		Cliente cliente = new Cliente();
		Animal ani = new Animal();
		int menu = 0;
		String P1;
		int atividades;
		int fazer = 0;
		int fazer2 = 0;
		int dia = 0;
		int hora= 0;
		int formpag;
		JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao CoraPets 1.0");
		do {
			menu = (Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar um Usuário\n2-Logar em uma conta já criada\n0-Sair")));
			switch (menu){
				case 1:{
					cliente.setcpf (JOptionPane.showInputDialog("Insira o CPF:"));
					cliente.setnome (JOptionPane.showInputDialog("Insira o Nome:"));
					cliente.setendereco(JOptionPane.showInputDialog("Qual o endereço? "));
					cliente.setemail (JOptionPane.showInputDialog("Qual o Email?"));
					cliente.settelefone(JOptionPane.showInputDialog("Insira seu Telefone:"));
					db.inserirCliente(cliente);
					JOptionPane.showMessageDialog(null, "Perfeito! Iremos agora cadastrar o seu pet! ");
				    	do {
							ani.setnomepet(JOptionPane.showInputDialog("Qual o nome do seu pet?"));
							ani.setraca(JOptionPane.showInputDialog("Qual a raça do seu animal? [gato/cachorro]"));
							ani.setporte(JOptionPane.showInputDialog("Qual o porte do seu animal? "));
							ani.setidade(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do seu animal?")));
							ani.setpeso(Double.parseDouble(JOptionPane.showInputDialog("Qual o peso?")));
							ani.setvacina(JOptionPane.showInputDialog("Seu pet está vacinado? [s/n]"));
							db.inserirpet(ani);
							P1 = JOptionPane.showInputDialog("Deseja cadastrar mais algum pet? [s/n]");
				    	} while ((P1.equals("s")) || (P1.equals("S")));
				    break;
			    }
				case 2:{
					cliente.setcpf(JOptionPane.showInputDialog("CPF: "));
					JOptionPane.showMessageDialog(null, ClienteLogado(db));
					break;
				}
				case 0: {
					System.exit(0);
				}
			}
			do {
				atividades = Integer.parseInt(JOptionPane.showInputDialog("Opções: \n ➤1- Ver perfil \n ➤2- Agendar Veteriário \n ➤3- Agendar PetShop"));
				switch (atividades){
					case 1:{
						JOptionPane.showMessageDialog(null, MostrarCliente(db));
					 	JOptionPane.showMessageDialog(null, "O mais você gostaria de fazer?");
					 	fazer = Integer.parseInt(JOptionPane.showInputDialog("Opções: \n ➤1- Atualizar Perfil \n ➤2- Excluir Perfil \n ➤3- Voltar"));
					 	switch(fazer){
					 		case 1:{
					 			Cliente cli1 = new Cliente();
					 			cli1.setcpf(JOptionPane.showInputDialog("Alterar Clientes: \n Por favor, insira o CPF:"));
					 			cli1.setendereco (JOptionPane.showInputDialog("Endereço atual: "));
					 			cli1.setemail (JOptionPane.showInputDialog("Email atual: "));
					 			cli1.settelefone(JOptionPane.showInputDialog("Telefone atual: "));
					 			db.alterarCliente(cli1);
					 			break;
					 		}
					 		case 2: {
						        Cliente cli2 = new Cliente();
						        cli2.setcpf(JOptionPane.showInputDialog("Alterar Clientes: \n Por favor, insira o CPF:"));
								db.excluirCliente(cli2);
								break;
					 		}
					 		case 3: {
					 			break;
					 		}
				        }
					 	break;
					}
					case 2:{
						JOptionPane.showMessageDialog(null, "Antes de prosseguirmos, aqui vai uma informação: \n ➤Todas as nossas consultas possuem um valor fixo de R$ 50,00!");
						JOptionPane.showMessageDialog(null,"Dias disponíveis: \n ▶ 03/07 \n ➥ 08:00 hrs | 09:00 hrs | 10:00 hrs | 11:00 hrs\n ▶ 04/07 \n ➥ 09:00 hrs | 10:00 hrs | 11:00 hrs \n ▶ 05/07 \n ➥ 08:00 hrs \n ▶ 06/07 \n ➥ 08:00 hrs | 10:00 hrs | 11:00 hrs");
						dia = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o dia desejado: \n1- 03/07 \n2- 04/07 \n3- 05/07 \n4- 06/07"));
						switch(dia) {
							case 1: {
								hora = Integer.parseInt(JOptionPane.showInputDialog("Certo, agora escolha a hora: \n1- 08:00hrs \n2- 09:00hrs \n3- 10:00hrs \n4- 11:00hrs"));
								switch(hora) {
									case 1:{
						 				AgendamentoVeterinario agendvet1 = new AgendamentoVeterinario();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendvet1.setdiavet("2023-07-03");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendVET08(agendvet1, ani1);
						 				break;
									}
									case 2:{
						 				AgendamentoVeterinario agendvet1 = new AgendamentoVeterinario();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendvet1.setdiavet("2023-07-03");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendVET09(agendvet1, ani1);
						 				break;
									}
									case 3:{
						 				AgendamentoVeterinario agendvet1 = new AgendamentoVeterinario();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendvet1.setdiavet("2023-07-03");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendVET10(agendvet1, ani1);
						 				break;
									}
									case 4:{
						 				AgendamentoVeterinario agendvet1 = new AgendamentoVeterinario();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendvet1.setdiavet("2023-07-03");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendVET11(agendvet1, ani1);
						 				break;
									}
								}
								break;
							}
							case 2:{
								hora = Integer.parseInt(JOptionPane.showInputDialog("Certo, agora escolha a hora: \n1- 09:00hrs \n2- 10:00hrs \n3- 11:00hrs"));
								switch(hora) {
									case 1:{
						 				AgendamentoVeterinario agendvet1 = new AgendamentoVeterinario();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendvet1.setdiavet("2023-07-04");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendVET09(agendvet1, ani1);
						 				break;
									}
									case 2:{
						 				AgendamentoVeterinario agendvet1 = new AgendamentoVeterinario();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendvet1.setdiavet("2023-07-04");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendVET10(agendvet1, ani1);
						 				break;
									}
									case 3:{
						 				AgendamentoVeterinario agendvet1 = new AgendamentoVeterinario();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendvet1.setdiavet("2023-07-04");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendVET11(agendvet1, ani1);
						 				break;
									}
								}
								break;
							}
							case 3:{
								hora = Integer.parseInt(JOptionPane.showInputDialog("Certo, agora escolha a hora: \n1- 08:00hrs"));
								switch(hora) {
									case 1:{
						 				AgendamentoVeterinario agendvet1 = new AgendamentoVeterinario();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendvet1.setdiavet("2023-07-05");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendVET08(agendvet1, ani1);
						 				break;
									}
								}
								break;
							}
							case 4:{
								hora = Integer.parseInt(JOptionPane.showInputDialog("Certo, agora escolha a hora: \n1- 08:00hrs \n2- 10:00hrs \n3- 11:00hrs"));
								switch(hora) {
									case 1:{
						 				AgendamentoVeterinario agendvet1 = new AgendamentoVeterinario();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendvet1.setdiavet("2023-07-06");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendVET08(agendvet1, ani1);
						 				break;
									}
									case 2:{
						 				AgendamentoVeterinario agendvet1 = new AgendamentoVeterinario();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendvet1.setdiavet("2023-07-06");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendVET10(agendvet1, ani1);
						 				break;
									}
									case 3:{
						 				AgendamentoVeterinario agendvet1 = new AgendamentoVeterinario();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendvet1.setdiavet("2023-07-06");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendVET11(agendvet1, ani1);
						 				break;
									}
								}
								break;
							}
						}	
						fazer2 = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja fazer? \n Opções: \n ➤1- ir para forma de pagamento \n ➤2- Voltar"));
						switch (fazer2) {
							case 1:{
								formpag =  Integer.parseInt(JOptionPane.showInputDialog("Escolha a forma de pagamento desejada: \n➤1- Dinheiro \n➤2- PIX \n➤3- Debito \n➤4- Crédito"));
								switch (formpag){
									case 1: {
										JOptionPane.showMessageDialog(null,"Você selecionou pagamento em dinheiro!");
						            	JOptionPane.showMessageDialog(null,"Aguardamos por você aqui no nosso PetShop para concluímos! \nObrigado!");
						            	break;
									}
									case 2: {
										JOptionPane.showMessageDialog(null,"Você selecionou pagamento no PIX!");
						            	JOptionPane.showMessageDialog(null, "Segue chave do PIX: \n a043ff56-4573-49cc-8a02-0bc4e4047b50");
						            	JOptionPane.showMessageDialog(null,"Pagamento confirmado, esperamos por você em breve!");
						            	break;
									}             
									case 3: {
						            	JOptionPane.showMessageDialog(null,"Você selecionou pagamento no Débito!");
						            	JOptionPane.showInputDialog("Pagamento via Débito: \n Insira o banco:");
						            	JOptionPane.showInputDialog("Pagamento via Débito: \n Insira a agência:");
						            	JOptionPane.showInputDialog("Pagamento via Débito: \n Insira a conta corrente s/ dígito:");
						            	JOptionPane.showInputDialog("Pagamento via Débito: \n Insira o dígito apresentado:");
						            	JOptionPane.showMessageDialog(null,"Pagamento confirmado, esperamos por você em breve!");
						            	break;
									}
									case 4: {
						            	JOptionPane.showMessageDialog(null,"Você selecionou pagamento no Crédito!");
						            	JOptionPane.showInputDialog("Pagamento via Crédito: \n Insira o nome do responsável pelo cartão:");
						            	JOptionPane.showInputDialog("Pagamento via Crédito: \n Insira os números completos do cartão:");
						            	JOptionPane.showInputDialog("Pagamento via Crédito: \n Insira o código CVV:");
						            	JOptionPane.showInputDialog("Pagamento via Crédito: \n Insira o mês e ano do vencimento:");
						            	JOptionPane.showMessageDialog(null,"Pagamento confirmado, esperamos por você em breve!");
						            	break;
									}
								}            
								break;
							}
							case 2: {
								break;
							}
						}	
						break;
					}
					case 3:{
						JOptionPane.showMessageDialog(null,"Dias disponíveis: \n ▶ 05/07 \n ➥ 13:00 hrs | 14:00 hrs | 15:00 hrs | 17:00 hrs\n ▶ 06/07 \n ➥ 14:00 hrs | 15:00 hrs | 16:00 hrs\n ▶ 07/07 \n ➥ 13:00 hrs");
						dia = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o dia desejado: \n1- 05/07 \n2- 06/07 \n3- 07/07"));
						switch(dia) {
							case 1: {
								hora = Integer.parseInt(JOptionPane.showInputDialog("Certo, agora escolha a hora: \n1- 13:00hrs \n2- 14:00hrs \n3- 15:00hrs \n4- 17:00hrs"));
								switch(hora) {
									case 1:{
						 				AgendamentoBanho agendpet1 = new AgendamentoBanho();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendpet1.setdiabanho("2023-07-05");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendPET13(agendpet1, ani1);
						 				break;
						 			}
						 			case 2:{
						 				AgendamentoBanho agendpet1 = new AgendamentoBanho();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendpet1.setdiabanho("2023-07-05");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendPET14(agendpet1, ani1);
						 				break;
						 			}
						 			case 3: {
						 				AgendamentoBanho agendpet1 = new AgendamentoBanho();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendpet1.setdiabanho("2023-07-05");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendPET15(agendpet1, ani1);
						 				break;
						 			}
						 			case 4:{
						 				AgendamentoBanho agendpet1 = new AgendamentoBanho();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendpet1.setdiabanho("2023-07-05");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendPET17(agendpet1, ani1);
						 				break;
						 			}
								}
								break;
							}
							case 2: {
								hora = Integer.parseInt(JOptionPane.showInputDialog("Certo, agora escolha a hora: \n1- 14:00hrs \n2- 15:00hrs \n3- 16:00hrs"));
								switch(hora) {
						 			case 1:{
						 				AgendamentoBanho agendpet1 = new AgendamentoBanho();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendpet1.setdiabanho("2023-07-06");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendPET14(agendpet1, ani1);
						 				break;
						 			}
						 			case 2:{
						 				AgendamentoBanho agendpet1 = new AgendamentoBanho();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendpet1.setdiabanho("2023-07-06");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendPET15(agendpet1, ani1);
						 				break;
						 			}
						 			case 3:{
						 				AgendamentoBanho agendpet1 = new AgendamentoBanho();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendpet1.setdiabanho("2023-07-06");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendPET16(agendpet1, ani1);
						 				break;
						 			}
								}
								break;
							}
							case 3: {
								hora = Integer.parseInt(JOptionPane.showInputDialog("Certo, agora escolha a hora: \n1- 13:00hrs"));
								switch(hora) {
						 			case 1:{
						 				AgendamentoBanho agendpet1 = new AgendamentoBanho();
						 				Animal ani1 = new Animal ();
						 				JOptionPane.showMessageDialog(null, "Ótimo, agora vamos pedir apenas alguns dados:");
						 				agendpet1.setdiabanho("2023-07-07");
						 				ani1.setnomepet(JOptionPane.showInputDialog("Qual o nome do Pet a ser consultado? "));
						 				db.alteraragendPET13(agendpet1, ani1);
						 				break;
						 			}
								}
								break;
							}
						}
						fazer2 = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja fazer? \n Opções: \n ➤1- ir para forma de pagamento \n ➤2- Voltar"));
						switch (fazer2) {
				        	case 1:{
				        		formpag =  Integer.parseInt(JOptionPane.showInputDialog("Escolha a forma de pagamento desejada: \n➤1- Dinheiro \n➤2- PIX \n➤3- Debito \n➤4- Crédito"));
				                switch (formpag){
					                case 1: {
						            	JOptionPane.showMessageDialog(null,"Você selecionou pagamento em dinheiro!");
						            	JOptionPane.showMessageDialog(null,"Aguardamos por você aqui no nosso PetShop para concluírmos! \nObrigado!");
						            	break;
					                }
						            case 2: {
						            	JOptionPane.showMessageDialog(null,"Você selecionou pagamento no PIX!");
						            	JOptionPane.showMessageDialog(null, "Segue chave do PIX: \n a043ff56-4573-49cc-8a02-0bc4e4047b50");
						            	JOptionPane.showMessageDialog(null,"Pagamento confirmado, esperamos por você em breve!");
						            	break;
						            }             
						            case 3: {
						            	JOptionPane.showMessageDialog(null,"Você selecionou pagamento no Débito!");
						            	JOptionPane.showInputDialog("Pagamento via Débito: \n Insira o banco:");
					            	    JOptionPane.showInputDialog("Pagamento via Débito: \n Insira a agência:");
					            	    JOptionPane.showInputDialog("Pagamento via Débito: \n Insira a conta corrente s/ dígito:");
					            	    JOptionPane.showInputDialog("Pagamento via Débito: \n Insira o dígito apresentado:");
					            	    JOptionPane.showMessageDialog(null,"Pagamento confirmado, esperamos por você em breve!");
					            	    break;
						            }
						            case 4: {
						            	JOptionPane.showMessageDialog(null,"Você selecionou pagamento no Crédito!");
						            	JOptionPane.showInputDialog("Pagamento via Crédito: \n Insira o nome do responsável pelo cartão:");
						            	JOptionPane.showInputDialog("Pagamento via Crédito: \n Insira os números completos do cartão:");
						            	JOptionPane.showInputDialog("Pagamento via Crédito: \n Insira o código CVV:");
						            	JOptionPane.showInputDialog("Pagamento via Crédito: \n Insira o mês e ano do vencimento:");
						            	JOptionPane.showMessageDialog(null,"Pagamento confirmado, esperamos por você em breve!");
						            	break;
						            }
				                }           
				                break;
				        	}	
				        	case 2: {
				        		break;
				        	}
						}
						break;		 
					}
				}
			}while((fazer == 3) || (fazer2 == 2));
			JOptionPane.showMessageDialog(null, "Ações encerradas, até breve!");
		}while (menu != 0);
	}
	public static String ClienteLogado(BaseDeDados bd) {
		List<Cliente> clientes= bd.listarTodosClientes(null);
		String listaDeClientes="";
		for(Cliente cli : clientes) {
			listaDeClientes += "Olá, " + cli.getnome() + "! Acesso liberado!";
		}
		return listaDeClientes;
		}
	public static String Atividades (BaseDeDados bd) {
		List<Cliente> clientes= bd.listarTodosClientes(null);
		String listaDeClientes="";
		for(Cliente cli : clientes) {
			listaDeClientes += "Olá, " + cli.getnome() + ", o que você gostaria de estar fazendo hoje?";
		}
		return listaDeClientes;
		}
	public static String MostrarCliente(BaseDeDados bd) {
		List<Cliente> clientes= bd.listarTodosClientes(null);
		String listaDeClientes="";
		for(Cliente cli : clientes) {
			listaDeClientes += "Certo, este é o seu Perfil: \n CPF: " + cli.getcpf()+ "\n" + "Nome: " + cli.getnome() + "\n" + "Email: " + cli.getemail() + "\n" + "Endereço: " + cli.getendereco() + "\n" + "Telefone: " + cli.gettelefone();
		}
		return listaDeClientes;
		}

}

/*
		
			
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

	
}*/
	
