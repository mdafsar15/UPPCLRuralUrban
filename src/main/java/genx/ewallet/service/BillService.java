package genx.ewallet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import genx.ewallet.model.UPPCLHierarchy;
import genx.ewallet.repository.IBillRepository;

@Service
public class BillService {

	@Autowired
	IBillRepository iBillRepository;

	public List<String> findId() {
		return iBillRepository.getAllBill();
	}

	public List<String> findBillRural(String code) {
		return iBillRepository.fndBill(code);

	}

	public List<String> findBillRuralUrban(String area, String code) {
		if (area.equals("NON_RAPDRP")) {
			return iBillRepository.fndBillHierarchy(code);
		}

		else {
			return iBillRepository.fndBillHierarchy1(code);
		}

	}
}
