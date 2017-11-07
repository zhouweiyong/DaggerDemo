package com.vst.daggerdemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by zwy on 2017/11/1.
 * email:16681805@qq.com
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface UserScopeb {
}
