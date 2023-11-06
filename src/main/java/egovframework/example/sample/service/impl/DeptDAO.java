package egovframework.example.sample.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractDAO;
import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.DeptVO;

@Repository("deptDAO")
public class DeptDAO  extends EgovAbstractDAO {
	public String InsertDept(DeptVO vo) {
		return (String) insert("deptDAO.InsertDept",vo);
	}

	public List<?> SelectDeptList(DeptVO vo) {
		// TODO Auto-generated method stub
		return (List<?>) list("deptDAO.SelecDeptList",vo);
	}

	public DeptVO selectDeptDetail(String deptno) {
		// TODO Auto-generated method stub
		return (DeptVO) select("deptDAO.selectDeptDetail",deptno);
	}

	public int deleteDept(String deptno) {
		// TODO Auto-generated method stub
		return (int) delete("deptDAO.deleteDept",deptno);
	}

	public int updateDept(DeptVO vo) {
		// TODO Auto-generated method stub
		return (int) update("deptDAO.updateDept",vo);
	}


}
