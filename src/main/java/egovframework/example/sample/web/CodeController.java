package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.CodeService;
import egovframework.example.sample.service.CodeVO;

@Controller
public class CodeController {

	@Resource(name = "codeService")
	private CodeService codeService;

	@RequestMapping(value = "/codeWrite.do")
	public String codeWrite() {
		return "code/codeWrite";
	}

	@RequestMapping(value = "/codeWriteSave.do")
	public String insertCode(CodeVO vo) throws Exception {
		String result = codeService.insertCodes(vo);
		if (result == null) {
			System.out.println("저장성공!");
		}
		return "redirect:codeWrite.do";
	}

	@RequestMapping(value = "/codeList.do")
	public String listCode(CodeVO vo, ModelMap model) throws Exception {
		List<?> list = codeService.selectCode(vo);
		int total = codeService.selectCodesCount(vo);
		System.out.println(list);
		model.addAttribute("resultTotal", total);
		model.addAttribute("resultList", list);
		return "code/codeList";
	}

	@RequestMapping(value = "/codeDelete.do")
	public String deleteCode(int code) throws Exception {
		int result = codeService.deleteCodes(code);
		if (result == 1) {
			System.out.println("삭제성공!");
		}
		return "redirect:codeList.do";
	}

	@RequestMapping(value = "/codeModifyWrite.do")
	public String selectCodesDetail(int code, ModelMap model) throws Exception {
		CodeVO vo = codeService.selectCodeDetail(code);
		model.addAttribute("vo", vo);
		return "code/codeModifyWrite";
	}

	@RequestMapping(value = "/codeModifySave.do")
	public String updateCodes(CodeVO vo) throws Exception {
		int result = codeService.updateCode(vo);
		if (result == 1) {
			System.out.println("수정성공!");
		}
		return "redirect:codeList.do";
	}

}
