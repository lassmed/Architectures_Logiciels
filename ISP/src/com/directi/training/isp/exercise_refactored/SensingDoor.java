package com.directi.training.isp.exercise_refactored;

import com.directi.training.isp.exercise.Door;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SensingDoor implements ISensorDoor
{
    private boolean _locked;
    private boolean _opened;

    public SensingDoor(Sensor sensor)
    {
        sensor.register((Door) this);
    }

    @Override
    public void lock()
    {
        _locked = true;
    }

    @Override
    public void unlock()
    {
        _locked = false;
    }

    @Override
    public void open()
    {
        if (!_locked) {
            _opened = true;
        }
    }

    @Override
    public void close()
    {
        _opened = false;
    }

    @Override
    public void proximityCallback()
    {
        _opened = true;
    }
}
