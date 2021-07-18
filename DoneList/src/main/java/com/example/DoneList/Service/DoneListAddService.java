package com.example.DoneList.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DoneList.Dao.DoneListDao;
import com.example.DoneList.Model.ListModel;

@Service
public class DoneListAddService {
	
	@Autowired
	DoneListDao doneListDao;
	public void insert(ListModel model) {
		doneListDao.insert(model);
	}
}
