package com.manning.gia.todo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import com.manning.gia.todo.model.ToDoItem;

public class InMemoryToDoRepository implements ToDoRepository {
	
	private AtomicLong currentId = new AtomicLong();
	private ConcurrentMap<Long, ToDoItem> toDos = new ConcurrentHashMap<Long, ToDoItem>();
	/*
	@Override
	public List<ToDoItem> findAll() {
		List<ToDoItem> toDoItems = new ArrayList<ToDoItem>(toDos.values());
		//Collections.sort(toDoItems);
		return toDoItems;
	}

	@Override
	public List<ToDoItem> findAllActive() {
		List<ToDoItem> activeToDos = new ArrayList<ToDoItem>();

		synchronized (toDos) {
			for (ToDoItem toDoItem : toDos.values()) {
				if (!toDoItem.isCompleted()) {
					activeToDos.add(toDoItem);
				}
			}
		}

		return activeToDos;
	}

	@Override
	public List<ToDoItem> findAllCompleted() {
		List<ToDoItem> completedToDos = new ArrayList<ToDoItem>();

		synchronized (toDos) {
			for (ToDoItem toDoItem : toDos.values()) {
				if (toDoItem.isCompleted()) {
					completedToDos.add(toDoItem);
				}
			}
		}

		return completedToDos;
	}

	@Override
	public ToDoItem findById(Long id) {
		return toDos.get(id);
	}

	@Override
	public Long insert(ToDoItem toDoItem) {
		Long id = currentId.incrementAndGet();
		toDoItem.setId(id);
		toDos.putIfAbsent(id, toDoItem);
		return id;
	}
	//
	*/
	@Override
	public List<ToDoItem> findAll() {
		// TODO Auto-generated method stub
		List<ToDoItem> toDoItems = new ArrayList<ToDoItem>(toDos.values());
		//Collections.sort(toDoItems);
		return toDoItems;
	}
	@Override
	public List<ToDoItem> findAllActive() {
		// TODO Auto-generated method stub
		List<ToDoItem> activeToDos = new ArrayList<ToDoItem>();

		synchronized (toDos) {
			for (ToDoItem toDoItem : toDos.values()) {
				if (!toDoItem.isCompleted()) {
					activeToDos.add(toDoItem);
				}
			}
		}

		return activeToDos;
	}
	@Override
	public List<ToDoItem> findAllCompleted() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ToDoItem findById(Long id) {
		// TODO Auto-generated method stub
		return toDos.get(id);
	}
	@Override
	public Long insert(ToDoItem toDoItem) {
		// TODO Auto-generated method stub
		Long id = currentId.incrementAndGet();
		toDoItem.setId(id);
		toDos.putIfAbsent(id, toDoItem);
		return id;
	}
	@Override
	public void update(ToDoItem toDoItem) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(ToDoItem toDoItem) {
		// TODO Auto-generated method stub
		
	}

}
