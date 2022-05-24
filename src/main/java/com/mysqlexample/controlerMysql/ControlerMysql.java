package com.mysqlexample.controlerMysql;

import java.util.List;

import com.mysqlexample.model.ModelMysql;
import com.mysqlexample.service.ServiceMysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mysql")
@RestController

public class ControlerMysql {

    private ServiceMysql Servicemysql;


    @Autowired
    public ServiceMysql setServicemysql() {
        return Servicemysql;
    }

    @GetMapping("/get")
    public ResponseEntity<List<ModelMysql>> getAll() {
		return ResponseEntity.ok(Servicemysql.findAll());
	}

    @PostMapping("/post")
    public ResponseEntity<ModelMysql> add(@RequestBody ModelMysql modelMysql) {
		return ResponseEntity.ok(Servicemysql.save(modelMysql));
	}

    @PutMapping("/put")
    public ResponseEntity<ModelMysql> update(@RequestBody ModelMysql modelMysql) {
		return ResponseEntity.ok(Servicemysql.save(modelMysql));
	}
    
    @DeleteMapping("/delete/{id}")
	public ResponseEntity<ModelMysql> delete(@PathVariable Long id) {
	    Servicemysql.findById(id).ifPresent(Servicemysql::delete);
		return ResponseEntity.ok().build();
	}

}
