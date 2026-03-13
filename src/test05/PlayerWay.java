package test05;

/**
 * [enum] 플레이어의 방향 상태
 *
 * enum 을 사용하는 이유:
 * - boolean 두개 (isLeft, isRight)로 방향을 관리하면
 * 둘다 true가 생기는 잘못된 상태가 생길 수 있음
 */
public enum PlayerWay {
    LEFT, RIGHT;
}
