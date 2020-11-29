package br.maua.DAO;

import br.maua.model.Anime;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe criada para conexão com o banco de dados "Personagens.db".
 */

public class PersonagensDAO implements DAO<Personagens> {
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
    public List<Personagens> getAll() {
        List<Personagens> personagens = new ArrayList<>();

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
                        result.getInt("Ataque Magico"),
                        result.getInt("Defesa"),
                        result.getInt("Defesa Magica"),
                        result.getInt("Velocidade"),
                        result.getInt("Destreza"),
                        result.getInt("Experiencia"),
                        result.getInt("Nivel Atual")

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
            preparedStatement.setString(1, Personagens.getNome());
            preparedStatement.setString(2, Personagens.getRace());
            preparedStatement.setString(3, Personagens.getProfissao());
            preparedStatement.setInt(4, anime.getDefesa());
            preparedStatement.setInt(5, anime.getAtaque());
            preparedStatement.setInt(6, anime.getAtaque_Magico());
            preparedStatement.setInt(7, anime.getDefesa());
            preparedStatement.setInt(8, anime.getDefesa_Magica());
            preparedStatement.setInt(9, anime.getVelocidade());
            preparedStatement.setInt(10, anime.getDestreza());
            preparedStatement.setInt(11, anime.getExp());
            preparedStatement.setInt(12, anime.getNivelAtual());
            //Executando
            int retorno = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
