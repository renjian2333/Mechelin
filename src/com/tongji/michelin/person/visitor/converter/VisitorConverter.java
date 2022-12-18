package com.tongji.michelin.person.visitor.converter;

import com.tongji.michelin.person.visitor.Visitor;

/**
 * @classname VisitorConverter
 * @description VisitorConverter implement Converter
 */
public class VisitorConverter extends Converter<VisitorDto, Visitor> {

    public VisitorConverter() {
        super(visitorDto -> new Visitor(visitorDto.getName(), visitorDto.getAge(),
                        visitorDto.getSex()),
                visitor -> new VisitorDto(visitor.getName(), visitor.getAge(),
                        visitor.getSex()));

    }

}