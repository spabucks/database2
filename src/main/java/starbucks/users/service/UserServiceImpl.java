package starbucks.users.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import starbucks.users.model.User;
import starbucks.users.repository.UserRepository;
import starbucks.users.vo.RequestUser;
import starbucks.users.vo.ResponseUser;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public ResponseUser addUser(RequestUser requestUser) {
        UUID uuid = UUID.randomUUID();
        User user = User.builder()
                .userId(uuid.toString())
                .nickname(requestUser.getNickname())
                .email(requestUser.getEmail())
                .pwd(requestUser.getPwd())
                .build();
        User resUser = userRepository.save(user);
        ResponseUser responseUser = ResponseUser.builder()
                .id(resUser.getId())
                .email(resUser.getEmail())
                .name(resUser.getNickname())
                .build();

        return responseUser;
    }

    @Override
    public ResponseUser getUser(Long id) {
        return null;
    }


}
