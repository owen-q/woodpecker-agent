package io.owen.woodpecker.agent;

import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by owen_q on 2018. 12. 1..
 */
public class WoodpeckerServiceImpl implements WoodpeckerService.Iface{
    private Logger logger = LoggerFactory.getLogger(WoodpeckerServiceImpl.class);

    @Override
    public long registerAgent() throws TException {

        return 0;
    }

    @Override
    public void start() throws TException {

    }
}
