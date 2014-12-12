

package Modelo;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Combate {
     String dia,mes,annio,fecha;
     Calendar c = Calendar.getInstance();
   public void actualizaC(int id1, int id2, int g) throws SQLException, ParseException{
        System.out.println("Datos a insertar: "+id1+" "+id2+" "+g);
        ConsultaSQL com = new ConsultaSQL();
        int numVic=0;
        int idC=0;
        //Creando la fecha completa
        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH)+1);
        annio = Integer.toString(c.get(Calendar.YEAR));
        fecha=annio+"-"+mes+"-"+dia;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	String dateInString = fecha;
 
	try {
 
		Date date = formatter.parse(dateInString);
		System.out.println(date);
		System.out.println(formatter.format(date));
 
	} catch (ParseException e) {
		e.printStackTrace();
	}
        //Extraemos el último id de combate
        com.setResult("select id_combate from combate order by id_combate");
        while(com.getResult().next()){
                idC=com.getResult().getInt(1);
            }
        if(g==1){
            com.getUpdate("INSERT INTO POKEMON.COMBATE (FECHA_COMBATE, GANADOR, PERDEDOR, ID_COMBATE, ID_ENTRENADOR, ID_LIGAPOKEMON, ENT_ID_ENTRENADOR, ID_TORREBATALLA) VALUES ('"+fecha+"','"+id2+"', '"+id1+"', "+(idC+1)+" , "+id2+", 1, "+id2+", 1)");
            

            com.setResult("select num_victorias from entrenador where id_entrenador="+id2);
            while(com.getResult().next()){
                numVic=com.getResult().getInt(1);
            }
            com.getUpdate("update pokemon.entrenador  set num_victorias="+(numVic+1)+" where entrenador.id_entrenador="+id2);
        }
        else{
            com.getUpdate("INSERT INTO POKEMON.COMBATE (FECHA_COMBATE, GANADOR, PERDEDOR, ID_COMBATE, ID_ENTRENADOR, ID_LIGAPOKEMON, ENT_ID_ENTRENADOR, ID_TORREBATALLA) VALUES ('"+fecha+"','"+id1+"', '"+id2+"', "+(idC+1)+", "+id1+", 1, "+id1+", 1)");
            com.setResult("select num_victorias from entrenador where id_entrenador="+id1);
            while(com.getResult().next()){
                numVic=com.getResult().getInt(1);
            }
            com.getUpdate("update pokemon.entrenador  set num_victorias="+(numVic+1)+" where entrenador.id_entrenador="+id1);
            }
        }
   }
