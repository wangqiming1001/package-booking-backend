package tws.service;

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
		storage.setId(StorageId);
		storageMapper.insertStorage(storage);
	    return storage;
	}
	
	
}
