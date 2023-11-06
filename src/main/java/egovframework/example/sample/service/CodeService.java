package egovframework.example.sample.service;

import java.util.List;

public interface CodeService {
	public String insertCodes(CodeVO vo) throws Exception;
	public List<?> selectCode(CodeVO vo) throws Exception;
	public int selectCodesCount(CodeVO vo) throws Exception;
	public int deleteCodes(int code) throws Exception;
	public CodeVO selectCodeDetail(int code) throws Exception;
	public int updateCode(CodeVO vo) throws Exception;
}
