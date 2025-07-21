package com.springbasic.controller.product;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springbasic.domain.ProductDTO;

@Controller
public class ProductController {
	
	// 리다이렉트
	@RequestMapping("viewProduct")
	public String viewProduct() {
		
		System.out.println("viewProduct() 호출됨.");
		
		return "redirect:/memberView"; // 리다이렉트시, /memberView 로 새로운 요청(request)이 간다.
									// 이 요청을 담당하는 (url맵핑이 된) 메서드가 컨트롤러에 있어야 한다.
	}
	
	// 파라미터를 넘겨주면서 페이지 redirect
	@RequestMapping(value = "viewProduct2")
	public String redirectView2(RedirectAttributes rttr) {
	
		// addAttribute() : 쿼리스트링으로 데이터가 넘겨진다.
		rttr.addAttribute("name", "hong");
		rttr.addAttribute("age", 10);
		
		// addFlashAttribute() : 쿼리스트링으로 데이터가 넘겨지지 않는다. + 휘발성 (리다이렉트 이후 한번만 사용된다)
		rttr.addFlashAttribute("status", "success");
		
		return "redirect:/hello";
	}
	
	@RequestMapping(value = "hello")
	public void hello() {
		
	}
	
	@RequestMapping(value = "viewProduct3")
	public String redirectView3(RedirectAttributes rttr) {
	
		Map<String, String> map = new HashMap<>();
		map.put("name", "lee");
		map.put("age", "20");
		
		rttr.addAllAttributes(map); // 쿼리스트링으로 데이터가 넘겨진다.
		
		return "redirect:/hello";
	}
	
	@GetMapping("productForm")
	public void productFormGET() {
		// product 입력 폼을 렌더링하기 위한 메서드
	}
	
	@PostMapping("prodPost")
//	public String saveProduct(@ModelAttribute(name="prod") ProductDTO product) {
//	public String saveProduct(@ModelAttribute ProductDTO product) {
	public String saveProduct(ProductDTO product) {
		System.out.println("상품 저장 요청됨");
		
		System.out.println(product);
		return "productList";
	}
	
	// JSON 응달
	@GetMapping("jsonForm")
	public void jsonFormGET() {
		
	}
	
	@PostMapping("saveJson")
	public @ResponseBody ProductDTO outputJson(ProductDTO productDTO) {
		
		return productDTO;
		
	}
	
	@GetMapping("ajaxJson")
	public void ajaxJson() {
		
	}
	
	@PostMapping("ajaxPOST")
	public @ResponseBody String ajaxPOST(@RequestBody String searchName) {
		System.out.println("ajaxPOST 요청됨");
		System.out.println(searchName);
		
		return "ok";
	}
}
