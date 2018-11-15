/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.repository.custom.impl;

import java.io.Serializable;
import java.util.List;
import lk.ijse.rmi.cab.entity.InsuaranceCompany;
import lk.ijse.rmi.cab.entity.Vehicle;
import lk.ijse.rmi.cab.repository.SuperRepositoryImpl;
import lk.ijse.rmi.cab.repository.custom.VehicleRepository;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

/**
 *
 * @author user
 */
public class VehicleRepositoryImpl implements VehicleRepository{
    
    private Session session;
    @Override
    public void setSesstion(Session session) {
        this.session=session;
    }

    @Override
    public boolean save(Vehicle t) throws Exception {
          Serializable Vehicle=session.save(t);
            if(Vehicle!=null){
                return true;

            }else{
                return false;
            }
    }

    @Override
    public void update(Vehicle t) throws Exception {
        session.update(t);
        
    }

    @Override
    public void delete(Vehicle t) throws Exception {
        session.delete(t);
    }
    

//    @Override
//    public Vehicle findBYId(Int InsuaranceCompanyName) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public List<Vehicle> findAll() throws Exception {
        return session.createCriteria(Vehicle.class).list();
        //return session.createCriteria(Vehicle.class).list();
    }

    @Override
    public Vehicle findBYId(Integer Id) throws Exception {
        Vehicle vehicle=session.get(Vehicle.class,Id);
        return vehicle;
    }

    @Override
    public List<Vehicle> getAllAvailableVehicles(String startDate, String endDate) {
      // NativeQuery SQLQuery =session.createSQLQuery(queryString :"");
      // return (List<Vehicle>) SQLQuery;
      throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Vehicle getVehicleDetailsForModify(String regNo) throws Exception {
        NativeQuery query=session.createNativeQuery("select vehicle.insuaranceCompany_insuaranceCompanyId,insuarancecompany.companyName, insuarancecompany.insuaranceType,\n" +"vehicle.vehicleId,vehicle.FuelType,vehicle.SeatingCapacity,vehicle.colour,vehicle.price,vehicle.status,vehicle.vehicleBrand,vehicle.vehicleInsuaranceId \n" +"From vehicle INNER JOIN insuarancecompany ON insuarancecompany.insuaranceCompanyId=vehicle.insuaranceCompany_insuaranceCompanyId\n" +"WHERE vehicle.regNo='"+regNo+"'");
        List<Object[]> list=query.list();
        Vehicle vehicle=new Vehicle();
        
        for (Object[] row : list) {
            InsuaranceCompany insuaranceCompany=new InsuaranceCompany();
            insuaranceCompany.setInsuaranceCompanyId(row[0].toString());
            insuaranceCompany.setCompanyName(row[1].toString());
            insuaranceCompany.setInsuaranceType(row[2].toString());
            
            vehicle.setInsuaranceCompany(insuaranceCompany);
            vehicle.setVehicleId(Integer.parseInt(row[3].toString()));
            vehicle.setFuelType(row[4].toString());
            vehicle.setSeatingCapacity(Integer.parseInt(row[5].toString()));
            vehicle.setColour(row[6].toString());
            vehicle.setPrice(Double.parseDouble(row[7].toString()));
            vehicle.setStatus(row[8].toString());
            vehicle.setVehicleBrand(row[9].toString());
            vehicle.setVehicleInsuaranceId(row[10].toString());
        }
        return vehicle;
    }

   
    
}
