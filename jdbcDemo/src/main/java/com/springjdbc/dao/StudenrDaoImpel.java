package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entites.Student;
@Componenet("studentDao")
public class StudenrDaoImpel implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
		public int insert(Student student) {
		 //insert query
	       String query="insert into student(id,name,city) values(?,?,?)";
	       int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	public int change(Student student) {
		// update query
		String query="update student set name=?,city=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
		
	public int delete(int studentId) {
		// delete query
		String query="delete from student where id=?";
		int r=this.jdbcTemplate.update(query,studentId);
				return r;
	}
	
	public Student getStudent(int studentId) {
		// selecting single student data
       String query="select * from student where id=?";
       //RowMapper<Student> rowMapper=new RowMapperImpel();
      Student student=this.jdbcTemplate.queryForObject(query, new RowMapper() {
    	  public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
    			// TODO Auto-generated method stub
    			Student student=new Student();
    			student.setId(rs.getInt(1));
    			student.setName(rs.getString(2));
    			student.setCity(rs.getString(3));
    			return student;
    		}

    	  
      },studentId);
		return student;
	}
	
	public List<Student> getAllStudents() {
		// selecting  multiple student data
		String query="select * from student";
	List<Student> students=this.jdbcTemplate.query(query, new RowMapperImpel());
		return students;
	}
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
