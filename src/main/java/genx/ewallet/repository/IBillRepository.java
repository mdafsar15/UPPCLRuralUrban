package genx.ewallet.repository;

import java.util.List;

import org.hibernate.Session;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import genx.ewallet.model.UPPCLHierarchy;

@Repository
public interface IBillRepository extends CrudRepository<UPPCLHierarchy, Integer> {

	UPPCLHierarchy findById(int id);

	List<UPPCLHierarchy> findAll();

	void deleteById(int id);

	@Query("select discomName,zoneName,circleName,districtName,divisionName from genx.ewallet.model.UPPCLHierarchy")
	public List<String> getAllBill();

	@Query("select id,discomName,zoneName,circleName,districtName,divisionName from genx.ewallet.model.UPPCLHierarchy u where u.ruralDivisionCode = ?1 ")
	public List<String> fndBill(String code);

	@Query("select id,discomName,zoneName,circleName,districtName,divisionName from genx.ewallet.model.UPPCLHierarchy u where   u.ruralDivisionCode = ?1 ")
	public List<String> fndBillHierarchy(String code);

	@Query("select id,discomName,zoneName,circleName,districtName,divisionName from genx.ewallet.model.UPPCLHierarchy u where u.urbanDivisionCode = ?1 ")
	public List<String> fndBillHierarchy1(String code);

//	public List<UPPCLHierarchy> getAllNotes(long userId);

}
