package starbucks.users.service;

import starbucks.users.model.User;
import starbucks.users.vo.RequestUser;
import starbucks.users.vo.ResponseUser;

public interface UserService {
    ResponseUser addUser(RequestUser requestUser);
    ResponseUser getUser(Long id);


}
