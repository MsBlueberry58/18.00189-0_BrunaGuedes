package br.maua.DAO;

import br.maua.models.Personagem;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe criada para conexão com o banco de dados "Personagens.db".
 */

public class PersonagensDAO implements DAO<Personagem> {
    private Connection connection;
    private String DBconnectionString = "jdbc:sqlite:Personagens.db";

    public PersonagensDAO() {
        try {
            connection = DriverManager.getConnection(DBconnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * Método criado para coletar dados de todos os personagens cadastrados no banco de dados local, alocando tais informações em uma lista de personagens.
     *
     * @return ArrayList - personagens
     */

    @Override
    public List<Personagem> getAll() {

        List<Personagem> personagens = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM Personagens");
            while (result.next()) {
                Personagem personagem = new Personagem(
                        result.getString("Nome"),
                        result.getString("Race"),
                        result.getString("Profissao"),
                        result.getInt("Mana"),
                        result.getInt("Ataque"),
                        result.getInt("Ataque_Magico"),
                        result.getInt("Defesa"),
                        result.getInt("Defesa_Magica"),
                        result.getInt("Velocidade"),
                        result.getInt("Destreza"),
                        result.getInt("Exp"),
                        result.getInt("Nivel_Atual")
                );

                personagens.add(personagem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personagens;
    }

    /**
     * Método criado para inserir um novo personagem no banco de dados local, recebendo tal personagem como parâmetro.
     *
     * @param personagem
     */

    @Override
    public void insert(Personagem personagem) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Personagens (Nome, Race, Profissao, Mana, Ataque, Ataque_Magico, Defesa, Defesa_Magica, Velocidade, Destreza, Exp, Nivel_Atual) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            preparedStatement.setString(1, personagem.getNome());
            preparedStatement.setString(2, personagem.getRace());
            preparedStatement.setString(3, personagem.getProfissao());
            preparedStatement.setInt(4, personagem.getMana());
            preparedStatement.setInt(5, personagem.getAtaque());
            preparedStatement.setInt(6, personagem.getAtaque_Magico());
            preparedStatement.setInt(7, personagem.getDefesa());
            preparedStatement.setInt(8, personagem.getDefesa_Magica());
            preparedStatement.setInt(9, personagem.getVelocidade());
            preparedStatement.setInt(10, personagem.getDestreza());
            preparedStatement.setInt(11, personagem.getExp());
            preparedStatement.setInt(12, personagem.getNivel_Atual());
            //Executando
            int retorno = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Método criado para remover um personagem do banco de dados local, recebendo tal personagem como parâmetro.
     *
     * @param personagem
     */

    public void remove(Personagem personagem, String nome) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(String.format("DELETE FROM Personagens WHERE Nome = %s", nome));

            //Executando
            int retorno = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

