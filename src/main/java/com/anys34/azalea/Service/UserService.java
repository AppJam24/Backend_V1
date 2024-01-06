package com.anys34.azalea.Service;

import com.anys34.azalea.Repository.UserRepository;
import com.anys34.azalea.domain.User;
import com.anys34.azalea.dto.LoginDto;
import com.anys34.azalea.dto.SignInDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public void signIn(SignInDto signInDto) {
        userRepository.save(signInDto.toEntity());
    }

    @Transactional
    public Pair<User, Boolean> login(LoginDto loginDto) {
        String userId = loginDto.getUserId();
        String password = loginDto.getPassword();
        User user = userRepository.findByUsernameAndPassword(userId, password);

        if (user != null) return Pair.of(user, true);
        if (user == null) return Pair.of(user, false);
        throw new IllegalArgumentException();
    }

    @Transactional
    public User select(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("유저가 없습니다."));
    }

    @Transactional
    public Boolean checkUserId(String userId) {
        return userRepository.findByUsername(userId) != null;
    }
}
