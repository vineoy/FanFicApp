package com.FanFic.blog.mappers;

import com.FanFic.blog.domain.CreatePostRequest;
import com.FanFic.blog.domain.UpdatePostRequest;
import com.FanFic.blog.domain.dtos.CreatePostRequestDto;
import com.FanFic.blog.domain.dtos.PostDto;
import com.FanFic.blog.domain.dtos.UpdatePostRequestDto;
import com.FanFic.blog.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {
    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    PostDto toDto(Post post);
    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);
    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);
}
