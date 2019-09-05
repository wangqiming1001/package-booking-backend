package tws.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.Employee;
import tws.entity.Storage;
import tws.service.StorageService;

@RestController
@RequestMapping("/storage")
public class StorageController {

	@Autowired
	private StorageService storageService;

    @PostMapping("")
    public ResponseEntity<Storage> insert(@RequestBody Storage storage) {
    	storageService.insertStorage(storage);
        return ResponseEntity.created(URI.create("/employees/" + storage.getId())).body(storage);
    }
    
    @GetMapping("")
    public ResponseEntity<List<Storage>> getAll() {
        return ResponseEntity.ok(storageService.selectAll());
    }
}
