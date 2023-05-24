package com.javalab.board.common;

/*
 * [어드바이스]
 * - 공통로직으로 특정 메소드가 호출될 때마다 그 메소드 실행 전에
 *   이 클래스의 printLog()메소드를 먼저 호출해서 로그를 남기도록 한다.
 *   이런 클래스를 어드바이스 클래스라고 한다.
 */
public class AfterLogAdvice {

	public AfterLogAdvice() {
		
	}
	
	public void printLog() {
		System.out.println("[로그기록] 비즈니스 로직 수행후 로그를 남깁니다.");
	}
	
} // class e
