package A3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BaseDeDados {
	
	public Connection conexao;
	
	public BaseDeDados() throws Exception{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conexao = DriverManager.getConnection("jdbc:mysql://localhost/db_petshop","root","root");
		}catch (Exception e) {
			throw new Exception("Ocorreu um erro na conexão");
		}
	}
	
	public void fecharConexao() {
		try {
			this.conexao.close();
		}catch (Exception e) {
			throw new RuntimeException("Ocorreu um erro no encerramento da conexão");
		}
	}
	
	public void liberar(PreparedStatement ps) {
		try {
			if (ps != null) {
				ps.close();
			}
		}catch (Exception e) {
			throw new RuntimeException("Ocorreu um erro na liberação do cursor");
		}
	}

	public void inserirCliente(Cliente cliente) {
		PreparedStatement psInsert = null;
		try {
			psInsert = conexao.prepareStatement("INSERT INTO cliente (cpf, nome, endereco, email, telefone) VALUES (?, ?, ?, ?, ?);");
			psInsert.setString(1, cliente.getcpf());
			psInsert.setString(2, cliente.getnome());
			psInsert.setString(3, cliente.getendereco());
			psInsert.setString(4, cliente.getemail());
			psInsert.setString(5, cliente.gettelefone());
			psInsert.executeUpdate();
		}catch (Exception e){
			 e.printStackTrace();
		}finally {
			this.liberar(psInsert);
		}
	}
	
	public void inserirpet(Animal animal) {
		PreparedStatement psInsert = null;
		try {
			psInsert = conexao.prepareStatement("INSERT INTO animal	 (nomepet, raca, porte, idade, peso, vacina) VALUES (?, ?, ?, ?, ?, ?);");
			psInsert.setString(1, animal.getnomepet());
			psInsert.setString(2, animal.getraca());
			psInsert.setString(3, animal.getporte());
			psInsert.setInt(4, animal.getidade());
			psInsert.setDouble(5, animal.getpeso());
			psInsert.setString(6, animal.getvacina());
			psInsert.executeUpdate();
		}catch (Exception e){
			 e.printStackTrace();
		}finally {
			this.liberar(psInsert);
		}
	}
	
	public List<Cliente> listarTodosClientes(java.lang.String cli){
		List<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente = new Cliente();
		cli = cliente.getcpf();
		PreparedStatement psSelect = null;
		try {
			psSelect = conexao.prepareStatement("SELECT * FROM cliente Where cpf=? ");
			psSelect.setString(1, "1023");
			ResultSet rs = psSelect.executeQuery();
			while (rs.next()) {
				String cpf1 = rs.getString("cpf");
				String nome = rs.getString("nome");
				String endereco = rs.getString("endereco");
				String email = rs.getString("email");
				String telefone = rs.getString("telefone");
				clientes.add(new Cliente( nome , endereco,email, telefone, cpf1));		
			}
		}catch (Exception e){
			 e.printStackTrace();
		}finally {
			this.liberar(psSelect);
		}
		return clientes;
	}
	
	public void alterarCliente(Cliente cliente) {		
		PreparedStatement psUpdate = null;		
		try {
			String cpf = cliente.getcpf();
			psUpdate = conexao.prepareStatement("update cliente set endereco = ?, email = ?, telefone = ? where cpf ='" + cpf + "'");
			psUpdate.setString(1, cliente.getendereco());
			psUpdate.setString(2, cliente.getemail());
			psUpdate.setString(3, cliente.gettelefone());
			psUpdate.executeUpdate();
			}catch (Exception e){
			 e.printStackTrace();
		}finally {
			this.liberar(psUpdate);
		}
	}
	
	public void excluirCliente(Cliente cliente) {
		PreparedStatement psDelete = null;
		try {
			String cpf = cliente.getcpf();
			psDelete = conexao.prepareStatement("DELETE FROM cliente WHERE cpf ='" + cpf + "'");
			psDelete.executeUpdate();
		}catch (Exception e){
			 e.printStackTrace();
		}finally {
			this.liberar(psDelete);
		}
	}
	
	public void alteraragendVET08(AgendamentoVeterinario agendVET, Animal animal, Vacina vacina) {		
		PreparedStatement psUpdate = null;
		String nome = (animal.getnomepet() + vacina.getvacina());
		try {
			String dia = agendVET.getdiavet();
			psUpdate = conexao.prepareStatement("update agendVET set 08HR = ? where dia = '"+dia+"'");
			psUpdate.setString(1, nome);
			psUpdate.executeUpdate();
			}catch (Exception e){
			 e.printStackTrace();
		}finally {
			this.liberar(psUpdate);
		}
	}
	public void alteraragendVET09(AgendamentoVeterinario agendVET, Animal animal, Vacina vacina) {		
		PreparedStatement psUpdate = null;	
		String nome = (animal.getnomepet() + vacina.getvacina());
		try {
			String dia = agendVET.getdiavet();
			psUpdate = conexao.prepareStatement("update agendVET set 09HR = ? where dia = '"+dia+"'");
			psUpdate.setString(1, nome);
			psUpdate.executeUpdate();
			}catch (Exception e){
			 e.printStackTrace();
		}finally {
			this.liberar(psUpdate);
		}
	}
	public void alteraragendVET10(AgendamentoVeterinario agendVET, Animal animal, Vacina vacina) {		
		PreparedStatement psUpdate = null;
		String nome = (animal.getnomepet() + vacina.getvacina());
		try {
			String dia = agendVET.getdiavet();
			psUpdate = conexao.prepareStatement("update agendVET set 10HR = ? where dia = '"+dia+"'");
			psUpdate.setString(1, nome);
			psUpdate.executeUpdate();
			}catch (Exception e){
			 e.printStackTrace();
		}finally {
			this.liberar(psUpdate);
		}
	}
	public void alteraragendVET11(AgendamentoVeterinario agendVET, Animal animal, Vacina vacina) {		
		PreparedStatement psUpdate = null;		
		String nome = (animal.getnomepet() + vacina.getvacina());
		try {
			String dia = agendVET.getdiavet();
			psUpdate = conexao.prepareStatement("update agendVET set 11HR = ? where dia = '"+dia+"'");
			psUpdate.setString(1, nome);
			psUpdate.executeUpdate();
			}catch (Exception e){
			 e.printStackTrace();
		}finally {
			this.liberar(psUpdate);
		}
	}
	public void alteraragendPET13(AgendamentoBanho agendPET, Animal animal, AgendamentoTosa agendtosa) {		
		PreparedStatement psUpdate = null;
		String nome = animal.getnomepet() + agendtosa.gettosa();
		try {
			String dia = agendPET.getdiabanho();
			psUpdate = conexao.prepareStatement("update agendPET set 13HR = ? where dia = '"+dia+"'");
			psUpdate.setString(1, nome);
			psUpdate.executeUpdate();
			}catch (Exception e){
			 e.printStackTrace();
		}finally {
			this.liberar(psUpdate);
		}
	}
	public void alteraragendPET14(AgendamentoBanho agendPET, Animal animal, AgendamentoTosa agendtosa) {		
		PreparedStatement psUpdate = null;
		String nome = animal.getnomepet() + agendtosa.gettosa();
		try {
			String dia = agendPET.getdiabanho();
			psUpdate = conexao.prepareStatement("update agendPET set 14HR = ? where dia = '"+dia+"'");
			psUpdate.setString(1, nome);
			psUpdate.executeUpdate();
			}catch (Exception e){
			 e.printStackTrace();
		}finally {
			this.liberar(psUpdate);
		}
	}
	public void alteraragendPET15(AgendamentoBanho agendPET, Animal animal, AgendamentoTosa agendtosa) {		
		PreparedStatement psUpdate = null;		
		String nome = animal.getnomepet() + agendtosa.gettosa();
		try {
			String dia = agendPET.getdiabanho();
			psUpdate = conexao.prepareStatement("update agendPET set 15HR = ? where dia = '"+dia+"'");
			psUpdate.setString(1, nome);
			psUpdate.executeUpdate();
			}catch (Exception e){
			 e.printStackTrace();
		}finally {
			this.liberar(psUpdate);
		}
	}
	public void alteraragendPET16(AgendamentoBanho agendPET, Animal animal, AgendamentoTosa agendtosa) {		
		PreparedStatement psUpdate = null;		
		String nome = animal.getnomepet() + agendtosa.gettosa();
		try {
			String dia = agendPET.getdiabanho();
			psUpdate = conexao.prepareStatement("update agendPET set 16HR = ? where dia = '"+dia+"'");
			psUpdate.setString(1, nome);
			psUpdate.executeUpdate();
			}catch (Exception e){
			 e.printStackTrace();
		}finally {
			this.liberar(psUpdate);
		}
	}
	public void alteraragendPET17(AgendamentoBanho agendPET, Animal animal, AgendamentoTosa agendtosa) {		
		PreparedStatement psUpdate = null;	
		String nome = animal.getnomepet() + agendtosa.gettosa();
		try {
			String dia = agendPET.getdiabanho();
			psUpdate = conexao.prepareStatement("update agendPET set 17HR = ? where dia = '"+dia+"'");
			psUpdate.setString(1, nome);
			psUpdate.executeUpdate();
			}catch (Exception e){
			 e.printStackTrace();
		}finally {
			this.liberar(psUpdate);
		}
	}
	public List<Admin> listarTodosAdmin(Admin admin){
		List<Admin> administradores = new ArrayList<Admin>();
		String Admin = "001";
		PreparedStatement psSelect = null;
		try {
			psSelect = conexao.prepareStatement("SELECT * FROM administrador Where numreg='" + Admin + "'");
			ResultSet rs = psSelect.executeQuery();
			while (rs.next()) {
				String nome = rs.getString("nome");
				administradores.add(new Admin(nome, nome, nome, nome, nome, nome));		
			}
		}catch (Exception e){
			 e.printStackTrace();
		}finally {
			this.liberar(psSelect);
		}
		return administradores;
	}
}

