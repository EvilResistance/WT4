package by.bsuir.yaskevich.builder;

import by.bsuir.yaskevich.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
