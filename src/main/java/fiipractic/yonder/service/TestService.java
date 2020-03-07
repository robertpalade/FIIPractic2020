package fiipractic.yonder.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public interface TestService {
    String getTestMessage();

    String getAll();

    void save(String name);

    void update(Integer id, String newValue);

    void delete(Integer id);

}

