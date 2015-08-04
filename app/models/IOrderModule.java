package models;

import java.util.List;

/**
 * Created by Beemen on 04/08/2015.
 */
public interface IOrderModule {
    StandardReturn SubmitOrder(IOrder order, ISession session);
    List<IOrder> GetUserOrders(IEndUser user);
}
