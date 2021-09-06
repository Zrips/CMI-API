package com.Zrips.CMI.commands;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface CAnnotation {
    int priority() default 100;

    String info() default "";

    String args() default "";

    String[] explanation() default {};

    @Deprecated
    String[] tab() default {};

    String[] multiTab() default {};

    int[] regVar() default { -666 };

    int[] consoleVar() default { -666 };

    boolean alias() default false;

    boolean hidden() default false;

    boolean test() default false;

    boolean ignoreHelpPage() default false;

    String[] customAlias() default {};

    String[] modules() default {};

    boolean paccess() default false;

    Class<? extends Cmd> redirectClass() default Void.class;

    String redirectFormat() default "";
    
    boolean asyncSupported() default false;

    boolean others();
}
