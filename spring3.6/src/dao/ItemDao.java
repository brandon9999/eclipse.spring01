package dao;

import java.io.InputStream;
import java.util.List;

import logic.Item;

public interface ItemDao {

	List<Item> findAll();

	Item findByPrimaryKey(Integer itemId);

	List<Item> findByItemName(String itemName);

	void create(Item item);

	void create2(Item item);
	
	void udpate(Item item);

	void delete(Item item);
	
	InputStream getPicture(Integer itemId);
}