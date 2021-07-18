package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.DoneListDao;
import com.example.Model.ListModel;

@Service
public class DoneListAddService {
	
	@Autowired
	DoneListDao doneListDao;
	public void insert(ListModel model) {
		doneListDao.insert(model);
	}
}
