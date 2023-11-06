package egovframework.example.sample.service;

import java.util.List;

public interface DeptService {
	public String InsertDetp(DeptVO vo) throws Exception;
	public List<?> SelectDeptList(DeptVO vo) throws Exception;
	public DeptVO selectDeptDetail(String deptno) throws Exception;
	public int deleteDept(String deptno) throws Exception;
	public int updateDept(DeptVO vo) throws Exception;
}
