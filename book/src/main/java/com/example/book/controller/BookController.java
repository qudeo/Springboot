package com.example.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.book.dto.BookDTO;
import com.example.book.service.BookService;

public class BookController {
	@Autowired
	private BookService bookService;
	
	@GetMapping("/save")
	public String save() {
		return "save";
	}
	
	// 도서등록
		@PostMapping("/save")
		public String save(@ModelAttribute BookDTO bookDTO) {
			System.out.println("BookDTO = " + bookDTO);
			// BookService 클래스의 save 메서드로 BookDTO 객체 전달
			// list 출력을 위해 list 주소 요청
			// redirect : 컨트롤러의 메서드에서 다른 메서드의 주소를 요청하고자 할 때
			return "redirect:/list";
		}
		
		@GetMapping("/list")
		public String findAll (Model model) {
			// DB에서 목록 데이터를 가져옴
			List<BookDTO> bookDTOs = bookService.findAll();
			// 리스트 데이터를 model에 담음
			model.addAttribute("bookList", bookDTOs);
			// list.html로 이동
			return "list";
			
		@GetMapping("/book/{id}")
		public String findById(@PathVariable("id") Long id, Model )
		}
	
}
