package nextstep.ladder.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DirectionTest {

    @DisplayName("방향을 초기화시킨다.")
    @Test
    void init() {
        assertThat(Direction.of(true, false)).isEqualTo(Direction.of(true, false));
    }

    @DisplayName("올바르지 못한 방향일 경우 예외를 발생시킨다.")
    @Test
    void initInvalid() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            Direction.of(true, true);
        });
    }

    @DisplayName("")
    @Test
    void nextRandomTrue() {

    }

    @DisplayName("")
    @Test
    void nextRandomFalse() {
    }

    @DisplayName("디음 방향이 true 일경우")
    @Test
    void nextTrue() {

    }

    @DisplayName("다음 방향이 false 일경우")
    @Test
    void nextFalse() {
    }

    @DisplayName("첫번째 점의 방향일 경우")
    @Test
    void first() {

    }

    @DisplayName("마지막 점의 방향일 경우")
    @Test
    void last() {

    }
}
