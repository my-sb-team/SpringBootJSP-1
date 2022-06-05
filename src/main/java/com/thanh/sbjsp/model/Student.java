package com.thanh.sbjsp.model;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class Student {
	
	@NotBlank(message = "Vui lòng nhập họ và tên")
	String name;
	
	@NotBlank(message = "Vui lòng nhập địa chỉ email")
	@Email(message = "Vui lòng nhập đúng định dạng email")
	String email;
	
	@NotNull(message = "Vui lòng nhập điểm")
	@Min(0)
	@Max(10)
	Double marks;
	
	@NotNull(message = "Vui lòng chọn giới tính")
	Boolean gender;
	
	@NotBlank(message = "Vui lòng chọn khoa")
	String faculty;
	
	@NotEmpty(message = "Vui lòng chọn sở thích")
	List<String> hobbies;
}
