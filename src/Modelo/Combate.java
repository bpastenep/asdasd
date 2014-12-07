

package Modelo;

import java.sql.SQLException;
import java.util.Calendar;


public class Combate {
     String dia,mes,annio,fecha;
     Calendar c = Calendar.getInstance();
   public void actualizaC(int id1, int id2, int g) throws SQLException{
        ConsultaSQL com = new ConsultaSQL();
        int numVic=0;
        //Creando la fecha completa
        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH)+1);
        annio = Integer.toString(c.get(Calendar.YEAR));
        fecha=annio+"-"+mes+"-"+dia;
        if(g==1){
            com.getUpdate("INSERT INTO POKEMON.COMBATE (FECHA_COMBATE, GANADOR, PERDEDOR, ID_COMBATE, ID_ENTRENADOR, ID_LIGAPOKEMON, ENT_ID_ENTRENADOR, ID_TORREBATALLA) VALUES ('"+fecha+"','"+id1+"', '"+id2+"', 1, "+id1+", 1, "+id1+", 1)");
            com.setResult("select num_victorias from entrenador where id_entrenador="+id1);
            while(com.getResult().next()){
                numVic=com.getResult().getInt(1);
            }
            com.getUpdate("update pokemon.entrenador  set num_victorias="+(numVic+1)+" where entrenador.id_entrenador="+id1);
        }
        else{
            com.getUpdate("INSERT INTO POKEMON.COMBATE (FECHA_COMBATE, GANADOR, PERDEDOR, ID_COMBATE, ID_ENTRENADOR, ID_LIGAPOKEMON, ENT_ID_ENTRENADOR, ID_TORREBATALLA) VALUES ('"+fecha+"','"+id2+"', '"+id1+"', 1, "+id2+", 1, "+id2+", 1)");
            com.setResult("select num_victorias from entrenador where id_entrenador="+id2);
            while(com.getResult().next()){
                numVic=com.getResult().getInt(1);
            }
            com.getUpdate("update pokemon.entrenador  set num_victorias="+(numVic+1)+" where entrenador.id_entrenador="+id2);
            }
        }
   }
