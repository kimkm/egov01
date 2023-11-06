package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;

@Controller
public class DeptController {
	
	@Resource(name="deptService")
	private DeptService deptService;
	
	@RequestMapping(value="/deptWrite.do")
	public String detpWrite(){
		return "dept/write";
	}
	@RequestMapping(value="/deptWriteSave.do")
	public String InsertDept(DeptVO vo) throws Exception {
		System.out.println(vo.getDeptno());
		System.out.println(vo.getDname());
		System.out.println(vo.getLoc());
		
		String result =deptService.InsertDetp(vo);
		if(result ==null) {
			System.out.println("save OK");
		}else {
			System.out.println("error");
		}
		return "redirect:deptList.do";
		
	}
	
	@RequestMapping(value="/deptList.do")
	public String selectDeptList(DeptVO vo,ModelMap model) throws Exception{
		List<?> list = deptService.SelectDeptList(vo);
		System.out.println(list);
		model.addAttribute("resultList",list);
		return "dept/deptList";
	}
	
	@RequestMapping(value="/deptDetail.do")
	public String selectDeptDetail(String deptno,ModelMap model) throws Exception{
		DeptVO vo = deptService.selectDeptDetail(deptno);
		System.out.println(vo.getDname());
		model.addAttribute("deptVO",vo);
		return "dept/deptDetail";
	}
	
	@RequestMapping(value = "/deptDelete.do")
	public String deleteDept(String deptno) throws Exception{
		int result = deptService.deleteDept(deptno);
		if(result ==1) {
			System.out.println("delete OK");
		}else {
			System.out.println("error");
		}
		return "redirect:deptList.do";
	}
	
	@RequestMapping(value="/deptModifyWrite.do")
	public String selectDeptModify(String deptno,ModelMap model) throws Exception{
		DeptVO vo = deptService.selectDeptDetail(deptno);
		System.out.println(vo.getDname());
		model.addAttribute("deptVO",vo);
		return "dept/modify";
	}
	
	@RequestMapping(value="/deptModifySave.do")
	public String updateDept(DeptVO vo) throws Exception{
		int result = deptService.updateDept(vo);
		if(result ==1) {
			System.out.println("modify OK");
		}else {
			System.out.println("error");
		}
		return "redirect:deptDetail.do";
	}

}
