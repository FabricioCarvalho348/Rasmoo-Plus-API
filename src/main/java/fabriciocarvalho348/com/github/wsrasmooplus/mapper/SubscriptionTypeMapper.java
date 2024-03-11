package fabriciocarvalho348.com.github.wsrasmooplus.mapper;

import fabriciocarvalho348.com.github.wsrasmooplus.dto.SubscriptionTypeDto;
import fabriciocarvalho348.com.github.wsrasmooplus.model.SubscriptionType;

public class SubscriptionTypeMapper {
    public static SubscriptionType fromDtoToEntity(SubscriptionTypeDto dto) {
        return SubscriptionType.builder()
                .id(dto.getId())
                .name(dto.getName())
                .accessMonths(dto.getAccessMonths())
                .price(dto.getPrice())
                .productKey(dto.getProductKey())
                .build();
    }
}
