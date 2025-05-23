/*    */ package com.intellij.ml.llm.matterhorn.ej.core.settings;
/*    */ 
/*    */ import com.intellij.openapi.components.BaseState;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.MutablePropertyReference1;
/*    */ import kotlin.jvm.internal.MutablePropertyReference1Impl;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.properties.ReadWriteProperty;
/*    */ import kotlin.reflect.KProperty;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\b\030\0002\0020\001B\007¢\006\004\b\002\020\003R/\020\006\032\004\030\0010\0052\b\020\004\032\004\030\0010\0058F@FX\002¢\006\022\n\004\b\013\020\f\032\004\b\007\020\b\"\004\b\t\020\n¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/settings/JunieProjectState;", "Lcom/intellij/openapi/components/BaseState;", "<init>", "()V", "<set-?>", "", "projectPath", "getProjectPath", "()Ljava/lang/String;", "setProjectPath", "(Ljava/lang/String;)V", "projectPath$delegate", "Lkotlin/properties/ReadWriteProperty;", "ej-core"})
/*    */ public final class JunieProjectState
/*    */   extends BaseState
/*    */ {
/*    */   @NotNull
/* 25 */   private final ReadWriteProperty projectPath$delegate = BaseState.string$default(this, null, 1, null).provideDelegate(this, $$delegatedProperties[0]); @Nullable public final String getProjectPath() { return (String)this.projectPath$delegate.getValue(this, $$delegatedProperties[0]); } public final void setProjectPath(@Nullable String <set-?>) { this.projectPath$delegate.setValue(this, $$delegatedProperties[0], <set-?>); } static { KProperty[] arrayOfKProperty = new KProperty[1]; arrayOfKProperty[0] = (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(JunieProjectState.class, "projectPath", "getProjectPath()Ljava/lang/String;", 0)); $$delegatedProperties = (KProperty<Object>[])arrayOfKProperty; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\settings\JunieProjectState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */