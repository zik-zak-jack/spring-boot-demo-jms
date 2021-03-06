package zik.zak.jack.SpringBootDemoJms.jms;

import zik.zak.jack.SpringBootDemoJms.domain.TransactionAlert;

/**
 * Abstract the Listener class for receiving messages from Queue
 * 
 * @author kalyan
 *
 */
public interface QueueListener {

  void receiveMessage(TransactionAlert alert);

}
