package com.spring.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.model.Person;
@Repository
public class PersonRepository implements IPersonRepository{
	@Autowired
	JdbcTemplate jdbc;
	class PersonRowMapper implements RowMapper<Person>
	{

		@Override
		public Person mapRow(ResultSet rs, int ar) throws SQLException {
			// TODO Auto-generated method stub
			Person prs=new Person();
			prs.setId(rs.getInt("id"));
			prs.setFirstName(rs.getString("firstname"));
			prs.setLastName(rs.getString("lastname"));
			prs.setAddress(rs.getString("address"));
			return prs;
		}
		
	}

	@Override
	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return jdbc.query("select * from person",new PersonRowMapper());
		
	}

	@Override
	public int update(Person pr) {
		// TODO Auto-generated method stub
		return jdbc.update("update person "+"set firstname=?,lastname=?,address=? where id=?",
				new Object[] {pr.getFirstName(),pr.getLastName(),pr.getAddress(),pr.getId()});
	}

	@Override
	public int insert(Person pr) {
		// TODO Auto-generated method stub
		return jdbc.update("insert into person(id,firstname,lastname,address)"+"values(?,?,?,?)",
				new Object[]{pr.getId(),pr.getFirstName(),pr.getLastName(),pr.getAddress()});
		
	}

	@Override
	public Person getById(int id) {
		// TODO Auto-generated method stub
		return jdbc.queryForObject("select * from person where id=?", new Object[] {id},
				new BeanPropertyRowMapper<Person>(Person.class));
	}

}
