package com.jihye.personal_project.web;

import com.jihye.personal_project.service.posts.PostsService;
import com.jihye.personal_project.web.dto.PostsResponseDto;
import com.jihye.personal_project.web.dto.PostsSaveRequestDto;
import com.jihye.personal_project.web.dto.PostsUpdateRequestDto;
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
