package com.bjsxt.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * 主题对象、消息发布者
 * @author Administrator
 *
 */
public class Subject {
	
	protected List<Observer> list = new ArrayList<Observer>();
	
	public void registerObserver(Observer obs){
		list.add(obs);
	}
	public void removeObserver(Observer obs){
		list.remove(obs);
	}

	//通知所有的观察者更新状态
	public void notifyAllObservers(){
		for (Observer obs : list) {
			obs.update(this);//调用观察者的更新方法（钩子函数）
		}
	}
	
}
