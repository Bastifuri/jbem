package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PCDAO {

    private Connection connection;

    public PCDAO() throws SQLException {
        // Conexion a la base de datos jbem
        this.connection = DBConnector.getConnection();
    }

    public List<String> obtenerProcesadores() {
        List<String> procesadores = new ArrayList<>();

        try {
            String query = "SELECT Modelo FROM procesadores";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String procesador = resultSet.getString("Modelo");
                procesadores.add(procesador);
            }

            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return procesadores;
    }

    public List<String> obtenerGraficas() {
        List<String> tarjetasGraficas = new ArrayList<>();

        try {
            String query = "SELECT modelo FROM tarjetasgraficas";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String tarjetaGrafica = resultSet.getString("Modelo");
                tarjetasGraficas.add(tarjetaGrafica);
            }

            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tarjetasGraficas;
    }

    public List<String> obtenerRAM() {
        List<String> rams = new ArrayList<>();

        try {
            String query = "SELECT modelo FROM ram";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String ram = resultSet.getString("Modelo");
                rams.add(ram);
            }

            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rams;
    }

    public List<String> obtenerFP() {
        List<String> fuentesPoder = new ArrayList<>();

        try {
            String query = "SELECT modelo FROM fuentesdepoder";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String fuentePoder = resultSet.getString("Modelo");
                fuentesPoder.add(fuentePoder);
            }

            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return fuentesPoder;
    }

    public List<String> obtenerPM() {
        List<String> placaM = new ArrayList<>();

        try {
            String query = "SELECT nombre FROM placasmadre";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String pm = resultSet.getString("Nombre");
                placaM.add(pm);
            }

            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return placaM;
    }

    public List<String> obtenerVent() {
        List<String> Venti = new ArrayList<>();

        try {
            String query = "SELECT nombre FROM refrigeraciones";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String Vent = resultSet.getString("Nombre");
                Venti.add(Vent);
            }

            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Venti;
    }

    public List<String> obtenerAlma() {
        List<String> alma = new ArrayList<>();

        try {
            String query = "SELECT nombre FROM almacenamientos";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String almac = resultSet.getString("Nombre");
                alma.add(almac);
            }

            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return alma;
    }
}
