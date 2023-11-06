package egovframework.example.sample.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractDAO;
import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.CodeVO;

@Repository("codeDAO")
public class CodeDAO  extends EgovAbstractDAO {

	public String insertCodes(CodeVO vo) {
		// TODO Auto-generated method stub
		return  (String) insert("codeDAO.insertCodes",vo);
	}

	public List<?> selectCodes(CodeVO vo) {
		// TODO Auto-generated method stub
		return (List<?>) list("codeDAO.selectCodes",vo);
	}

	public int selectCodesCount(CodeVO vo) {
		// TODO Auto-generated method stub
		return (int) select("codeDAO.selectCodesCount",vo);
	}

	public int deleteCodes(int code) {
		// TODO Auto-generated method stub
		return (int) delete("codeDAO.deleteCodes",code);
	}

	public CodeVO selectCodeDetail(int code) {
		// TODO Auto-generated method stub
		return (CodeVO) select("codeDAO.selectCodeDetail",code);
	}

	public int updateCode(CodeVO vo) {
		// TODO Auto-generated method stub
		return (int) update("codeDAO.updateCode",vo);
	}


}
