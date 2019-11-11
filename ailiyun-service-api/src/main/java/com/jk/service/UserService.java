package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "ailiyun-consumer",fallback = UserServiceError.class)
public interface UserService {
}
