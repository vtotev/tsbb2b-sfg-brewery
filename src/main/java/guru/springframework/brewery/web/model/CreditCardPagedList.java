package guru.springframework.brewery.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class CreditCardPagedList extends PageImpl<CreditCardDto> {

    public CreditCardPagedList(List<CreditCardDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public CreditCardPagedList(List<CreditCardDto> content) {
        super(content);
    }
}
