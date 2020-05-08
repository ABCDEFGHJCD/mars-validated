package com.github.fashionbrot.validated.test;


import com.github.fashionbrot.validated.constraint.ConstraintValidator;

import java.lang.annotation.Annotation;

public class CustomConstraintValidator2 implements ConstraintValidator<Custom, Object> {

    @Override
    public boolean isValid(Custom annotation, Object var1) {
        return true;
    }

    @Override
    public Object modify(Custom annotation, Object var) {
        System.out.println("CustomConstraintValidator2:"+var);
        return var+"2";
    }
}
