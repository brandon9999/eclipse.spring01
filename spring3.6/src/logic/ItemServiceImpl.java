package logic;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.transaction.annotation.Propagation;

import dao.ItemDao;

import com.samsung.core.exception.SDPException;

@Service
@Transactional(rollbackFor={Exception.class}, propagation=Propagation.REQUIRED)
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;
	
	public void deleteItem(Item item) {
		this.itemDao.delete(item);
	}

	public void entryItem(Item item) throws Exception {
		try
		{
			System.out.println("[kisdebug : getCurrentTransactionName]"+TransactionSynchronizationManager.getCurrentTransactionName());
			System.out.println("[kisdebug : getCurrentTransactionIsolationLevel]"+TransactionSynchronizationManager.getCurrentTransactionIsolationLevel());
			System.out.println("[kisdebug : isActualTransactionActive]"+TransactionSynchronizationManager.isActualTransactionActive());
			
			System.out.println("[Start] =======================================");

			this.itemDao.create(item);

			// Exception
			//this.itemDao.create2(item);

			System.out.println("[END] =======================================");
		}
		catch (Exception e)
		{
			System.out.println("[Exception] ======================================= : "+e.toString());
			//throw new SDPException(e);
			
			e.printStackTrace();
			throw new Exception();
		}
	}

	public Item getItemByItemId(Integer itemId) {
		return this.itemDao.findByPrimaryKey(itemId);
	}

	public List<Item> getItemByItemName(String itemName) {
		return this.itemDao.findByItemName(itemName);
	}

	public List<Item> getItemList() {
		return this.itemDao.findAll();
	}

	public void updateItem(Item item) {
		this.itemDao.udpate(item);
	}

	public InputStream getPicture(Integer itemId) {
		return this.itemDao.getPicture(itemId);
	}

}
