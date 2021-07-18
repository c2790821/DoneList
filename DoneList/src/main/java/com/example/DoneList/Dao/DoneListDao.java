package com.example.DoneList.Dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.DoneList.Model.ListModel;

@Repository
public class DoneListDao {
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	public void insert(ListModel model) {
		String table = "Done_List";
		String query = "INSER INTO Done_List(CONTENT,DATE)VALUES(?,?)";
		jdbcTemplate.update(query, model.getContent(), model.getDate());
	}
	
	public List<ListModel> findAll(){
		LinkedList<ListModel> doneLists = new LinkedList<ListModel>();
		String query = "SELECT * FROM Done_List";
		List<Map<String, Object>> results = (List<Map<String, Object>>) jdbcTemplate.queryForList(query);
		for(Map<String, Object> result: results) {
			String content = (String) result.get("CONTENT");
			String date    = (String) result.get("DATE");
			doneLists.addFirst(new ListModel(content, date));
		}
		return doneLists;
	}
}
