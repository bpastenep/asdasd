package Modelo;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class TorreDeBatalla {
    

    public void actualizar(int vC, String nomE, int tB) throws SQLException {
        ConsultaSQL sql = new ConsultaSQL();
        int id=0;
        sql.setResult("Select id_entrenador from entrenador where nombre_entrenador='"+nomE+"'");
        while(sql.getResult().next()){
            id=sql.getResult().getInt(1);
        }
        sql.getUpdate("update historial_entrenador_torre_batalla set cantidadvictoriasconsecutivas_historialentrenadortorrebatalla ="+vC+"where id_entrenador="+id+" and id_torrebatalla="+tB);
        sql.cerrarConexion();
    }

    public int batallasDB(String nomE) throws SQLException {
        ConsultaSQL sql = new ConsultaSQL();
        sql.setResult("Select id_entrenador from entrenador where nombre_entrenador='"+nomE+"'");
        int id=0;
        while(sql.getResult().next()){
            id=sql.getResult().getInt(1);
        }
        int cbatallas=0; 
        sql.setResult("Select cantidadvictoriasconsecutivas_historialentrenadortorrebatalla from historial_entrenador_torre_batalla where id_entrenador="+id+" and cantidadvictoriasconsecutivas_historialentrenadortorrebatalla<>0");
         while(sql.getResult().next()){
             cbatallas=sql.getResult().getInt(1);
        }
         System.out.println("Cantidad de batallas ganadas: "+cbatallas);
         return cbatallas;
    }

    public void inicializa(int idE) throws SQLException {
       ConsultaSQL sql = new ConsultaSQL();
       for (int i=1;i<5;i++){
        sql.getUpdate("insert into historial_entrenador_torre_batalla (id_torrebatalla,id_entrenador, cantidadvictorias_historialentrenadortorrebatalla, cantidadderrotas_historialentrenadortorrebatalla, cantidadvictoriasconsecutivas_historialentrenadortorrebatalla) values("+i+","+idE+",0,0,0)");
    }
    }

    public String tipoTorre(String nomE) throws SQLException {
        ConsultaSQL sql = new ConsultaSQL();
        sql.setResult("Select id_entrenador from entrenador where nombre_entrenador='"+nomE+"'");
        int id=0;
        while(sql.getResult().next()){
            id=sql.getResult().getInt(1);
        }
        String cbatallas=null; 
        sql.setResult("Select torre_batalla.version_torrebatalla from torre_batalla inner join historial_entrenador_torre_batalla on (historial_entrenador_torre_batalla.id_torrebatalla=torre_batalla.ID_TORREBATALLA) where historial_entrenador_torre_batalla.id_entrenador="+id+" and  historial_entrenador_torre_batalla.CANTIDADVICTORIASCONSECUTIVAS_HISTORIALENTRENADORTORREBATALLA<>0");
         while(sql.getResult().next()){
             System.out.println("Valor encontrado :"+sql.getResult().getString(1));
             cbatallas=sql.getResult().getString(1);
             System.out.println("pasó la asignación");
        }
         return cbatallas.trim();
    }

    public int cantBatallas(int cantidadCombateGanar) throws SQLException {
        ConsultaSQL sql = new ConsultaSQL();
        int cbatallas=0;
        sql.setResult("Select id_torrebatalla from torre_batalla where version_torrebatalla='"+cantidadCombateGanar+"'");
         while(sql.getResult().next()){
             System.out.println("Valor encontrado :"+sql.getResult().getString(1));
             cbatallas=sql.getResult().getInt(1);
             System.out.println("pasó la asignación");
        }
         return cbatallas;
    }
}
    
