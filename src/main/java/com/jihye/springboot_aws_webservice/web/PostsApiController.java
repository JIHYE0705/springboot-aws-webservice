package com.jihye.springboot_aws_webservice.web;

import com.jihye.springboot_aws_webservice.service.posts.PostsService;
import com.jihye.springboot_aws_webservice.web.dto.PostsResponseDto;
import com.jihye.springboot_aws_webservice.web.dto.PostsSaveRequestDto;
import com.jihye.springboot_aws_webservice.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return this.postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return this.postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return this.postsService.findById(id);
    }
}
