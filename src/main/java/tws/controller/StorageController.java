package tws.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.Storage;
import tws.service.StorageService;

@RestController
@RequestMapping("/storage")
@CrossOrigin("*")
public class StorageController {

	@Autowired
	private StorageService storageService;
	
	//新建包裹
    @PostMapping("")
    public ResponseEntity<Storage> insert(@RequestBody Storage storage) {
    	storageService.insertStorage(storage);
        return ResponseEntity.created(URI.create("/storage/" + storage.getId())).body(storage);
    }
    
    //查询包裹列表
    @GetMapping("")
    public ResponseEntity<List<Storage>> getAll() {
        return ResponseEntity.ok(storageService.selectAll());
    }
    
    //预约
    @PutMapping("/updateTime")
    public ResponseEntity<Storage> update(@RequestBody Storage storage) {
    	storageService.updateStorage(storage);
    	return ResponseEntity.created(URI.create("/storage/updateTime" + storage.getOrderNumber())).body(storage);
    }
    
}
