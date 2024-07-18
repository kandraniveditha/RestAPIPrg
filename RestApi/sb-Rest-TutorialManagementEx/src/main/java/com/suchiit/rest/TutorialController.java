package com.suchiit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suchiit.entity.Tutorial;
import com.suchiit.repo.TutorialRepository;

@RestController
@RequestMapping("/api")
public class TutorialController {

	@Autowired
	private TutorialRepository daoImpl;
	
	@PostMapping("/tutorials")
	public ResponseEntity<Tutorial>createTutorial(@RequestBody Tutorial tutorial){
		
	Tutorial tutEnt=	daoImpl.save(tutorial);
	if(tutEnt!=null) {
		return new ResponseEntity<>(tutEnt,HttpStatus.CREATED);

	}
	else
		return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
	
	}//end of createtutorial
	
	@GetMapping
	public ResponseEntity<List<Tutorial>>getAllTutorials(){
		
		List<Tutorial>tutorialInfo=daoImpl.findAll();
		{
		return new ResponseEntity<List<Tutorial>>(tutorialInfo,HttpStatus.OK);
		}
		}
	
}
