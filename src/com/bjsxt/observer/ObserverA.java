package com.bjsxt.observer;

public class ObserverA implements Observer {

	private int myState;   //myState需要跟目标对象的state值保持一致！
	
	
	@Override
	public void update(Subject subject) {
		myState = ((ConcreteSubject)subject).getState();
//		System.out.println("具体观察者：" + myState);
	}


	public int getMyState() {
		return myState;
	}
	public void setMyState(int myState) {
		this.myState = myState;
	}
	
	

}
