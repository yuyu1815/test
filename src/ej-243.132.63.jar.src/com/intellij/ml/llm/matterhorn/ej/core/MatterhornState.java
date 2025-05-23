/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ import com.intellij.openapi.components.BaseState;
/*    */ import kotlin.jvm.internal.MutablePropertyReference1;
/*    */ import kotlin.reflect.KProperty;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\f\030\0002\0020\001B\007¢\006\004\b\002\020\003R/\020\006\032\004\030\0010\0052\b\020\004\032\004\030\0010\0058F@FX\002¢\006\022\n\004\b\013\020\f\032\004\b\007\020\b\"\004\b\t\020\nR/\020\r\032\004\030\0010\0052\b\020\004\032\004\030\0010\0058F@FX\002¢\006\022\n\004\b\020\020\f\032\004\b\016\020\b\"\004\b\017\020\n¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/MatterhornState;", "Lcom/intellij/openapi/components/BaseState;", "<init>", "()V", "<set-?>", "", "executionMode", "getExecutionMode", "()Ljava/lang/String;", "setExecutionMode", "(Ljava/lang/String;)V", "executionMode$delegate", "Lkotlin/properties/ReadWriteProperty;", "model", "getModel", "setModel", "model$delegate", "ej-core"})
/*    */ public final class MatterhornState extends BaseState {
/*    */   @NotNull
/* 11 */   private final ReadWriteProperty executionMode$delegate = BaseState.string$default(this, null, 1, null).provideDelegate(this, $$delegatedProperties[0]); @Nullable public final String getExecutionMode() { return (String)this.executionMode$delegate.getValue(this, $$delegatedProperties[0]); } public final void setExecutionMode(@Nullable String <set-?>) { this.executionMode$delegate.setValue(this, $$delegatedProperties[0], <set-?>); } static { KProperty[] arrayOfKProperty = new KProperty[2]; arrayOfKProperty[0] = (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(MatterhornState.class, "executionMode", "getExecutionMode()Ljava/lang/String;", 0)); arrayOfKProperty[1] = 
/* 12 */       (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(MatterhornState.class, "model", "getModel()Ljava/lang/String;", 0)); $$delegatedProperties = (KProperty<Object>[])arrayOfKProperty; } @NotNull private final ReadWriteProperty model$delegate = BaseState.string$default(this, null, 1, null).provideDelegate(this, $$delegatedProperties[1]); @Nullable public final String getModel() { return (String)this.model$delegate.getValue(this, $$delegatedProperties[1]); } public final void setModel(@Nullable String <set-?>) { this.model$delegate.setValue(this, $$delegatedProperties[1], <set-?>); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\MatterhornState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */