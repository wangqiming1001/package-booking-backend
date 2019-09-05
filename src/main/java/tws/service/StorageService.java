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
		List<Storage> storages = storageMapper.selectAll();
		for (int i = 0; i < storages.size(); i++) {
			String qq = storages.get(i).getState();
			if (storages.get(i).getState().equals("0") ) {
				storages.get(i).setState("未预约");
			}else if(storages.get(i).getState().equals("1")){
				storages.get(i).setState("已预约");
			}else if(storages.get(i).getState().equals("2")){
				storages.get(i).setState("已取件");
			}
		}
	    return storages;
	}
	
	public Storage insertStorage(Storage storage) {
		String StorageId = UUID.randomUUID().toString();
		storage.setId(StorageId);
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
