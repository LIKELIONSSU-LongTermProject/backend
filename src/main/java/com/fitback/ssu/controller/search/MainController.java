package com.fitback.ssu.controller.search;

import com.fitback.ssu.dto.question.QuestionInfoDto;
import com.fitback.ssu.service.question.SearchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/main")
public class MainController {
    private final SearchService searchService;

    /**
     * 메인화면 개발 질문 리스트
     * @param keyword
     * @return
     */
    @GetMapping(value = "/dev")
    public ArrayList<QuestionInfoDto> devQuestions(
            @RequestParam(value = "keyword",required = false,defaultValue = "dev") String keyword){
//        log.info("keyword = {}",keyword);
        return searchService.mainPageInfo(keyword);
    }

    /**
     * 메인화면 디자인 질문 리스트
     * @param keyword
     * @return
     */
    @GetMapping(value = "/design")
    public ArrayList<QuestionInfoDto> designQuestions(
            @RequestParam(value = "keyword",required = false,defaultValue = "design") String keyword){
        return searchService.mainPageInfo(keyword);
    }

    /**
     * 메인화면 기획 질문 리스트
     * @param keyword
     * @return
     */
    @GetMapping(value = "/pm")
    public ArrayList<QuestionInfoDto> pmQuestions(
            @RequestParam(value = "keyword",required = false,defaultValue = "pm") String keyword){
        return searchService.mainPageInfo(keyword);
    }
//    @GetMapping(value = "/keyword")
//    @GetMapping(value = "/part")
//    @GetMapping(value = "/part/all")
//    @GetMapping(value = "/part/keyword")
}
