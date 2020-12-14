//package genx.ewallet.repository;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.persistence.EntityManager;
//
//import org.hibernate.Session;
//import org.hibernate.query.Query;
//import org.hibernate.Transaction;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import genx.ewallet.model.UPPCLHierarchy;
//import genx.ewallet.utils.HibernateUtils;
//
//public class BillRepository implements IBillRepository{
//	
//	@Autowired
//	private EntityManager entityManager;
//
//	@Override
//	public <S extends UPPCLHierarchy> S save(S entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends UPPCLHierarchy> Iterable<S> saveAll(Iterable<S> entities) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Optional<UPPCLHierarchy> findById(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean existsById(Integer id) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public Iterable<UPPCLHierarchy> findAllById(Iterable<Integer> ids) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public long count() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void deleteById(Integer id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void delete(UPPCLHierarchy entity) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteAll(Iterable<? extends UPPCLHierarchy> entities) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteAll() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public UPPCLHierarchy findById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<UPPCLHierarchy> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteById(int id) {
//		// TODO Auto-generated method stub
//		
//	}
//
////	@Override
////	public List<UPPCLHierarchy> getAllNotes(long userId) {
////	
////			Session session = entityManager.unwrap(Session.class);
//////			String hql = "from genx.ewallet.model.UPPCLHierarchy";
////			
////			Query query = session.createQuery("from genx.ewallet.model.UPPCLHierarchy");
////					
////			return query.getResultList();
////		
////	}
//
//	@Override
//	public List<String> getAllBill() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<String> fndBill(String code) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int fndBillHierarchy(String area, String code) {
//		Session session = entityManager.unwrap(Session.class);
//		Query query = session.createQuery("select n_id from note where u_id = ? and title = ?");
//				
//		return query.getFirstResult();
//	}
//
//
//
////		if(area=="RAPDRP")
////		{
////			Session session = entityManager.unwrap(Session.class);
//////			String hql = "from genx.ewallet.model.UPPCLHierarchy";
////			Query query = session.createQuery("select id,discomName,zoneName,circleName,districtName,divisionName from genx.ewallet.model.UPPCLHierarchy u where  u.ruralDivisionCode = ?2  ");
////			return query.getResultList();
////		}
////		else if(area=="NON_RAPDRP")
////		{
////				Session session = entityManager.unwrap(Session.class);
//////		String hql = "from genx.ewallet.model.UPPCLHierarchy";
////		Query query = session.createQuery("select id,discomName,zoneName,circleName,districtName,divisionName from genx.ewallet.model.UPPCLHierarchy u where u.urbanDivisionCode = ?2  ");
////		return query.getResultList();
////		}
////		return null;
////	}
////	
////	public List<UPPCLHierarchy> getAllUPPCL()
////	{
////		Transaction tx=null;
////		try(Session ses=HibernateUtils)
////	}
//
////	@Override
////	public String findId(String Area, String Code) {
////
////		return null;
////	}
//	
//
//}
