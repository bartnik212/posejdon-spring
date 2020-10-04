package com.jakubbartnik.module.books.mapper;

import com.jakubbartnik.module.books.dto.BookDetailsDto;
import com.jakubbartnik.module.books.entity.BooksDetailsEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class BookDetailsMapperTest {

    private static final String ISBN = "000";
    public static final String LANG = "PL";

    @InjectMocks
    private BookDetailsMapper bookDetailsMapper;

    @Test
    public void shouldReturnNotNullObject() {
        // given
        BooksDetailsEntity details = null;

        // when
        BookDetailsDto dto = bookDetailsMapper.map(details);

        // then
        assertThat(dto).isNotNull();
    }

    @Test
    public void shouldReturnDto(){
        //given
        BooksDetailsEntity details = new BooksDetailsEntity()
                .setIsbn(ISBN)
                .setLang(LANG);
        //when
        BookDetailsDto dto = bookDetailsMapper.map(details);
        //then
        assertThat(dto.getIsbn()).isEqualTo(ISBN);
        assertThat(dto.getLang()).isEqualTo(LANG);
    }
}