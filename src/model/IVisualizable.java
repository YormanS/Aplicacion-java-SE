package model;

import java.util.Date;

/**
 * 
 * @author TROFEO
 * 
 * Este metodo captura el tiempo exacto de visualizacion
 */

public interface IVisualizable {
	Date startToSee(Date dateI);
	void stopToSee(Date dateI, Date dateF);
	
}
