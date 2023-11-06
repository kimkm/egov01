package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;

@Service("deptService")
public class DeptServiceImpl extends EgovAbstractServiceImpl implements DeptService{
	
	@Resource(name="deptDAO")
	private DeptDAO deptDAO;
	
	@Override
	public String InsertDetp(DeptVO vo) throws Exception {
		return deptDAO.InsertDept(vo);
	}

	@Override
	public List<?> SelectDeptList(DeptVO vo) throws Exception {
		// TODO Auto-generated method stub
		return deptDAO.SelectDeptList(vo);
	}

	@Override
	public DeptVO selectDeptDetail(String deptno) throws Exception {
		// TODO Auto-generated method stub
		return deptDAO.selectDeptDetail(deptno);
	}

	@Override
	public int deleteDept(String deptno) throws Exception {
		// TODO Auto-generated method stub
		return deptDAO.deleteDept(deptno);
	}

	@Override
	public int updateDept(DeptVO vo) throws Exception {
		// TODO Auto-generated method stub
		return deptDAO.updateDept(vo);
	};
	
	
}
