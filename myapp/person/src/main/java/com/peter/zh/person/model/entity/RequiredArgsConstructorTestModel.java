package com.peter.zh.person.model.entity;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * @author admin_z by 2019/12/16
 * @ClassName RequiredArgsConstructorTestModel
 */
//必传参数构造器
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode
public class RequiredArgsConstructorTestModel {
    private final List<String> alist;

}
