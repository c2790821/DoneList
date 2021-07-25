package com.example.DoneList.Dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.DoneList.Controller.DoneListController;
import com.example.DoneList.Model.ListModel;

@Repository
public class DoneListDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final Logger logger = LoggerFactory.getLogger(DoneListController.class);
	
	public void insert(ListModel model) {
		String query = "INSERT INTO Done_List(CONTENT,DATE)VALUES(?,?)";
		jdbcTemplate.update(query, model.getContent(), model.getDate());
	}
	
	public List<ListModel> findAll(){
		LinkedList<ListModel> doneLists = new LinkedList<ListModel>();
		String query = "SELECT * FROM Done_List";
		List<Map<String, Object>> results = jdbcTemplate.queryForList(query);
		for(Map<String, Object> result: results) {
			Integer id = (Integer) result.get("ID");
			String content = (String) result.get("CONTENT");
			String date    = (String) result.get("DATE");
			doneLists.addFirst(new ListModel(id, content, date));
		}
		return doneLists;
	}
}
