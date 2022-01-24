package com.xworkz.Company.AirportDao;

import com.xworkz.Company.AirportDao.AirportEntity.AirportEntity;

public interface AirportDao {
	void saveAirportEntity(AirportEntity airportEntity);

	void deleteAirportEntity(int AP_id);

	void updateAirportEntity(float no_of_emp, int AP_id);

	void readAirportEntity();

	void readAllAirportEntity();

}
