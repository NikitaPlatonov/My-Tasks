package ru.myprojects.myTasks.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.myprojects.myTasks.DB.Task;

@Repository
public interface RepoDB extends CrudRepository<Task, Long> {
    void deleteById(Long id);
}
