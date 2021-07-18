package com.example.DoneList.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DoneList.Dao.DoneListDao;
import com.example.DoneList.Model.ListModel;

@Service
public class DoneListFindService {
	
	@Autowired
	DoneListDao doneListDao;
	
	public List<ListModel> findAll(){
		return doneListDao.findAll();
	}
}
