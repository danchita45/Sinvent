/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinvent;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author hp
 */
public class IncAuto {
    
    public int autoincCompras(){
        int id = 1;
        PreparedStatement ps= null;
        ResultSet rs=null;
        ConexionSQL db= new ConexionSQL();
        
        try {
                ps = db.conexion().prepareStatement("Select max(id_compra)From ncompras");
                rs=ps.executeQuery();
                while (rs.next()) { 
                    
                id =rs.getInt(1)+1;
                

                
            }
                
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            
                 
        }
        finally{
            try {
                ps.close();
                rs.close();
                
            } catch (Exception e) {
                
            }
        }
        return id;
    }
       public int autoincProveedor(){
        int id = 1;
        PreparedStatement ps= null;
        ResultSet rs=null;
        ConexionSQL db= new ConexionSQL();
        
        try {
                ps = db.conexion().prepareStatement("Select max(id_proveedor)From proveedores");
                rs=ps.executeQuery();
                while (rs.next()) { 
                    
                id =rs.getInt(1)+1;
                

                
            }
                
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            
                 
        }
        finally{
            try {
                ps.close();
                rs.close();
                
            } catch (Exception e) {
                
            }
        }
        return id;
    }
public int autoincProducto(){
        int id = 1;
        PreparedStatement ps= null;
        ResultSet rs=null;
        ConexionSQL db= new ConexionSQL();
        
        try {
                ps = db.conexion().prepareStatement("Select max(id_producto)From productos");
                rs=ps.executeQuery();
                while (rs.next()) { 
                    
                id =rs.getInt(1)+1;
                

                
            }
                
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            
                 
        }
        finally{
            try {
                ps.close();
                rs.close();
                
            } catch (Exception e) {
                
            }
        }
        return id;
    }
    
}
