package com.hot6.project.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hot6.project.service.CalendarService;
import com.hot6.project.service.StudyRoomService;

@RestController
public class StudyRoomController {
	@Inject
	StudyRoomService service;
	@Inject
	CalendarService Cservice;
	
	ModelAndView mav = new ModelAndView();
	
	@RequestMapping(value = "/study/studyRoom", method = RequestMethod.GET)
    public ModelAndView studyRoom(int study_num) {
		mav.addObject("study_num", study_num);
		mav.setViewName("/study/studyRoom");
		
		return mav;
	}
}
