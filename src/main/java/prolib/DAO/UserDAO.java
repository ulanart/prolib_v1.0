package prolib.DAO;

import java.sql.SQLException;
import java.util.Collection;

import prolib.Models.User;

public interface UserDAO 
{
	public void addUser(User user) throws SQLException;
	public void updateUser(User id, User user) throws SQLException;
	public void deleteUser(User id) throws SQLException;
	public User getUserId(int id) throws SQLException;
	public Collection getAllUsers() throws SQLException;
}
