package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.DoneListDao;
import com.example.Model.ListModel;

@Service
public class DoneListFindService {
	
	@Autowired
	DoneListDao doneListDao;
	
	public List<ListModel> findAll(){
		return doneListDao.findAll();
	}
}
