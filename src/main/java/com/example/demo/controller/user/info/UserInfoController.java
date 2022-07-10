package com.example.demo.controller.user.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Login.CustomUserDetails;
import com.example.demo.domain.UserInfo.UserInfo;
import com.example.demo.service.UserInfo.UserInfoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/user-info")
@RequiredArgsConstructor
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;

	// －－－－－－－－－－－－－－－－－－画面遷移－－－－－－－－－－－－－－－－－－－－//

	// ①プロフィール登録画面
	@GetMapping("/create")
	public String showForm(@ModelAttribute("user_info") UserInfo userInfo, Model model) {
		return "Userinfo/Create-userinfo";
	}

	// ②プロフィール編集画面
	@GetMapping("show")
	public String show(@AuthenticationPrincipal CustomUserDetails customUserDetails, Model model) {
		UserInfo userInfo = userInfoService.selectOne(customUserDetails.getUsername());
		model.addAttribute("user_info", userInfo);
		return "Userinfo/Show-userinfo";
	}

	// ③プロフィール詳細表示（画面遷移）
	@GetMapping("/edit")
	public String edit(@AuthenticationPrincipal CustomUserDetails customUserDetails, Model model) {
		UserInfo userInfo = userInfoService.selectOne(customUserDetails.getUsername());
		model.addAttribute("user_info", userInfo);
		return "Userinfo/Edit-userinfo";
	}

	// －－－－－－－－－－－－－－－－－－CRUD処理－－－－－－－－－－－－－－－－－－－－//

	// ①登録処理（データ登録）
	@PostMapping
	public String create(@ModelAttribute("user_info") @Validated UserInfo userInfo, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "User-info/Edit-userinfo";
		} else {
			userInfoService.insert(userInfo);
			return "redirect:/announcements";
		}
	}

	// ③編集処理（画面遷移）
	@GetMapping("/{username}/edit")
	public String edit(@PathVariable @AuthenticationPrincipal CustomUserDetails customUserDetails,
			@ModelAttribute("user_info") UserInfo userInfo, Model model) {
		model.addAttribute("user_info", userInfoService.selectOne(customUserDetails.getUsername()));
		return "Userinfo/Edit-userinfo";
	}

	// ④更新処理（データ更新）
	@PutMapping("{username}")
	public String update(@AuthenticationPrincipal CustomUserDetails customUserDetails, @PathVariable String username,
			@ModelAttribute("user_info") @Validated UserInfo userInfo, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("user_info", userInfo);
			return "Userinfo/Edit-userinfo";
		} else {
			userInfo.setUsername(customUserDetails.getUsername());
			userInfoService.update(userInfo);
			return "redirect:/user-info/show";
		}
	}

	// －－－－－－－－－－－－－－－－－－CRUD処理－－－－－－－－－－－－－－－－－－－－//

}
