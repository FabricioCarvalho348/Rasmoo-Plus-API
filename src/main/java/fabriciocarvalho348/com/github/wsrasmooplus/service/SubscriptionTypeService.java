package fabriciocarvalho348.com.github.wsrasmooplus.service;

import fabriciocarvalho348.com.github.wsrasmooplus.dto.SubscriptionTypeDto;
import fabriciocarvalho348.com.github.wsrasmooplus.model.SubscriptionType;

import java.util.List;

public interface SubscriptionTypeService {

    List<SubscriptionType> findAll();

    SubscriptionType findById(Long id);

    SubscriptionType create(SubscriptionTypeDto dto);

    SubscriptionType update(Long id, SubscriptionTypeDto dto);

    void delete(Long id);
}
