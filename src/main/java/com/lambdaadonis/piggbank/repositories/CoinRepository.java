package com.lambdaadonis.piggbank.repositories;

import com.lambdaadonis.piggbank.models.Coin;
import org.springframework.data.repository.CrudRepository;

public interface CoinRepository extends CrudRepository <Coin,Long> {
}
