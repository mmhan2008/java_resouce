package com.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的聚合类
 * @author user01
 * @create 2019/10/15
 */
public class ConcreteMyAggregate {

    private List<Object> list = new ArrayList<>();

    public MyIterator createIterator(){
        return new ConcreteIterator();
    }

    public ConcreteMyAggregate() {
    }

    public void addObject(Object object){
        this.list.add(object);
    }
    public void removeObject(Object object){
        this.list.remove(object);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    private class ConcreteIterator implements MyIterator{

        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if (cursor < list.size()){
                cursor ++;
            }
        }

        @Override
        public boolean hasNext() {
            if (cursor<list.size()){
                return true;
            }
            return false;
        }

        @Override
        public boolean isFirst() {
            return cursor == 0?true:false;
        }

        @Override
        public boolean isLast() {
            return cursor == (list.size()-1)?true:false;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}

