package com.example.last.dto;

import com.example.last.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {
    private int id;
    private String title;
    private String content;
    private String file;
    private String writer;

    public static BoardDto toDto(Board board) {
        return new BoardDto(
                board.getId(),
                board.getTitle(),
                board.getContent(),
                board.getFile(),
                board.getUser().getNickname());
    }

}