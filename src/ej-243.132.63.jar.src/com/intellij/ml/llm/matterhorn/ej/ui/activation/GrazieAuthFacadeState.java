/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.openapi.components.BaseState;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.MutablePropertyReference1;
/*     */ import kotlin.jvm.internal.MutablePropertyReference1Impl;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.properties.ReadWriteProperty;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\b\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003R+\020\006\032\0020\0052\006\020\004\032\0020\0058@@@X\002¢\006\022\n\004\b\013\020\f\032\004\b\007\020\b\"\004\b\t\020\n¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacadeState;", "Lcom/intellij/openapi/components/BaseState;", "<init>", "()V", "<set-?>", "", "loginSuccessful", "getLoginSuccessful$ej_ui", "()Z", "setLoginSuccessful$ej_ui", "(Z)V", "loginSuccessful$delegate", "Lkotlin/properties/ReadWriteProperty;", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class GrazieAuthFacadeState
/*     */   extends BaseState
/*     */ {
/*     */   @NotNull
/* 105 */   private final ReadWriteProperty loginSuccessful$delegate = property(false).provideDelegate(this, $$delegatedProperties[0]); public static final int $stable = 8; public final boolean getLoginSuccessful$ej_ui() { return ((Boolean)this.loginSuccessful$delegate.getValue(this, $$delegatedProperties[0])).booleanValue(); } public final void setLoginSuccessful$ej_ui(boolean <set-?>) { this.loginSuccessful$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(<set-?>)); } static { KProperty[] arrayOfKProperty = new KProperty[1]; arrayOfKProperty[0] = (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(GrazieAuthFacadeState.class, "loginSuccessful", "getLoginSuccessful$ej_ui()Z", 0)); $$delegatedProperties = (KProperty<Object>[])arrayOfKProperty; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\GrazieAuthFacadeState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */