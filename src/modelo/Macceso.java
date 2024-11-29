package modelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
public class Macceso extends ConexionBD {
public static String nivel, nombre; 
    public boolean accesoUsuario(String usuario) {
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("select * from Usuarios where usuario = '" + usuario + "' and idEstado=1");
            ResultSet res = pstm.executeQuery();
            boolean r = res.next();
            if (r) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "El Usuario no se encuentra registrado o esta desactivado", "Atencion",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Macceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean accesoClave(String usuario, String clave) {
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("select * from Usuarios where usuario = '" + usuario + "'");
            ResultSet res = pstm.executeQuery();
            res.next();
            nombre=res.getString("nombre");
            nivel =res.getString("idNivel");
            String xclave = res.getString(3);
            if (xclave.equals(clave)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Atencion",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Macceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
	public boolean cargarDatos(String trim, String trim0, JTable tabla) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}