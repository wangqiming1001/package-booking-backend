package tws.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tws.entity.Storage;
import tws.repository.StorageMapper;


@Service
public class StorageService {

	@Autowired
	private StorageMapper storageMapper;
	
	public List<Storage> selectAll() {
	    return storageMapper.selectAll();
	}
	
	public Storage insertStorage(Storage storage) {
		String StorageId = UUID.randomUUID().toString();
//		Date date = new Date(); 
//		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		storage.setId(StorageId);
//		storage.setTimeOfAppointment(format.format(date));
		//未预约
		storage.setState("0");
		storageMapper.insertStorage(storage);
	    return storage;
	}
	
	public Storage updateStorage(Storage storage) {
		Date date = new Date(); 
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		storage.setTimeOfAppointment(format.format(date));
		//已预约
		storage.setState("1");
		storageMapper.updatetTimeOfAppointment(storage);
	    return storage;
	}
	
	
	
}
